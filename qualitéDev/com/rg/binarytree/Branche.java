package qualitéDev.com.rg.binarytree;

public class Branche implements Comparable {
    private final Character character;
    private int count;
    private Branche droite;
    private Branche gauche;

    public Branche(Character character, int count) {
        this.character = character;
        this.count = count;
        this.droite = null;
        this.gauche = null;


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

    public Branche getDroite() {
        return droite;
    }

    public void setDroite(Branche droite) {
        this.droite = droite;
    }

    public Branche getGauche() {
        return gauche;
    }

    public void setGauche(Branche gauche) {
        this.gauche = gauche;
    }

    public int compareTo(Object o) {
        return Integer.compare(this.getCount(), ((Branche) o).getCount());
    }

    @Override
    public String toString() {
        return "{BRUH'" + character + "' : " + count + "}";
    }
}
