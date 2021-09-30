package gof.creational.prototype;

public class Example implements Cloneable {
    private int age;
    public String name;

    Example(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Example{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
