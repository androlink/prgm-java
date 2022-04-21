package test.StringTree;
/**
 * @author androlink
 *
 *
 */
public class Rule {
    char id;
    String dev;

    public Rule(char ini,String dev){
        this.id =ini;
        this.dev=dev;
    }

    public char getId() {
        return id;
    }

    public String getDev() {
        return dev;
    }
}
