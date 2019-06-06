package 二十一点;

import java.util.Scanner;

public class Test1 {
	//先发给用户一个数字（数字随机）
	//随机数字只能是1-9的数字
	public static int creatRandom() {
		int a = (int)(Math.random() * 9 + 1);
		System.out.println("你的初始点数为：");
		System.out.println(a);
		return a;
	}
	//进行菜单：1.继续要数字 2.重头再来 3.退出游戏
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的选择：");
		System.out.println("1.继续要数字\n2.重头再来\n3.退出游戏");
		return sc.nextInt();
	}
	//继续要数字
	public static int oneMoreNum(int a) {
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 9 + 1);
		return num + a;
	}
	//如果大于21点，输出“游戏失败”，并输出菜单：1.重头再来，2.退出游戏
	public static int out(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("游戏失败，当前点数为："+ a);
		System.out.println("请输入你的选择：\n1.重头再来\n2.退出游戏");
		return sc.nextInt();
	}
	public static int win(int a) {
		//如果等于21点，输出“恭喜你，完成比赛，当前点数为：21”并输出菜单：1.再来一把2.退出游戏
		Scanner sc = new Scanner(System.in);
		System.out.println("恭喜你，完成比赛，当前点数为：21");
		System.out.println("请输入你的选择：\n1.再来一把\n2.退出游戏");
		return sc.nextInt();
		
	}
	
	public static int goOn(int a) {
		//如果小于21点，则游戏没有结束，则输出当前点数，并重新提示菜单
		//1.继续要数字，2.重头再来，3.退出游戏
		Scanner sc = new Scanner(System.in);
		System.out.println("当前点数为："+ a);
		//printMenu();
		System.out.println("请输入你的选择\n1.继续要数字，\n2.重头再来，\n3.退出游戏");
		return sc.nextInt();
	}
}


