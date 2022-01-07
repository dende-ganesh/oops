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
class simpleinheritance{
 public static void main(String[] args) {
        dog leo =new dog();
        leo.eat();
        leo.sound();
        
    }
}
