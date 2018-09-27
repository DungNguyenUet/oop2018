package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class BacSi{
    public int tuoi;
    public int chieucao;
    void khambenh(){
        System.out.println(" kham benh");
        };
    void chuabenh(){
        {
        System.out.println(" chua benh");
        }
        };
        BacSi(int a){
            chieucao=170;
            tuoi=a;

        }
        BacSi(int a, int b){
            chieucao = a;
            tuoi =b;

        }
        BacSi(){
            chieucao = 165;

        }
}
class GiaoVien{
public int tuoi;
public int chieucao;
    void giangbai(){
        System.out.println("giang bai");
        }
    void chambai(){
        System.out.println("cham bai");

        }
        GiaoVien(int a){
        tuoi=24;

        }
        GiaoVien(int a, int b){
        tuoi=36;

        }
        GiaoVien(){
        tuoi=49;

        }

}
class KiSu{
public int tuoi;
public int chieucao;
    void xaydung(){
        System.out.println("xay dung");
        }
    void vesodo(){
        System.out.println("ve so do");
        }
        KiSu(int a){
        tuoi = 30;

        }
        KiSu(int a, int b){
        tuoi=40;

        }
        KiSu(){
        tuoi=50;

        }

}