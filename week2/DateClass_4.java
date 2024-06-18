public class DateClass_4 {
    private int day, month, year;

    // Accessor and Mutator methods
    // accessor -- read methods
    // mutator -- modify methods

    // CONSTRUCTOR
    // special functions called when an object is created 
    // same name as the class

    public DateClass_4(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;

    }
    // Function overloading - same name, different signatures
    /*
    public DateClass_4(int d, int m) {
        this.day = d;
        this.month = m;
        this.year = 2024;

    }
    */
    public DateClass_4(int d, int m) {
        this(d, m, 2024);
    }
    
    // create a new object from an existing one

    public DateClass_4(DateClass_4 d) {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    } 


    public void setDate(int d, int m, int y) {
        // this.day = d;
        // this.month = m;
        // this.year = y;

        // this is a reference to current object
        // we can ommit this if reference is unambiguous

        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return  month;
    }

    public int getYear() {
        return year;
    }

}

// A class defines a type
// instance variables are private, available through accesor and mutator methods
// use `new` to create an object
// constructor is called implicitly to set up an object
// - multiple constructors --- overloading
// - Reuse --- one constructor can use another
// - Default constructor --- if none is defined
// - Copy constructor --- make copy of an existing object