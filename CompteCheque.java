public class CompteCheque extends Compte{
    private int frais;

    public CompteCheque(){
        super();
    }
    public CompteCheque(int solde, int frais){
        super(solde);
        this.frais=frais;
    }

    public int getFrais(){
        return frais;
    }

    public void setFrais(int frais){
        this.frais=frais;
    }
    @Override
    public void depot(float mt){
        solde+=mt-frais;
    }

    public void retrait(float mt){
        sodle-=mt+frais;
    }

    public void virement(float mt){

    }
}