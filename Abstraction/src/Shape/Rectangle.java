package Shape;

class Rectangle extends Shape{
    double l;
    double b;
    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    @Override
    double area(){
        System.out.print("area of Rectangle : "+ l*b);
        return 0;
    }
}
