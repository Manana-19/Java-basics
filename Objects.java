class Person {
    
    byte age;
    String name;

    Person(String n, byte a) {
        name=n;
        age=a;
    }

    byte Set(String Name, byte Age) {
        age = Age; 
        name = Name;
        return 0;
    }
    
    String info() {
        return "Name => "+name+"\nAge => "+age;
    };
};


public class Objects {

    public static void main(String[] Args) {

        // Creating the list of objects

        Person[] obj = new Person[3];

        // Creating for loop
        for (byte i = 0; i < 3; i++) {
            
            // Initializing the object 
            obj[i] = new Person("Something", (byte) (i+12));

            // Creating the reference
            Person Something =  obj[i];

            System.out.println(Something.info());
            
        }

    }

};