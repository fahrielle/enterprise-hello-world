package v102316;

public class HelloWorldMain {
    public static void main(String args) {
        HelloWorldFactory helloWorldFactory = new HelloWorldFactory("The end, world!");
        HelloWorld helloWorldArray[] = new HelloWorld[4];

        helloWorldArray[0] = helloWorldFactory.getGreetingHelloWorld();
        helloWorldArray[1] = helloWorldFactory.getGoodbyeHelloWorld();
        helloWorldArray[2] = helloWorldFactory.getSurpriseHelloWorld();
        helloWorldArray[3] = helloWorldFactory.getCustomHelloWorld();

        for (int i = 0; i < helloWorldArray.length; i++) {
            helloWorldArray[i].print();
        }
    }
}
