package Builder;

public class MealBuilderPattern {
    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();

        Meal vegMeal = mb.prepareVeg();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonvegMeal = mb.prepareNonVeg();
        System.out.println("Non-Veg Meal");
        nonvegMeal.showItems();
        System.out.println("Total cost: " + nonvegMeal.getCost());
    }
}
