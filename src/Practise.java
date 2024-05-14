public class Practise {
  private long id;
  private int money;

  public void showInfo() {
    System.out.println("卡號：" + id);
    System.out.println("餘額：" + money + "元");
  }

  public Boolean add(int value) {
    if(value > 0 && value+money <= 10000) {
      money += value;
      return true;
    }
    return false;
  }

  public Practise(long id,int money) {
    this.id = id;
    this.money = money;
  }

  public Practise(long id) {
    this(id,0);
  }


}
