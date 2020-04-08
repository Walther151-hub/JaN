//        У препятствий есть высота (для стены)
public class Wall extends Barriers {

        protected int wall=2;

        public int getHeight() {
            return wall;
        }

        public void setHeight(int height) {
            this.wall = height;
        }
//    public void heig () {
//        System.out.println ("Height wall " +wall+" metrs");
//    }

    public void walls() {
        System.out.println ("Height wall " +wall+" metrs");

    }
}

