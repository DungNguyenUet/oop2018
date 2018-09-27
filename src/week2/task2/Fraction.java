package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
     public int tuso;
     public int mauso;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        tuso = numerator;
        mauso = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction psm = new Fraction();
        psm.tuso = tuso*other.mauso + mauso * other.tuso;
        psm.mauso= mauso*other.mauso;
        return psm;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction psm = new Fraction();
        psm.tuso = tuso*other.mauso - mauso * other.tuso;
        psm.mauso= mauso*other.mauso;
        return psm;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction psm = new Fraction();
        psm.tuso = tuso*other.tuso;
        psm.mauso= mauso*other.mauso;
        return psm;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction psm = new Fraction();
        psm.tuso = tuso*other.mauso;
        psm.mauso= mauso*other.tuso;
        return psm;
    }
    public boolean assertEquals(Fraction ps1, Fraction ps2){
        if((ps1.tuso*ps2.mauso) == (ps1.mauso * ps2.mauso)) return true;
        else return false;
    }

//    public static void main(String[] args) {
//        Fraction ps1 =  new Fraction(1,2);
//        Fraction ps2 =  new Fraction(3,4);
//        //ps1.add(ps2);
//        //ps1.subtract(ps2);
//        System.out.println(ps1.tuso +"/" + ps1.mauso+"\n");
//    }
}
