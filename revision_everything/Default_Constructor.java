package revision_everything;
public class Default_Constructor {
    int num;      // Default value is 0
    String text;  // Default value is null

    public static void main(String[] args) {
       Default_Constructor obj = new Default_Constructor(); // Default constructor is called
        System.out.println(obj.num);   // Prints: 0
        System.out.println(obj.text);  // Prints: null
    }
}
