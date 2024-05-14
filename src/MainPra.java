public class MainPra {
  public static void main(String [] args) {
    Practise myCard = new Practise(1111,500);
    Practise hisCard = new Practise(2222);

    System.out.println("我的卡片加值500元" +
            (myCard.add(500) ? "成功" : "失敗") );
    myCard.showInfo();

    System.out.println("他的卡片加值900元" +
            (hisCard.add(900) ? "成功" : "失敗") );
    hisCard.showInfo();

  }
}
