import java.util.Scanner;

public class App {

/*2- PRINTAR CARACTER SEGUN NUMERO
Pides al usuario que escriba un número entre el 33 y el 126, y le muestras
el carácter que le corresponde. Ejemplo:
Numero de usuario: 65.  Muestras la A mayúscula.

*/
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número del 33 al 129");
        int numero = teclado.nextInt();
        System.out.println((char)numero);
    }
}
