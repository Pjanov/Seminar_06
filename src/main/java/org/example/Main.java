package org.example;

public class Main {
    public static void main(String[] args) {

        Worker worker = WorkerBuilder
                .getInstance()
                .setName("test")
                .cabinet((byte) 120)
                .salary(45673)
                .build();

        System.out.println(worker);
    }
}