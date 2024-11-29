
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

public class WinGame extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton jgfoun = new JButton("JOGU FOUN");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("YOU WIN");
    JPanel panel = new JPanel();

    public WinGame() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(140, -30, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.black);
        add(title);

        repeteBtn.setBounds(130, 100, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.yellow);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay gameplay = new GamePlay();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        jgfoun.setBounds(130, 180, 160, 50);
        jgfoun.setFocusable(false);
        jgfoun.setBackground(Color.green);
        jgfoun.setFont(new Font("Times New Roman", Font.BOLD, 15));
        jgfoun.setForeground(Color.black);
        jgfoun.addActionListener(this);
        jgfoun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay gameplay = new GamePlay();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        }
        );
        add(jgfoun);

        saiBtn.setBounds(130, 260, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak Sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                    System.exit(0);
                }
            }
        });
        add(saiBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//WINGAME1.
class WinGame1 extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton jgfoun = new JButton("JOGU FOUN");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("YOU WIN");
    JPanel panel = new JPanel();

    public WinGame1() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(140, -30, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.black);
        add(title);

        repeteBtn.setBounds(130, 100, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.yellow);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay1 gameplay = new GamePlay1();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        jgfoun.setBounds(130, 180, 160, 50);
        jgfoun.setFocusable(false);
        jgfoun.setBackground(Color.green);
        jgfoun.setFont(new Font("Times New Roman", Font.BOLD, 15));
        jgfoun.setForeground(Color.black);
        jgfoun.addActionListener(this);
        jgfoun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay1 gameplay = new GamePlay1();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        }
        );
        add(jgfoun);

        saiBtn.setBounds(130, 260, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak Sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                    System.exit(0);
                }
            }
        });
        add(saiBtn);
        //dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//WINGAME2.
class WinGame2 extends JFrame implements ActionListener {

    JButton repeteBtn = new JButton("REPETE");
    JButton jgfoun = new JButton("JOGU FOUN");
    JButton saiBtn = new JButton("SAI");
    JLabel title = new JLabel("YOU WIN");
    JPanel panel = new JPanel();

    public WinGame2() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        title.setBounds(140, -30, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.black);
        add(title);

        repeteBtn.setBounds(130, 100, 160, 50);
        repeteBtn.setFocusable(false);
        repeteBtn.setBackground(Color.yellow);
        repeteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        repeteBtn.setForeground(Color.black);
        repeteBtn.addActionListener(this);
        repeteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay2 gameplay = new GamePlay2();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(repeteBtn);

        jgfoun.setBounds(130, 180, 160, 50);
        jgfoun.setFocusable(false);
        jgfoun.setBackground(Color.green);
        jgfoun.setFont(new Font("Times New Roman", Font.BOLD, 15));
        jgfoun.setForeground(Color.black);
        jgfoun.addActionListener(this);
        jgfoun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame obj = new JFrame();
                GamePlay2 gameplay = new GamePlay2();
//              obj.setSize(700,625);
                obj.setBounds(10, 10, 700, 640);
                obj.setVisible(true);
                obj.setTitle("BRICK BREAK");
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.setResizable(false);
                obj.add(gameplay);
//                obj.pack();
                obj.setLocationRelativeTo(null);
                dispose();
            }
        }
        );
        add(jgfoun);

        saiBtn.setBounds(130, 260, 160, 50);
        saiBtn.setFocusable(false);
        saiBtn.setBackground(Color.red);
        saiBtn.setForeground(Color.white);
        saiBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        saiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak Sai husi jogu?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                     setVisible(true);
                    new Main_Menu().setVisible(true);
                    dispose();
//                    System.exit(0);
                }
            }
        });
        add(saiBtn);
        //dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
