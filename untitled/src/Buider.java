import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;



interface Item {
    public String name();
    public Packing packing();
    // public float price();
}
interface Packing {
    public String pack();
}
class Wrapper implements Packing {

    @Override
    public String pack() {
        return " ";
    }
}
class Bottle implements Packing {

    @Override
    public String pack() {
        return " ";
    }
}
abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    // @Override
    // // public abstract float price();
}
abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    // @Override
    // public abstract float price();
}
class VegBurger extends Burger {

    // @Override
    // public float price() {
    //    return 25.0f;
    // }

    @Override
    public String name() {
        return "Walls";
    }
}
class ChickenBurger extends Burger {

    // @Override
    // public float price() {
    //    return 50.5f;
    // }

    @Override
    public String name() {
        return "Doors";
    }
}
class Coke extends ColdDrink {

    // @Override
    // public float price() {
    //    return 30.0f;
    // }

    @Override
    public String name() {
        return "Chairs";
    }
}
class Pepsi extends ColdDrink {

    // @Override
    // public float price() {
    //    return 35.0f;
    // }

    @Override
    public String name() {
        return "Ventilators";
    }
}
class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            // cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Home : " + item.name());
            System.out.print(",Walls: " + item.packing().pack());
            // System.out.println(", Price : " + item.price());
        }
    }
}
class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}