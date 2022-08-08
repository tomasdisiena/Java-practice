package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.equals("") || name.length() > 40) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

        if (age > 120 || age < 0) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
