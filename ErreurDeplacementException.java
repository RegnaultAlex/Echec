public class ErreurDeplacementException extends RuntimeException {
    
    private Piece pd;
    private Piece pa;

    public ErreurDeplacementException(Piece pieceDepart, Piece pieceArrive)
    {
        this.pd = pieceDepart;
        this.pa = pieceArrive;
    }

    @Override 
    public String getMessage()
    {
        Position posD = this.pd.getPosition();
        Position posA = this.pa.getPosition();
        return new String("Impossible de faire le deplacement de " + posD.toString() + " en " + posA.toString());
    }
}
