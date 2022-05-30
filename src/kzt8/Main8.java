package kzt8;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        User[] users = new User[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            System.out.println("INsert name");
            users[i].setName(in.next());
            System.out.println("insert surname");
            users[i].setSurname(in.next());
            System.out.println("insert age");
            if (!in.hasNextInt()){
                try {
                    throw new IOException();
                } catch (IOException e){
                    users[i].setAge(0);
                    in.next();
                }
            }
            else users[i].setAge(in.nextInt());

        }
        double sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
            sumAge += users[i].getAge();
        }
        System.out.println("Average value age :" + sumAge/users.length);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() == 0){
                System.out.println(" NO correct input age :" + users[i].getName() + " " + users[i].getSurname());
            }
        }
    }
}

class User {
    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}


