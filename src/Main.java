//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    int [] nums = LotteryGenerator
            .generateNumbers(5,10);
    for(int num: nums) {
      System.out.println(num);
    }

//    double random = Math.random();//0.0~0.999
//    System.out.println(random);
//    //if endNum = 100
//    random = random * 100;//0.0~99.999
//    random = Math.floor(random);//0~99
//    random++;
//    System.out.println(random);




//    Student tom = new Student();
//    tom.showInfo();
//    tom = null;
//    tom.showInfo();

//    System.out.println(Math.min(1,5));
//    System.out.println(Math.max(1,5));
//    System.out.println(Math.abs(-1));
//    System.out.println(Math.round(5.6));
//    System.out.println(Math.floor(5.6));
//    System.out.println(Math.random());


//    TemperatureConverter temp = new TemperatureConverter();
//    System.out.println(TemperatureConverter.converToC(180));
//    System.out.println(TemperatureConverter.converToF(25));


  }
}