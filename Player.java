import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JPanel{

    public void paintComponent(Graphics g){
	super.paintComponent(g);
	this.setBackground(Color.WHITE);

	g.setColor(Color.RED);
	g.fillRect(500, 700, 50, 50);
    }
}
