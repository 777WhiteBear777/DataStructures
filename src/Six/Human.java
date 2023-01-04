package Six;

public class Human implements Comparable<Human> {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Human(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Human{" +
                " id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                " }";
    }

    @Override
    public int compareTo(Human human) {
        if (id > human.getId()) {
            return 1;
        }
        if (id < human.getId()) {
            return -1;
        }
        return 0;
    }
}
