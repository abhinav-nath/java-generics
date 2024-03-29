# Motivation behind Generics

Generics was introduced in `Java 5`.

Prior to `Java 5`, it was a common practice of developers to represent the generic types with the `Object` class.

For example:

```java
class Store {
    private Object a;

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }
}
```

Now assume two developers are using this `Store` class:

Tom:
```java
Store store = new Store();
store.set(new Date(someTime));  // java.sql.Date
..
Date date = (Date) store.get();  // java.sql.Date
```


Lily:
```java
store.set(new Date());  // java.util.Date
```


Tom:
```java
Date date = (Date) store.get();  // java.sql.Date

-----> ClassCastException
```

There are three problems here:

1. The type `Object` is way too generic. It allowed storing instances of both `java.sql.Date` and `java.util.Date`

2. Need for explicit casting. The instance returned by the `get()` method needs to be casted.

3. Runtime exception.


> So Java designers wanted to fix these problems and avoid such runtime exceptions.
They wanted to identify such issues at Compile-time itself.
>
> And so they introduced the Generics feature.
>
> Note that Generics is totally a compile-time feature.


Same class using Generics:

```java
class Store<T> {
    private T a;

    public void set(T a) {
        this.a = a;
    }
    
    public T get() {
        return a;
    }

    // T is a type parameter
}
```


Tom:
```java
Store<Date> store = new Store<Date>();  // java.sql.Date
store.set(new Date(someTime));
..
Date date = store.get();  // no casting
```


Lily:
```java
store.set(new Date());  // java.util.Date

-----> Compile-time ERROR !
```


Harry:
```java
Store<Book> store = new Store<Book>();
store.set(new Book());
```


- Type-safety at compile-time
- Cleaner Code
- Expressive Code
- Truly Generic