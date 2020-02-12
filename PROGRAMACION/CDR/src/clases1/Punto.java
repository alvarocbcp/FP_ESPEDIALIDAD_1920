package clases1;

public class Punto {
	
	private int x, y;
	
	public Punto() {
		x=0;
		y=0;
	}
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void imprimirCoordenadas() {
		System.out.println("Las cordenadas del punto son: (" + x  + ", " + y + ")");
	}
	
	

}
