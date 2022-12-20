public class Male extends Person {
    public Male(String name, String father) {
        this.name = name;
        this.father = father;
    }
    @Override
    public String familyTies() {
        return "He";
    }
}
