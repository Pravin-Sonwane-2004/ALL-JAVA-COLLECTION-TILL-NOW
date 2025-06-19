package revision_everything;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte smallNumber = 10;       // 1 byte
        short shortNumber = 1000;    // 2 bytes
        int integerNumber = 100000;  // 4 bytes
        long largeNumber = 1000000000L; // 8 bytes
        float decimalNumber = 3.14F; // 4 bytes
        double largeDecimal = 3.14159265359; // 8 bytes
        char singleCharacter = 'A'; // 2 bytes
        boolean isJavaFun = true;   // 1 bit
        
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + integerNumber);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + decimalNumber);
        System.out.println("Double: " + largeDecimal);
        System.out.println("Char: " + singleCharacter);
        System.out.println("Boolean: " + isJavaFun);
    }
}
