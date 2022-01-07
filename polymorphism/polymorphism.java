class Bank{
    float roi;
    void getRateOfInterest(){
        System.out.prinln("Rate of Interest"+roi);
    }
    void setRateOfInterest(){ //method overloading
        roi=5;
    }
    void setRateOfInterest(float rate){
        roi=rate;
    }
}
class Sbi extends Bank{
    void getRateOfInterest(){ //method overriding
        System.out.println("Rate of Interest of Sbi bank is "+roi);
    }
}
class polymorphism{
    public static void main(String args[]){
        Sbi s=new Sbi();
        s.setRateOfInterest(7);
        s.getRateOfInterest();
    }
}