
public class Animal {
	private String name;
	private int body;
	private int head;
	private int brain;
	
	public Animal(String name, int body, int head, int brain) {
		this.name = name;
		this.body = body;
		this.head = head;
		this.brain = brain;
	}
	public void eat() {
		System.out.println("Animal.eat called()");
		
	}
	public void  move(int speed) {
		System.out.println("Animal is moving at " + speed);
		
	}
	public String getName() {
		return this.name;
	}
	public int getBody() {
		return this.body;
	}
	public int getHead() {
		return this.head;
	}
	public int getBrain() {
		return this.brain;
	}
	

}
