package P3;

public class Position {
private int x;
private int y;
public Position(int positionX,int positionY)
{
	positionX=this.x;
	positionY=this.y;
}
public int getpositionX()
{
	return x;
}
public int getpositionY()
{
	return y;
}
public boolean equals(Object that)
{
	Position p1=(Position)that;
	Position p2;
	return (this.x==p1 .x)&&(this.y==p1 .y);
	
}
}
