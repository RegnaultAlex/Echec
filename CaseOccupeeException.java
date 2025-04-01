public class CaseOccupeeException extends RuntimeException
{

    private Piece p;

    public CaseOccupeeException(Piece p)
    {
        this.p = p;
    }


    @Override
    public String getMessage()
    {
        Position p = this.p.getPosition();
        return new String("Impossible de placer le " + this.p.getType() + " en "  + p.toString() + ". Une autre pièce s'y trouve déjà.");
    }
}