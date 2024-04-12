package com.mirea.kt.example;
import java.io.*;

public class DeserializingRunnable implements Runnable {
    private String path;

    public DeserializingRunnable(String path) {
        this.path = path;
    }

    public void run() {
        FileInputStream fis;
        if (this.path != null && new File(this.path).exists()) {
            try {
                fis = new FileInputStream(this.path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println(message.toString());
                System.out.println("Десериализация выполнена");
            }catch (ClassNotFoundException | IOException e) {
                System.out.println("Десериализация не выполнена");
            }
        }
    }
}
