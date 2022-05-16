package kzn3;

import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

    }
}
abstract class GoldShape{

    public abstract double getVolume();
    public double getPrice(){
        return getVolume() *250 +1200;
    }

}
class SphereGold extends GoldShape{
    private double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}


