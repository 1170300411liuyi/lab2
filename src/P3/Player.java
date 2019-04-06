package P3;
import P3.Piece.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Player {
private String playerName;
private Set<Piece>remaining= new HashSet<Piece>();
private String history = new String();
public String getplayerName() {
	return playerName;
}
public Set<Piece> getremaining() {
	return remaining;
}
public Piece getPiece(String pieceName) {
	if(pieceName==null)
	{
	return null;
	}
	else {
		return (Piece) remaining;
	}
	
}
public boolean addPieces(Piece piece)
{
	if(remaining.contains(piece))
	{
		return false;
	}
	else {
		remaining.add(piece);
		return true;
	}
}
public void addHistory(String oneHistory)
{
	if(oneHistory!=null)
	{
		history=history.concat(oneHistory);
		
	}
}
public void SetplayerName(String playerName)
{
	this.playerName=playerName;
}
public boolean judgeOwnPiece(Piece piece)
{
	if(remaining.contains(piece))
	{
		return true;
	}
	else {
		return false;
	}
}
public int countQuantityOfPieceInBoard()
{
	int num = 0 ;
	
	if(Piece.getpieceState()==1)
	{
	  num++;
	}
	return num;
	
}
}
