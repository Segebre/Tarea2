import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Tarea2
{
	public static void main (String args[])
	{		
		int modo = 5;
		char opcion = ' ';
		Scanner scan = new Scanner(System.in);
		
		while (modo != 1 || modo != 2 || modo != 3 || modo != 0)
		{
			for (int i=1; i<45; i++){System.out.print("\n");}
			System.out.println("Seleccione una opcion:");
			System.out.println("(1) Jugar modo 3 X 3");
			System.out.println("(2) Jugar modo 4 X 4");
			System.out.println("(3) Ver creditos");
			System.out.println("(0) Salir!");
			for (int i=1; i<19; i++){System.out.print("\n");}
			System.out.print("Opcion: ");
			try{modo = scan.nextInt();}catch(Exception e){System.out.print("Opcion invalida"); System.exit(1);}
		
			//3 X 3
			if (modo == 1)
			{
				//Variables
				//Para lograr que los numeros fueran al azar los cambie a txto y use la funcion aprendida de "http://chronicles.blog.ryanrampersad.com/2008/10/shuffle-an-array-in-java/", 
				//no pude hacerlo con numeros, creo que me falto una libreria que no pude encontrar.
				String[] lista = new String[]{" ", "1", "2", "3", "4", "5", "6", "7", "8"};
				Collections.shuffle(Arrays.asList(lista));
				String cas11 = lista[1];
				String cas12 = lista[2];
				String cas13 = lista[3];
				String cas21 = lista[4];
				String cas22 = lista[5];
				String cas23 = lista[6];
				String cas31 = lista[7];
				String cas32 = lista[8];
				String cas33 = lista[0];
				
				while (cas11 != "1" || cas12 != "2" || cas13 != "3" || cas21 != "4" || cas22 != "5" || cas23 != "6" || cas31 != "7" || cas32 != "8" || cas33 != " ")
				{
					for (int i=1; i<45; i++){System.out.print("\n");}
					System.out.println("                                " + cas11 + "        " + cas12 + "        "  + cas13 + "\n\n\n");
					System.out.println("                                " + cas21 + "        " + cas22 + "        "  + cas23 + "\n\n\n");
					System.out.println("                                " + cas31 + "        " + cas32 + "        "  + cas33);
					System.out.print("pressione (e) en cualquier momento para salir\nUse wasd para mover: ");
					opcion = scan.next().charAt(0);

					// letra S
					if (opcion == 's')
					{
						//linea numero 3
						if (cas33 == " ")
						{
							cas33 = cas23;
							cas23 = " ";
						}
						else if (cas32 == " ")
						{
							cas32 = cas22;
							cas22 = " ";
						}
						else if (cas31 == " ")
						{
							cas31 = cas21;
							cas21 = " ";
						}
						
						//linea numero 2
						else if (cas23 == " ")
						{
							cas23 = cas13;
							cas13 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas12;
							cas12 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas11;
							cas11 = " ";
						}
					}
					
					// letra W
					if (opcion == 'w')
					{
						//linea numero 2
						if (cas23 == " ")
						{
							cas23 = cas33;
							cas33 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas32;
							cas32 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas31;
							cas31 = " ";
						}
						
						//linea numero 1
						else if (cas13 == " ")
						{
							cas13 = cas23;
							cas23 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas22;
							cas22 = " ";
						}
						else if (cas11 == " ")
						{
							cas11 = cas21;
							cas21 = " ";
						}
					}
					
					// letra D
					if (opcion == 'd')
					{
						//columna numero 3
						if (cas33 == " ")
						{
							cas33 = cas32;
							cas32 = " ";
						}
						else if (cas23 == " ")
						{
							cas23 = cas22;
							cas22 = " ";
						}
						else if (cas13 == " ")
						{
							cas13 = cas12;
							cas12 = " ";
						}
						
						//columna numero 2
						else if (cas32 == " ")
						{
							cas32 = cas31;
							cas31 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas21;
							cas21 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas11;
							cas11 = " ";
						}
					}
					
					// letra A
					if (opcion == 'a')
					{
						//columna numero 2
						if (cas32 == " ")
						{
							cas32 = cas33;
							cas33 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas23;
							cas23 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas13;
							cas13 = " ";
						}
						
						//columna numero 1
						else if (cas31 == " ")
						{
							cas31 = cas32;
							cas32 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas22;
							cas22 = " ";
						}
						else if (cas11 == " ")
						{
							cas11 = cas12;
							cas12 = " ";
						}
					}
					
					//Exit
					if( opcion == 'e')
					{
						System.out.print("El juego se ha cerrado!");
						System.exit(1);
					}
				}
				for (int i=1; i<45; i++){System.out.print("\n");}
				System.out.println("                                " + cas11 + "        " + cas12 + "        "  + cas13 + "\n\n\n");
				System.out.println("                                " + cas21 + "        " + cas22 + "        "  + cas23 + "\n\n\n");
				System.out.println("                                " + cas31 + "        " + cas32 + "        "  + cas33);
				System.out.print("Felicidades, has ganado!");
				System.exit(1);
			}
			
			// 4 X 4
			else if (modo == 2)
			{
				//Variables
				//Para lograr que los numeros fueran al azar los cambie a txto y use la funcion aprendida de "http://chronicles.blog.ryanrampersad.com/2008/10/shuffle-an-array-in-java/", 
				//no pude hacerlo con numeros, creo que me falto una libreria que no pude encontrar.
				String[] lista = new String[]{" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
				Collections.shuffle(Arrays.asList(lista));
				String cas11 = lista[0];
				String cas12 = lista[1];
				String cas13 = lista[2];
				String cas14 = lista[3];
				String cas21 = lista[4];
				String cas22 = lista[5];
				String cas23 = lista[6];
				String cas24 = lista[7];
				String cas31 = lista[8];
				String cas32 = lista[9];
				String cas33 = lista[10];
				String cas34 = lista[11];
				String cas41 = lista[12];
				String cas42 = lista[13];
				String cas43 = lista[14];
				String cas44 = lista[15];

				while (cas11 != "1" || cas12 != "2" || cas13 != "3" || cas14 != "4" || cas21 != "5" || cas22 != "6" || cas23 != "7" || cas24 != "8" || cas31 != "9" || cas32 != "10" || cas33 != "11" || cas34 != "12" || cas41 != "13" || cas42 != "14" || cas43 != "15" || cas44 != " ")
				{
					for (int i=1; i<45; i++){System.out.print("\n");}
					System.out.println("                           " + cas11 + "        " + cas12 + "        "  + cas13 + "        " + cas14 + "\n\n\n");
					System.out.println("                           " + cas21 + "        " + cas22 + "        "  + cas23 + "        " + cas24 + "\n\n\n");
					System.out.println("                           " + cas31 + "        " + cas32 + "        "  + cas33 + "        " + cas34 + "\n\n\n");
					System.out.println("                           " + cas41 + "        " + cas42 + "        "  + cas43 + "        " + cas44);
					System.out.print("pressione (e) en cualquier momento para salir\nUse wasd para mover: ");
					opcion = scan.next().charAt(0);

					// letra S
					if (opcion == 's')
					{
						//linea numero 4
						if (cas44 == " ")
						{
							cas44 = cas34;
							cas34 = " ";
						}
						else if (cas43 == " ")
						{
							cas43 = cas33;
							cas33 = " ";
						}
						else if (cas42 == " ")
						{
							cas42 = cas32;
							cas32 = " ";
						}
						else if (cas41 == " ")
						{
							cas41 = cas31;
							cas31 = " ";
						}

						//linea numero 3
						else if (cas34 == " ")
						{
							cas34 = cas24;
							cas24 = " ";
						}
						else if (cas33 == " ")
						{
							cas33 = cas23;
							cas23 = " ";
						}
						else if (cas32 == " ")
						{
							cas32 = cas22;
							cas22 = " ";
						}
						else if (cas31 == " ")
						{
							cas31 = cas21;
							cas21 = " ";
						}
						
						//linea numero 2
						else if (cas24 == " ")
						{
							cas24 = cas14;
							cas14 = " ";
						}
						else if (cas23 == " ")
						{
							cas23 = cas13;
							cas13 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas12;
							cas12 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas11;
							cas11 = " ";
						}
					}
					
					// letra W
					if (opcion == 'w')
					{
						//linea numero 3
						if (cas34 == " ")
						{
							cas34 = cas44;
							cas44 = " ";
						}
						else if (cas33 == " ")
						{
							cas33 = cas43;
							cas43 = " ";
						}
						else if (cas32 == " ")
						{
							cas32 = cas42;
							cas42 = " ";
						}
						else if (cas31 == " ")
						{
							cas31 = cas41;
							cas41 = " ";
						}
						
						//linea numero 2
						else if (cas24 == " ")
						{
							cas24 = cas34;
							cas34 = " ";
						}
						else if (cas23 == " ")
						{
							cas23 = cas33;
							cas33 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas32;
							cas32 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas31;
							cas31 = " ";
						}
						
						//linea numero 1
						else if (cas14 == " ")
						{
							cas14 = cas24;
							cas24 = " ";
						}
						else if (cas13 == " ")
						{
							cas13 = cas23;
							cas23 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas22;
							cas22 = " ";
						}
						else if (cas11 == " ")
						{
							cas11 = cas21;
							cas21 = " ";
						}
					}
					
					// letra D
					if (opcion == 'd')
					{
						//columna numero 4
						if (cas44 == " ")
						{
							cas44 = cas43;
							cas43 = " ";
						}
						 else if (cas34 == " ")
						{
							cas34 = cas33;
							cas33 = " ";
						}
						else if (cas24 == " ")
						{
							cas24 = cas23;
							cas23 = " ";
						}
						else if (cas14 == " ")
						{
							cas14 = cas13;
							cas13 = " ";
						}
						
						//columna numero 3
						else if (cas43 == " ")
						{
							cas43 = cas42;
							cas42 = " ";
						}
						 else if (cas33 == " ")
						{
							cas33 = cas32;
							cas32 = " ";
						}
						else if (cas23 == " ")
						{
							cas23 = cas22;
							cas22 = " ";
						}
						else if (cas13 == " ")
						{
							cas13 = cas12;
							cas12 = " ";
						}
						
						//columna numero 2
						else if (cas42 == " ")
						{
							cas42 = cas41;
							cas41 = " ";
						}
						else if (cas32 == " ")
						{
							cas32 = cas31;
							cas31 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas21;
							cas21 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas11;
							cas11 = " ";
						}
					}
					
					// letra A
					if (opcion == 'a')
					{
						//columna numero 3
						if (cas43 == " ")
						{
							cas43 = cas44;
							cas44 = " ";
						}
						else if (cas33 == " ")
						{
							cas33 = cas34;
							cas34 = " ";
						}
						else if (cas23 == " ")
						{
							cas23 = cas24;
							cas24 = " ";
						}
						else if (cas13 == " ")
						{
							cas13 = cas14;
							cas14 = " ";
						}
						
						//columna numero 2
						if (cas42 == " ")
						{
							cas42 = cas43;
							cas43 = " ";
						}
						else if (cas32 == " ")
						{
							cas32 = cas33;
							cas33 = " ";
						}
						else if (cas22 == " ")
						{
							cas22 = cas23;
							cas23 = " ";
						}
						else if (cas12 == " ")
						{
							cas12 = cas13;
							cas13 = " ";
						}
						
						//columna numero 1
						else if (cas41 == " ")
						{
							cas41 = cas42;
							cas42 = " ";
						}
						else if (cas31 == " ")
						{
							cas31 = cas32;
							cas32 = " ";
						}
						else if (cas21 == " ")
						{
							cas21 = cas22;
							cas22 = " ";
						}
						else if (cas11 == " ")
						{
							cas11 = cas12;
							cas12 = " ";
						}
					}
					
					//Exit
					if( opcion == 'e')
					{
						System.out.print("El juego se ha cerrado!");
						System.exit(1);
					}
				}
				for (int i=1; i<45; i++){System.out.print("\n");}
				System.out.println("                                " + cas11 + "        " + cas12 + "        "  + cas13 + "        " + cas14 + "\n\n\n");
				System.out.println("                                " + cas21 + "        " + cas22 + "        "  + cas23 + "        " + cas24 +  "\n\n\n");
				System.out.println("                                " + cas31 + "        " + cas32 + "        "  + cas33 + "        " + cas34 +  "\n\n\n");
				System.out.println("                                " + cas41 + "        " + cas42 + "        "  + cas43 + "        " + cas44);
				System.out.print("Felicidades, has ganado!");
				System.exit(1);
			}
			
			else if (modo == 3)
			{
				for (int i=1; i<45; i++){System.out.print("\n");}
				System.out.println("Creador: Juan Enrique Segebre\n");
				System.out.println("Idea: Ing. Ahmed Castro\n");
				System.out.print("Gracias por jugar!  :D");
				for (int i=1; i<20; i++){System.out.print("\n");}
				System.exit(1);
			}
			
			else if (modo == 0)
			{
				System.out.print("El juego se ha cerrado!");
				System.exit(1);
			}
		}
	}
}