package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }

    public String getId() {
        return id;
    }

    public void setId(String x) {
        id = x;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String x) {
        group = x;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String x) {
        email = x;
    }
    //cau 7a
    Student() {
        // TODO:
        name = "Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     *
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name =n;
        id=sid;
        email=em;
        group="INT22041";
    }

    /**
     * Constructor 3
     *
     * @param s
     */
    Student(Student s) {
        // TODO:
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    void getInfo() {
        // TODO:
        System.out.println("Thong tin sinh vien: "+"\n"+
                           "Ten Sinh Vien: "+name+"\n"
                            +"MSSV: "+id+"\n"
                            +"Group: "+group+"\n"
                            +"Email: "+email+"\n");
    }
}
