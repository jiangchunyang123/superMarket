/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.scanManage;

import QRCode.base.VoiceUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LocalSocketServer implements Runnable {

    static final Logger logger = Logger.getLogger(LocalSocketServer.class);
    private Map<String, Object> codes = new HashMap<String, Object>();
    private StringBuilder stringBuilder = new StringBuilder();
    private ServerSocket serverSocket;
    private Socket socket;
    private boolean stop = false;
    private boolean suspended = false;
    private int size = 0;
    private SocketScanManage socketScanManage;

    public LocalSocketServer(int port, int size, SocketScanManage socketManage) throws IOException {
        serverSocket = new ServerSocket(port);
        this.size = size;
        socketScanManage = socketManage;
    }

    public LocalSocketServer() throws IOException {
        serverSocket = new ServerSocket(8085);
    }

    public void run() {
        service();
    }

    public void service() {
        while (!serverSocket.isClosed()) {
            try {
                logger.log(Level.INFO, "service start waiting for client ....");
                socket = serverSocket.accept(); // 接收客户连接
                try {
                    logger.log(Level.INFO, "New connection accepted {0}:{1}");
                    InputStream socketIn = socket.getInputStream();
                    int msg = socketIn.read();

                    while (!stop) {
                        if (msg != -1) {
                            System.out.println("recive[" + (char) msg + "] from " + socket.getInetAddress());

                            if (msg != 69) {
                                if (msg != 10 && msg != 13) {
                                    stringBuilder.append((char) msg);
                                }
                            } else {

                                if (codes.get(stringBuilder.toString()) == null) {
//                                    if (codes.isEmpty()) {
//                                        codes.put(stringBuilder.toString(), 2);
//                                    } else {
                                        codes.put(stringBuilder.toString(), 1);
 //                                   }
                                    if ((Integer) codes.get(stringBuilder.toString()) == 1) {
                                        appendText("输入的二维码为：" + stringBuilder.toString());
                                    } else {
                                        appendText("输入的箱码为：" + stringBuilder.toString());
                                    }

                                } else {
                                    VoiceUtils.play("扫描重复.wav");
                                }
                                logger.info("you input the big  E  and that's enough Im quit....");
                                VoiceUtils.play("叮.wav");
                                stringBuilder = new StringBuilder();
//                                if (codes.size() == 1) {
//                                    VoiceUtils.play("任务启动扫描箱标.wav");
//                                    
//                                    stringBuilder = new StringBuilder();
//                                } else 
                                if (codes.size() > size) {
                                    handleCodes(codes);
                                    codes.clear();
                                }
                            }
                            msg = socketIn.read();
                            synchronized (this) {
                                while (suspended) {
                                    try {
                                        logger.info("暂停咯。。。");
                                        wait();
                                    } catch (InterruptedException ex) {
                                        VoiceUtils.play("系统异常.wav");
                                        Logger.getLogger(SocketScanManage.class.getName()).log(Level.ERROR, null, ex);
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    VoiceUtils.play("系统异常.wav");
                    logger.log(Level.ERROR, e.getMessage());
                } finally {
                    try {
                        if (socket != null) {
                            socket.close();
                            stopServer();
                            socketScanManage.setEnableds(true);
                        }
                    } catch (IOException e) {
                        VoiceUtils.play("系统异常.wav");
                        logger.log(Level.ERROR, e.getMessage());
                    }
                }
            } catch (IOException e) {
                VoiceUtils.play("系统异常.wav");
                logger.log(Level.ERROR, e.getMessage());
            }
        }
    }

    public synchronized void awake() {
        suspended = false;
        notify();
        logger.info("已唤醒。。。");
    }

    public synchronized void suspend() {
        suspended = true;
    }

    public synchronized boolean getSuspend() {
        return suspended;
    }

    private void appendText(String text) {
        socketScanManage.appendTextFiledText("\n" + text);
    }

    private void handleCodes(Map<String, Object> codes) {

        if (codes != null && !codes.isEmpty()) {
            socketScanManage.bindBoxAndProd(codes);
        }
    }

    /**
     * 关闭socketServer
     */
    public void stopServer() {
        try {
            if (serverSocket != null) {
                this.stop = true;
                serverSocket.close();
            }
        } catch (IOException e) {
            VoiceUtils.play("系统异常");
            logger.log(Level.ERROR, e.getMessage());
        }
    }
}