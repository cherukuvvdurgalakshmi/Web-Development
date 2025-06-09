class Animall {
    public void sound() {
        System.out.println("Animall makes a sound");
    }
}


class Dog extends Animall{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animall {
    @Override
    public void sound()
 {
        System.out.println("Cat meows");
    }
}


 class Main {
    public static void main(String[] args) {
       
        Animall a1 = new Dog();  
        Animall a2 = new Cat();  

        
        a1.sound();  
        a2.sound();  
    }
}