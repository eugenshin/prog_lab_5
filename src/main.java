package prog_lab_5;

public class main {
   public static void main(String[] args) {
		point point1 = new point(), point2 = new point();
		System.out.printf("Input first point\n");
		point1.vvod();
		point1.vivod();
		System.out.printf("Input second point\n");
		point2.vvod();
		point2.vivod();
		System.out.printf("Distance is %f\n", point1.distance(point2));
		line line1 = new line();
		System.out.printf("Input 2 point of line\n");
		line1.vvod();
		line1.vivod();
		System.out.printf("Length is %f\n", line1.length());
		angle angle1 = new angle();
		System.out.printf("Input firtst point, vertex and second point of angle\n");
		angle1.vvod();
		angle1.vivod();
		System.out.printf("Value is %f\n", angle1.value());
		circle circle1 = new circle();
		System.out.printf("Input center and radius of circle\n");
		circle1.vvod();
		circle1.vivod();
		System.out.printf("Square is %f, Perimetr is %f\n", circle1.square(), circle1.per());
		segments sm1 = new segments();
		System.out.printf("Input number of segments and fill it in\n");
		sm1.vvod();
		sm1.vivod();
		System.out.printf("Total length is %f\n", sm1.totallength());		
   }
}