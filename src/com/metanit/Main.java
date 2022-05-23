package com.metanit;

import java.util.ArrayList;
import java.util.List;

abstract class deliver{
    String name;
    List<String> pluski = new ArrayList<>();
    public String toString(){
        return "Способ доставки: " + name +"\n" + pluski;
    }
}

abstract class delivering{
    public abstract deliver createDeliver();
}

class Truke extends deliver{
    public Truke(){
        name = "Truck";
        pluski.add("Скорость 120 - 150");
        pluski.add("Проходимость");
        pluski.add("Надежность");
        pluski.add("Универсальность ");
    }
}
class Ship extends deliver{
    public Ship(){
        name = "Ship";
        pluski.add("Грузоподъемность");
        pluski.add("Вместимость");
        pluski.add("Безопастность");
        pluski.add("Дешевизна");
    }
}
class Airplain extends deliver{
    public Airplain(){
        name ="Airplane";
        pluski.add("Быстрота");
        pluski.add("Надежность");
        pluski.add("Малая вместимость");
    }
}
class TrukDeliver extends delivering{
    @Override
    public deliver createDeliver() {
        return new Truke();
    }
}
class ShipDeliver extends delivering{
    @Override
    public deliver createDeliver() {
        return new Ship();
    }
}
class AirDeliver extends delivering{
    @Override
    public deliver createDeliver() {
        return new Airplain();
    }
}
public class Main {
    public static void main(String[] args) {
        delivering meTruce = new TrukDeliver();
        deliver myTrue = meTruce.createDeliver();
        System.out.println(myTrue + "\n");
        delivering meShip = new ShipDeliver();
        deliver myShip = meShip.createDeliver();
        System.out.println(myShip + "\n");
        delivering meAir = new AirDeliver();
        deliver myAir = meAir.createDeliver();
        System.out.println(myAir + "\n");
    }
}
