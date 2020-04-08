//        У препятствий есть длина (для дорожки)
public class Track extends Barriers {

        protected int track = 2000;

                public int getTrack() {
                    return track;
                }

                public void setTrack(int track) {
                    this.track = track;
                }
    public void tracks () {
        System.out.println ("Distance " +track+" metrs");
    }


        }

