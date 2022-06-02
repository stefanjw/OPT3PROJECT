package model;

public class Bon {
Gebruiker gebruiker;
Bestelling bestelling;

public Bon(Bestelling bestelling){
    this.bestelling=bestelling;

}
   public String printBon(){

       return "naam: " + bestelling.getBesteller().getNaam() +" "+ bestelling.getBesteller().getAchternaam()+ "\n" +
               "leeftijd " + bestelling.getBesteller().getLeeftijd()+"\n" +

       "---------------------------------------------------" +"\n" +
               "Producten: "+"\n" +
               bestelling.getWinkelmand().toString()+ "\n" +
               "---------------------------------------------"+
               bestelling.berekenTotalePrijs();









   }
}
