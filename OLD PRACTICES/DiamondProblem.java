interface A {
    void close();
}

interface B extends A {
    default void close() {
        System.out.println("Close method in Interface B");
    }
}

interface C extends A {
    default void close() {
        System.out.println("Close method in Interface C");
    }
}
class D implements B, C {
    @Override
    public void close() {
        // Explicitly choose which interface's method to call
        C.super.close(); // Or use C.super.close()
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.close(); // Output: Close method in Interface B
    }
}
