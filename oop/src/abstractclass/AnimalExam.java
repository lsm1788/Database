package abstractclass;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------------");
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Ham());
	}
	//메소드 다형성
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
