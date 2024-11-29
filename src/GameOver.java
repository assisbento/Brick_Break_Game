
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.*;

public class GameOver extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("GAME OVER");
    JPanel panel = new JPanel();

    public GameOver() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(115, -10, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.red);
        add(title);

        repeteBtn.setBounds(128, 130, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.green);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay gameplay = new GamePlay();
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        saiBtn.setBounds(128, 220, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                      System.exit(0);
                }
            }
        });
        add(saiBtn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//GAMEOVER1.

class GameOver1 extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("GAME OVER");
    JPanel panel = new JPanel();

    public GameOver1() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(115, -10, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.red);
        add(title);

        repeteBtn.setBounds(128, 130, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.green);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay1 gameplay = new GamePlay1();
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        saiBtn.setBounds(128, 220, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                      System.exit(0);
                }
            }
        });
        add(saiBtn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//GAMEOVER2.

class GameOver2 extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("GAME OVER");
    JPanel panel = new JPanel();

    public GameOver2() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(115, -10, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.red);
        add(title);

        repeteBtn.setBounds(128, 130, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.green);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay2 gameplay = new GamePlay2();
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        saiBtn.setBounds(128, 220, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                      System.exit(0);
                }
            }
        });
        add(saiBtn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


