# Generics

> Generics enable types to be parameters when defining classes and methods and with that you can re-use the same code with different inputs (types).

This class can store a String, an Integer or any Custom object.
The purpose of this Box is to re-use it for any kind of data.

```java
public class Box<T> {
    private T type;

    public void set(T type) {
        this.type = type;
    }

    public T get() {
        return type;
    }

    // T is a type parameter
}
```

```java
Box<String> favoriteColor = new Box<>();
favoriteColor.set("BLACK");
favoriteColor.set(10); // compilation error
```

```java
Box<Integer> favoriteNumber = new Box<>();
favoriteNumber.set(27);
```

```java
Box<Animal> favoriteAnimal = new Box<>();
favoriteAnimal.set("Tiger");
```

---

- [Motivation behind Generics](./notes/01_motivation-behind-generics.md "Motivation behind Generics")
- [Generics Terminology](./notes/02_generics-terminology.md "Generics Terminology")
- [Type Inference](./notes/03_type-inference.md "Type Inference")
- [Generics Restrictions](./notes/04_generics-restrictions.md "Generics Restrictions")

---
<p align="center">
  ⭐ Star this repository — it helps!
</p>
