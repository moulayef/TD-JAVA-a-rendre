public class Epargne extends Compte{
    private int taux;

    //Constructeurs par defaut
    public Epargne(){

    }
    
    //Constructeur surchargé
    public Epargne(int solde, int taux){
        super(solde);
        this.taux=taux;
    }

    //Getters
    public int getTaux(){
        return taux;
    }

    //Setters
    public void setTaux(int taux){
        this.taux=taux;
    }

    @Override
    public void depot(int mt){
        solde+=mt*(1+(taux/100));

    }
}