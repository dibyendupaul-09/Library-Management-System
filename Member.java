public class Member {
    private static int idCounter = 1;
    private int id;
    private String name;

    public Member(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member ID: " + id + ", Name: " + name;
    }
}
