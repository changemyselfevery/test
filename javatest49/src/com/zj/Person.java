package com.zj;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/3 15:12
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private String id;
    private String name;
    private Room currentRoom;
    public Person(String id,String name){
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
