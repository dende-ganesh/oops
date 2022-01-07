public interface car {
    void getCapacity();
    void getFuelType();
    void getCarPrice();
}
class Swift implements car{
    public void getCapacity(){
        System.out.println("Four Seater");
    }
    public void getFuelType(){
        System.out.println("Diesel");
    }
    public void getCarPrice(){
        System.out.println("9Lakhs");

    }
}
class Tesla implements car{
    public void getCapacity(){
        System.out.println("Four Seater");
    }
    public void getFuelType(){
        System.out.println("Electric");
    }
    public void getCarPrice(){
        System.out.println("20Lakhs");

    }
}
class Car {
    public static void main(String ...args){
        Swift s= new Swift();
        System.out.println("Details of Swift car");
        s.getCapacity();
        s.getCarPrice();
        s.getFuelType();
        Tesla t=new Tesla();
        System.out.println("Details of Tesla car");
        t.getCapacity();
        t.getCarPrice();
        t.getFuelType();

    }
}

