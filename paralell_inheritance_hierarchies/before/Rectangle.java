package paralell_inheritance_hierarchies.before;

public class Rectangle extends Shape2D {
	@Override
	public float area() {
		return height * width;
	}
}