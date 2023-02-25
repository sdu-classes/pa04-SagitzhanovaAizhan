public class MovableCircle implements Movable{ 
private MovablePoint center;

private int radius;

public MovableCircle( 
int x, int y, int xspeed, int yspeed, int radius){

center = new MovablePoint(x, y, xspeed, yspeed);
}

public void MoveUp(){
center.y = center.yspeed;

}
}
