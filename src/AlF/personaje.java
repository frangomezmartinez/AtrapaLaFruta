package AlF;

import java.util.ArrayList;

public class Personaje extends Elemento {
	protected int velocidad;
	protected int desaparecer;
	protected int contadorDesaparecer;
	protected int contadorSaltar;
	protected ArrayList<Fruta> Fruta;
	public int mostrar = 0;
	
	//Constructor
	public Personaje(int posicionX,int posicionY, int alto, int ancho, int velocidad) {
		super(posicionX, posicionY, ancho, alto, "O", 'O');
		this.Fruta= new ArrayList<Fruta>();
		if(velocidad > 0) {
			this.velocidad=velocidad;
		}
	}
	//Metdodos set y get
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
	//Metodo para que aparezca el personaje
	public void setAparecer() {
		this.setImagen("O");
		this.setSimbolo('O');
	}
	
	//Metodo para avanzar teniendo en cuenta saltar y desaparecer
	public void avanzar() {
		this.posicionX += this.velocidad;
		if(this.contadorDesaparecer>0 && this.contadorDesaparecer <=25) {
				this.contadorDesaparecer++;
				this.desaparecer();
			}
			else{
				this.setAparecer();
				this.contadorDesaparecer=0;
			}
		if(this.contadorSaltar>0 && this.contadorSaltar<3) {
			this.contadorSaltar++;
		}
		else {
			this.contadorSaltar = 0;
			this.bajar();
		}
	}
	//Metodo para que al saltar suba y luego baje de nuevo a la altura inicial
	public void saltar() {
		this.setPosicionY(3);
		this.contadorSaltar++;
		}

	public void bajar() {
		this.setPosicionY(1);
	}
	//metodo para coger una fruta
	public void cogerFruta(Fruta a) {
		char sim = a.getSimbolo();
		if((sim == 'D' || sim == 'G' || sim == 'P' || sim == 'H' || sim == 'V')) {
			Fruta.add(a);
		}
	}
	//Metodo para comprobar si ha cogido la fruta y si tiene algun efecto especial
	public boolean choca(Elemento b) {
		if(this.posicionX==b.getPosicionX() && this.posicionY==b.getPosicionY()) {
			Fruta a = new Fruta (b.getPosicionX(),b.getPosicionY(),b.getAlto(),b.getAncho(),b.getImagen(),b.getSimbolo());
			a.setFormaFruta(a.getSimbolo());
			this.cogerFruta(a);
			b.setPosicionX(0);
			b.setPosicionY(0);
			b.setAlto(0);
			b.setAncho(0);
			
			char simbolo = b.getSimbolo();
			switch(simbolo) {
			case 'G':
				this.correr();
				break;
			case 'V':
				this.ralentizar();
				break;
			case 'H':
				this.contadorDesaparecer=1;
			}
			return true;
		}
		return false;
	}
	//Método para efecto correr
		public void correr() {
			this.setVelocidad(this.velocidad+1);
		}
		
		//Método para efecto ralentizar
		public void ralentizar() {
			this.setVelocidad(this.velocidad-1);
		}
	// Metodo para efecto desaparecer
		public void desaparecer() {
			this.setImagen(" ");
			this.setSimbolo(' ');
		}
		public void mostrarDatos() {
			this.mostrar++;
			if(mostrar == 1) {
				int puntosTotales = 0;
			for(Fruta i : Fruta) {
				puntosTotales += i.getPuntos();
				if(i.getSimbolo() == 'G' || i.getSimbolo() == 'H' || i.getSimbolo() == 'V') {
					FrutaMagica a1 = new FrutaMagica(i.getPosicionX(),i.getPosicionY(),i.getAlto(),i.getAncho(),i.getImagen(),i.getSimbolo());
					a1.setEfecto(a1);
					a1.mostrarDatos();
				}
				else if(i.getSimbolo() == 'D' || i.getSimbolo() == 'P') {
					i.mostrarDatos();
				}
			}
			System.out.println("Puntos totales: " +puntosTotales);
		}
		}
		
		
	
}
