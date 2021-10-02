package introduction;

import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        Container<String> stringStore = new Store<>();
        stringStore.set("java");
        // stringStore.set(1); Compile-time type-safety
        System.out.println(stringStore.get());
        // under the hood, compiler will insert a cast here
        // Compiler -> Type Erasure + Explicit Casting
        // (String) stringStore.get(); 

        Container<Integer> intStore = new Store<>();
        intStore.set(1);
        System.out.println(intStore.get());
        // under the hood, compiler will insert a cast here
        // Compiler -> Type Erasure + Explicit Casting
        // (Integer) intStore.get();

        Container<List<Integer>> listStore = new Store<>();
        listStore.set(Arrays.asList(1, 2, 3));
        System.out.println(listStore.get());
        // under the hood, compiler will insert a cast here
        // Compiler -> Type Erasure + Explicit Casting        
        // (List<Integer>) listStore.get();
    }

}

interface Container<T> {
    void set(T a);

    T get();
}

class Store<T> implements Container<T> {

    private T a;

    @Override
    public void set(T a) {
        this.a = a;
    }

    @Override
    public T get() {
        return this.a;
    }

}