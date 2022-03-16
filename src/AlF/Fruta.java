package AlF;

public class Fruta extends Elemento {
	
	protected String nombre;
	protected int puntos;
	
	public Fruta(int posicionX, int posicionY, int ancho, int alto, String imagen, String nombre, int puntos, char simbolo){
	super(posicionX ,posicionY , ancho,alto , imagen, simbolo);
	this.nombre=nombre;
	this.puntos=puntos;
	}
	public int getPuntos(){
	return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
}
