/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.base;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 *声音类
 * @author jiangchunyang
 */
public class VoiceUtils {

    public static final Logger logger = Logger.getLogger(VoiceUtils.class);

    public static void play(final String voiceName) {
        try {

            //     FileInputStream fileau = new FileInputStream(sysUrl + "/voices/" + voiceName);

            String sysUrl = System.getProperty("user.dir");
            URL url = new URL("file:" + sysUrl + System.getProperty("file.separator") + "src\\QRCode\\base\\voices" + System.getProperty("file.separator") + voiceName);
            AudioClip ac = Applet.newAudioClip(url);
            ac.play();
            System.out.print("a");
        } catch (Exception e) {
            logger.error("播放失败", e);
        }
    }

    public static void main(String[] args) {
        play("任务启动.wav");
    }
}
