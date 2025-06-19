package revision_everything;
public class EnumSwitchExample {
enum TrafficLight {
    RED, YELLOW, GREEN
}
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        switch (light) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Get Ready!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}
