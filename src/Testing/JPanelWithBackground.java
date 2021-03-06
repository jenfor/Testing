package Testing;
/*

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class JPanelWithBackground extends JPanel {
private static final long serialVersionUID = 1L;
Image imageOrg = null;
Image image = null;

public JPanelWithBackground(Image image2) {
    imageOrg=image2;
    image=image2;
    setOpaque(false);
    }
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (image!=null) 
      g.drawImage(image, 0, 0, null);
   }
}
*/

import javax.swing.*;
import java.awt.*;

/**
 * Sätter skalad bakgrundsbild. Kan använda setLayout(null) och add-funktion för att adda synliga/osynliga knappar på bilden.
 * Inparameter: sökväg för bild
 */
public class JPanelWithBackground extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image bgimage = null;

	public JPanelWithBackground(String fileName) {
		MediaTracker mt = new MediaTracker(this);
		bgimage = Toolkit.getDefaultToolkit().getImage(fileName);
		mt.addImage(bgimage, 0);
		try {
			mt.waitForAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void paintComponent(Graphics g) {
		g.drawImage(bgimage, 0, 0, getSize().width, getSize().height, null);
	}
}

