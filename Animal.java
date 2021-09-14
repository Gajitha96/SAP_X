abstract class Animal {
	// abstract methods // must have absctract keyword
	abstract void move();// void = no return type
	// method signature
	abstract void eat();

	// concrete method having method definition
	void label() {
		System.out.println("Animal's data:");
	}
}