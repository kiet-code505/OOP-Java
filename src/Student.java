public class Student {
    private  String studentId;
    private String studentName;
    private  String height;

    public Student(String studentId, String studentName, String height) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.height = height;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
