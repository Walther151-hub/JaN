package Lession6.Animals;

public class CrazyCat extends Cat {

    public CrazyCat(String name, String color, int age) {
        super (name, color, age);
    }
        @Override

        public void swim() {
            if (swim <= 1) System.out.println (name+ "проплыл целый метр!");
            else
                System.out.println (name+" слишком мокро даже для Супер кота!");
        }


        @Override
        public void run() {
            if (distr <= 300) System.out.println (name+" успешно преодолел дстанцию!");
            else
                System.out.println (name+" непреодолимая даже для Супер кота дистанция!");

        }


        @Override
        public void jump() {
            if (height <= 3) System.out.println (name+" прыгнул успешно !");
            else
                System.out.println (name+" слишком высоко даже для Супер кота!");

        }

}

