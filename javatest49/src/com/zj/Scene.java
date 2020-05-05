package com.zj;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/3 14:44
 * @version: 1.0
 * @modified By:
 */
public class Scene {
    private RoomSet roomSet;
    private Room outside,lobby,pub,study,bedroom;
    private Person person;
    //该模块后期改为从数据库读入场景数据
    //1创建Room,并给Room的描述和Room的各个出口
    //2将1创建的Room添加到场景中(即Room集合)
    //3重复1和2
    public void createSceneRoomset(){
        roomSet=new RoomSet();
        outside=new Room("城堡外");
        lobby=new Room("大堂");
        pub=new Room("小酒吧");
        study=new Room("书房");
        bedroom=new Room("卧室");


       outside.setExit("east",lobby);
       outside.setExit("south",study);
       outside.setExit("west",pub);

       lobby.setExit("west",outside);

       study.setExit("north",outside);
       study.setExit("east",bedroom);

       pub.setExit("east",outside);

       bedroom.setExit("west",study);

       roomSet.addRoom(outside);
       roomSet.addRoom(lobby);
       roomSet.addRoom(study);
       roomSet.addRoom(pub);
       roomSet.addRoom(lobby);

        person=new Person("201902157","xiaozhao");
        person.setCurrentRoom(outside);

    }

    public void cruise(Person person,String direction){
        int roomFlag=0;
        for(String exit:person.getCurrentRoom().getExits().keySet()){
            if(exit.equals(direction)){
                roomFlag=1;
                person.setCurrentRoom(person.getCurrentRoom().getExits().get(exit));
                break;
            }
        }
        if(0==roomFlag){
            Ui.printNoRoom();
        }else {
            Ui.displayExits(this);
        }
    }

    public RoomSet getRoomSet() {
        return roomSet;
    }

    public void setRoomSet(RoomSet roomset) {
        this.roomSet = roomset;
    }

    public Room getOutside() {
        return outside;
    }

    public void setOutside(Room outside) {
        this.outside = outside;
    }

    public Room getLobby() {
        return lobby;
    }

    public void setLobby(Room lobby) {
        this.lobby = lobby;
    }

    public Room getPub() {
        return pub;
    }

    public void setPub(Room pub) {
        this.pub = pub;
    }

    public Room getStudy() {
        return study;
    }

    public void setStudy(Room study) {
        this.study = study;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public void setBedroom(Room bedroom) {
        this.bedroom = bedroom;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
