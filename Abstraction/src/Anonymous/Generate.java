package Anonymous;
class Generate {
    public void greet() {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Welcome to C-Dac");
            }
        };
        g.sayHello();
    }
}
