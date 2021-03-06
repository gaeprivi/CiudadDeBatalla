package Obstaculo;

import java.awt.Rectangle;
import javax.swing.JLabel;
import Visitor.Visitante;

public class Cemento extends Obstaculo {
	private static final String ruta="Cemento";
	
	public Cemento(int x,int y){
		this.x=x;
		this.y=y;
		path=ruta;
		path_dinamico="";
		avanzable=false;
		destructible=true;
		grafico=new JLabel();
		refrescarPosicion();
		rectangulo=new Rectangle(x,y,tamanio_celda,tamanio_celda);
		vida=8;

	}
	
	public boolean getAvanzable(){
		return avanzable;
	}
	
	public  Rectangle getRectangulo(){
		return rectangulo;
	}
	
	public void afectar(Visitante v){
		v.visit(this);
		
	}
}
