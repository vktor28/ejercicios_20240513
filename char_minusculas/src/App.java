public class App {
    public static void main(String[] args) throws Exception {
        /*
1- PRINTAR CARACTERES LETRAS MINUSCULAS
 Mediante un bucle de que recorre tipos char, imprime todas las letras minúsculas de la 'a' a la 'z'.
+EXTRA: imprimir las mayúsculas y las minúsculas sin los signos entre medio.
        */
        char miLetra='A';
        int numLetra = miLetra;
        for(int i=65; i<=122; i++){
            miLetra = (char) (numLetra);
            if(i<91 || i>96){
            System.out.println(miLetra);}
            numLetra++;
        }
    }
}
