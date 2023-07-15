package marsRover.marsRover;

public class Rover {
//	public static final Integer N = 1;
//	public static final Integer E = 2;
//	public static final Integer S = 3;
//	public static final Integer W = 4;
//
//	public Integer x = 0;
//	public Integer y = 0;
//	public Integer facing = N;
//    public static int plateauY;
//    public static int plateauX;
//	public Rover() {
//	}
//
//	public void setPosition(Integer x, Integer y, Integer facing) {
//		this.x = x;
//		this.y = y;
//		this.facing = facing;
//	}
//
//	public void printPosition() {
//		char dir = 'N';
//		if (facing == 1) {
//			dir = 'N';
//		} else if (facing == 2) {
//			dir = 'E';
//		} else if (facing == 3) {
//			dir = 'S';
//		} else if (facing == 4) {
//			dir = 'W';
//		}
//		System.out.println(x + " " + y + " " + dir);
//	}
//
//	public void process(String commands) {
//		for (int idx = 0; idx < commands.length(); idx++) {
//			process(commands.charAt(idx));
//		}
//	}
//
//	private void process(Character command) {
//		if (command.equals('L')) {
//			turnLeft();
//		} else if (command.equals('R')) {
//			turnRight();
//		} else if (command.equals('M')) {
//			move();
//		} else {
//			throw new IllegalArgumentException("Speak in Mars language, please!");
//		}
//	}
//
//	
//	public void move() {
//		if (facing == N) {
//			
//			this.y = Math.min(this.y + 1, plateauY);
//		} else if (facing == E) {
//			
//			this.x = Math.min(this.x + 1, plateauX);
//		} else if (facing == S) {
//			this.y = Math.max(this.y - 1, 0);
//		} else if (facing == W) {
//			this.x = Math.max(this.x - 1, 0);
//		}
//	}
//	private void turnLeft() {
//		facing = (facing - 1) < N ? W : facing - 1;
//	}
//
//	private void turnRight() {
//		facing = (facing + 1) > W ? N : facing + 1;
//	}
//	
//	public String getPositionString() {
//		String direction;
//		if (facing == N) {
//			direction = "N";
//		} else if (facing == E) {
//			direction = "E";
//		} else if (facing == S) {
//			direction = "S";
//		} else if (facing == W) {
//			direction = "W";
//		} else {
//			throw new IllegalStateException("Invalid facing direction");
//		}
//
//		return x + " " + y + " " + direction;
//		
//	}
//	
//	public int convertFacingString(String facingString) {
//		switch (facingString) {
//		case "N":
//			return Rover.N;
//		case "E":
//			return Rover.E;
//		case "S":
//			return Rover.S;
//		case "W":
//			return Rover.W;
//		default:
//			throw new IllegalArgumentException("Invalid facing direction: " + facingString);
//		}
//	}
//	
//	public String convertFacingIntToString(int facingInt) {
//		if (facingInt == Rover.N) {
//			return "N";
//		} else if (facingInt == Rover.E) {
//			return "E";
//		} else if (facingInt == Rover.S) {
//			return "S";
//		} else if (facingInt == Rover.W) {
//			return "W";
//		} else {
//			throw new IllegalArgumentException("Invalid facing direction: " + facingInt);
//		}
//	}

}
