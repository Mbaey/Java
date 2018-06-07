import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OtherTest extends JFrame {
    private static final long serialVersionUID = 1L;
  
    public static void main(String[] args) {
        MyPanel mp = new MyPanel();
        OtherTest ot = new OtherTest();
        ot.add(mp);
        ot.addKeyListener(mp); 
        ot.setSize(400, 300);
        ot.setTitle("Moving XO");
        ot.setLocationRelativeTo(null);
        ot.setVisible(true);
    }
}
  
class MyPanel extends JPanel implements KeyListener {
    private static final long serialVersionUID = 1L;
    int x = 10;
    int y = 10;
  
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 10, 10);
    }
  
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint();
    }
  
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
          
    }
  
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
          
    }
      
}