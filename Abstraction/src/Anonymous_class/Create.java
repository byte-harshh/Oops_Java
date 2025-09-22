package Anonymous_class;

public class Create {
    public void createPrinter(){
        Printer p = new Printer(){
            @Override
            public void printMassage(){
                System.out.println("This is anonymous inner class");
            }
        };
        p.printMassage();
    }
}
