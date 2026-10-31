import java.util.Scanner;
public class TestCircleArr {
	//gets a array and a circle objects and adds the circle to array
	public static void addsCircleToArr(CircleArr arr, Circle c) {
		arr.addCir(c);
	}
	//gets 2 points from the user and makes a circle from it
	public static void makeCircleFromUser(Scanner input) {
		System.out.println("Give the center point ");
		System.out.println("x: ");
		double x1 = input.nextDouble();
		System.out.println("y: ");
		double y1 = input.nextDouble();
		System.out.println("Give a edge point: ");
		System.out.println("x: ");
		double x2 = input.nextDouble();
		System.out.println("y: ");
		double y2 = input.nextDouble();
		Point center = new Point(x1,y1);
		Point edge = new Point(x2,y2);
		Circle result = new Circle(center, edge);
	}
	/* gets an array and returns the circle with the biggest area 
	 * hey samar :)
	 */
	public Circle returnBiggestCircle(CircleArr arr) {
		return arr.biggestCircle();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * hey samar I know I need to put the functions in here but im too tired to 
		 * fill the arrays with circles so imaging as if I did it 
		 */
		input.close();
	}

}
