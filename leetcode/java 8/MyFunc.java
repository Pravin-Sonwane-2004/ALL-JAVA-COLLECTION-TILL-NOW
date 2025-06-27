@FunctionalInterface
interface MyFunc {
  void doWork();

  static void logStart() {
    System.out.println("loging");
  }

  static void running() {
    System.out.println("Running");
  }
}

