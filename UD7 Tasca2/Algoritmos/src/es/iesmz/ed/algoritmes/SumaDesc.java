package es.iesmz.ed.algoritmes;

public class SumaDesc {
    public static int suma(long numero){
        String s=String.valueOf(numero);
        int suma=0;
        for (int i=0;i<String.valueOf(numero).length();i++) suma+=Integer.parseInt(s.substring(i));
        return suma;
    }
}