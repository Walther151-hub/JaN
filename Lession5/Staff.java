package Lession5;

//    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//    persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class Staff {
    String name;
    String position;
    String email;
    int tel;
    int money;
    int age;
    Staff[] staffsAr = new Staff[5];


    Staff(String name, String position, String email, int tel, int money, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;

    }

    public int getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    public int getTel() {
        return tel;
    }


    public void infall() {
        System.out.println ("Имя:"+name+" "+"Должность: "+position+" "+"Эл.почта: "+email+" "+"Тел: "+tel+" "+"З/П: "+money+" "+"Возраст: "+age+" ");
    }

    public void infall1() {
        System.out.println ("Имя:"+name+" "+"Должность: "+position+" "+"Эл.почта: "+email+" "+"Тел: "+tel+" "+"З/П: "+money+" "+"Возраст: "+age+" ");
    }

    public void infall2() {
        System.out.printf ("Возраст: "+age+" ");
    }
    // staffsAr.schage();


    public void schage() {

        for (int i = 0; i < staffsAr.length; i++) {
            if (getAge () >= 40) {
                System.out.println ("Имя:"+name+" "+"Должность: "+position+" "+"Эл.почта: "+email+" "+"Тел: "+tel+" "+"З/П: "+money+" "+"Возраст: "+age+" ");
            }
            break;

        }

    }
}


