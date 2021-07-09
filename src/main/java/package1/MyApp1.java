package package1;

public class MyApp1 {

	public static void main(String[] args) {
		//Create the object
		Coach theCoach = new BaseballCoach();
		//Use the object
		System.out.println(theCoach.getDailyWorkout());
		//Will work with any Coach implementation
	}

}
