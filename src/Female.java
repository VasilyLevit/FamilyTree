public class Female extends Person {
    public Female(String name, String father) {
        this.name = name;
        this.father = father;
    }
    @Override
    public String familyTies() {
        return "She";
    }
}
