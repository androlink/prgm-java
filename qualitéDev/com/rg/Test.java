package qualitéDev.com.rg;

import qualitéDev.com.rg.huffmancoding.LetsCompressAFileItsFunny;

public class Test {
    public static void main(String[] args) {
        LetsCompressAFileItsFunny t = new LetsCompressAFileItsFunny();
        if (t.doAllStuffForThisClass("F:\\QualiteDev\\tp_code_propre\\test.txt", "F:\\QualiteDev\\tp_code_propre\\compressed.txt")) {
            System.out.println("Compression successful !");
        }
    }
}
