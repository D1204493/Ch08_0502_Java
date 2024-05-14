public class TemperatureConverter {

  //華氏轉攝氏
  static double converToC(double f){
    double C = (f-32) * 5/9;
    return C;
  }

  //攝氏轉華氏
  static double converToF(double c){
    double F = (c * 9/5) + 32;
    return F;
  }


}
