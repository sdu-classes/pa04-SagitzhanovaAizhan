public class MovablePoint{
int x,y, xspeed, yspeed;

public MovablePoint(int x , int y, int xspeed, int yspeed){
this.x = x;
}

@Override
public void moveUp(){
y = yspeed;
}
}
