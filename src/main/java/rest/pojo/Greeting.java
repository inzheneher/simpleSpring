package rest.pojo;

public class Greeting {
    private final long id;
    private final String contetnt;

    public Greeting(long id, String contetnt) {
        this.id = id;
        this.contetnt = contetnt;
    }

    public long getId() {
        return id;
    }

    public String getContetnt() {
        return contetnt;
    }
}
