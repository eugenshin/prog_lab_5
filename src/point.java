package prog_lab_5;
import java.util.Scanner;

public class point {
	double x, y;
	
	public void vvod() {
		Scanner in = new Scanner(System.in);
		this.x = in.nextDouble();
		this.y = in.nextDouble();
	}
	
	public void vivod()	{
		System.out.printf("(%f; %f)\n", this.x, this.y);
	}

	public double distance(point sdpoint) {
		return Math.sqrt(Math.pow(this.x - sdpoint.x, 2) + Math.pow(this.y - sdpoint.y, 2));
	}
	
	public double getx() {
		return this.x;
	}
	
	public double gety() {
		return this.y;
	}
}