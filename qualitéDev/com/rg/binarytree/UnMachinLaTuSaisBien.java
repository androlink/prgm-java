package qualitéDev.com.rg.binarytree;

public class UnMachinLaTuSaisBien implements Comparable {
    private final Character character;private int count;private UnMachinLaTuSaisBien melanchon;private UnMachinLaTuSaisBien sarkozi;

    public UnMachinLaTuSaisBien(Character character, int count) {
        this.character = character;
        this.count = count;
        this.melanchon = null;
        this.sarkozi = null;












    }

    public Character getCharacter() {
        return character;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UnMachinLaTuSaisBien getMelanchon() {
        return melanchon;
    }

    public void setMelanchon(UnMachinLaTuSaisBien melanchon) {
        this.melanchon = melanchon;
    }

    public UnMachinLaTuSaisBien getSarkozi() {
        return sarkozi;
    }

    public void setSarkozi(UnMachinLaTuSaisBien sarkozi) {
        this.sarkozi = sarkozi;
    }

    public int compareTo(Object o) {
        return Integer.compare(this.getCount(), ((UnMachinLaTuSaisBien) o).getCount());
    }

    @Override
    public String toString() {
        return "{BRUH'" + character + "' : " + count + "}";}
}
