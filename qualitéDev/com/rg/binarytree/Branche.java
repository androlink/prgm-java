package qualitéDev.com.rg.binarytree;

public class Branche implements Comparable {
    private final Character character;
    private int count;
    private Branche first;
    private Branche second;

    public Branche(Character character, int count) {
        this.character = character;
        this.count = count;
        this.first = null;
        this.second = null;


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

    public Branche getFirst() {
        return first;
    }

    public void setFirst(Branche first) {
        this.first = first;
    }

    public Branche getSecond() {
        return second;
    }

    public void setSecond(Branche second) {
        this.second = second;
    }

    public int compareTo(Object o) {
        return Integer.compare(this.getCount(), ((Branche) o).getCount());
    }

    @Override
    public String toString() {
        return "{BRUH'" + character + "' : " + count + "}";
    }
}
