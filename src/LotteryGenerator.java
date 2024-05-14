import javax.swing.plaf.IconUIResource;

public class LotteryGenerator {

  static int [] generateNumbers(int length,int endNumb) {
    int[] numbers = new int[length];

    int index = 0;
    while (index < length) {
      int num = generateNumbers(endNumb);

      if(index == 0){
        numbers[index] = num;
        index++;
        continue;
      }
      boolean isExist = false;
      for(int i=0; i<index; i++){
        if(numbers[i] == num){
          isExist = true;
          System.out.println("重複："+ num );
          break;
        }
      }
      if(!isExist){
        numbers[index] = num;
        index++;
      }
    }
    return numbers;
  }
  
    static int generateNumbers(int endNum) {
      double random = Math.random();//0.0~0.999
      //if endNum = 100
      random = random * endNum;//0.0~99.999
      int result = (int)random+1;
      return result;
    }

}
