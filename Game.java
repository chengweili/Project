import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{

    public Game(){
	setTitle("Game");
	setSize(1000,600);
	setLocation(250,250);
    }

    public static void main(String[]args){
	JFrame f = new Game();
	f.show();
    }

}
