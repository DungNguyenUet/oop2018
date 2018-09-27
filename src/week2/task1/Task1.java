package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int temp;
        while(a!=0){
            temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }

//    public static void main(String[] args) {
//        int n=7;
//        System.out.println(fibonacci(3));
//
//    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int[] f = new int[10000];
        f[1]=1; f[2]=1;
        for(int i=3;i<=n;i++)
            f[i]=f[i-1]+f[i-2];
        return f[n];
    }
}
