public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println("Today is : " + today);
        System.out.println("Days of the week : ");
        for(Day day : Day.values()) {
            System.out.println(day);
        }
        
    }
}