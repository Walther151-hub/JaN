//        Эти классы должны уметь бегать и прыгать (методы)
//        У участников ограничения на бег и прыжки.
public class Man implements Run {
    private String name;
    private int rundistance = 2000;
    private int jumping = 2;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //   public void run() {}


//    public void jump () {
//            System.out.println (name+ " jumpnig "+ jumping +" mets");
//    }

    public void running() {
        System.out.println (name+" runnig "+rundistance+" mets");
    }

    public void junping() {
        System.out.println (name+ " jumpnig "+ jumping +" mets");

    }
}
