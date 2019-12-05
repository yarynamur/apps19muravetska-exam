package json;

public class JsonBoolean extends Json {
    private final Boolean bool;

    public JsonBoolean(Boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toJson() {
        return bool.toString();
    }
}
