
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main_Menu extends JFrame implements ActionListener {

    JButton playBtn = new JButton("HAHU JOGU");
    JButton exitBtn = new JButton("SAI");
    JLabel title = new JLabel("BRICK BREAK");
    JPanel panel = new JPanel();

    public Main_Menu() {
        setSize(430, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(panel);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.black);

        playBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        exitBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));

        title.setBounds(120, -10, 200, 200);
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setForeground(Color.white);
        add(title);

        playBtn.setBounds(128, 130, 160, 50);
        playBtn.setFocusable(false);
        playBtn.setBackground(Color.green);
        playBtn.addActionListener(this);
        playBtn.setForeground(Color.black);
        add(playBtn);

        exitBtn.setBounds(128, 220, 160, 50);
        exitBtn.setFocusable(false);
        exitBtn.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Hakarak Sai?", "Konfirmasaun", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    System.exit(0);
                }
            }
        });
        add(exitBtn);
    }

    public static void main(String[] args) {
        new Main_Menu().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Nivel().setVisible(true);
    }

}
