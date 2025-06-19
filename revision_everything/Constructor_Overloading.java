package revision_everything;
public class Constructor_Overloading {
        int num;
        String text;
    
        // No-argument constructor
        Constructor_Overloading() {
            num = 0;
            text = "Default";
        }
    
        // Parameterized constructor
        Constructor_Overloading(int num, String text) {
            this.num = num;
            this.text = text;
        }
        public static void main(String[] args) {
            Constructor_Overloading obj1 = new Constructor_Overloading();              // Calls no-argument constructor
            Constructor_Overloading obj2 = new Constructor_Overloading ();  // Calls parameterized constructor
    
            System.out.println(obj1.num + ", " + obj1.text);  // Prints: 0, Default
            System.out.println(obj2.num + ", " + obj2.text);  // Prints: 99, Custom
        }
    }

