public abstract class Beverage {
    private String description;
    private Double milk;
    private Double soy;
    private Double mocha;
    private Double whip;
    private Double price;

    public Double Price(Double item){ return price+item; }

    public String getDescription() { return description; }

    public String setMilk() { return description += " + молоко " + Price(milk); }
    public abstract Double cost();

    public String setSoy(){ return description += " + соя " + Price(soy); }

    public String setMocha(){ return description += " + мокко " + Price(mocha); }

    public String setWhip(){ return description += " + взбитые сливки " + Price(whip); }
}
