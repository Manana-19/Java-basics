class Person {
    
    byte age;
    String name;

    public void Set(String Name, byte Age) {
        age = Age; name = Name;
    }
    
    String info() {
        return "Name =>"+name+"\nAge => "+age;
    };
};


public class Objects {

    Person Some = new Person();

}