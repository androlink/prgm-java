package test.StringTree;

import java.util.ArrayList;

public class TreeFractal {

    String seed="";
    String tree="";
    ArrayList<Rule> rules= new ArrayList<>();

    TreeFractal(String seed){
        this.seed=seed;
        //this.tree=this.seed;
    }
    String update(int i,String t){
        //t="A";
        String newTree="";
        System.out.println(t);
        if(i==0)return t;
        for(char s:t.toCharArray()){
            newTree+=getRuleDev(s);
            //System.out.println(s + " ->" + getRuleDev(s));
        }

        return update(i-1,newTree);
    }

    void addRule(char ini,String dev){
        for(Rule r:rules)if(ini==r.ini)return;
        rules.add(new Rule(ini,dev));
    }

    String getRuleDev(char i){
        for(Rule r:rules)if(i==r.ini)return r.dev;
        return "";
    }
    String getSeed(){
        return seed;
    }
    String getTree(){
        return tree;
    }

    public static void main(String[] args) {
        TreeFractal tree = new TreeFractal("N");
        tree.addRule('N',"TC");
        tree.addRule('T',"T");
        tree.addRule('C',"CQ");
        tree.addRule('Q',"Q");
        System.out.println(tree.update(10,tree.getSeed()));
        //System.out.println(tree.getSeed());

    }
}
