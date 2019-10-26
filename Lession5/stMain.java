package Lession5;

public class stMain {




    public static void main(String[] args) {



        Staff[] staffsAr = new Staff[5];


        staffsAr[0] = new Staff ("Ted Backman", "manager", "Ted@mail.ru", 8999556, 30000, 26);
        staffsAr[1] = new Staff ("Kelly Baile", "supermanager", "kell@mail.ru", 8969696, 35000, 40);
        staffsAr[2] = new Staff ("Jeff Ballinger", "security", "jeffsd@mail.ru", 89653536, 15000, 43);
        staffsAr[3] = new Staff ("Laura Dubuk", "teacher", "laurthc@mail.ru", 89675691, 16000, 40);
        staffsAr[4] = new Staff ("Eric Smith", "boss", "eboss@mail.ru", 898989898, 50000, 21);




        for (int i = 0; i < staffsAr.length; i++) {


              staffsAr[i].schage ();


       }


    }
}






