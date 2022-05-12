package model;

public class Korting {



    private Double korting;
    private Bestelling bestelling;

    public Korting(Bestelling bestelling) {
        this.bestelling=bestelling;
    }

    public double checkProducten() {
        int count = 0;

        for (Product a : bestelling.getWinkelmand()) {
            count++;
        }

        if (count >= 2 && count <= 4) {
            return  0.8;
        }
        if (count > 4) {
            return  0.6;
        }
        else {
            return 1.0;
        }
    }
}
