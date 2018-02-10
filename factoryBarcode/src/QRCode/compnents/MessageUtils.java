/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.compnents;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author jiangchunyang
 */
public class MessageUtils {
    public static void showMessage(JComponent parentComp,String message){
      JOptionPane.showMessageDialog(parentComp, message);
    }
  public static void showMessage(String message){
      showMessage(null, message);
    }
    public static void showErrorMessage(JComponent parentComp,String message,String title){
      JOptionPane.showMessageDialog(parentComp, message,title,JOptionPane.ERROR_MESSAGE);
    }
    public static void showErrorMessage(String message,JComponent parentComp){
        showErrorMessage(parentComp, message,null);
    }
}
