package AlF;

public class Fruta extends Elemento {
	
	protected String nombre;
	protected int puntos;
	
	public Fruta(int posicionX, int posicionY, int alto, int ancho, String imagen, char simbolo) {
		super(posicionX, posicionY, alto, ancho, imagen, simbolo);
		
		switch(simbolo) {
		case 'D':
			this.nombre="Dragón";
			this.puntos=100;
			this.imagen="D";
			break;
		case 'G':
			this.nombre="Dorada";
			this.puntos=300;
			this.imagen="G";
			break;
		case 'P':
			this.nombre="Plateada";
			this.puntos=200;
			this.imagen="P";
			break;
		case 'H':
			this.nombre="Harry Potter";
			this.puntos=-50;
			this.imagen="H";
			break;
		case 'V':
			this.nombre="Venenosa";
			this.puntos=-100;
			this.imagen="V";
			break;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void agregarFrutaDragon(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaDorada(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaPlateada(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaHarryPotter(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	public void agregarFrutaVenenosa(int posicionX, int posicionY) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}

	public void mostrarDatos() {
		System.out.println("La fruta obtenida se llama "+nombre+ ", cuyos puntos son "+puntos);
	}
	
	public void setFormaFruta(char simbolo) {
		switch(simbolo) {
		case 'D':
			this.nombre="Dragón";
			this.puntos=100;
			this.imagen="D";
			break;
		case 'G':
			this.nombre="Dorada";
			this.puntos=300;
			this.imagen="G";
			break;
		case 'P':
			this.nombre="Plateada";
			this.puntos=200;
			this.imagen="P";
			break;
		case 'H':
			this.nombre="Harry Potter";
			this.puntos=-50;
			this.imagen="H";
			break;
		case 'V':
			this.nombre="Venenosa";
			this.puntos=-100;
			this.imagen="V";
			break;
		}
	}
	
}
