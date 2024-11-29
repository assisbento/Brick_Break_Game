
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.*;

public class Nivel extends JFrame implements ActionListener {

    JButton fasilBtn = new JButton("FASIL");
    JButton natonBtn = new JButton("NATON");
    JButton difBtn = new JButton("DIFISIL");
    JLabel title = new JLabel("NIVEL");
    JPanel panel = new JPanel();

    public Nivel() {
        setSize(430,430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.black);

        title.setBounds(160, -30, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.white);
        add(title);

        fasilBtn.setBounds(130, 100, 160, 50);
        fasilBtn.setFocusable(false);
        fasilBtn.setBackground(Color.GREEN);
        fasilBtn.setForeground(Color.BLACK);
        //fasilBtn.setBackground(new Color(204, 250, 204));
        fasilBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        fasilBtn.addActionListener(this);
        fasilBtn.addActionListener(new ActionListener() {
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
        dispose();
        add(fasilBtn);

        natonBtn.setBounds(130, 200, 160, 50);
        natonBtn.setFocusable(false);
        natonBtn.setForeground(Color.black);
        natonBtn.setBackground(Color.YELLOW);
        natonBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        natonBtn.addActionListener(new ActionListener() {
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
                obj.setLocationRelativeTo(null);
                dispose();
            }
        });
        add(natonBtn);
        
        
        difBtn.setBounds(130, 300, 160, 50);
        difBtn.setFocusable(false);
        difBtn.setBackground(Color.red);
        difBtn.setForeground(Color.white);
        difBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        difBtn.addActionListener(this);
        difBtn.addActionListener(new ActionListener() {
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
        add(difBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
