/**
 * 추상클래스
 * 
 * @author BigData18
 *
 */

public abstract class Pet {

	abstract void bark();;

}


class Dog extends Pet {

	@Override
	void bark() {
		
			System.out.println("woof woof");
		}	
}

class Cat extends Pet {

	@Override
	void bark() {
		System.out.println("mew mew");
	}

}


