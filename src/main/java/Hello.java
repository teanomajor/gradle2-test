/**
 * teano@silence.org
 * Date:2016/8/16.
 *
 * @author teano yang
 * @see org.silence
 * @since version0.1
 */
public class Hello {
        public static void main(String args[]){
            if(args.length <= 0){
                System.out.println(args[0]);
            }else{
                for (String arg : args) {
                    System.out.println(arg);
                }
            }

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("run");
                }
            });

            Thread thread1 = new Thread(new MyRun(1000,100));
            thread1.start();
            thread.start();

    }

}
