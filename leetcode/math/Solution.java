class Solution {
  public static double myPow(double x, int n) {
    double power = Math.pow(x, n);
    return power;
  }

  public static void main(String[] args) {
    Solution obj = new Solution();
    System.out.println(obj.myPow(10, 2));
  }
}