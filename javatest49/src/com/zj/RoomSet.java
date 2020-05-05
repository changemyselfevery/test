package com.zj;

import java.util.ArrayList;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/3 15:19
 * @version: 1.0
 * @modified By:
 */
public class RoomSet {
    ArrayList<Room> sceneRoomSet=new ArrayList<>();
    public RoomSet(){

    }
    public void addRoom(Room newRoom){
        sceneRoomSet.add(newRoom);
    }

    public ArrayList<Room> getSceneRoomSet() {
        return sceneRoomSet;
    }

    public void setSceneRoomSet(ArrayList<Room> sceneRoomSet) {
        this.sceneRoomSet = sceneRoomSet;
    }
}
