package com.Company;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;


interface Factory {
    void build();
 }
  class Windows implements Factory {
 
    @Override
    public void build() {
       System.out.println("Windows are Created");
    }
 }
  class Doors implements Factory {
 
    @Override
    public void build() {
       System.out.println("Doors are Created");
    }
 }
  class Ventilators implements Factory {
 
    @Override
    public void build() {
       System.out.println("Ventilators are Created");
    }
 }
 class Sofa implements Factory {
 
    @Override
    public void build() {
       System.out.println("Sofa is Created");
    }
 }
 class Chairs implements Factory {
 
    @Override
    public void build() {
       System.out.println("Chairs are Created");
    }
 }
 class Beds implements Factory {
 
    @Override
    public void build() {
       System.out.println("Beds are Created");
    }
 }
  class HomeFactory {
     
    
    public Factory getFactory(String FactoryType){
       if(FactoryType == null){
          return null;
       }		
       if(FactoryType.equalsIgnoreCase("Ventilators")){
          return new Ventilators();
          
       } else if(FactoryType.equalsIgnoreCase("Windows")){
          return new Windows();
          
       } else if(FactoryType.equalsIgnoreCase("Door")){
          return new Doors();
       } else if(FactoryType.equalsIgnoreCase("Sofa")){
          return new Sofa();
       } else if(FactoryType.equalsIgnoreCase("Chairs")){
          return new Chairs();
       } else if(FactoryType.equalsIgnoreCase("Beds")){
          return new Beds();
       }
       
       return null;
    }
 }

 interface FamilyFactory {
    void buildfamily();
 }
  class Window implements FamilyFactory {
    @Override
    public void buildfamily() {
       System.out.println("Square Windows Family Created");
       System.out.println("Family of Beds Created");
    }
 }
  class RoundedWindow implements FamilyFactory {
    @Override
    public void buildfamily() {
       System.out.println("Rounded Windows are created");
       System.out.println("Family of Chairs created");
    }
 }
 class Door implements FamilyFactory {
   @Override
   public void buildfamily() {
      System.out.println("Square Door Family Created");
      System.out.println("Family of Sofa are Created");
   }
}
   class RoundedDoor implements FamilyFactory {
      @Override
      public void buildfamily() {
         System.out.println("RoundedSquare Door Family Created");
         System.out.println("Family of Ventilators Created");
      }
}

 


  abstract class AbstractFactory {
    abstract FamilyFactory getfactory(String shapeType) ;
 }
  class SquareFactory extends AbstractFactory {
    @Override
    public FamilyFactory getfactory(String shapeType){    
       if(shapeType.equalsIgnoreCase("Window")){
          return new Window();         
       }else if(shapeType.equalsIgnoreCase("Door")){
           return new Door();
       }	 
       return null;
    }
 }
  class RoundedSquareFactory extends AbstractFactory {
    @Override
    public FamilyFactory getfactory(String shapeType){    
       if(shapeType.equalsIgnoreCase("Window")){
          return new RoundedWindow();         
       }else if(shapeType.equalsIgnoreCase("Door")){
          return new RoundedDoor();
       }	 
       return null;
    }
 }

  class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){   
       if(rounded){
          return new RoundedSquareFactory();         
       }else{
          return new SquareFactory();
       }
    }
   }


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


 class SingleObject {

   
   private static SingleObject instance = new SingleObject();

 
   private SingleObject(){}

  
    static SingleObject getInstance(){
      return instance;
   }

 void showMessage(){
      System.out.println("2 Windows are Created");
      System.out.println("3 Doors are Created");
      System.out.println("Ventilators are Provided");
      System.out.println("2 Chairs are also provided");
      System.out.println("Beds are also provided");
   }
}