package wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    /* Generic Type Parameter
    public static <T> void displayDate(List<T> list) {
        for (T t : list)
            System.out.println(t);
    }
    */

    /* WildCard */
    public static void displayDate(List<?> list) {
        for (Object t : list)
            System.out.println(t);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        displayDate(list);
    }

}