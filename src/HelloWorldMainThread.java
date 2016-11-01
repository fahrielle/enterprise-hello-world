import v102316.HelloWorldMain;

public class HelloWorldMainThread implements Runnable{
    public void run() {
    	//Call our main helloWorld's main class's main
		HelloWorldMain.main(null);
    }
    //Start our main helloWorld's main class's main execution thread
    public static void main(String args[]) {
        (new Thread(new HelloWorldMainThread())).start();
    }
}
