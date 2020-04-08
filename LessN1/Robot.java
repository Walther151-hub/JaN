//        Эти классы должны уметь бегать и прыгать
//        У участников ограничения на бег и прыжки.
public class Robot {
        private String name;
        private int rundistance = 500;
        private int jumping = 1;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
        public void run() {
                System.out.println (name+" runnig "+rundistance+" mets");
        }
        public void jump () {
                System.out.println (name+ " jumpnig "+ jumping +" mets");
        }
}
