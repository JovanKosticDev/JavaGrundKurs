package com.example.concurrency;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 5; i++){
//                    System.out.println("Printing " + i + " in a worker thread");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//
//        for(int i = 0; i < 5; i++){
//            System.out.println("Printing " + i + " in a main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        int a = 2;
        int b = 0;

        String name = null;


        try{
            name.equals("Max");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Name war NULL");
        }

































   }
}
