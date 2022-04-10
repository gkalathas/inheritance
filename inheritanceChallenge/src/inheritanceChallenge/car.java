package inheritanceChallenge;

public class car extends vehicle {
	private int doors;
	private int wheels;
	private String engine;
	
	public car(String name, String steering, int gears, String move, int doors, int wheels, String engine) {
		super(name, steering, gears, move);
		this.doors = doors;
		this.wheels = wheels;
		this.engine = engine;
	}
	
	public int getDoors() {
		return doors;
	}
	public int getWheels() {
		return wheels;
	}
	public String getEngine() {
		return engine;
	}
	 

}
