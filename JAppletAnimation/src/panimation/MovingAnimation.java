package panimation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rob Attfield
 */
public class MovingAnimation extends JApplet {

    private ImageIcon smileyFace;
    private int maxY, minY, maxWidth, xCoord, yCoord, move, timerDelay;
    private final int Y_OFFSET = 10;
    private final int X_OFFSET = 10;
    private boolean goingUp = true;
    private boolean goingSideways = true;
    private Timer timer;

    @Override
    public void init() {

        smileyFace = new ImageIcon("images/happyFace.png");
        add(new ImagePanel());
        timerDelay = 10;
        timer = new Timer(timerDelay, new TimerListener());
        timer.start();

        //getContentPane().setBounds(0, 0, CONTENTPANE_WIDTH, CONTENTPANE_HEIGHT);
        getContentPane().setBackground(Color.BLACK);

        //maxY = getContentPane().getHeight();
        minY = 0;

        xCoord = 0;
        yCoord = 0;
        move = 2;

    }

    class ImagePanel extends JPanel
    {
        
        public ImagePanel()
        {
            setBackground(Color.BLACK);
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(smileyFace.getImage(), xCoord, yCoord, this);
        }

        @Override
        public void setBackground(Color bg) {
            super.setBackground(bg); //To change body of generated methods, choose Tools | Templates.
        }
        
        
    }

    private class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //Following if-else manipulates Y coordinate
            if (goingUp) {
                if (yCoord > minY) {
                    yCoord -= move;
                } 
                else {
                    goingUp = false;
                }
            } else {
                if (yCoord < (getContentPane().getHeight() - (smileyFace.getIconHeight()+ Y_OFFSET))) {
                    yCoord += move;
                } 
                else {
                    goingUp = true;
                }
            }
            
            //Following if-else manipulates Y coordinate
            if (goingSideways) {
                if (xCoord > 0) {
                    xCoord -= move;
                } 
                else {
                    goingSideways = false;
                }
            } else {
                if (xCoord < (getContentPane().getWidth() - (smileyFace.getIconWidth() + X_OFFSET))) {
                    xCoord += move;
                } 
                else {
                    goingSideways = true;
                }
            }
            
            repaint();
        }
    }
}
