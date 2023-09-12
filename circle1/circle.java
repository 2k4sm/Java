package circle1;

public class circle {
    public static void main(String[] args) {
        // Circle circleOne = new Circle(5);
        // Circle circleTwo = new Circle(5);
        // Circle circleThree = new Circle(8);

        // System.out.println("AreaOne: "+circleOne.area());        
        // System.out.println("AreaTwo: "+circleTwo.area());
        // System.out.println("AreaThree: "+circleThree.area());

        // System.out.println("IsEqual(c1,c2): "+circleOne.isEqual(circleTwo));
        // System.out.println("IsEqual(c1,c3): "+circleOne.isEqual(circleThree));

        Rectangle rectOne = new Rectangle(9, 10);
        Rectangle rectTwo = new Rectangle(9, 9);
        Rectangle rectThree = new Rectangle(10, 9);

        System.out.println(rectOne.area());        
        System.out.println(rectTwo.area());
        System.out.println(rectThree.area());
        System.out.println();

        System.out.println(rectOne.perimeter());
        System.out.println(rectTwo.perimeter());
        System.out.println(rectThree.perimeter());
        System.out.println();

        System.out.println(rectOne.isSquare());
        System.out.println(rectTwo.isSquare());
        System.out.println(rectThree.isSquare());
        System.out.println();

        System.out.println(rectOne.IsEqual(rectTwo));
        System.out.println(rectOne.IsEqual(rectThree));




    }
    
}
class Circle{
        int radius;
        //Constructor
        public Circle(int r){
            radius = r;
        }

        double area(){
            return 3.14*this.radius*this.radius;
        }
        double perimeter(){
            return 2*3.14*this.radius;
        }

        boolean isEqual(Circle c2){
            if (this.area() == c2.area() && this.perimeter() == c2.perimeter()){
                return true;
            }
            return false;
        }


}

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return this.length*this.breadth;
    }

    int perimeter(){
        return 2*(this.length+this.breadth);
    }

    boolean isSquare(){
        if(this.length == this.breadth){
            return true;
        }
        return false;
    }

    boolean IsEqual(Rectangle r2){
        if(this.area() == r2.area() && this.perimeter() == r2.perimeter()){
            return true;
        }
        return false;
    }
}
