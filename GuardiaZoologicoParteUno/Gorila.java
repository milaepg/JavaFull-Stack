package GuardiaZoologicoParteUno;


public class Gorila extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("El gorila te ha tirado algo");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("El gorila come algunos plátanos e instantáneamente se siente más feliz con su entorno.");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("El gorila trepa a un árbol cercano, pero para ello gasta una buena cantidad de energía.");
		displayEnergy();
	}
}

