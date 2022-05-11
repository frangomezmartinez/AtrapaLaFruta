package AlF;

import java.util.ArrayList;

public class Personaje extends Elemento {
	protected int velocidad;
	protected int desaparecer;
	protected int contadordesaparecer;
	protected int contadorsaltar;
	protected ArrayList<Fruta> Fruta;
	
	public Personaje(int posicionX,int posicionY, int alto, int ancho, int velocidad) {
		super(posicionX, posicionY, ancho, alto, "O", 'O');
		this.Fruta= new ArrayList<Fruta>();
		if(velocidad > 0) {
			this.velocidad=velocidad;
		}
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
}
