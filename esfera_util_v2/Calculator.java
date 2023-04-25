package esfera_util_v2;

public class Calculator {
	public final double PI = 3.14159; //final = constante. Sempre em maísculo;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
