package es.iesmz.ed.algoritmes;

public class Cableado {
    public static boolean ordenar(String orden){
        if(orden.equals("HM") || orden.equals("MH+HM") || orden.equals("HM+HH+MM")) return true;
        if(orden.equals("HH") || orden.equals("MM")) return false;
        return false;
    }
}