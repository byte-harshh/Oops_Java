package Annonymous_abstarct;
class Create {
    public void createShape(){
       Shape s = new Shape(){
            public void draw(){
                System.out.println("drawing Circle");
            }
        };
       s.draw();
    }
}
