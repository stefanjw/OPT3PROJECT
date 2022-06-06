package model;

public abstract class Bon {
Gebruiker gebruiker;
Bestelling bestelling;

public  Bon(Bestelling bestelling){
    this.bestelling=bestelling;

}
public abstract String GetSpecificLastLines();


   public String printBon(){

       return "naam: " + bestelling.getBesteller().getNaam() +" "+ bestelling.getBesteller().getAchternaam()+ "\n" +
               "leeftijd " + bestelling.getBesteller().getLeeftijd()+"\n" +

       "---------------------------------------------------" +"\n" +
               "Producten: "+"\n" +
               bestelling.getWinkelmand().toString()+ "\n" +
               "---------------------------------------------\n"+
               "Totale Prijs(Zonder Korting): "+bestelling.getTotalePrijs()+ "\n"+
               "----------------------------------------------\n"+
                "Prijs met Korting: " + (bestelling.getTotalePrijs()* bestelling.GetKorting())+"\n"+
               "---------------------------------------------\n"+
               GetSpecificLastLines();
   }
}

 class BonWithBtw extends Bon {

    public BonWithBtw(Bestelling bestelling) {
        super(bestelling);

    }

    @Override
    public String GetSpecificLastLines() {
        return "Btw: " + bestelling.getTotalePrijs() * 0.21;
    }
}

class BonWithoutBtw extends Bon {

    public BonWithoutBtw(Bestelling bestelling) {
        super(bestelling);
    }

    @Override
    public String GetSpecificLastLines() {
        return "Geen Btw Toegevoegd";
    }
}



