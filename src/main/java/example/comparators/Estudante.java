package example.comparators;

public class Estudante implements Comparable<Estudante> {

    private final String name;
    private final Integer age;

    public Estudante(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Estudante obj) {
        return this.getAge() - obj.getAge();
    }
}
