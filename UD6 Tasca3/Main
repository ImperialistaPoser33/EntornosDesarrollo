import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String pw;

        /*
        EJEMPLOS (False):
        comillas  hola    holacaracola    hola12  holA    hola    holaA   hola12  hola12A     holacaracola12  holacaracola
        holacaracolA    ho12A   holacaracolaA   holacaracola12  holacaracola12A

        EJEMPLOS (True):
        holacaracola12A!    #P4blit0cl4v0uncl4vit0#
         */

        try{
            System.out.println("Validador de contraseña compleja: (Al menos: 1 minuscula, 1 mayuscula, 1 numero, 1 caracter especial"+
                    "(!@#&()–{}:;',?/*~$^+=<>). Longitud minima de 8, maxima de 50. No se permiten espacios en blanco.");
            System.out.print("Escribe: ");
            pw=sc.nextLine();

            Password pwVerify = new Password(pw);
        }catch(InputMismatchException | InvalidPassWordException e){
            e.printStackTrace();
        }
    }
}
