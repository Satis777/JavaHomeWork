package com.pb.tereschenko.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSwing extends JFrame {

    private Scanner inMessage;
    private PrintWriter outMessage;
    private final JTextField jtfMessage;
    private final JTextField jtfName;
    private final JTextArea jtaTextAreaMessage;
    private String clientName = "";


    public ClientSwing() {
        try {
            Socket socket = new Socket("localhost", 8000);
            inMessage = new Scanner(socket.getInputStream());
            outMessage = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);


        setTitle("Чат (Задание 15)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jtaTextAreaMessage = new JTextArea();
        jtaTextAreaMessage.setEditable(false);
        jtaTextAreaMessage.setLineWrap(true);

        JScrollPane jsp = new JScrollPane(jtaTextAreaMessage);
        add(jsp, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        JButton jbSendMessage = new JButton("Отправить");
        bottomPanel.add(jbSendMessage, BorderLayout.EAST);

        jtfMessage = new JTextField("Введите Ваше сообщение: ");
        jtfMessage.setFont(new Font("Serif", Font.PLAIN, 14));
        jtfMessage.setHorizontalAlignment(JTextField.CENTER);
        bottomPanel.add(jtfMessage, BorderLayout.CENTER);

        jtfName = new JTextField("Введите Ваше имя: ");
        jtfName.setFont(new Font("Serif", Font.PLAIN, 14));
        bottomPanel.add(jtfName, BorderLayout.WEST);

        jbSendMessage.addActionListener(e -> {
            if (!jtfMessage.getText().trim().isEmpty() && !jtfName.getText().trim().isEmpty()) {
                clientName = jtfName.getText();
                sendMsg();
                jtfMessage.grabFocus();
            }
        });

        jtfMessage.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfMessage.setText("");
            }
        });

        jtfName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfName.setText("");
            }
        });

        new Thread (() -> {
            try {
                while (true) {
                    if (inMessage.hasNext()) {
                        String inMes = inMessage.nextLine();
                        jtaTextAreaMessage.append(inMes + "\n");
                    }
                }
            } catch (Exception ignored) {
            }
        }).start();
        setVisible(true);
    }

    public void sendMsg() {
        String messageStr = jtfName.getText() + ": " + jtfMessage.getText();
        outMessage.println(messageStr);
        outMessage.flush();
        jtfMessage.setText("");
    }
    public static void main(String[]args){
        ClientSwing clientWindow = new ClientSwing();
    }
}