package Google;

public class Parent {
    //<parentName> <parentBirthday>"
    private String name;
    private String birthday;

    public Parent(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getInfo(){
        return this.name+" "+this.birthday;
    }
}
