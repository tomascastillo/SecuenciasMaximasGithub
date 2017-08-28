package SecuenciasMaximas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
import java.util.ArrayList;
public class SecuenciasMaximas {
	
	public static void main(String[] args) throws IOException {
		String miPath = "maximas.in";
		Scanner sc = new Scanner(new File(miPath));
		sc.useLocale(Locale.ENGLISH);
		ArrayList<Integer> arrayListSeguidos = new ArrayList<Integer>();
		int [] vec = new int[sc.nextInt()]; // vector para almacenar la lectura. tamaño es la operacion sc next int, primero lee un entero, sc es archivo. leeme el proximo entero
		for (int i = 0; i < vec.length ; i++) {
			vec[i] =sc.nextInt() ;
		}
		sc.close();
		int contadorValidos=0,contadorSeguidos=0,bandera=0;
		for (int i = 0; i < vec.length ; i++) {
			if(vec[i]%2!=0&&vec[i]%3!=0&&vec[i]%5!=0)///se podria probar algo de la validez  con esta condicion del if
			{
				contadorValidos++;
				contadorSeguidos++;
			}
			else
			{
				if(contadorSeguidos>0)
				{
					arrayListSeguidos.add(contadorSeguidos);
					contadorSeguidos=0;
				}
			}
			System.out.println( vec[i]);
		}
		int mayor=0,j=0,tam=arrayListSeguidos.size(),elementoLista=0;
		if(tam>0)
		{
			for(j=0;j<tam;j++)
			{
				elementoLista=arrayListSeguidos.get(j);
				if(elementoLista>mayor)
				{
					mayor=elementoLista;
				}
			}
		}
		
		String miPath2 = "salida.out";
		
		PrintWriter salida = new PrintWriter(new FileWriter(miPath2));  //  preparo el arch de salida
		
		/*for (int i : vec) {//parecido al foreach
			
			salida.print(i);
			salida.println("\n");
		}*/
		
		salida.print(contadorValidos);
		salida.println("\n");
		salida.print(mayor);
		salida.println("\n");
		
		
		salida.close(); //esto escribe : dni: 50
		
	}
}

	