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
		System.out.println("Nivel 1"); //Para primer escenario
		System.out.println("Nivel 2"); //Para segundo escenario
		System.out.println("Nivel 3"); //Para tercer escenario
		System.out.println("Nivel 4");
		
		choice = scanner.nextInt();
		//Creamos un switch para crear cualquier nivel que nos pidan
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
		Timer timer = new Timer();
		timer.schedule(new TimerJuego(this), 0, 200);
		
		scanner.nextLine();
		while(true) {
			String entrada = scanner.nextLine();
			if(entrada.equals("")) {
			this.escenario.saltarPersonaje();	
			}
		}		
	}	
//Metodo cogido del enunciado de la practica
public void dibujarEscenario(ArrayList<Elemento> elementos, int WIDTH, int HEIGHT) { 
	try {
		 char[][] escenarioTextual = new char[WIDTH][HEIGHT];  
		  for (int i = 0; i < WIDTH; i++) {     
		    for (int j = 0; j < HEIGHT; j++) {           
		      if (j==0) {              
		        escenarioTextual[i][j] = '#';           
		      }else {              
		        escenarioTextual[i][j] = ' ';          
		       }        
		    }     
		  }     
		  for (Elemento elemento: elementos) {      
		    escenarioTextual[elemento.getPosicionX()][elemento.getPosicionY()] = elemento.getSimbolo();
		  }     
		  for (int y =HEIGHT - 1; y >= 0; y--) {        
		    for (int x = 0; x < WIDTH; x++) {           
		      if (y==0) {              
		        System.out.printf("#");           
		      }else {
		        System.out.printf(Character.toString(escenarioTextual[x][y]));           
		      }        
		    }        
		    System.out.printf("\n");     
		  }  
	}
	  catch(ArrayIndexOutOfBoundsException e) {
		  this.escenario.personaje.mostrarDatos();
	  }
	}

public boolean jugando() {
	boolean verificar = true;
	if(verificar == true) {
		this.mover=true;
		dibujarEscenario(this.escenario.getElementos(), ancho, alto);
		if(this.mover) {
			this.escenario.jugando();
			this.escenario.personaje.avanzar();
			}
		}
	return verificar;
}

}
