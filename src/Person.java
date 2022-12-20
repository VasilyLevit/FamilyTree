/**
 * Базовый класс для описания сущьности "человек"
 */
public class Person {
    String name;
    String father;
    private String mother;
    int yearBirth;
    int yearDeath;

    /**
     * Сеттер для присвоения знаяения приватному полю mother
     * @param mother
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * Геттер для получения значения приватного поля mother
     * @return
     */
    public String getMother() {
        return mother;
    }

    /**
     * Метод для отработки переопределения метода (полиморфизм)
     * @return возращает переопределённое значение в наследуемых классах
     */
    public String familyTies() {
        return "You";
    }

    /**
     * метод для преобразования формата вывода полей экземпляра для последующей печати из main
     * @return возвращает формат вывода для печати
     */
    public String getInfo() {
        return String.format(familyTies() + ": " + name + " father: " + father);
    }
}
