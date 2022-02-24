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

    public abstract String cost();

    public void hasMilk(){
        if (milk > 0){
            Price += milkPrice * milkCounter;
            description += "+" + milkCounter + " молоко ";
        }
    }
    Integer milkCounter = 0;
    public void setMilk(){
        milk ++;
        milkCounter++;
    }

    Integer soyCounter = 0;
    public void hasSoy(){
        if (soy > 0){
            Price += soyPrice * soyCounter;
            description +="+" + soyCounter + " соя ";
        }
    }
    public void setSoy(){
        soy ++;
        soyCounter++;
    }

    Integer mochaCounter = 0;
    public void hasMocha(){
        if (mocha > 0){
            Price += mochaPrice * mochaCounter;
            description += "+" + mochaCounter + " мокачино ";
        }
    }
    public void setMocha(){
        mocha ++;
        mochaCounter++;
    }

    Integer whipCounter = 0;
    public void hasWhip(){
        if(whip > 0){
            Price += whipPrice * whipCounter;
            description += "+" + whipCounter + " взбить ";
        }
    }
    public void setWhip(){
        whip ++;
        whipCounter++;
    }
}