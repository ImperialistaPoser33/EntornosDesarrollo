package es.iesmz.ed.algoritmos;

public class Factoriales {
    public static long divisionFactoriales(int num1,int num2){
        long factorial1=calcularFactorial(num1);
        long factorial2=calcularFactorial(num2);

        if(factorial1==0) return 0;

        return factorial1/factorial2;
    }

    public static long calcularFactorial(int num){
        long factorial=1;

        for(int i=2;i<=num;i++) factorial*=i;

        return factorial;
    }
}