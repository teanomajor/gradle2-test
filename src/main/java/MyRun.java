/**
 * teano@silence.org
 * Date:2016/8/17.
 *
 * @author teano yang
 * @see org.silence
 * @since version0.1
 */
class MyRun implements Runnable {
    private long distance;
    private float speed;

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    MyRun(long distance,float speed){
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public void run(){
        int time = (int)(distance/speed);
        for(int i = time; i > 0; i--){
            System.out.println("has less:"+i+" sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("this's time:"+time+" sec");
    }
}
