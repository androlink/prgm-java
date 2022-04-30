package qualitéDev.com.rg.huffmancoding;

import qualitéDev.com.rg.binarytree.Arbre;
import qualitéDev.com.rg.binarytree.Branche;

import java.util.*;

public class GenerateBinaryTree {
    // ouai
    public Arbre TreeFromOccurrences(HashMap<Character, Integer> occurrences) {
        Arbre tree = new Arbre();

        ArrayList<Branche> nodes = new ArrayList<>();
        Set<Character> iterateOccurrences = occurrences.keySet();
        for (Character character : iterateOccurrences) {
            nodes.add(new Branche(character, occurrences.get(character)));
        }
        nodes.sort(Branche::compareTo);

        tree.setRoot(recursivelyGenerateTree(nodes).get(0));

        return tree;
    }

    public ArrayList<Branche> recursivelyGenerateTree(ArrayList<Branche> nodes) {
        if (nodes.size() == 1) {
            return nodes;
        }

        Branche firstNode = nodes.remove(0);
        Branche secondNode = nodes.remove(0);
        Branche newNode = new Branche(null, firstNode.getCount() + secondNode.getCount());
        newNode.setFirst(firstNode);
        newNode.setSecond(secondNode);

        nodes.add(newNode);
        nodes.sort(Branche::compareTo);

        return recursivelyGenerateTree(nodes);
    }

    public void generateCharacterCode(HashMap<Character, String> characterCode, Branche node, String code) {
        if (node.getCharacter() == null) {
            generateCharacterCode(characterCode, node.getFirst(), code + "0");
            generateCharacterCode(characterCode, node.getSecond(), code + "1");
        }
        if (node.getCharacter() != null) {
            characterCode.put(node.getCharacter(), code);
        }
    }
}
