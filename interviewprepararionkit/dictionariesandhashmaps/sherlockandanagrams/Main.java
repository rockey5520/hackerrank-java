package dictionariesandhashmaps.sherlockandanagrams;

public class Main {

  public static void main(String[] args) {
    //String regex = "1[234][abc]b";
    //String regex = "[13][234][a-d]b";
    String regex = "0\\.[0-9]{2}9{0,2}5*";
    System.out.println("0.125".matches(regex));
    System.out.println("0.1295".matches(regex));
    System.out.println("0.129995".matches(regex));
    System.out.println("0.1299".matches(regex));
    System.out.println("0.129955".matches(regex));
    /*







    */
  }
}
