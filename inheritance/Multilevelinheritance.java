class animal{
    void sound(){
        System.out.println("Making Sound");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("Dog eats");
    }
}
class shiba extends dog{
    void bark(){
        System.out.println("Shiba does not bark");
    }
}
class Multilevelinheritance{
 public static void main(String[] args) {
        shiba leo =new shiba();
        leo.eat();
        leo.sound();
        leo.bark();
        
    }
}
