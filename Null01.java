public class Null01 {
  public static void main(String[] args) {
    String String1;
    String1 = "あいう";
    System.out.println(String1 + "の文字数：" + String1.length());

    String1 = "";
    System.out.println(String1 + "の文字数：" + String1.length());

    String1 = null;
    System.out.println(String1 + "の文字数：" + String1.length());
  }
}