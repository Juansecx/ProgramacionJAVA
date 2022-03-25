import java.util.Scanner;

public class OcaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int minDado, maxDado, fichaJ1, fichaJ2, tirada1, tirada2;
		String ronda;
		String nomJ1;
		String nomJ2;

		System.out.println("!BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("");
		System.out.println("¿Cual es el numero mínimo del dado?");
		minDado = sn.nextInt();
		System.out.println("¿Cual es el numero máximo del dado?");
		maxDado = sn.nextInt();
		System.out.println("¿Cual es el nombre del jugador 1?");
		nomJ1 = sn.next();
		do {
			System.out.println("¿Cual es el nombre del jugador 2?");
			nomJ2 = sn.next();

			if (nomJ1.equals(nomJ2)) {

				System.out.println("Los nombres no pueden coincidir");
			}
		} while (nomJ1.equals(nomJ2));

		System.out.println("");
		boolean tiradaV ;
		do {
			pintaPista();
			System.out.println("");
			System.out.println("Pulse cualquier tecla  para la siguiente ronda");
			System.out.print(">:");
			ronda = sn.next();
			System.out.println("");
			System.out.println("Turno del jugador 1 " + nomJ1);
			tirada1 = (int) (Math.random() * 11);
			tirada2 = (int) (Math.random() * 11);
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada");
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada");

			// Numero primo¿?

			if ((tirada1 + tirada2) %2 == 0) {
				tiradaV = true;
				System.out.println("TIRADA VÁLIDA");
				fichaJ1=tirada1+tirada2;
				
			} else {
				tiradaV = false;
				System.out.println("TIRADA NO VÁLIDA");
				System.out.println("No suma puntos ya que la suma de ambos números no es un número primo");
				fichaJ1=0;
			}
			
			// Numero primo¿?

						if (sumadeNumerosesPrimo(tirada1, tirada2)) {
							System.out.println("TIRADA VÁLIDA");
							fichaJ1=tirada1+tirada2;
							
						} else {
							System.out.println("TIRADA NO VÁLIDA");
							System.out.println("No suma puntos ya que la suma de ambos números no es un número primo");
							fichaJ1=0;
						}
			
			
			switch (fichaJ1) {
			
			case 1:
				
				pintaPista();
				
			
			
			}
			
			
			

		} while (tiradaV || !tiradaV);
		
		
	}

	public static int tiraDados(int min, int max) {

		int op;

		op = (int) Math.random() * (max - min) + 1;

		return op;

	}

	public static void pintaPista() {

		int TAMCIRCUITO = 11;
		String fichaJ1="J1",fichaJ2="J2";
		System.out.println("¡COMENCEMOS A JUGAR!");
		for (int i = 1; i <= TAMCIRCUITO; i++) {

			System.out.print("   " + i + " ");

		}

		System.out.print("\n"+fichaJ1+"          \n");
		System.out.print(fichaJ2+"           ");           

	}
	
	public static boolean sumadeNumerosesPrimo(int tirada1,int tirada2) {
	
		// Numero primo¿?
		
		boolean tiradaV;

					if ((tirada1 + tirada2) %2 == 0) {
						tiradaV = true;
						
						
					} else {
						tiradaV = false;
						
					}
					return tiradaV;
		
	}

}
