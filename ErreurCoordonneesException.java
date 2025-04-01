

public class ErreurCoordonneesException extends RuntimeException 
{

    private int x,y;


    public ErreurCoordonneesException(int x, int y)
    {
        if (x < 0 || x > 7 || y < 0 || y > 7)
        {
            this.x = x;
            this.y = y;
        }

    }

    public ErreurCoordonneesException(String position)
    {
        try {
            Position p = new Position(position);
            if (p.getX() < 0 || p.getX() > 7 || p.getY() < 0 || p.getY() > 7)
            {
                this.x = p.getX();
                this.y = p.getY();
            }
        }
        catch(Exception e) {}


    }


    public void setY(int newY)
    {
        if (newY < 0 || newY > 7)
        {
            this.y = newY;
        }
    }

    public void setX(int newX)
    {
        if (newX < 0 || newX > 7)
        {
            this.x = newX;
        }
    }


    @Override
    public String getMessage()
    {
        if((this.x < 0 || this.x > 7) && (this.y < 0 || this.y > 7))
        {
            return new String("Erreur dans la position X : " + this.x + " - Les indices doivent être compris entre 0 et 7\n" +
            "Erreur dans la position Y : " + this.y + " - Les indices doivent être compris entre 0 et 7");
        }
        else if (this.x < 0 || this.x > 7)
        {
            return new String("Erreur dans la position X : " + this.x + " - Les indices doivent être compris entre 0 et 7\n");
        }
        else 
        {
            return new String("Erreur dans la position Y : " + this.y + " - Les indices doivent être compris entre 0 et 7\n");
        }
    }


    
}
