package ��ʮһ��;

public class Test2 {
	public static void main(String[] args) {
		boolean flag = false;//���ó�ֵ
		while (true) {
			int num = Test1.creatRandom();//��̬����ֱ�ӵ���
			int input = Test1.printMenu();//��̬����ֱ�ӵ���
			//����1ʱ�������²���
			if (input == 1) {
				while(true) {
					num = Test1.oneMoreNum(num);//�����һ����������֮ǰ�������
					if (num < 21) {//�����С��21
						int choice = Test1.goOn(num);
						if (choice == 1) {//1.����Ҫ���� 2.��ͷ���� 3.�˳���Ϸ
							continue;
						} else if (choice == 2) {
							break;
						} else if (choice == 3) {
							flag = true;
							break;
						}
					} else if (num == 21) {//����͵���21
						int choice = Test1.win(num);//1.����һ��2.�˳���Ϸ
						if (choice == 1) {
							break;
						} else {
							flag = true;
							break;
						}
					} else if (num > 21) {//����ʹ���21
						int choice = Test1.out(num);//1.��ͷ������2.�˳���Ϸ
						if (choice == 1) {
							break;
						} else {
							flag = true;
							break;
						}
					}
				}
				//����2ʱ��ͷ����
			} else if (input == 2) {
				continue;
				//����3ʱ�˳�ϵͳ
			} else if (input == 3) {
				System.exit(0);
			} else {
				System.out.println("��������");
			} if(flag) {
				break;
			}
		}
	}

}
