package experiments;

public class MyExceptions {
  public static void main(String[] args) {
    method1();
  }

  public static void method1(){
    //System.out.println("1");
    //pauseThread();
    //System.out.println("2");
    uncheckableExceptions(10,0);
  }

  public static void pauseThread(){
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }finally {
      System.out.println("qwerty");
    }
  }

  public static void uncheckableExceptions(int a, int b){
    int result = 0;
    result = a/b;
    System.out.println("result --> " + result);
  }

}
