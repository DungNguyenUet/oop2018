package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>n) return m; else return n;

    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=array[0];
        for(int i=0;i<array.length;i++)
            if(min>array[i]) min=array[i];
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double result=weight/(height*height);
        if(result<18.5) return "Thieu Can";         //todo <18.5 la thieu can
        else if(result<22.99) return "Binh Thuong"; //todo tu 18.2->22.99 la Binh Thuong
        else if(result<24.99) return "Thua Can";    //todo tu 23->24.99 la Thua Can
        else return "Beo Phi";                      //todo >25 la beo phi
    }
}
