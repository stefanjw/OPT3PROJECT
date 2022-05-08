package model;

public class Korting {

    private Double korting;
    private Bestelling bestelling;


    public Korting() {

    }


    public Double GeefKOrting(){
        int count =0;
        for(Product product : bestelling.getWinkelmand()){
          count++;

            if(count<2){
                return korting =1.0;
            }
            if(count>=2 && count <= 4){
                return korting =0.8;
            }
            if(count > 4 && count <=8 )
                return korting = 0.6;
        }
        return 1.0;




    }




}
