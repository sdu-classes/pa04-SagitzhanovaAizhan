public class Fish extends Animal implements Pet{

public Fish(){
super(O);
}

public void eat(){
System.out.println("Fish eats meal");
}

public String getName(){
return fishName;
}
public void setName(String name){
fishName = name;
}

public void play(){
throw new UnsupportedOperationException("not sup yet");
}


public void walk()
{
System.out.println("Fish have not legs.");
}}
