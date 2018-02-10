/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCode.compnents;

import QRCode.base.model.Param;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Administrator
 */
public class MyCombobox extends JComboBox<ComponentModel> {

    public MyCombobox() {
        super();
    }

    public void setModel(List<ComponentModel> l) {
        ComboBoxModel combo = new DefaultComboBoxModel(l.toArray());
        super.setModel(combo);

    }

    public void setModelWithParam(List<Param> l) {
        List<ComponentModel> lst = new ArrayList<ComponentModel>();
        if (l != null && !l.isEmpty()) {
               ComponentModel m1 = new ComponentModel("","");
                lst.add(m1);
            for (Param p : l) {
                ComponentModel m = new ComponentModel(p.getCnname(), p.getCode().toString());
                lst.add(m);
            }
        }
        setModel(lst);
    }

    public String getSelectValue() {
        Object selectObj = this.getSelectedItem();
        String val = "";
        if(selectObj!=null){
            ComponentModel item = (ComponentModel) selectObj;
           val = item.getValue();
        }
        return val;
    }

    public Object getSelectText() {
        ComponentModel item = (ComponentModel) this.getSelectedItem();
        return item.getName();
    }

    public void setSelectValue(String value) {
        ComboBoxModel<ComponentModel> m = this.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            ComponentModel comp = m.getElementAt(i);
            if (comp.getValue()!=null&&comp.getValue().equals(value)) {
                this.setSelectedIndex(i);
            }
        }
    }
}
