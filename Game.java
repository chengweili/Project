import javax.swing.*;
import java.awt.*;

public class Game{
    
    public static void main(String[]args){
	JFrame f = new JFrame("Game");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Player p = new Player();
	f.add(p);
	f.setSize(1000,800);
	f.setVisible(true);
    }
}
