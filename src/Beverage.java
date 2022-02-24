public abstract class Beverage {

    String description;

    Integer milk = 0;
    Integer soy = 0;
    Integer mocha = 0;
    Integer whip = 0;

    Double milkPrice = 1.99;
    Double soyPrice = 2.99;
    Double mochaPrice = 0.99;
    Double whipPrice = 0.59;

    Double Price;

    public void setPrice(Double newPrice){
        Price = newPrice;
    }

    public void setDescription(String newDescription){
        description = newDescription;
    }
    public String getDescription(){
        cost();
        return description + Price;
    }

    public abstract void cost();

    public void hasMilk(){
        if (milk > 0){
            Price += milkPrice * milk;
            description += "+" + milk + " молоко ";
        }
    }
    public void setMilk(){
        milk ++;
    }

    public void hasSoy(){
        if (soy > 0){
            Price += soyPrice * soy;
            description +="+" + soy + " соя ";
        }
    }
    public void setSoy(){
        soy ++;
    }

    public void hasMocha(){
        if (mocha > 0){
            Price += mochaPrice * mocha;
            description += "+" + mocha + " мокачино ";
        }
    }
    public void setMocha(){
        mocha ++;
    }

    public void hasWhip(){
        if(whip > 0){
            Price += whipPrice * whip;
            description += "+" + whip + " взбить ";
        }
    }
    public void setWhip(){
        whip ++;
    }
}