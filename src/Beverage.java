public abstract class Beverage {

    private String description = "";

    Integer milk = 0;
    Integer soy = 0;
    Integer mocha = 0;
    Integer whip = 0;

    Double milkPrice = 1.99;
    Double soyPrice = 2.99;
    Double mochaPrice = 0.99;
    Double whipPrice = 0.59;

    Double Price = 0.0;

    protected void setPrice(Double newPrice){
        Price += newPrice;
    }
    public Double getPrice(){
        return Price;
    }

    protected void setDescription(String newDescription){
        description += newDescription;
    }
    public String getDescription(){
        hasMilk();
        hasMocha();
        hasSoy();
        hasWhip();
        return description + cost();
    }

    public Double cost(){
        setPrice(milkPrice * milk);
        setPrice(soyPrice * soy);
        setPrice(mochaPrice * mocha);
        setPrice(whipPrice * whip);
        return getPrice();
    }

    protected void hasMilk(){
        if (milk ==1){
            setDescription("+ молоко ");
        }
        else if (milk > 1){
            setDescription("+" + milk + " молоко ");
        }
    }
    public void setMilk(){
        milk ++;
    }

    protected void hasSoy(){
        if (soy == 1) {
            setDescription("+ соя ");
        }
        else if (soy > 1){
            setDescription("+" + soy + " соя ");
        }
    }
    public void setSoy(){
        soy ++;
    }

    protected void hasMocha(){
        if (mocha == 1){
            setDescription("+ мокачино ");
        }
        else if (mocha >1){
            setDescription("+" + mocha + " мокачино ");
        }
    }
    public void setMocha(){
        mocha ++;
    }

    protected void hasWhip(){
        if(whip == 1){
            setDescription("+ взбитые сливки ");
        }
        else if(whip > 1){
            setDescription("+" + whip + " взбитые сливки ");
        }
    }
    public void setWhip(){
        whip ++;
    }
}