package test.StringTree;

import java.util.ArrayList;

/**
 * @author androlink
 * @see Rule
 *
 */
public class TreeFractal {

    String seed;

    ArrayList<Rule> rules= new ArrayList<>();

    TreeFractal(String seed){
        this.seed=seed;
    }
    String update(int i,String tree){

        String newTree="";
        System.out.println(tree);
        if(i==0)return tree;
        for(char c:tree.toCharArray()){
            newTree+=getRuleDev(c);
        }
        return update(i-1,newTree);
    }

    void addRule(char ini,String dev){
        for(Rule rule:rules)if(ini==rule.getId())return;
        rules.add(new Rule(ini,dev));
    }

    String getRuleDev(char c){
        for(Rule rule:rules)if(c==rule.getId())return rule.getDev();
        return "";
    }
    String getSeed(){
        return seed;
    }


    public static void main(String[] args) {
        TreeFractal tree = new TreeFractal("N");
        tree.addRule('N',"TQ");
        tree.addRule('T',"T");
        tree.addRule('C',"C");
        tree.addRule('Q',"CQ");
        System.out.println(tree.update(10,tree.getSeed()));
        //System.out.println(tree.getSeed());

    }
}
