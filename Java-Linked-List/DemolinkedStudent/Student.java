package DemolinkedStudent;

public class Student {
    private int StudentId;
    private String StudentName;
    private int StudentAge;

    public Student(int StudentId, String StudentName, int StudentAge) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
    }

    public int getStudentId(){
        return StudentId;
    }


    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }



    public void printInfo(){
        System.out.println(" ID: " + this.StudentId);
        System.out.println(" Name: " + this.StudentName);
        System.out.println(" Age: " + this.StudentAge + "\n");
    }
}
