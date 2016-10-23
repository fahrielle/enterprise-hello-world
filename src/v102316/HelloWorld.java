package v102316;

public class HelloWorld {
    private String output;

    public HelloWorld() {
    }

    public HelloWorld(String output) {
        this.output = output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public boolean hasOutput() {
        return output.isEmpty();
    }

    public boolean hasOutput(String output) {
        return this.output.equals(output);
    }

    public void print() {
        System.out.println(output);
    }
}
