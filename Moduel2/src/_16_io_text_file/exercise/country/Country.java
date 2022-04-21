package _16_io_text_file.exercise.country;

public class Country {
    public   int id = 0;
    public String code, countryName;

    public Country(int id, String code, String countryName) {
        this.code = code;
        this.countryName = countryName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "[id=" + id +
                ", code=" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                ']';
    }
}
