import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int Choice;
        System.out.println("Press 1 to Create Home Components");
        System.out.println("Press 2 to Create Familiy of these objects");
        System.out.println("Press 3 to Build Home");
        System.out.println("Press 5 For Singleton");
        Choice = inp.nextInt();

        switch (Choice) {
            case 1:
                HomeFactory HomeFactory = new HomeFactory();

                Factory window = HomeFactory.getFactory("Windows");
                window.build();
                Factory Door = HomeFactory.getFactory("Door");
                Door.build();
                Factory ventilator = HomeFactory.getFactory("Ventilators");
                ventilator.build();
                Factory sofa = HomeFactory.getFactory("Sofa");
                sofa.build();
                Factory chairs = HomeFactory.getFactory("Chairs");
                chairs.build();
                Factory beds = HomeFactory.getFactory("Beds");
                beds.build();
                break;
            case 2:
                AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
                FamilyFactory shape1 = shapeFactory.getfactory("Window");
                shape1.buildfamily();

                AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
                FamilyFactory shape2 = shapeFactory2.getfactory("Window");
                shape2.buildfamily();

                AbstractFactory shapeFactory3 = FactoryProducer.getFactory(false);
                FamilyFactory shape3 = shapeFactory3.getfactory("Door");
                shape3.buildfamily();

                AbstractFactory shapeFactory4 = FactoryProducer.getFactory(true);
                FamilyFactory shape4 = shapeFactory4.getfactory("Door");
                shape4.buildfamily();


                break;
            case 3:
                MealBuilder mealBuilder = new MealBuilder();

                Meal vegMeal = mealBuilder.prepareVegMeal();
                System.out.println("Home");
                vegMeal.showItems();
                System.out.println("Total Cost: " + vegMeal.getCost());
                break;
            case 4:
                // Prototype
                break;
            case 5:
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
                break;

        }
    }
}
