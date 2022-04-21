package test.StringTreeDegueu;

import java.util.ArrayList;

/**
* @author androlink
* @see R
*
*/
public class TF {

String s;
ArrayList<R> rs = new ArrayList<>();

TF(String s){
this.s=s;
}
String update(int i,String t){

String nT="";
System.out.println(t);
if(i==0)return t;
for(char s:t.toCharArray()) nT+=getRuleDev(s);
return update(i-1,nT);
}

void addRule(char i,String d){
for(R r: rs)if(i==r.getI())return;
rs.add(new R(i,d));
}

String getRuleDev(char i){
for(R r: rs)if(i==r.getI())return r.getD();
return "";
}
String getS(){
return s;
}

public static void main(String[] args) {
TF tree = new TF("N");
tree.addRule('N',"TQ");
tree.addRule('T',"T");
tree.addRule('C',"C");
tree.addRule('Q',"CQ");
System.out.println(tree.update(10,tree.getS()));
}
}
