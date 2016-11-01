package v102316;

public class HelloWorldFactory {
    private final String greetingString = "Hello, world!";
    private final String goodbyeString = "Goodbye, world!";
    private final String surpriseString = "Woooooooow, world!";

    private String customString = "";

    public HelloWorldFactory() {
    }

    public HelloWorldFactory(String customInput) {
        this.customString = customInput;
    }

    public HelloWorld getBasicHelloWorld() {
        return new HelloWorld();
    }

    public HelloWorld getGreetingHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setOutput(greetingString);
        return helloWorld;
    }

    public HelloWorld getGoodbyeHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setOutput(goodbyeString);
        return helloWorld;
    }

    public HelloWorld getSurpriseHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setOutput(surpriseString);
        return helloWorld;
    }

    public HelloWorld getCustomHelloWorld() throws NullPointerException {
        if (customString.isEmpty()) {
            throw new NullPointerException("No custom string defined.");
        }
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setOutput(customString);
        return helloWorld;
    }
}
