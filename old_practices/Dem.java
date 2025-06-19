public class Dem {
  static int staticCount = 0; // Belongs to class
  int instanceCount = 0; // Belongs to object

  public void increment() {
    staticCount++;
    instanceCount++;
    System.out.println(staticCount + " this is count " + instanceCount);
  }

  public static void main(String[] args) {
    Dem d1 = new Dem();
    Dem d2 = new Dem();

    d1.increment();
    d2.increment();

    // System.out.println("Static Count: " + Dem.staticCount); // 2
    // System.out.println("Instance Count d1: " + d1.instanceCount); // 1
    // System.out.println("Instance Count d2: " + d2.instanceCount); // 1
  }
}
