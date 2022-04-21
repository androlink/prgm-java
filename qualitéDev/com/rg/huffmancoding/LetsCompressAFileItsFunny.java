package qualitéDev.com.rg.huffmancoding;

import qualitéDev.com.rg.binarytree.LeTrucQuiContientLeMachin;
import qualitéDev.com.rg.filemanager.ReadFile;
import qualitéDev.com.rg.filemanager.WriteFile;

import java.util.HashMap;
import java.util.HashSet;

public class LetsCompressAFileItsFunny {

    public boolean doAllStuffForThisClass(String file_path, String compressed_file_path) {
        boolean result = false;

        ReadFile readFile = new ReadFile(file_path);
        String fileContent = extractFileContent(readFile);
        readFile.close();
        HashMap<Character, Integer> letsGo = countOccurrences(fileContent);


        LeTrucQuiContientLeMachin binary_tree = new GenerateBinaryTree()
                .TreeFromOccurrences(letsGo);


        HashMap<Character, String> characterCode = new HashMap<>();
        boolean onlyOneCharacter = onlyOneCharacter(fileContent);
        if (onlyOneCharacter) {
            new GenerateBinaryTree().generateCharacterCode(characterCode, binary_tree.getRoot(), "0");
        }
        if (!onlyOneCharacter) {
            new GenerateBinaryTree().generateCharacterCode(characterCode, binary_tree.getRoot(), "");
        }


        WriteFile writeFile = new WriteFile(compressed_file_path);

        String bytesFromFileContent = "";
        for (int i = 0; i < fileContent.length(); ++i) {
            bytesFromFileContent = bytesFromFileContent.concat(characterCode.get(fileContent.charAt(i)));
        }

        String hehehe = "";
        int i;
        for (i = 0; i < bytesFromFileContent.length()/8; i++) {
            int a = Integer.parseInt(bytesFromFileContent.substring(8*i,(i+1)*8),2);
            hehehe += (char)(a);
        }
        String missingBytes = bytesFromFileContent.substring(i*8);

        // The replace function is here to escape the encoding table to avoid problems when decompressing
        writeFile.writeText(characterCode.toString().replace("\n", "\\n"));
        writeFile.writeText("\n" + missingBytes + "\n");
        writeFile.writeText(hehehe);


        writeFile.close();
        return result;
    }
// ++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>>++++++++++++.-.+++.----.------.+++++++++++++.-------------------.
    private String extractFileContent(ReadFile file) {
        String extracted = "";
        String hihiHa = file.getLine();

        while (hihiHa != null) {
            extracted = extracted.concat(hihiHa + "\n");
            hihiHa = file.getLine();
        }

        extracted = extracted.substring(0, extracted.length() - 1);
        return extracted;
    }

    private HashMap<Character, Integer> countOccurrences(String text) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        Character character;
        boolean contains;

        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            contains = occurrences.containsKey(character);
            if (!contains) {
                occurrences.put(character, 1);
            }
            if (contains) {
                occurrences.put(character, occurrences.get(character) + 1);
            }
        }

        return occurrences;
    }

    private boolean onlyOneCharacter(String input) {
        boolean result = true;
        HashSet<Character> set = new HashSet<>();
        for (int i =0 ;i < input.length();i++){
            set.add(input.charAt(i));
            if (set.size() > 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
