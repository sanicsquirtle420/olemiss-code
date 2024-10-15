public class PolicyOwner {
    private String name, address, city, state;

    public PolicyOwner() {
        name = "";
        address = "";
        city = "";
        state = "";
    }

    public PolicyOwner(String n, String a, String c, String s) {
        name = n;
        address = a;
        city = c;
        state = s;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setCity(String c) {
        city = c;
    }

    public void setState(String s) {
        state = s;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address ;
    }

    public String getCity() {
        return city ;
    }

    public String getState() {
        return state ;
    }

    public String toString() {
        return String.format("Name: %s\nAddress: %s\nCity / State: %s, %s" , name , address , city , state) ;
    }
}
