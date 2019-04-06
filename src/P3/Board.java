package P3;
import static P3.Piece.*;
import static P3.Player.*;
import static P3.Position.*;
public class Board {
private int boardSize;
private Piece[][]boardPositionPieces;

public int setboardSize()
{
	boardSize = 100;
	return boardSize;
}
public boolean check(int x,int y)
{
	if(x>boardSize||y>boardSize)
	{
		return false;
	}
	else {
		return true;
	}
}
public Piece getBoardPiece(int x,int y) throws Exception{
	if(x>boardSize||y>boardSize)
	{
		throw new  Exception();
		
	}
	else
	{
		boardPositionPieces = this.boardPositionPieces;
		
	}
	
	return null;
}
public void setBoardPositionState(int x,int y,int newState) throws Exception
{
	if((x>boardSize)||(y>boardSize))
{
		throw new Exception();
}
}
public void setBoardPositionState(Piece piece,int x,int y) throws Exception
{
	if((x>boardSize)||(y>boardSize))
{
		throw new  Exception();
}
	else if(Piece.getpieceState()==1)
	{
		throw new Exception();
	}
	
}

}