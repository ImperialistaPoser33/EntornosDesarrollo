import java.util.*;

public class Password {
    private String pw;

    public Password(String pw) throws InvalidPassWordException {
        if(pw.length()<8) throw new InputMismatchException("El numero minimo de caracteres para la contraseña es de 8.");
        if(pw.length()>50) throw new InputMismatchException("Maximo numero de caracteres excedido.");
        if(!pw.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>])(?=\\S+$).{8,50}$"))
            throw new InvalidPassWordException("La contraseña no cumple los requisitos de complejidad.");
        else System.out.print("Contraseña correcta!");
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
