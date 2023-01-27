public class Car {
    String name;
    Myself owner; 

    Car(String carName, Myself me){
        this.name = carName;
        this.owner = me;

    }
    void showOwnerName(){
        System.out.println ("The car's brand is " + this.name + " The owner's name is " + owner.name);
    }
}



