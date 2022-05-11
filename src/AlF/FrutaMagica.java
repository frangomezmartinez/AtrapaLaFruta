package AlF;

public class FrutaMagica extends Fruta {
	protected int posicionX;
	protected int posicionY;
	protected int alto;
	protected int ancho;
	protected String imagen;
	protected char simbolo;
	private int puntos;
	private String nombre;
	private String efecto;
	
	public FrutaMagica(int posicionX, int posicionY, int alto, int ancho, String imagen, char simbolo) {
		super(posicionX, posicionY, alto, ancho, imagen, simbolo);
		
	
		switch(simbolo) {
		case 'G':
			this.nombre="Dorada";
			this.puntos=300;
			this.efecto="Correr";
			this.imagen="G";
			break;
		case 'H':
			this.nombre="Harry Potter";
			this.puntos=-50;
			this.efecto="Desaparecer";
			this.imagen="H";
			break;
		case 'V':
			this.nombre="Venenosa";
			this.puntos=-100;
			this.efecto="Ralentizar";
			this.imagen="V";
			break;
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEfecto() {
		return efecto;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setEfecto(Fruta a) {
		char sim = a.getSimbolo();
		switch(simbolo) {
		case 'G':
			this.efecto="Correr";
			break;
		case 'H':
			this.efecto="Desaparecer";
			break;
		case 'V':
			this.efecto="Ralentizar";
			break;
		}
		
	}
	
	public void mostrarDatos() {
		System.out.println("La fruta obtenida se llama "+nombre+ ", cuyos puntos son "+puntos +" y efecto es " +efecto);
	}
}
