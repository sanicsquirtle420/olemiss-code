// 10/09/24 
public class Student {

    private String name;
    private String major;
    private int grade;

    public Student() {
        name = " ";
        major = " ";
        grade = 0;
    }

    public Student(String name, String major, int grade){
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public void setName(String n){
        name = n;
    }

    public void setMajor(String m){
        major = m;
    }

    public void setGrade(int g){
        grade = g;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }
    public int getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%14s, majoring in %s, received a %d", name, major, grade);
    }
}
