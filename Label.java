package Model;

public class Label {

    Integer id;
    String name;

    public Label(){

    }

    public Label(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id =" + id +
                "| name ='" + name + '\'' +
                '}';
    }
}
