import java.util.ArrayList;
import java.util.Scanner;

public class App {
/*
Son las elecciones! Se van a mostrar gráficamente los resultados de cada partido.
Crea una clase Partido con los datos: nombre y porcentaje. Instancia al menos 5
partidos.
Pedir el porcentaje de votos recibido para cada uno de los partidos. Impide que
se escriba un tipo diferente mediante hasNext() (ej: si se pide un entero, usar
teclado.hasNextInt() )
Cuando estén introducidos todos los resultados, crear un método que muestre barras
de resultado para cada uno de los participantes. Puedes escoger cualquier carácter
alfanumérico habitual, como *, o #.

Cuando acabe que pregunte: ¿Actualizar resultados (S/N)? Si dice que sí, limpia
el terminal y vuelve a preguntar los resultados. Si dice que no, limpia el terminal
y escribe “hasta la próxima!” y se acaba el programa. Debe existir una clase Metodos,
que contenga los métodos:
- mostrarResultado()
- limpiarPantalla() borra la consola,
- aprietaEnter(). le dice “para seguir, aprieta enter”.

Son en total tres clases: principal, Partido y Metodos.
+EXTRA se pueden añadir controles del tipo: suma la cantidad más del 100% ?
+EXTRA: como controlarías may/min en S/N con tipo char
NOTA: el extended ASCII list (número ascii más de 127) puede dar error, o mostrar resultados diferentes según el sistema operativo o charset empleado.
 */
    public static void main(String[] args) throws Exception {
        System.out.println("ELECCIONES CATALUNYA 2024");

        Scanner teclado = new Scanner(System.in);
        ArrayList <Votos> escanVotos = new ArrayList<>();
        boolean activo = true;
        while (activo) {
            
        
        System.out.println("¿Cuántos partidos han salido representados?");
        int numPartidos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Cuál es el total de escaños?");
        int totalEscanos = teclado.nextInt();
        teclado.nextLine();
        for(int i=0; i<numPartidos; i++){
            System.out.println("Indica el nombre del partido " + (i+1));
            String nombrePartido = teclado.nextLine();
            System.out.println("Indica el número de escaños del " + nombrePartido);
            int escanosPartido = teclado.nextInt();
            teclado.nextLine();
            escanVotos.add(new Votos(nombrePartido, escanosPartido));
        }
        System.out.println("\naprieta ENTER para continuar");
        Metodos.aprietaEnter(teclado);
        Metodos.mostrarResultado(escanVotos);

        System.out.println("¿Quieres actualizar los resultados?(S/N)");
        Character actualiar = teclado.next().charAt(0);
        if(actualiar=='N'){
        
        Metodos.limpiarPantalla();
        System.out.println("hata la proxima");
        activo=false;
        }else {Metodos.limpiarPantalla();}

        }
            

        }

        
    }

