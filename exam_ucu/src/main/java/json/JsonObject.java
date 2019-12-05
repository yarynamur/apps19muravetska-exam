package json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsonObject extends Json {
    private Map<String, Json> pairs;

    public JsonObject(JsonPair... jsonPairs) {
        this.pairs = new HashMap<>();
        for (JsonPair pair : jsonPairs) {
            this.pairs.put(pair.key, pair.value);
        }
    }

    @Override
    public String toJson() {
        StringBuilder json = new StringBuilder();
        json.append("{");
        Iterator pairsIt = this.pairs.entrySet().iterator();
        while (pairsIt.hasNext()) {
            Map.Entry pair = (Map.Entry) pairsIt.next();
            json.append("'");
            json.append((String) pair.getKey());
            json.append("': ");
            json.append(((Json) pair.getValue()).toJson());
            if (pairsIt.hasNext()) {
                json.append(", ");
            }
        }
        json.append("}");
        return json.toString();
    }

    public void add(JsonPair jsonPair) {
        this.pairs.put(jsonPair.key, jsonPair.value);
    }

    public Json find(String name) {
        if (pairs.get(name) != null) {
            return pairs.get(name);
        }
        else {
            return null;
        }
    }

    public JsonObject projection(String... names) {
        JsonObject newJsonObject = new JsonObject();
        for (String name : names) {
            Json value = this.find(name);
            if (value != null) {
                newJsonObject.add(new JsonPair(name, value));
            }
        }
        return newJsonObject;
    }
}
