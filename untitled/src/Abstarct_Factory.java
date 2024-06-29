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