package exo.TP_java.personalExeption;

public class NombreHorsLimiteException extends Exception {

    public NombreHorsLimiteException(int i){
        super("nombre "+i + " est hors limite dans la situation actuelle");
    }

}
