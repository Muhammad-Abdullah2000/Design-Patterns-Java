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