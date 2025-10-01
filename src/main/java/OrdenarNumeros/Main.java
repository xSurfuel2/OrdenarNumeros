package OrdenarNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        try
        {
        InputStreamReader isr = new InputStreamReader(System.in); //flujo de entrada
        BufferedReader br = new BufferedReader(isr); //buffer de lectura
        String linea=null;

            while ((linea = br.readLine())!=null) //lee hasta que no haya mas lineas
            {
                String datos[] = linea.split(" "); //Separa los datos por espacios con el metodo .split
                int numeros[] =new int [datos.length]; //Guarda los datos en un array de enteros
                for(int i=0;i<numeros.length;i++) //Recorre el array
                {
                    numeros[i] =Integer.parseInt(datos[i]); //Convierte los datos a enteros, el casting es para convertir el String en int.
                }
                Arrays.sort(numeros);
                System.out.println(Arrays.toString(numeros).replaceAll("[\\[\\],]","")); //Imprime el array ordenado, el replaceAll es para quitar los corchetes y las comas.
            }
        }
        catch (IOException ex) //Captura el error
            {
            System.out.println(ex.hashCode());
            }

    }
}