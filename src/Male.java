/**
 * Класс мужчин - наследник класса "Person"
 */
public class Male extends Person {
    public Male(String name, String father) {
        this.name = name;
        this.father = father;
    }

    /**
     * Переопределение метода базового класса для вывода гендерного признака
     * Базовое поведение выводит You
     * @return
     */
    @Override
    public String familyTies() {
        return "He";
    }
}
