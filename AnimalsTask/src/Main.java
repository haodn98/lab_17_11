public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Bird("Hey",2,2.3,"Yellow");
        animals[1] = new Blowfish("Dan",1,2,"red","blue");
        Blowfish bob = new Blowfish("Nik",1,2,"red","blue");
        animals[1].setName("Mike");
        animals[1].eat();
        bob.wop();
        bob.areFish();
        animals[2] = new Dog("Sam",10,5,"black","bulldog");
        animals[3] = new Mammal("brown");
        if(animals[2] instanceof Dog){
            ((Dog)animals[2]).myBread();
        }
        if(animals[3] instanceof Mammal){
            ((Mammal)animals[3]).areMammal();
        }
        System.out.println(animals[3].toString());
        System.out.println(animals[2].toString());
        System.out.println(animals[1].toString());
    }
}
