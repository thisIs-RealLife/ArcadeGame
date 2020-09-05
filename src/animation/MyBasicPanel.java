
package animation;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MyBasicPanel extends JPanel {
    BufferedImage img;
    String path;

    public MyBasicPanel(String path) {
        this.path = path;
    }

    @Override
    protected void paintComponent(Graphics g) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
