public class Main {
    public static void main(String[] args)
    {
        Male alexisI = new Male("Alexis I","Michael I");
//        alexisI.mother = "Evdoxia"; // доступна при модификаторе доступа поля public
        alexisI.setMother("Evdoxia"); // присвоение через сеттер
        System.out.println(alexisI.getInfo());
        System.out.println("mother: " + alexisI.getMother()); // доступ через геттер

        Female sophia = new Female("Sophia","Alexis I");
        System.out.println(sophia.getInfo());
    }
}