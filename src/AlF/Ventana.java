package AlF;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
public class Ventana {
	protected Escenario escenario;
	private final int ancho = 80;
	private final int alto = 80;
	private boolean mover = false;
	
	//Constructor
	public Ventana() {
		this.escenario = new Escenario(alto, ancho);
	}
	// Métodos get
	public int getAlto() {
		return alto;
	}
	public int getAncho() {
		return ancho;
	}
	
	//Metodo que muestra en pantalla los escenarios a elegir
public void mostrarMenu() {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		System.out.println("Selecciona un nivel o escenario por jugar");
		System.out.println();
		System.out.println("Nivel 1"); 
		System.out.println("Nivel 2"); 
		System.out.println("Nivel 3"); 
		System.out.println("Nivel 4");
		
		choice = scanner.nextInt();
		
		switch(choice) {
			case 1:
				this.escenario.crearEscenario1();
				break;
			case 2:
				this.escenario.crearEscenario2();
				break;
			case 3:
				this.escenario.crearEscenario3();
				break;
			case 4:
				this.escenario.crearEscenario4();
				break;
			default:
				System.out.println("Solo se puede escoger un escenario del 1 al 4 introduciendo un número del 1 al 4");
				break;
		}
}


}
