package RobotLikeDog;

public class Client {
	public static void main(String []args){
		Robot robot = (Robot)XMLUtilRobot.getBean();
		robot.cry();
		robot.move();
	}
}
