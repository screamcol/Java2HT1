package Lesson_4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 200, 800, 600);

        setLayout(new BorderLayout());
        JPanel[] jp = new JPanel[2];
        for (int i = 0; i < jp.length; i++) {
            jp[i] = new JPanel();
            if (i == 0) add(jp[i], BorderLayout.CENTER);
            else add(jp[i], BorderLayout.SOUTH);
            jp[i].setBackground(new Color(191, 220, 216));
        }

        jp[0].setLayout(new BorderLayout());
        JLabel jl1 = new JLabel("Chat field");
        jl1.setPreferredSize(new Dimension(20, 20));
        jp[0].add(jl1, BorderLayout.NORTH);
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp, BorderLayout.CENTER);

        jp[1].setLayout(new BorderLayout());
        JLabel jl2 = new JLabel("Enter text below: ");
        jl2.setPreferredSize(new Dimension(20, 20));
        jp[1].add(jl2, BorderLayout.NORTH);
        JTextField jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(40, 40));
        JScrollPane jsp1 = new JScrollPane(jtf);
        jp[1].add(jsp1, BorderLayout.CENTER);

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jta, jtf);
            }
        });

        JButton jb = new JButton("Send");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(jta, jtf);
            }
        });
        jp[1].add(jb, BorderLayout.EAST);
        setVisible(true);

        JMenuBar mainMenu = new JMenuBar();
        JMenu chat = new JMenu("Chat");
        JMenuItem saveChat = new JMenuItem("Save Chat");
        JMenuItem cleanMessages = new JMenuItem("Clean chat");
        setJMenuBar(mainMenu);
        mainMenu.add(chat);
        chat.add(saveChat);
        chat.add(cleanMessages);
        cleanMessages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
            }
        });
    }

    private void sendMessage(JTextArea textArea, JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) textArea.append(textField.getText() + "\n");
        textField.setText("");
    }
}
