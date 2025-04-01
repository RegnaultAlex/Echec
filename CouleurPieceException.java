
public class CouleurPieceException extends RuntimeException {
    
    private char c;

    public CouleurPieceException(char couleur)
    {
        if (couleur != 'B' && couleur != 'N')
        {
            this.c = couleur;
        }
    }


    @Override
    public String getMessage()
    {
       return new String("Erreur dans la couleur de la pièce " + this.c + " - La couleur doit etre B ou N. "); 
    }


}
