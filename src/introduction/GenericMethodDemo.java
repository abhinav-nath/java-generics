package introduction;

public class GenericMethodDemo {

    static <T> void genericDisplay(T t) {
        System.out.println(t.getClass().getName() + "=" + t);
    }

    public static void main(String[] args) {

        genericDisplay(11);

        genericDisplay("helloworld");

        genericDisplay(1.0);

    }

}