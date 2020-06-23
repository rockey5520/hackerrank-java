package warmup.comparethetriplets;

public class Main {

  public static void main(String[] args) {
    long method = method(29815);
    System.out.println(method);
  }

  public static long method(long n) {
    if (n == 0) {
      return 0;
    }
    return n % 10 + method(n / 10);
  }
}