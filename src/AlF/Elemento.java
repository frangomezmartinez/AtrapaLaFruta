package AlF;
import java.util.ArrayList;
public abstract class Elemento {
	protected int posicionX;
	protected int posicionY;
	protected int ancho;
	protected int alto;
	protected String imagen;
	protected char simbolo;
	
	public Elemento (int posicionX, int posicionY, int ancho, int alto, String imagen, char simbolo) {
		super();
		this.posicionX=posicionX;
		this.posicionY=posicionY;
		this.ancho=ancho;
		this.alto=alto;
		this.imagen=imagen;
		this.simbolo=simbolo;
	}
	public char getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(char simbolo) {
		this.simbolo=simbolo;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX=posicionX;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY=posicionY;
	}
}
