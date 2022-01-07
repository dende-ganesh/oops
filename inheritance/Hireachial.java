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
class lion extends animal{
    void eat(){
        System.out.println("lion eats flesh");
    }
}
class Hireachial{
 public static void main(String[] args) {
        dog leo =new dog();
        leo.eat();
        leo.sound();
        lion l=new lion();
        l.eat();
        l.sound();
    }
}
