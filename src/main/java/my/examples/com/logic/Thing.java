package my.examples.com.logic;

public class Thing {
    private String name;
    private String size;
    private String value;

    public Thing(String name, String size, String value) {
        this.name = name;
        this.size = size;
        this.value = value;
    }

    public Thing() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}



