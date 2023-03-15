package Q3;
// 3) WAP to showcase the usage of volatile in java.
public class t1 {
    private  Integer number = 0;

    public static void main(String[] args) {
        t1 volatileObject = new t1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200000 ; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(volatileObject.number);
                }
            }
        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        volatileObject.number = 5;
        System.out.println("number changed");
    }
}
