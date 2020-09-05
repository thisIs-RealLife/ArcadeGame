
package animation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovedPanelListener implements KeyListener{
    public NewJFrame newJFrame;

    public MovedPanelListener(NewJFrame newJFrame) {
        this.newJFrame = newJFrame;
    }
    public boolean isLeft;
    public boolean isRight;
    
    

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            isLeft = true;
            try {
                newJFrame.movedPanelOnKeyBoard();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
            isRight = true;
            try {
                newJFrame.movedPanelOnKeyBoard();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
