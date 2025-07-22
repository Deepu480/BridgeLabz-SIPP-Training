package week04_day1_PracticesforJavaGenerics;
interface MealPlan {
    String getType();
}
class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getType() {
        return "High-Protein Meal";
    }
}
class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void showMealPlan() {
        System.out.println("Your selected meal plan: " + mealType.getType());
    }
    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        System.out.println("Validating meal plan: " + plan.getType());
        return new Meal<>(plan);
    }
}
class MealPlanTest {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        Meal<VegetarianMeal> vegPlan = Meal.generateMealPlan(veg);
        vegPlan.showMealPlan();

        KetoMeal keto = new KetoMeal();
        Meal<KetoMeal> ketoPlan = Meal.generateMealPlan(keto);
        ketoPlan.showMealPlan();
    }
}
