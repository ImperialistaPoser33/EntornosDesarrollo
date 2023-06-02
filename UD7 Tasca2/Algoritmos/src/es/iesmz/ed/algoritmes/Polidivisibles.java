package es.iesmz.ed.algoritmes;

public class Polidivisibles {
    public static boolean numPoli(long numero){
        String s=String.valueOf(numero);
        int suma=0;
        for (int i=0;i<String.valueOf(numero).length();i++){
            suma+=String.valueOf(numero).length()-1;
            return true;
        }
        return false;
    }
}