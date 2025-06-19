package revision_everything;
public class Parameterized_Constructor {
        int num;
        String text;
    
        // Parameterized constructor
        Parameterized_Constructor(int num, String text) {
            this.num = num;    // Assign parameter value to field
            this.text = text;
        }
        public static void main(String[] args) {
            Parameterized_Constructor obj = new Parameterized_Constructor(50, "hello");
            System.out.println(obj.num);   // Prints: 10
            System.out.println(obj.text);  // Prints: Hello
        }
    }
    