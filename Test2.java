package 二十一点;

public class Test2 {
	public static void main(String[] args) {
		boolean flag = false;//设置初值
		while (true) {
			int num = Test1.creatRandom();//静态方法直接调用
			int input = Test1.printMenu();//静态方法直接调用
			//输入1时进行如下操作
			if (input == 1) {
				while(true) {
					num = Test1.oneMoreNum(num);//再随机一个数，并和之前的数相加
					if (num < 21) {//如果和小于21
						int choice = Test1.goOn(num);
						if (choice == 1) {//1.继续要数字 2.重头再来 3.退出游戏
							continue;
						} else if (choice == 2) {
							break;
						} else if (choice == 3) {
							flag = true;
							break;
						}
					} else if (num == 21) {//如果和等于21
						int choice = Test1.win(num);//1.再来一把2.退出游戏
						if (choice == 1) {
							break;
						} else {
							flag = true;
							break;
						}
					} else if (num > 21) {//如果和大于21
						int choice = Test1.out(num);//1.重头再来，2.退出游戏
						if (choice == 1) {
							break;
						} else {
							flag = true;
							break;
						}
					}
				}
				//输入2时重头再来
			} else if (input == 2) {
				continue;
				//输入3时退出系统
			} else if (input == 3) {
				System.exit(0);
			} else {
				System.out.println("输入有误");
			} if(flag) {
				break;
			}
		}
	}

}
