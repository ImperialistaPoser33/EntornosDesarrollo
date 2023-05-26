package es.iesmz.ed.algoritmos;

public class Any {
    public static boolean comprobarAny(long numero){
        for(int i=0;i<String.valueOf(numero).length()-1;i++){
            for(int j=i+1;j<String.valueOf(numero).length();j++){
                if(String.valueOf(numero).charAt(i)==String.valueOf(numero).charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}