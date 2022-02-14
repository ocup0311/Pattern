public class DuckBuzzer extends Device{  
  public DuckBuzzer(){
    quackBehavior = new Quack();
  }

  public void display(){
    System.out.println("I'm a Duck Buzzer.")
  }
}