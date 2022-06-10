package model;

public abstract class Bon {
final static double btwPercantage = 0.21;
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
                "Prijs met Korting: " + bestelling.getTotalePrijsMetKorting()+ "\n"+
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
        return "Btw: " + bestelling.getTotalePrijs() * btwPercantage;
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



