/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jiangchunyang
 */
public class StringUtils {

    public static boolean isNullOrEmpty(Object o) {
        return o == null || o.toString().equals("");
    }
}
