/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.compnents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class MyDatePicker extends JComboBox<Object> {

    private JTextField field = new JTextField();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String dateString = "";

    public MyDatePicker() {
        final MyDatePicker my = this;
        my.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                final JCalendarChooser jp = new JCalendarChooser(null, "选择日期", my);
                jp.setLocationRelativeTo(null);
                jp.setResizable(false);
                jp.showCalendarDialog();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

    }

    public void setText(String s) {
        this.setModel(new javax.swing.DefaultComboBoxModel(new String[]{s}));
    }

    public void setSelectDate(Date date) {
        String s = sdf.format(date);
        this.setModel(new javax.swing.DefaultComboBoxModel(new String[]{s}));
        dateString = s;
    }

    public Date getSelectDate() {
        try {
            return sdf.parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(MyDatePicker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
