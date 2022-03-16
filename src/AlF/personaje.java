package AlF;
import java.util.ArrayList;
public class personaje extends Elemento {
	protected int velocidad;
	protected int desaparecer;
	protected int contadordesaparecer;
	protected int contadorsaltar;
	protected ArrayList<Fruta> frutas;
	
	public  personaje(int posicionX, int posicionY, int ancho, int alto, String imagen, int velocidad, char simbolo) {
		super(posicionX,posicionY, ancho,alto, imagen, simbolo );
		this.velocidad= velocidad;
		this.frutas= new ArrayList<Fruta>();
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
}
