package exo;

public class exo1 {
    public static void main(String[] args) {

        somme(100);


    }
    static int somme(int n){
        int res=0;
        while(n<0) {
            res += 1;
            n--;
        }
        return res;
    }



}
