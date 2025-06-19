package revision_everything;
class Human {
    private String name = "Pravin";
    private int age = 20;

    public String getname () {
        return name;
    }
    public int getage() {
        return age;
    }
}

public class Encaosulation {

     public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getname()+" : " +obj.getage());
     }
}