package AlF;
import java.util.Timer;
import java.util.TimerTask;
public class TimerJuego extends TimerTask {
	
    private final Ventana consola;
  
    public TimerJuego(Ventana consola){
    	this.consola=consola;
    }
    
    public void run() {
    	if(consola.jugando()==false) {
    		cancel();
    		System.exit(0);
    	}
    	else {
    	}
    	//M�todo que ser� ejecutado cada 200 milisegundos
      // Para cancelar el timer pod�is utilizar: "cancel();" 
    } 
}
