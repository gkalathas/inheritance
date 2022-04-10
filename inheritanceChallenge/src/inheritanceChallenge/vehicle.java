package inheritanceChallenge;

public class vehicle {
	private String name;
	private String steering;
	private int gears;
	private String move;
	private int topSpeed =100;
	
	public vehicle(String name, String steering, int gears, String move) {
		super();
		this.name = name;
		this.steering = steering;
		this.gears = gears;
		this.move = move;
	}
	public void topSpeed(int speed) {
		if (speed>= topSpeed)
		System.out.println("top speed =" + speed);
	}
	public String getSteering() {
		return steering;
	}

	public int getGears() {
		return gears;
	}

	public String getMove() {
		return move;
	}
	public String getName() {
		return name;
	}
	
	

}
