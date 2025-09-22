package Exception;

public class NullPointer {
    public static void main(String[] args) {
        String s = null;
        try{
            String q = s.toUpperCase();
            System.out.println("Length of String : "+q);
        }
        catch(NullPointerException e){
           System.out.println(e);
        }
        finally{
            System.out.println("operation is complete");
        }
    }
}
