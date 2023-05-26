package es.iesmz.ed.algoritmos;

public class Hyperpar {
    public static boolean comprobarHyper(long numero){
        int cont=0;
        for(int i=0;i<String.valueOf(numero).length();i++){
            if(String.valueOf(numero).charAt(i)%2==0) cont++;
        }
        if(String.valueOf(numero).length()==cont) return true;
        return false;
    }
}
