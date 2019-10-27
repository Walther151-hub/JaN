package Lession6;
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
//        собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
//        (Например, dog1.run(150); -> результат: run: true)
//        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может
//        быть 400 м., у другой 600 м.


import Lession6.Animals.Cat;
import Lession6.Animals.CrazyCat;
import Lession6.Animals.Dog;

public class AnimalMain {


    public static void main(String[] args) {
        Cat cat = new Cat ("Zalman","smoky", 4);
        Cat cat1 = new Cat ("Barsik","carrot", 2);
        Cat cat2 = new Cat ("Tihon","rainbow", 2);
        CrazyCat cat3 = new CrazyCat ("Мурзяка","Чёрный", 3); // разброс в ограничениях
        Dog dog1 =new Dog ("Tuzik","white",5);
        Dog dog2 =new Dog ("Полкан","коричневый", 7);

cat.run ();
cat1.jump ();
cat2.swim (); //кот не умеет плавать!!!
cat.info();
cat3.info();
cat3.run ();
        dog1.run ();
        dog2.swim ();


        }
    }
