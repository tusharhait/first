public interface Base {
    void b1();

    default void b2(){
        System.out.println("in base");
    }
}
