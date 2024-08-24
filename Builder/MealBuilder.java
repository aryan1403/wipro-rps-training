package Builder;

public class MealBuilder {
    public Meal prepareVeg() {
        Meal veg = new Meal();
        veg.addItem(new VegBurger());
        veg.addItem(new Coke());

        return veg;
    }

    public Meal prepareNonVeg() {
        Meal nonveg = new Meal();
        nonveg.addItem(new CBurger());
        nonveg.addItem(new Pepsi());

        return nonveg;
    }
}
