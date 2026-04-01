package org.example.exercico4;

public class Principal extends Thread {
    public Principal(String str) {
        super(str);
    }
    public void run() {
        System.out.println("Iniciando download...");
        for(int i=0; i<=100; i=i+10) {
            System.out.println(i+"%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Download concluido!");
    }
    public static void main(String[] args) {
        Principal Thread1 = new Principal("Thread");
        Thread1.start();
    }
}