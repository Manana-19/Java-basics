public class gc {
    
    public static void main(String[] Args) {
        
        gc ok = new gc();
        ok = null;

        System.gc();
    
        gc something = new gc();
        something = null;

        System.gc();
    }

    
    protected void finalize() {
        System.out.println("Trash");
    }
}
