public abstract class Device{
  QuackBehavior quackBehavior;

  // constructor
  public Device(){}

  // 
  public abstract void display();

  // use interface
  public void performQuack(){
    quackBehavior.quack();
  }

  // setter
  public void setQuackBehavior(QuackBehavior qb){
    quackBehavior = qb;
  }




}