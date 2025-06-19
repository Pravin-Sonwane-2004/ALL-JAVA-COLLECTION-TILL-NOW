public class AutoboxingExample {
    public static void main(String[] args) {
        int num = 10;

        // Autoboxing: int (primitive) to Integer (wrapper)
        Integer numObj = num; 
        System.out.println("Primitive int: " + num);
        System.out.println("Autoboxed Integer object: " + numObj);

        // Adding to a collection (works only with objects)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(num); // Autoboxing
        System.out.println("ArrayList: " + list);
    }
}
