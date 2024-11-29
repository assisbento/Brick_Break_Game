//import java.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;

    private int TotalBricks = 24;

    private Timer timer;
    private int delay = 4;

    private int playerX = 320;

    private int ballposX = 360;
    private int ballposY = 530;

    private int ballXdir = -1;
    private int ballYdir = -2;

    private MapGenerator map;
    private int totalBricks;

    public GamePlay() {
        map = new MapGenerator(4, 6);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

    }

    ;
    @Override
    public void paint(Graphics g) {
        //Background 
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

//        //Drawing map 
        map.draw((Graphics2D) g); //IDA NEE MAK FO SAI BLOK SIRA.

        //Border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("SCORE : " + score, 25, 30);

        //The Paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);

        //the Ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballposX, ballposY, 20, 20);

        if (TotalBricks <= 0) {
            if (TotalBricks <= 0) {
                play = false;
                ballXdir = 0;
                ballYdir = 0;

//                g.setColor(Color.green);
//                g.setFont(new Font("serif", Font.BOLD, 35));
//                g.drawString("YOU WIN!", 220, 300);
//
//                g.setFont(new Font("serif", Font.BOLD, 20));
//                g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);

                setVisible(false);
                new WinGame();
                g.dispose();
            }

        }

        if (ballposY > 570) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
//
//            g.setColor(Color.red);
//            g.setFont(new Font("serif", Font.BOLD, 35));
//            g.drawString("GAME OVER!", 220, 300);
//
//            g.setColor(Color.white);
//            g.setFont(new Font("serif", Font.BOLD, 20));
//            g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);
//
           setVisible(false);
            new GameOver().setVisible(true);
            g.dispose();

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
            if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYdir = -ballYdir;
            }
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {

                        int brickX = j * map.brickWidth + 80;
                        int brickY = i * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballrect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;

                        if (ballrect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            TotalBricks--;
                            score += 5;

                            if (ballposX + 19 <= brickRect.x || ballposY + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }
                            break;
                        }
                    }
                }

            }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if (ballposX < 0) {
                ballXdir = -ballXdir;
            }
            if (ballposY < 0) {
                ballYdir = -ballYdir;
            }
            if (ballposX > 670) {
                ballXdir = -ballXdir;
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                TotalBricks = 24;
                map = new MapGenerator(4, 6);
                repaint();
            }
        }
    }

    private void moveRight() {
        play = true;
        playerX += 20;

    }

    private void moveLeft() {
        play = true;
        playerX -= 20;

    }
}

//GAMEPALY1.
class GamePlay1 extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;

    private int TotalBricks = 30;

    private Timer timer;
    private int delay = 3;

    private int playerX = 320;

    private int ballposX = 360;
    private int ballposY = 530;

    private int ballXdir = -1;
    private int ballYdir = -2;

    private MapGenerator map;
    private int totalBricks;

    public GamePlay1() {
        map = new MapGenerator(5, 6);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

    }

    @Override
    public void paint(Graphics g) {
        //Background 
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

//        //Drawing map 
        map.draw((Graphics2D) g); //IDA NEE MAK FO SAI BLOK SIRA.

        //Border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("SCORE : " + score, 25, 30);

        //The Paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);

        //the Ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballposX, ballposY, 15, 15);

        if (TotalBricks <= 0) {
            if (TotalBricks <= 0) {
                play = false;
                ballXdir = 0;
                ballYdir = 0;

//                g.setColor(Color.green);
//                g.setFont(new Font("serif", Font.BOLD, 35));
//                g.drawString("YOU WIN!", 220, 300);
//
//                g.setFont(new Font("serif", Font.BOLD, 20));
//                g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);
                setVisible(play);
                new WinGame1().setVisible(true);
                g.dispose();

            }

        }

        if (ballposY > 570) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;

//            g.setColor(Color.red);
//            g.setFont(new Font("serif", Font.BOLD, 35));
//            g.drawString("GAME OVER!", 220, 300);
//
//            g.setColor(Color.white);
//            g.setFont(new Font("serif", Font.BOLD, 20));
//            g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);

            setVisible(play);
            new GameOver1().setVisible(true);
            g.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
            if (new Rectangle(ballposX, ballposY, 15, 15).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYdir = -ballYdir;
            }

            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {

                        int brickX = j * map.brickWidth + 80;
                        int brickY = i * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballrect = new Rectangle(ballposX, ballposY, 15, 15);
                        Rectangle brickRect = rect;

                        if (ballrect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            TotalBricks--;
                            score += 5;

                            if (ballposX + 19 <= brickRect.x || ballposY + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }

            }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if (ballposX < 0) {
                ballXdir = -ballXdir;
            }
            if (ballposY < 0) {
                ballYdir = -ballYdir;
            }
            if (ballposX > 670) {
                ballXdir = -ballXdir;
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                TotalBricks = 30;
                map = new MapGenerator(5, 6);
                repaint();
            }
        }
    }

    private void moveRight() {
        play = true;
        playerX += 20;

    }

    private void moveLeft() {
        play = true;
        playerX -= 20;

    }

}

//GAMEPLAY2.
class GamePlay2 extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;

    private int TotalBricks = 50;

    private Timer timer;
    private int delay = 1;

    private int playerX = 320;

    private int ballposX = 360;
    private int ballposY = 530;

    private int ballXdir = -1;
    private int ballYdir = -2;

    private MapGenerator map;
    private int totalBricks;

    public GamePlay2() {
        map = new MapGenerator(5, 10);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        //Background 
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

//        //Drawing map 
        map.draw((Graphics2D) g); //IDA NEE MAK FO SAI BLOK SIRA.

        //Border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("SCORE : " + score, 25, 30);

        //The Paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);

        //the Ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballposX, ballposY, 15, 15);

        if (TotalBricks <= 0) {
            if (TotalBricks <= 0) {
                play = false;
                ballXdir = 0;
                ballYdir = 0;
                
//                g.setColor(Color.green);
//                g.setFont(new Font("serif", Font.BOLD, 35));
//                g.drawString("YOU WIN!", 220, 300);
//
//                g.setFont(new Font("serif", Font.BOLD, 20));
//                g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);

                setVisible(false);
                new WinGame2().setVisible(true);
                g.dispose();
            }
        }

        if (ballposY > 570) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;

//            g.setColor(Color.red);
//            g.setFont(new Font("serif", Font.BOLD, 35));
//            g.drawString("GAME OVER!", 220, 300);
//
//            g.setColor(Color.white);
//            g.setFont(new Font("serif", Font.BOLD, 20));
//            g.drawString("Favor klick Enter hodi Restart jogu!", 190, 350);
            setVisible(false);
            new GameOver2().setVisible(true);
            g.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
            if (new Rectangle(ballposX, ballposY, 15, 15).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYdir = -ballYdir;
            }

            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {

                        int brickX = j * map.brickWidth + 80;
                        int brickY = i * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballrect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;

                        if (ballrect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            TotalBricks--;
                            score += 5;

                            if (ballposX + 19 <= brickRect.x || ballposY + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }

            }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if (ballposX < 0) {
                ballXdir = -ballXdir;
            }
            if (ballposY < 0) {
                ballYdir = -ballYdir;
            }
            if (ballposX > 670) {
                ballXdir = -ballXdir;
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir = -2;
                playerX = 310;
                score = 0;
                TotalBricks = 50;
                map = new MapGenerator(5, 10);
                repaint();
            }
        }
    }

    private void moveRight() {
        play = true;
        playerX += 20;

    }

    private void moveLeft() {
        play = true;
        playerX -= 20;

    }
}
