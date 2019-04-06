package P3;

public class Piece {
private String pieceName;
private static int pieceState;
private int pieceX;
private int pieceY; 
public Piece(String name ,int state ,int x,int y)
{
     name = this.pieceName;
     state =this.pieceState;
     x=this.pieceX;
     y = this.pieceY;
}
public String getpieceName()
{
	return pieceName;
}
public static int  getpieceState()
{
	return pieceState;
}
public void remove()
{
	pieceState=-1;
	pieceX=-1;
	pieceY=-1;
}
public  int getPieceState() {
	return pieceState;
}
public void setPieceState(int pieceState) {
	this.pieceState = pieceState;
}

}