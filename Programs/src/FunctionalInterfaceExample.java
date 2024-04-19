public class FunctionalInterfaceExample {
}

@FunctionalInterface
interface Consumer<E> {
    void apply(E e);
}

@FunctionalInterface
interface Supplier<E> {
    E apply();
}

@FunctionalInterface
interface Predicate<E> {
    boolean apply(E e);
}

@FunctionalInterface
interface Function<E,T> {
    T apply(E e);
}


