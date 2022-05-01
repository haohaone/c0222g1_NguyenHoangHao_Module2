package test_codegym.model;

public class Subject {
    private String id, name, version, difficultLevel;
    private int time;

    public Subject(String id, String name, String version, String difficultLevel, int time) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.difficultLevel = difficultLevel;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(String difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", difficultLevel='" + difficultLevel + '\'' +
                ", time=" + time +
                ']';
    }

    public String getLine(){
        return id + "," + name + "," + version + "," + difficultLevel + "," + time;
    }
}
