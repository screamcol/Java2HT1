package Lesson_6.Client;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient extends JFrame {
    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static Socket socket;

    public static void main(String[] args) {
        try {
            startClient();
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            closeConnection();
        }
    }


    static void startClient() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String strFromServer = in.readUTF();
                        if (strFromServer.equalsIgnoreCase("/end")) {
                            break;
                        }
                        System.out.println(strFromServer);
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }).start();

        Scanner sc = new Scanner(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = sc.nextLine();
            if (str.equalsIgnoreCase("/end")) {
                break;
            }
            out.writeUTF(str);
        }
    }

    private static void closeConnection() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

