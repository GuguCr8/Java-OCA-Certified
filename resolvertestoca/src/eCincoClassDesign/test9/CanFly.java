package eCincoClassDesign.test9;

// Este ejemplo demuestra que cuando implementamos una interfaz con un metodo abstracto
//por ende la clase que lo implementa tendra que ser abstracta.
public interface CanFly {
	void fly();
}

interface HasWings {
	public abstract Object getWindSpan();
}

abstract class Falcon implements CanFly, HasWings {
}
