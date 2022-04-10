package inheritanceChallenge;

public class tesla extends car {
	

	private String touchScreen;
	
	
	public tesla(String name, String steering, int gears, String move, int doors, int wheels, String engine, String touchScreen) {
		super(name, steering, gears, move, doors, wheels, engine);
		this.touchScreen = touchScreen;
	}


	public String getTouchScreen() {
		return touchScreen;
	}

	

}
