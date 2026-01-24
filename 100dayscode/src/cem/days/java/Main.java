package cem.days.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var male = new Person("João", 19);

        var Female = new Person("Millena", 18);

        System.out.println("Male Name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female Name: " + Female.getName() + " age: " + Female.getAge());

        var scanner = new Scanner(System.in);
    }
}
