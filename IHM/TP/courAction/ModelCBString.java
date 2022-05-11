package IHM.TP.courAction;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModelCBString extends AbstractListModel<String> implements ComboBoxModel<String> {


    List<String> list = new ArrayList<>();
    String selectedIt;


    public ModelCBString(){
    }

    public ModelCBString(String[] tabString){
        list.addAll(List.of(tabString));
        fireIntervalAdded(list,0,list.size());
    }



    @Override
    protected void fireIntervalAdded(Object source, int index0, int index1) {
        super.fireIntervalAdded(source, index0, index1);
    }
    @Override
    protected void fireIntervalRemoved(Object source, int index0, int index1) {
        super.fireIntervalRemoved(source, index0, index1);
    }

    void ajoutString(String s){
        list.add(s);
        fireIntervalAdded(this, list.size()-1, list.size());
    }

    void effacerString(String s){
        list.remove(s);
        fireIntervalRemoved(list, list.size()-1, list.size());
    }

    void effacerTout(){
        list.clear();
        fireIntervalRemoved(this,0,list.size());
    }
    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof String) selectedIt=(String) anItem;
        else selectedIt = null;
    }

    @Override
    public Object getSelectedItem() {
        return selectedIt;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public String getElementAt(int index) {
        return list.get(index);
    }


    public static void main(String[] args) {
        String[] str={"string","lol"};
        ModelCBString t = new ModelCBString(str);
        t.ajoutString("fun");
        t.ajoutString("test");
        t.effacerTout();
    }
}
