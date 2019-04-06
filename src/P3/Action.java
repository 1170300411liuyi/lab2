package P3;
import static P3.Board.*;
import static P3.Position.*;
public class Action {
private Board chessBoard = new Board();
public Board getchessBoard()
{
	return chessBoard ;
}
public Board setchessBoard()
{
	chessBoard=this.chessBoard;
	return chessBoard;
}
public void putPiece(Player player,Piece piece,Position position) throws Exception{
	
	player.addHistory(String.format("%s put a piece %s in (%d,%d)\n",
	      player.getplayerName(),piece.getpieceName(),position.getpositionX(),position.getpositionY()));
	if (position.getpositionX()>chessBoard||position.getpositionY()>chessBoard||Piece.getpieceState()==1) {
		throw new Exception();
	}
}

}