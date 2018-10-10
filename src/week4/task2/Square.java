package week4.task2;

public class Square extends Rectangle {
    private double side;
    Square(){
    }
    Square(double side){
        this.side=side;
    }
    Square(double side, String color, boolean filled){
        this.side= side;
        setColor(color);
        setFilled(filled);
    }
    //todo phuong thuc getter, setter:
    double getSide() {
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    void setWidth(double side){
        super.setWidth(side); //todo super.  de goi ham setWidth cua Rectangle(ham cha cua Square)
    }
    void setLength(double side){
        super.setLength(side);//todo super.  de goi ham setLength cua Rectangle
    }
    public String toString(){
        //return "toString cua Square";
        return super.toString();//todo super tra ve toString cua ham cha la Rectangle
    }

    public static void main(String[] args) {
        //todo: khoi tao doi tuong
        Square sq1 = new Square();
        Square sq2 = new Square(3.4);
        Square sq3 = new Square(2.3,"black",false);

        //todo test khoi tao
        System.out.println("sq1 has side = " +sq1.side+", color = "+sq1.getColor()+", filled = "+sq1.isFilled());
        System.out.println("sq2 has side = " +sq2.side+", color = "+sq2.getColor()+", filled = "+sq2.isFilled());
        System.out.println("sq3 has side = " +sq3.side+", color = "+sq3.getColor()+", filled = "+sq3.isFilled());
        System.out.println(sq1.toString());

        //todo test setSide()
        System.out.println("sq1: side = "+sq1.getSide()+", length ="+sq1.getLength()+", width = "+sq1.getWidth());
        sq1.setSide(5.1);
        System.out.println("sq1: side = "+sq1.getSide()+", length ="+sq1.getLength()+", width = "+sq1.getWidth());

        //todo test setWidth and setLength
        sq1.setWidth(sq1.getSide());
        sq1.setLength(sq1.getSide());
        System.out.println("sq1: side = "+sq1.getSide()+", length ="+sq1.getLength()+", width = "+sq1.getWidth());

        //todo tinh Area, perimeter bang phuong thuc ham Rectangle
        System.out.println("sq1: Area = "+sq1.getArea() +", Perimeter = "+sq1.getPerimeter());


    }
}
