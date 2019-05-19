package edu.skku.map.skku_findlost;

import java.util.HashMap;
import java.util.Map;

public class MemoItem {
    String title;
    String owner;
    String content;

    public MemoItem () { }

    public MemoItem(String title, String owner, String content) {
        this.title = title;
        this.owner = owner;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getOwner() {
        return owner;
    }

    public String getContent() {
        return content;
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("content", content);
        result.put("owner", owner);
        result.put("title", title);
        return result;
    }
}
