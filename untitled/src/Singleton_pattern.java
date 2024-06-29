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