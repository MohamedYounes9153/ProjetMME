package fr.tripleme.game.parsing;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

public class Parser implements Parsable {
    protected Json json;
    protected JsonValue jsonValue;
    protected String path;
    protected FileHandle file;

    /**
     * @param path Path of the json to parse.
     */
    public Parser(String path) {
        this.path = path;
        this.json = new Json();
        this.file = Gdx.files.internal(this.path);
    }

    /**
     *
     */
    public void parse() {
        this.jsonValue = new JsonReader().parse(this.file);
        if (this.jsonValue == null) {
            throw new RuntimeException("Parsing failed");
        }
    }

    /**
     *
     * @param path File path to parse.
     */
    @Override
    public void parse(String path) {

    }
}
