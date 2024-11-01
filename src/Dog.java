public class Dog extends Animal{
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Dog(String colour, String action) {
        super(colour);
        this.action = action;
    }

    String action;

    public Dog(String colour) {
        super(colour);
    }

    public static void sample(){
        System.out.println("in dog");
    }
}
