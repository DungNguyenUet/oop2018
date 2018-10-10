package week4.task2;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    Rectangle(){
    } /** phuong thuc khoi tao lay cac gia tri mac dinh
 */
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }/** phuong thuc khoi tao lay width va length theo bien tham chieu, mac dinh color va filled;
    */
    Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        setColor(color);
        setFilled(filled);
    }/** phuong thuc khoi tai lay toan bo gia tri nhap vao
    */
//todo ham getter, setter:
    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }
    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    //todo tinh dien tich hinh chu nhat
    double getArea(){
        return (length*width);
    }
    //todo tinh chu vi hinh chu nhat
    double getPerimeter(){
        return (2*(length+width));
    }
    public String toString(){
        //return "toString cua Rectangle";
        return super.toString(); //todo return gia tri toString lop shape
    }

    public static void main(String[] args) {
        //todo: khoi tao doi tuong
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(3.4,5.6);
        Rectangle R3 = new Rectangle(3.9,6.7,"white",false);
        //todo: test khoi tao
        System.out.println("R1 has width = "+ R1.getWidth()+", lendth = "+R1.getLength()+", color = "+R1.getColor()+", filled= "+R1.isFilled());
        System.out.println("R2 has width = "+ R2.getWidth()+", lendth = "+R2.getLength()+", color = "+R2.getColor()+", filled= "+R2.isFilled());
        System.out.println("R3 has width = "+ R3.getWidth()+", lendth = "+R3.getLength()+", color = "+R3.getColor()+", filled= "+R3.isFilled());
        System.out.println(R1.toString());

        //todo:test getArea, getPerimeter
        System.out.println("R1: Perimeter = "+R1.getPerimeter() +", Area = "+R1.getArea());
        System.out.println("R2: Perimeter = "+R2.getPerimeter() +", Area = "+R2.getArea());
        System.out.println("R3: Perimeter = "+R3.getPerimeter() +", Area = "+R3.getArea());
    }
}
