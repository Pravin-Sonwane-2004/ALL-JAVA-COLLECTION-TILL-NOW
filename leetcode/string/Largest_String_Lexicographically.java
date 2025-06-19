public class Largest_String_Lexicographically {

    public static void main(String[] args) {
        String Fruits [] = {"Apple" , "Banana" , "Mango"}; 
        String largeString = Fruits[0];
        for(int i = 1;i<Fruits.length;i++) {
            if(largeString.compareTo(Fruits [i])<0) {
                largeString = Fruits[i];
            }
        }
        System.out.println(largeString);
    }
}