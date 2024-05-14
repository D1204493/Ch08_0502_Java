import java.util.*;
public class Main2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

    int num = LotteryGenerator
            .generateNumbers(100);

    int max = 100;
    int min = 1;

    while (true) {
      //請使用者輸入一整數值，直到輸入的整數值等於num
      //提示num介於的範圍
      System.out.println("請猜一個值介於："
              + min + "到" + max + "之間");
      int input = sc.nextInt();
      if(input == num){
        System.out.println("恭喜你猜到了");
        break;
      }
      else if (input > num) {
        max = input;
      }
      else {
        min = input;
      }
    }
    System.out.println("密碼是："+ num);

  }
}
