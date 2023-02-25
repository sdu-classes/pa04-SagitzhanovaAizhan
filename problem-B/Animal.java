public abstract class Animal{
  protected int legs;
  
  protected Animal(int legs)
  {
    this.legs=legs;
  }
  
  public vois walk()
  {
    System.out.println("this animal walks by "+lega+"legs.");
  }
  public abstract vois eat();
}
