package test_cinema.model;

public class Interest {
    private String id, date, nameFilm;
    private int amount;

    public Interest(String id, String date, String nameFilm, int amount) {
        this.id = id;
        this.date = date;
        this.nameFilm = nameFilm;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", nameFilm='" + nameFilm + '\'' +
                ", amount=" + amount +
                ']';
    }

    public String getLine(){
        return id + "," + date + "," + nameFilm + "," + amount;
    }
}
