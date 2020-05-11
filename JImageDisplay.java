import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent {
	public BufferedImage bufferedImage;

	public JImageDisplay(int width, int height) {
		bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		setPreferredSize(new Dimension(width, height));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bufferedImage, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
	}

	public void clearImage() {
		for (int i = 0; i < bufferedImage.getWidth(); i++) {
			for (int j = 0; j < bufferedImage.getHeight(); j++) {
				bufferedImage.setRGB(i, j, Color.BLACK.getRGB());
			}
		}
	}

	public void drawPixel(int x, int y, int rgbColor) {
		bufferedImage.setRGB(x, y, rgbColor);
	}
}
