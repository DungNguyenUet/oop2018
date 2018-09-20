package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if ((s1.getGroup()).equals(s2.getGroup())) return true;
        else return false; // xóa dòng này sau khi cài đặt
    }
    public static void Sw(Student A, Student B){
        String temp;
        temp = A.getGroup(); A.setGroup(B.getGroup()); B.setGroup(temp);
        temp = A.getId(); A.setId(B.getId()); B.setId(temp);
        temp = A.getName(); A.setName(B.getName()); B.setName(temp);
        temp = A.getEmail(); A.setEmail(B.getEmail()); B.setEmail(temp);
    }


    static void studentsByGroup(Student[] SVarray) {
        // TODO:

        for(int i=0;i<SVarray.length;i++){
            if(i>0 && SVarray[i].getGroup()!=SVarray[i-1].getGroup())
                System.out.println("Danh sach hoc sinh lop "+SVarray[i].getGroup()+" la:");
            SVarray[i].getInfo();

        }
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student S1 = new Student();
        // todo cau 6:
        S1.setName("Nguyen Tien Dung");
        S1.setId("16020908");
        S1.setGroup("K61CB");
        S1.setEmail("16020908@vnu.edu.vn");
        S1.getInfo();


        //todo cau 8:
        Student S2 = new Student();
        Student S3 = new Student("SVname","SVid","SVem");
        Student S4 = new Student(S3);
        Student S5 = new Student(S3);
        S2.getInfo();
        S3.getInfo();
        S4.getInfo();
        S5.setGroup("INT22042");


        //todo test cau 9:
        StudentManagement SM = new StudentManagement();
        if(sameGroup(S3,S4)) System.out.println("S3 va S4 cung hoc lop: "+S3.getGroup()+"\n");
        else System.out.println("S3 va S4 khong hoc cung lop"+"\n");
        if(sameGroup(S5,S3)) System.out.println("S5 va S3 cung hoc lop: "+S1.getGroup()+"\n");
        else System.out.println("S5 va S3 khong hoc cung lop"+"\n");

        //todo cau 10:
        Student[] SVarray = new Student[100];
        String SVgroup = "lop1";
        for(int i=0;i<99;i++)
            SVarray[i].setGroup(SVgroup);

        //todo cau 11:
        SVarray[99] = new Student();
        System.out.println("chuan bi in ra");
        SVarray[99].getInfo();
        System.out.println(" da in ra");
        //todo cau 12
        for(int i=0;i<98;i++)
            for(int j=i+1;j<99;j++){
                if(SVarray[i].getGroup().compareTo(SVarray[j].getGroup())==-1)
                    Sw(SVarray[i],SVarray[j]);
            }
        studentsByGroup(SVarray);




    }
}
