public class Gooo {
    public static void main(String[] args) {

        Man man = new Man ();
        man.setName ("Garri");
        Cat cat = new Cat ();
        cat.setName ("Bars");
        Robot robot = new Robot ();
        robot.setName ("Robbi");
        Track track = new Track ();
        Wall wall = new Wall ();
//        man.running ();
//        man.junping ();
//        cat.running ();
//        cat.junping ();
        robot.run ();
        robot.jump ();
        track.tracks ();
        wall.walls ();



        Barriers[] barriers = {track, wall};

        Run[] runnin = {man, cat};

        for (Run running : runnin) {

            running.junping ();



//            System.out.println (runnin == barriers);


//                for (int i = 0; i < runnin.length; i++) {
//                    for (int )
//                }
//
//
//                        if (running =  )System.out.println ("Все ваши сотрудники молоды!");
//            else{


        }




    }
}