package com.auleev.pluralsight;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World! To Merge");
        int count = 0;
        try {
            while(true){
                Thread.sleep(2*1000);
                System.out.println("i'm still here ! Iteration" + count++);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
