public class Main {
    public static void main(String[] args)
    {
        Person alexisI = new Male("Alexis I","Michael I");
        alexisI.setMother("Evdoxia"); // присвоение через сеттер
        System.out.println(alexisI.getInfo()); // вывод на печать данных экземпляра
        System.out.println("mother: " + alexisI.getMother()); // доступ через геттер

        Female sophia = new Female("Sophia","Alexis I");
        System.out.println(sophia);
    }
}