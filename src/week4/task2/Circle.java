package week4.task2;

public class Circle extends Shape {
    final double PI = 3.14;//todo: nen de PI la final vi gia tri PI luon khong doi = 3,14
    private double radius=1.0;
    Circle(){
    }/** phuong thuc Circle() khong co bien tham chieu thi se mac dinh lay radius = 1.0,
     color = red, va filled = true cua lop shape
    */


    Circle(double radius){
        this.radius = radius;
    }/** phuong thuc nay lay radius la bien tham chieu, mac dinh color = red va filled = true cua shape
 */

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }/** phuong thuc nay lay toan bo thong tin tu tham chieu
 */
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getArea(){
        return (PI*radius*radius); // todo tinh dien tich hinh tron
    }
    double getPerimeter(){
        return (PI*2*radius); // todo tinh chu vi hinh tron
    }
    public String toString(){
        return "toString cua lop Circle";
    }//todo phuong thuc toString cua lop circle

    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(23);
        Circle C3 = new Circle(12,"pink",false);
        System.out.println("C1 co ban kinh = " +C1.getRadius()+" ; co mau sac la: "+C1.getColor()+" ; co filled = "+C1.isFilled() );
        System.out.println("C2 co ban kinh = " +C2.getRadius()+" ; co mau sac la: "+C2.getColor()+" ; co filled = "+C2.isFilled() );
        System.out.println("C3 co ban kinh = " +C3.getRadius()+" ; co mau sac la: "+C3.getColor()+" ; co filled = "+C3.isFilled() );
        System.out.println(C1.toString());
        System.out.println("C1 co chu vi = "+C1.getPerimeter() +" va dien tich = "+C1.getArea());
        System.out.println("C2 co chu vi = "+C2.getPerimeter() +" va dien tich = "+C2.getArea());
        System.out.println("C3 co chu vi = "+C3.getPerimeter() +" va dien tich = "+C3.getArea());

    }


}
