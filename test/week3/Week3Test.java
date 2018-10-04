package week3;

//import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Assert;
import org.junit.Test;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    private int a0=0,a1=1,a2=2,a3=3,a4=4,a5=5,a6=6,a7=7,a8=8,a9=9;
    @Test
    public void maxTest(){
        Assert.assertEquals(1,Week3.max(a0,a1));
        Assert.assertEquals(9,Week3.max(a6,a9));
        Assert.assertEquals(6,Week3.max(a3,a6));
        Assert.assertEquals(2,Week3.max(a0,a2));
        Assert.assertEquals(7,Week3.max(a5,a7));
    }



    // TODO: Viết 5 testcase cho phương thức minOfArray()
    private int[] b0 = {1,2,3,4,5};
    private int[] b1 = {2,4,6,88,12,16};
    private int[] b2 = {2,3,4};
    private int[] b3 = {1,11,1211,1212,222};
    private int[] b4 = {12,13,14,15,16};

    @Test
    public void minOfArrayTest(){
        Assert.assertEquals(1,Week3.minOfArray(b0));
        Assert.assertEquals(2,Week3.minOfArray(b1));
        Assert.assertEquals(2,Week3.minOfArray(b2));
        Assert.assertEquals(1,Week3.minOfArray(b3));
        Assert.assertEquals(12,Week3.minOfArray(b4));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    private double w1=75.5, w2= 70, w3= 71, w4=45, w5=60;
    private double h1=1.62, h2=1.85, h3=1.7, h4= 1.5, h5=1.66;

    @Test
    public void calculateBMITest(){
        Assert.assertEquals("Beo Phi", Week3.calculateBMI(w1,h1));
        Assert.assertEquals("Binh Thuong", Week3.calculateBMI(w2,h2));
        Assert.assertEquals("Thua Can", Week3.calculateBMI(w3,h3));
        Assert.assertEquals("Binh Thuong", Week3.calculateBMI(w4,h4));
        Assert.assertEquals("Binh Thuong", Week3.calculateBMI(w5,h5));
    }
}
