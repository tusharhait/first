public interface Bases {
    void b1();

    default void b2(){
        System.out.println("in bases");
    }
}
