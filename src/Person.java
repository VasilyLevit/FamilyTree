public class Person {
    String name;
    String father;
    private String mother;
    int yearBirth;
    int yearDeath;

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMother() {
        return mother;
    }

    public String familyTies() {
        return "You";
    }

    public String getInfo() {
        return String.format(familyTies() + ": " + name + " father: " + father);
    }
}
