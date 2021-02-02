/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape{
    double side;
    public Square(double side, String name){
        super(name);
        this.side=side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return 4*this.side;
    }

    @Override
    public boolean equals(Object obj){
        if (obj!=null&&obj.getClass() == this.getClass()){
            Square s = (Square) obj;
            return this.name.equals(s.name)&& this.side == s.side;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.name + ":"+this.side;
    }
}