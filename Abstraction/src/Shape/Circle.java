package Shape;

class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    double area(){
        System.out.print("area of Circle : "+3.14*r*r);
        return 0;
   }
}
