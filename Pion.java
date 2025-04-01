abstract class Pion extends Piece{
    
    public Pion() throws ErreurCoordonneesException
    {
	super('B', new Position());
    }

    public Pion(char couleur, Position position) throws ErreurCoordonneesException
    {
	super(couleur, position);
    }
    
    public String getType(){
    	return new String("pion");
    }
}
