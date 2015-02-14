package Testing;


import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.awt.image.*;


public class test {
	
	 	//private GameEngine engine;
	    private JFrame myFrame;
	    private JTextField entryField;
	    private JTextArea log;
	    private JLabel image;
	    ImageIcon ikon;
	    private JButton exitButton;
	    private HashMap<String,JButton> exitButtons = new HashMap<String,JButton>();
	    //private JPanelWithBackground panel;
	
	
	public test()
	{
		createGUI();
    }
	
	 public void createGUI()
	    {
	        myFrame = new JFrame("Spel");
	        entryField = new JTextField(34);
	        exitButton = new JButton("Exit");
	        JButton button2 = new JButton("Affär");
	        JButton mapButton = new JButton("Karta");
	        JButton button4 = new JButton("Föremål");
	        JButton button5 = new JButton("Pengar");
	        JButton button6 = new JButton("Föremål");
	        JButton button7 = new JButton("Pengar");
	        File sourceimage = new File("C:/Users/Jenny/Desktop/mittforsok/Jenny/pictures/stig.jpg");
	        Image image= null;
			try {
				image = ImageIO.read(sourceimage);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	                
	        
	        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        double width = screenSize.getWidth();
	        double height = screenSize.getHeight();
	        
	        double textHeight = height * 0.15;
	        double textWidth = height * 0.15;
	        double imgWidth = width * 0.9;
	        double imgHeight = height * 0.9;
	        
	        
	        myFrame.setPreferredSize(new Dimension((int)width, (int)height));
	        myFrame.setMinimumSize(new Dimension((int)width, (int)height));
	        myFrame.setResizable(false);
	        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	        
	        JPanel panel = new JPanel();
	        	panel = new JPanelWithBackground(image); 
			
			
	        
	        JPanel p = new JPanel(new GridLayout(4,1));
	        JPanel p2 = new JPanel(new GridLayout(4,1));
	        JPanel b = new JPanel();
	        b.setLayout(new BoxLayout(b, BoxLayout.X_AXIS));

	        p.add(button2);
	        p.add(mapButton);
	        p.add(exitButton);
	        b.add(button4);
	        b.add(button5);
	        
	        panel.setLayout(new BorderLayout());
	        //panel.add(textBox, BorderLayout.AFTER_LAST_LINE);
	        panel.add(p, BorderLayout.WEST);
	        panel.add(p2, BorderLayout.EAST);
	        panel.add(b, BorderLayout.NORTH);
	        
	        panel.setPreferredSize(new Dimension((int)width, (int)height)); //bildstorlek, gör om till att skala
	        panel.setMinimumSize(new Dimension((int)width, (int)height)); //istället för att skära av
	        
	        myFrame.getContentPane().add(panel, BorderLayout.NORTH);
	        
	        button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        
	        exitButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	            	System.exit(0);
	            }
	        });
	        
	        mapButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	            	System.exit(0);
	            }
	        });
	        
	      //Where the GUI is created:
	        JMenuBar menuBar;
	        JMenu menu, submenu;
	        JMenuItem menuItem;
	        JRadioButtonMenuItem rbMenuItem;
	        JCheckBoxMenuItem cbMenuItem;

	        //Create the menu bar.
	        menuBar = new JMenuBar();

	        //Build the first menu.
	        menu = new JMenu("Meny");
	        menu.setMnemonic(KeyEvent.VK_A);
	        menu.getAccessibleContext().setAccessibleDescription(
	                "The only menu in this program that has menu items");
	        menuBar.add(menu);

	        //a group of JMenuItems
	        menuItem = new JMenuItem("Öppna sparat spel",
	                                 KeyEvent.VK_T);
	        menuItem.setAccelerator(KeyStroke.getKeyStroke(
	                KeyEvent.VK_1, ActionEvent.ALT_MASK));
	        menuItem.getAccessibleContext().setAccessibleDescription(
	                "This doesn't really do anything");
	        menu.add(menuItem);
	        
	        menuItem = new JMenuItem("Spara", new ImageIcon("image.gif"));
	        menuItem.setMnemonic(KeyEvent.VK_D);
	        menu.add(menuItem);


	        menuItem = new JMenuItem("Avsluta",
	                                 new ImageIcon("images/middle.gif"));
	        menuItem.setMnemonic(KeyEvent.VK_B);
	        menuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        
	        
	        menu.add(menuItem);


	        //a group of radio button menu items
	        menu.addSeparator();
	        ButtonGroup group = new ButtonGroup();
	        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
	        rbMenuItem.setSelected(true);
	        rbMenuItem.setMnemonic(KeyEvent.VK_R);
	        group.add(rbMenuItem);
	        menu.add(rbMenuItem);

	        rbMenuItem = new JRadioButtonMenuItem("Another one");
	        rbMenuItem.setMnemonic(KeyEvent.VK_O);
	        group.add(rbMenuItem);
	        menu.add(rbMenuItem);

	        //a group of check box menu items
	        menu.addSeparator();
	        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
	        cbMenuItem.setMnemonic(KeyEvent.VK_C);
	        menu.add(cbMenuItem);

	        cbMenuItem = new JCheckBoxMenuItem("Another one");
	        cbMenuItem.setMnemonic(KeyEvent.VK_H);
	        menu.add(cbMenuItem);

	        //a submenu
	        menu.addSeparator();
	        submenu = new JMenu("A submenu");
	        submenu.setMnemonic(KeyEvent.VK_S);

	        menuItem = new JMenuItem("An item in the submenu");
	        menuItem.setAccelerator(KeyStroke.getKeyStroke(
	                KeyEvent.VK_2, ActionEvent.ALT_MASK));
	        submenu.add(menuItem);

	        menuItem = new JMenuItem("Another item");
	        submenu.add(menuItem);
	        menu.add(submenu);

	        //Build second menu in the menu bar.
	        menu = new JMenu("Inställningar");
	        menu.setMnemonic(KeyEvent.VK_N);
	        menu.getAccessibleContext().setAccessibleDescription(
	                "This menu does nothing");
	        menuBar.add(menu);

	        myFrame.setJMenuBar(menuBar);
	        
	      //Build second menu in the menu bar.
	        menu = new JMenu("Hjälp");
	        menu.setMnemonic(KeyEvent.VK_N);
	        menu.getAccessibleContext().setAccessibleDescription(
	                "This menu does nothing");
	        
	        menuBar.add(menu);
	        
	        menuItem = new JMenuItem("Hjääälp",
	                new ImageIcon("images/middle.gif"));
	        menuItem.setMnemonic(KeyEvent.VK_B);
	        menuItem.addActionListener(new ActionListener() {
	        		@Override
	        		public void actionPerformed(ActionEvent event) {
	        			JOptionPane.showMessageDialog( null, "[hjälp kommer senare]","Hjälp",JOptionPane.OK_CANCEL_OPTION); 
	        		}
	        });
	        
	        menu.add(menuItem);

	        myFrame.setJMenuBar(menuBar);
	        
	        
	        
	        
	        
	        myFrame.pack();
	        myFrame.setVisible(true);
	        entryField.requestFocus();
	        
	    }
	        
	
	

}

