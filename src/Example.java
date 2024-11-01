public class Example implements Base, Bases{
    @Override
    public void b1() {
        System.out.println("In example");
    }

    @Override
    public void b2() {
        System.out.println("In example");
        Base.super.b2();
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.b1();
        example.b2();
    }

}
