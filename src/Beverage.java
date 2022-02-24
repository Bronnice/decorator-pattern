public abstract class Beverage {

    String description;

    Integer milk = 0;
    Integer soy = 0;
    Integer mocha = 0;
    Integer whip = 0;

    Double milkprice = 1.99;
    Double soyprice = 2.99;
    Double mochaprice = 0.99;
    Double whipprice = 0.59;

    Double Price;

    public void setPrice(Double newprice){
        Price = newprice;
    }

    public void setDescription(String newdescription){
        description = newdescription;
    }
    public String getDescription(){
        return description;
    }

    public abstract String cost();

    public void hasMilk(){
        if (milk > 0){
            Price += milkprice * milkcounter;
            description += "+" + milkcounter + " молоко ";
        }
    }
    Integer milkcounter = 0;
    public void setMilk(){
        milk ++;
        milkcounter++;
    }

    Integer soycounter = 0;
    public void hasSoy(){
        if (soy > 0){
            Price += soyprice*soycounter;
            description +="+" + soycounter + " соя ";
        }
    }
    public void setSoy(){
        soy ++;
        soycounter++;
    }

    Integer mochacounter = 0;
    public void hasMocha(){
        if (mocha > 0){
            Price += mochaprice*mochacounter;
            description += "+" + mochacounter + " мокачино ";
        }
    }
    public void setMocha(){
        mocha ++;
        mochacounter++;
    }

    Integer whipcounter = 0;
    public void hasWhip(){
        if(whip > 0){
            Price += whipprice*whipcounter;
            description += "+" + whipcounter + " взбить ";
        }
    }
    public void setWhip(){
        whip ++;
        whipcounter++;
    }
}