
public class dog extends Animal {
	private int legs;
	private int tail;
	private int mouth;
	private String coat;
	
	public dog(String name, int body, int head, int brain, int legs, int tail, int mouth, String coat) {
		super(name, body, head, brain);
		this.legs = legs;
		this.tail = tail;
		this.mouth = mouth;
		this.coat = coat;
	}
	public void walk(){
		System.out.println("dog.walk()called");
		move(5);
		
	}
	public void run() {
		System.out.println("dog.run()called");
		move(10);
	}
	private void chew() {
		System.out.println("dog.chew() called");
		
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public int getMouth() {
		return mouth;
	}

	public String getCoat() {
		return coat;
	}
	@Override
	public void eat() {
		System.out.println("dog.eat()called");
		chew();
		super.eat();
	}
	private void moveLegs(int speed) {
		System.out.println("bob.moveLegs() called");
	}
	@Override
	public void move(int speed) {
		System.out.println("dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	

}
