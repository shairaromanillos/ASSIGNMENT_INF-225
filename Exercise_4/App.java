public class App {
    public static void main(String[] args) throws Exception {
        Person friend = new Person("Kenji", 19);
        Myself me = new Myself ("Shaira", 19);

        //Aggregation
        me.addFriend(friend);

        //Composition
        Pet puppy = new Pet("Kacey", friend);
        puppy.showOwnerName();

        Car Car = new Car("Porsche 550 Spyder", me);
        Car.showOwnerName();
    }
}
