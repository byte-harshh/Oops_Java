package ParentChild;

public class Driver {
public static void main(String[] args) {
	Parent p = new Parent();
	p.method();
	Child c = new Child();
	c.method2();
	c.method();
	
   }
}
