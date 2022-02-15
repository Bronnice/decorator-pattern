public abstract class Beverage {

    String description;

    Boolean milk = Boolean.FALSE;
    Boolean soy = Boolean.FALSE;
    Boolean mocha = Boolean.FALSE;
    Boolean whip = Boolean.FALSE;

    Double milkprice = 1.99;
    Double soyprice = 2.99;
    Double mochaprice = 0.99;
    Double whipprice = 0.59;

    Double Price;

    public abstract Double cost();

    public void hasMilk(){
        if (milk == Boolean.TRUE){
            Price += milkprice;
        }
    }
    public void setMilk(){
        milk = Boolean.TRUE;
    }

    public void hasSoy(){
        if (soy == Boolean.TRUE){
            Price += soyprice;
        }
    }
    public void setSoy(){
        soy = Boolean.TRUE;
    }

    public void hasMocha(){
        if (mocha == Boolean.TRUE){
            Price += mochaprice;
        }
    }
    public void setMocha(){
        mocha = Boolean.TRUE;
    }

    public void hasWhip(){
        if(whip == Boolean.TRUE){
            Price += whipprice;
        }
    }
    public void setWhip(){
        whip = Boolean.TRUE;
    }
}