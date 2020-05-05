package com.zj;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //创建场景
        Scene scene1=new Scene();
        scene1.createSceneRoomset();
        Ui.printWelcome(scene1);
        Scanner in=new Scanner(System.in);
        while (true){
            String command=in.nextLine();
            String[] words=command.split(" ");
            if(words[0].equals("help")){
                Ui.printHelp();
            }else if(words[0].equals("go")){
                scene1.cruise(scene1.getPerson(),words[1]);
            }else if(words[0].equals("bye")){
                System.out.println("感谢你的光临");
                break;
            }
        }
    }
}
