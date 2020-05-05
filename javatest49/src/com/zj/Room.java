package com.zj;

import java.util.HashMap;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/3 15:14
 * @version: 1.0
 * @modified By:
 */
public class Room {
    private String description;
    private HashMap<String,Room>exits=new HashMap<>();

    public Room(){}
    public Room(String description){
        this.description=description;
    }
    public void setExit(String direction,Room room){
        exits.put(direction,room);
    }
    @Override
    public String toString(){
        return this.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Room> getExits() {
        return exits;
    }

    public void setExits(HashMap<String, Room> exits) {
        this.exits = exits;
    }
}
