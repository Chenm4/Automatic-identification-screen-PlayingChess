package recognition;

import javax.imageio.ImageIO;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//Author 在线疯狂
//Homepage http://bookshadow.com
/*这段代码实现了获取屏幕截图的功能。
具体来说，它使用Java AWT库中的Robot类创建了一个Robot实例，然后使用该实例的createScreenCapture方法获取整个屏幕的截图，返回一个BufferedImage对象。
该方法还使用了Java AWT库中的Dimension和Rectangle类来确定屏幕的尺寸和要截取的区域。*/
public class ScreenshotGetter {
	public BufferedImage getScreenshot() throws AWTException, IOException {
		final Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) dimension.getWidth();
		int height = (int) dimension.getHeight();
		BufferedImage screenshot = robot.createScreenCapture(new Rectangle(0,
				0, width, height));
		File file = new File("screenshotzhaoshengmu.png");
		ImageIO.write(screenshot, "png", file);
		return screenshot;
	}
}
