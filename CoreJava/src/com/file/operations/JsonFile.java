package com.file.operations;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonFile {
    public static void main(String[] args) {
        // Creating a JSON object
        JsonObject jsonObject = Json.createObjectBuilder()
            .add("name", "John Doe")
            .add("age", 30)
            .add("city", "New York")
            .build();

        // Writing JSON to a string
        StringWriter stringWriter = new StringWriter();
        try (JsonWriter jsonWriter = Json.createWriter(stringWriter)) {
            jsonWriter.writeObject(jsonObject);
        }

        String jsonString = stringWriter.toString();
        System.out.println("JSON String: " + jsonString);

        // Reading JSON from a string
        try (JsonReader jsonReader = Json.createReader(new StringReader(jsonString))) {
            JsonObject readObject = jsonReader.readObject();
            System.out.println("Read JSON object: " + readObject);
        }
    }
}
