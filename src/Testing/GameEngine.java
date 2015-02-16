package Testing;

public class GameEngine {
	
	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	/**
	 * Den här klassen skapar rum, frame och starta spelet.
	 * Return: myFrame och currentRoom med hjälp av två public metoder.
	 */
	public class GameEngine {
		public JFrame myFrame;
		public Money money;
		private String current;
		private Player user;
		private UserInterface gui;
		private JPanelWithBackground background;
		
		public GameEngine() {
			//Namnet på vårt spel heter för tillfället spel ^ ^
			myFrame = new JFrame("spel");
			money = new Money();
			user = new Player();
			gui = new UserInterface(this);
			gameStart();
		}
		
		public JFrame frame() {
			return myFrame;
		}
		
		public String getCurrent() {
			return current;
		}
		
		public void printWelcome() {
			String name;
			JOptionPane.showMessageDialog(myFrame, "Välkommen till vårt spel!!", "", JOptionPane.INFORMATION_MESSAGE);
			name = JOptionPane.showInputDialog(myFrame, "Vad är ditt namn?", "", JOptionPane.QUESTION_MESSAGE);
			//player.setName(name);
		}
		
		private void gameStart() {
			background = new JPanelWithBackground("C:/Users/Jenny/Documents/GitHub/SammaGamlaProject/SammaGamlaProject/pictures/startbackground.jpg");
			background.setLayout(null);
			Font font = new Font("Viner Hand ITC", Font.BOLD, 50);
			
			//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	        //double width = screenSize.getWidth();
	        //double height = screenSize.getHeight();
	        
			//Frame har en bestämd storlek 1280x800. Kan finnas kvar tills man implementerar resize-funktion för JButton
	        myFrame.setPreferredSize(new Dimension(1280, 800));
	        myFrame.setMinimumSize(new Dimension(1280, 800));
	        myFrame.setResizable(false);
	        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	        gui.createMenu();
			
			JButton startButton = new JButton ("Starta spel");
	        startButton.setBounds(420,580,400,80);
	        startButton.setContentAreaFilled(false);
	        startButton.setBorderPainted(false); //med eller utan kant
	        startButton.setFont(font);
	        startButton.setForeground(Color.pink); //färg på startknappen
	        
	        background.add(startButton);
			myFrame.add(background);
			
			//Skapa några lyssnare
	        startButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                //starta spel här
	            	gui.createGUI();
	            	printWelcome();
	            }
	        });
			
	        myFrame.pack();
	        myFrame.setVisible(true);
	    }
		
		private void createRooms() {
	        Room center, shop, garden, minigame1;
	      
	        center = new Room();
	        shop = new Room();
	        garden = new Room();
	        minigame1 = new Room();

	        //startar spelet i centrum
	        current = "center";
	    }
	}


}
