public class Member {
    private String name;
    private int age;

    public Member(){
        name = "";
        age = 0;
    }

    public Member(String n , int a) {
        name = n ;
        age = a ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%s , %d" , name , age) ;
    }
}
