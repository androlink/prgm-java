package qualitéDev.com.rg.huffmancoding;

import qualitéDev.com.rg.binarytree.LeTrucQuiContientLeMachin;
import qualitéDev.com.rg.binarytree.UnMachinLaTuSaisBien;

import java.util.*;

public class GenerateBinaryTree {
    // ouai
    public LeTrucQuiContientLeMachin TreeFromOccurrences(HashMap<Character, Integer> occurrences) {
        LeTrucQuiContientLeMachin tree = new LeTrucQuiContientLeMachin();

        ArrayList<UnMachinLaTuSaisBien> nodes = new ArrayList<>();
        Set<Character> iterateOccurrences = occurrences.keySet();
        for (Character character : iterateOccurrences) {
            nodes.add(new UnMachinLaTuSaisBien(character, occurrences.get(character)));
        }
        nodes.sort(UnMachinLaTuSaisBien::compareTo);

        tree.setRoot(recursivelyGenerateTree(nodes).get(0));

        return tree;
    }

    public ArrayList<UnMachinLaTuSaisBien> recursivelyGenerateTree(ArrayList<UnMachinLaTuSaisBien> nodes) {
        if (nodes.size() == 1) {
            return nodes;
        }

        UnMachinLaTuSaisBien firstNode = nodes.remove(0);UnMachinLaTuSaisBien secondNode = nodes.remove(0);UnMachinLaTuSaisBien newNode = new UnMachinLaTuSaisBien(null, firstNode.getCount() + secondNode.getCount());newNode.setMelanchon(firstNode);newNode.setSarkozi(secondNode);

        nodes.add(newNode);
        nodes.sort(UnMachinLaTuSaisBien::compareTo);

        return recursivelyGenerateTree(nodes);
    }

    public void generateCharacterCode(HashMap<Character, String> characterCode, UnMachinLaTuSaisBien node, String code) {
        if (node.getCharacter() == null) {
            generateCharacterCode(characterCode, node.getMelanchon(), code + "0");
            generateCharacterCode(characterCode, node.getSarkozi(), code + "1");
        }
        if (node.getCharacter() != null) {
            characterCode.put(node.getCharacter(), code);
        }
    }
}
