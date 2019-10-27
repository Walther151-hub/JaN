package Lession6.Animals;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super (name, color, age);
    }

    @Override

    public void swim() {
        System.out.println (name+" DO NOT swim!!!");
    }


    @Override
    public void run() {
        if (distr <= 200) System.out.println (name+" успешно преодолел дстанцию!");
        else
            System.out.println (name+" непреодолимая для кота дистанция!");

    }

//    public void swim() {
//        System.out.println (name + " swim");

    //    }
    @Override
    public void jump() {
        if (height <= 2) System.out.println (name+" прыгнул успешно !");
        else
            System.out.println (name+" слишком высоко для кота!");

    }

//    Супер Кот Тихон


}
