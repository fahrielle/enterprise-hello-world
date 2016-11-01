import v102316.HelloWorldMain;

public class HelloWorldMainThread implements Runnable{
    public void run() {
		HelloWorldMain.main(null);
    }

    public static void main(String args[]) {
        (new Thread(new HelloWorldMainThread())).start();
    }
}
