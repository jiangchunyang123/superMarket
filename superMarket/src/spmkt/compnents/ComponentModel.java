/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spmkt.compnents;

/**
 *
 * @author Administrator
 */
public final class ComponentModel {

    private String textString;
    private String value;

    public ComponentModel() {
    }

    public ComponentModel(String textString, String value) {
        this.textString = textString;
        this.value = value;
    }

    public String getName() {
        return textString;
    }

    public void setName(String name) {
        this.textString = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return textString ;
    }
    
    
}
