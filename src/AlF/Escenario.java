package AlF;
import java.util.ArrayList;
public class Escenario {
	
	protected int ancho;
	protected int alto;
	protected Personaje personaje;
	protected ArrayList<Elemento> elementos;
	
	
	//Constructor
	public Escenario(int ancho, int alto) {
		this.ancho=ancho;
		this.alto=alto;
		this.elementos= new ArrayList<Elemento>();
	}
	
	public int getAlto() {
		return alto;
	}
	public int getAncho() {
		return ancho;
	}
	public ArrayList <Elemento> getElementos() {
		return elementos;	
	}
	
	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos=elementos;
	}
	//Método para agregar personaje
	public void agregarPersonaje(int posicionX,int posicionY, int alto, int ancho,int velocidad) {
		this.personaje = new Personaje(posicionX, posicionY, alto, ancho, velocidad);
		elementos.add(personaje);
	}
	//Método para agregar fruta
	public void agregarFruta(int posicionX, int posicionY,int alto, int ancho, String imagen, char simbolo) {
		Fruta a = new Fruta(posicionX, posicionY, alto, ancho, imagen, simbolo);
		switch(simbolo) {
		case 'D':
			a.agregarFrutaDorada(posicionX, posicionY);
			break;
		case 'G':
			a.agregarFrutaDragon(posicionX, posicionY);
			break;
		case 'P':
			a.agregarFrutaPlateada(posicionX, posicionY);
			break;
		case 'H':
			a.agregarFrutaHarryPotter(posicionX, posicionY);
			break;
		case 'V':
			a.agregarFrutaVenenosa(posicionX, posicionY);
			break;
		}
		elementos.add(a);
	}
	
	//Metodos para agregar los distintos escenarios
		public void crearEscenario1() {
			this.agregarPersonaje(1, 1, 10, 10, 2);
			this.agregarFruta(21, 1, 1, 1, "D", 'D');
			this.agregarFruta(43, 1, 1, 1, "P", 'P');
		}
		public void crearEscenario2() {
			this.agregarPersonaje(1, 1, 10, 10, 2);
			this.agregarFruta(13, 1, 1, 1, "V", 'V');
			this.agregarFruta(53, 1, 1, 1, "G", 'G');		
		}
		public void crearEscenario3() {
			this.agregarPersonaje(1, 1, 10, 10, 2);
			this.agregarFruta(13, 1, 1, 1, "H", 'H');
			

		}
				
			
			//Metodo para que salte el personaje
			public void saltarPersonaje() {
				this.personaje.saltar();
			}
			
			public boolean jugando() {
				ArrayList<Elemento> el = new ArrayList<Elemento>();
				el = this.getElementos();
				for(int i = 0; i<el.size(); i++) {
					if(i > 0) {
						Elemento e = this.elementos.get(i);
						this.personaje.choca(e);
					}
				}
				return true;
			}
}
