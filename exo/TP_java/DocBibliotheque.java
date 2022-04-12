package exo.TP_java;

import exo.TP_java.notification.Notifiable;

public class DocBibliotheque {
    private String titre;
    private String code;        // 000. OOO A000A
    private String auteur;
    public String typeDoc;

    static int countEmprunt = 0;
    static int countRetour = 0;
    static int countSectionReservation = 0;

    private MembreBibliotheque emprunteur;
    private Notifiable reservateur;




    enum etat {
        etagère,
        emprunté,
        pile_de_retour,
        section_de_reservation
    }


    etat ou = etat.etagère;

    private boolean reservé = false;

    /*
    0: etagère
    1: emprunté
    2: pile de retour
     */


    private int annee;

    public DocBibliotheque(){

    }
    public DocBibliotheque(String titre, String code, String auteur, int annee) {
        this.titre = titre;
        this.annee = annee;
        this.code = code;
        this.auteur = auteur;
    }
    //todo reservation
    public boolean reservation(MembreBibliotheque me) {//initialise une reservation
        boolean test = false;

        if (!reservé && ou == etat.emprunté && me != null && me!=emprunteur) {
            reservateur = me;
            reservé = true;
            test = true;


        }
        return test;
    }
    //todo dereservation
    public boolean dereservation() {//annule une reservation
        boolean test = false;
        if (reservé) {
            if (ou == etat.section_de_reservation) {
                countSectionReservation--;
                ou = etat.pile_de_retour;
                countRetour++;
            }
            if(reservateur!=null) System.out.println(reservateur.docDisponible(this));

            reservateur = null;
            reservé = false;
            test = true;
        }
        return test;
    }//---------------------------------------
    //todo rangement
    public boolean rangement() {//enlève le livre de la pile de retour pour la mettre sur une etagere
        boolean test = false;
        if (ou == etat.pile_de_retour) {
            countRetour--;
            ou = etat.etagère;
            test = true;
        }
        return test;
    }//----------------------------------------
    //todo retour
    public boolean retour() {//place le livre sur la pile de retour ou dans la section de reservation
        boolean test = false;
        if (ou == etat.emprunté) {

            if (reservé) {
                countSectionReservation++;
                ou = etat.section_de_reservation;

            } else {
                ou = etat.pile_de_retour;

                countRetour++;
            }
            emprunteur.removeDoc();
            emprunteur = null;
            countEmprunt--;
            test = true;
        }
        return test;
    }//---------------------------------------------
    //todo emprunt
    public boolean emprunt(MembreBibliotheque me)  throws Exception {//pour emprunter le livre
        boolean test = false;

        if (me != null && me.peutEmprunterUnAutreDocument()) {
            if (ou == etat.section_de_reservation && reservateur!=null && me == reservateur) {
                countEmprunt++;
                countSectionReservation--;
                reservé = false;
                emprunteur = me;
                emprunteur.addDoc();
                ou = etat.emprunté;
                test = true;
                reservateur = null;
            }
            else if (ou == etat.etagère) {
                countEmprunt++;
                emprunteur = me;emprunteur.addDoc();
                ou = etat.emprunté;
                test = true;
            }

        }
        if (!test)throw new Exception("not enouth space");
        return test;
    }//-----------------------------------------------
    //todo autre
    void statut() {
        System.out.println("où: '" + ou + "'\test reservé: '" + reservé + "'");
    }

    static public void statuDesLivre() {
        System.out.println(
                "nombre d'emprunt=" + countEmprunt +
                        ", nombre dans la pile de retour='" + countRetour +
                        ", nombre dans la section de reservation='" + countSectionReservation
                +"\n"
        );

    }

    @Override
    public String toString() {
        return "DocBibliotheque{" +
                "titre='" + titre + '\'' +
                ", code='" + code + '\'' +
                ", auteur='" + auteur + '\'' +
                ", emprunteur=" + emprunteur +
                ", reservateur=" + reservateur +
                ", ou=" + ou +
                ", reservé=" + reservé +
                ", annee=" + annee +
                '}';
    }


    public void setEmprunteur(MembreBibliotheque emprunteur) {
        this.emprunteur = emprunteur;
    }

    public void setReservateur(MembreBibliotheque reservateur) {
        this.reservateur = reservateur;
    }

    public MembreBibliotheque getEmprunteur() {
        return emprunteur;
    }

    public Notifiable getReservateur() {
        return reservateur;
    }

    void changeName(String name) {
        titre = name;
    }

    void changeCode(String code) {
        this.code = code;
    }

    void changeAuteur(String auteur) {
        this.auteur = auteur;
    }

    void changeAnnee(int annee) {
        this.annee = annee;
    }

    String getName() {
        return titre;
    }

    String getTitre() {
        return titre;
    }

    String getCode() {
        return code;
    }

    String getAuteur() {
        return auteur;
    }

    void printBook() {
        System.out.println("titre: " + titre + " auteur: " + auteur + " code: " + code + " annee: " + annee);
    }
}
