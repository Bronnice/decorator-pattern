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


    public String getDescription(){
        return
        description +
        hasMilk() +
        hasMocha() +
        hasSoy() +
        hasWhip() +
        this.cost();
    }

    public Double cost(){
        return
        milkPrice * milk +
        soyPrice * soy +
        mochaPrice * mocha +
        whipPrice * whip;
    }

    private String hasMilk(){
        if(milk > 0) {
            return "+" + milk + " молоко ";
        }
        return "";
    }
    public void setMilk(){
        milk ++;
    }

    private String hasSoy(){
        if (soy > 0){
            return "+" + soy + " соя ";
        }
        return "";
    }
    public void setSoy(){
        soy ++;
    }

    private String hasMocha(){
        if(mocha > 0) {
            return "+" + mocha + " мокачино ";
        }
        return "";
    }
    public void setMocha(){
        mocha ++;
    }

    private String hasWhip(){
        if (whip > 0) {
            return "+" + whip + " взбитые сливки ";
        }
        return "";
    }
    public void setWhip(){
        whip ++;
    }
}