package json;

public class JsonString extends Json {
    private final String string;

    public JsonString(String string) {
        this.string = string;
    }

    @Override
    public String toJson() {
        return "'" + string + "'";
    }
}
