package Lession6.Animals;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super (name, color, age);
    }

    @Override

    public void swim() {
        if (swim <= 10) System.out.println ("Собака "+name+" успешно проплыла дстанцию!");
        else
            System.out.println (name+" собака утонула(((");

    }



    @Override
    public void run() {
        if (distr <= 500) System.out.println ("Собака "+name+" успешно преодолела дстанцию!");
        else
            System.out.println (name+"  дистанция не пройдена!");

    }


    @Override
    public void jump() {
        if (height <= 0.5) System.out.println (name+" пёс подпрыгнул успешно !");
        else
            System.out.println (name+" собака не кенгуру!");

    }
}
