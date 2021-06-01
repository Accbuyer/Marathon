package day12.task4;

public class Member {
    private String name;
    private String lastName;


    public Member(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
