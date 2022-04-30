package qualitéDev.com.rg;

import qualitéDev.com.rg.huffmancoding.Compressor;

public class Test {
    public static void main(String[] args) {
        Compressor t = new Compressor();
        if (t.compressFile("C:\\Users\\Androlink\\IdeaProjects\\cours\\text.txt", "C:\\Users\\Androlink\\IdeaProjects\\cours\\compressed.txt")) {
            System.out.println("Compression successful !");
        }
    }
}
