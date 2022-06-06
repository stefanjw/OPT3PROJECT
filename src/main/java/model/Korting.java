package model;

public abstract class Korting {
    private double korting;

    public abstract void BerekenKorting();
    public abstract double geefKoring();

    public void setKorting(Double korting) {
        this.korting = korting;
    }

    public double getKorting() {
        return korting;
    }

}

class KortingBoven65 extends Korting{

    public void BerekenKorting(){
        setKorting(0.8);
    }

    @Override
    public double geefKoring() {
        return getKorting();
    }
}

class KortingOnder18 extends Korting{

    @Override
    public void BerekenKorting() {
        setKorting(0.7);
    }

    @Override
    public double geefKoring() {
        return getKorting();
    }
}
class AantalProductenKorting extends Korting {
private Bestelling bestelling;
    public AantalProductenKorting(Bestelling bestelling) {
       this.bestelling=bestelling;
    }

    @Override
    public void BerekenKorting() {

        int count = 0;
        for (Product a : bestelling.getWinkelmand()) {
            count++;
        }
        if (count >= 2 && count <= 4) {
            setKorting(0.8);
        }
        if (count > 4) {
            setKorting(0.6);
        }
        else {
            setKorting(1.0);
        }

    }


    @Override
    public double geefKoring() {
        return getKorting();
    }
}





