public class Person {

    // Private variable
    // Private variables are only accessible within the class where they are
    // declared. They are not accessible outside of this class.
    private String name;
    private int ccnumber;

    // get() method
    public String getName() {

        return this.name;
    }

    // set() method
    public void setName(String newName) {

        this.name = newName;
    }

    // set() method
    public void setCCnumber(int cardnumber) {

        this.ccnumber = cardnumber;
    }

       // get() method
       public int getCCnumber() {

        return this.ccnumber;
    }    
}
