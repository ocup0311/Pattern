public class MiniDuckSimulator{
  public static void main(String[] args){
    Device model = new ModelDuck();
    model.performQuack();
    model.setQuackBehavior(new MuteQuack());
    model.performQuack();
  }
}
