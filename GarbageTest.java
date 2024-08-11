class GarbageTest {
    GarbageTest() {
            System.out.println("Object created: " + this);
        }
    
        // Override finalize method to observe when the object is garbage collected
        @Override
        protected void finalize(){
            System.out.println("Garbage collected: " + this);
            //super.finalize(); // Call the superclass's finalize method
        }
    
        public static void main(String[] args) {
            // Creating objects
            GarbageTest obj1 = new GarbageTest();
            GarbageTest obj2 = new GarbageTest();
            GarbageTest obj3 = new GarbageTest();
    
            // Nullifying the references
            obj1 = null;
            obj2 = null;
    
            // Requesting JVM to run Garbage Collector
            System.gc();
    
    
            // Nullifying the last reference
            obj3 = null;
    
            System.gc();
    
    
            System.out.println("End of main method.");
        }
    }