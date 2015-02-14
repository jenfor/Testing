package Testing;


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

