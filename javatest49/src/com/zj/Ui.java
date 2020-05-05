package com.zj;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/3 15:22
 * @version: 1.0
 * @modified By:
 */
public class Ui {
    public static void printWelcome(Scene scene){
        System.out.println();
        System.out.println("欢迎来到城堡");
        System.out.println("这是一个好玩的游戏");
        System.out.println("如果需要帮助，请输入'help'");

        displayExits(scene);
    }
    //显示当前房间入口所用方向
    public static void displayExits(Scene scene){
        System.out.println("现在你在"+scene.getPerson().getCurrentRoom().toString());
        System.out.println("出口有：");
        for (String key:scene.getPerson().getCurrentRoom().getExits().keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
    }
    public static void printHelp(){
        System.out.println("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\t go east");
    }
    public static void printNoRoom(){
        System.out.println("哪里没有房间");
    }
}
