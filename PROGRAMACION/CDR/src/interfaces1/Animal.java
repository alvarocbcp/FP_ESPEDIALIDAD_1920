package interfaces1;

public class Animal implements Relaciones{ 
	
	private int peso;
	
	public Animal(int peso) {
		this.peso = peso;
	}

	public boolean esMayor (Object b) {
		Animal a1 =(Animal) b;
		if (this.peso>a1.peso){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esMenor (Object b) {
		Animal a1 =(Animal) b;
		if (this.peso<a1.peso){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esIgual (Object b) {
		Animal a1 =(Animal) b;
		if (this.peso==a1.peso){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal(9);
		Animal a2 = new Animal(7);
		Animal a3 = new Animal(9);
		Animal a4 = new Animal(10);
		
		//Comparamos a1
		System.out.println("풹1 mayor que a2? " + a1.esMayor(a2));
		System.out.println("풹1 mayor que a3? " + a1.esMayor(a3));
		System.out.println("풹1 mayor que a4? " + a1.esMayor(a4));
		System.out.println();
		System.out.println("풹1 menor que a2? " + a1.esMenor(a2));
		System.out.println("풹1 menor que a3? " + a1.esMenor(a3));
		System.out.println("풹1 menor que a4? " + a1.esMenor(a4));
		System.out.println();
		System.out.println("풹1 igual que a2? " + a1.esIgual(a2));
		System.out.println("풹1 igual que a3? " + a1.esIgual(a3));
		System.out.println("풹1 igual que a4? " + a1.esIgual(a4));
		
	}

}
