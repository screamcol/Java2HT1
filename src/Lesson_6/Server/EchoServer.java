package Lesson_6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class EchoServer {
    private static DataInputStream in;
    private static DataOutputStream out;
    private static Socket socket;

    public static void main(String[] args) {
        startServer();
    }

    static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            AtomicBoolean flag = new AtomicBoolean(false);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String str = in.readUTF();
                            if (str.equalsIgnoreCase("/end")) {
                                flag.set(true);
                                break;
                            }
                            System.out.println(str);
                        }
                    } catch (IOException e) {
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
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        finally {
            closeConnection();
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
