package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

      //  doDownloadImages();
      //  doWriteToFile();
      new MyThread(true).start(); // метод start() запускает  run() внутри в отдельном потоке
      new MyThread(false).start(); 

    }

    static void doDownloadImages() {

    }

    static void doWriteToFile() {

    }
}
class MyThread extends Thread {
    private boolean flag;
    MyThread(boolean f) {
        this.flag = f;
    }
    @Override
    public void run() {
        if(this.flag) {
            Main.doDownloadImages();
        } else {
            Main.doWriteToFile();
        }
    }
}

