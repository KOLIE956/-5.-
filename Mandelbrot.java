import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
	public static final int MAX_ITERATIONS = 2000;

	@Override
	public void getInitialRange(Rectangle2D.Double range) {
		range.x = -2;
		range.y = -1.5;
		range.width = 3;
		range.height = 3;
	}

	@Override
	public int numIterations(double x, double y) {
		int counter = 0;
		Complex z = new Complex(0, 0);
		Complex c = new Complex(x, y);

		while (z.pabs() <= 4) {
			if (counter >= MAX_ITERATIONS) {
				return -1;
			}
			z.pow();
			z.add(c);
			counter++;
		}

		return counter;
	}

	@Override
	public String toString() {
		return "Mandelbrot";
	}
}
