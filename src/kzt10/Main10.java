package kzt10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
    public static void main(String [] args){
        ArrayList<Players> players  = new ArrayList<>();
        Scanner in = new Scanner(System.in);

    }
}
class Players {
    private String name;
    private double price;
    private int age;

    public Players() {
    }

    public Players(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
