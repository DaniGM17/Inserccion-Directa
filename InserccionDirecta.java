import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author dania
 */
public class InserccionDirecta {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] leerArreglo(int n) throws IOException {
        int[] a = new int[n];
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
        return a;
    }


    public static int[] inserccionDirecta(int[] listaD) {
       for(int k=1; k<listaD.length;k++){
           int mantener = listaD[k];
           int j = k-1;
           while(j>=0 && mantener<=listaD[j]){
               listaD[j+1] = listaD[j];
               j=j-1;
           }
           listaD[j+1]=mantener;
       }
        return listaD;
    }

    public static void imprimirArreglo(int[] a) {
        System.out.println("-------------------------");
        System.out.println("Lista ordenada");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int[] array;
        int t;
        System.out.println("Programa que ordena la lista de números");
        System.out.println("Escribe la longitud de la lista a ingresar: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        array = leerArreglo(t);
        array = inserccionDirecta(array);
        imprimirArreglo(array);
    }

}
