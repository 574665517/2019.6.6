package ��ʮһ��;

import java.util.Scanner;

public class Test1 {
	//�ȷ����û�һ�����֣����������
	//�������ֻ����1-9������
	public static int creatRandom() {
		int a = (int)(Math.random() * 9 + 1);
		System.out.println("��ĳ�ʼ����Ϊ��");
		System.out.println(a);
		return a;
	}
	//���в˵���1.����Ҫ���� 2.��ͷ���� 3.�˳���Ϸ
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ѡ��");
		System.out.println("1.����Ҫ����\n2.��ͷ����\n3.�˳���Ϸ");
		return sc.nextInt();
	}
	//����Ҫ����
	public static int oneMoreNum(int a) {
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() * 9 + 1);
		return num + a;
	}
	//�������21�㣬�������Ϸʧ�ܡ���������˵���1.��ͷ������2.�˳���Ϸ
	public static int out(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ϸʧ�ܣ���ǰ����Ϊ��"+ a);
		System.out.println("���������ѡ��\n1.��ͷ����\n2.�˳���Ϸ");
		return sc.nextInt();
	}
	public static int win(int a) {
		//�������21�㣬�������ϲ�㣬��ɱ�������ǰ����Ϊ��21��������˵���1.����һ��2.�˳���Ϸ
		Scanner sc = new Scanner(System.in);
		System.out.println("��ϲ�㣬��ɱ�������ǰ����Ϊ��21");
		System.out.println("���������ѡ��\n1.����һ��\n2.�˳���Ϸ");
		return sc.nextInt();
		
	}
	
	public static int goOn(int a) {
		//���С��21�㣬����Ϸû�н������������ǰ��������������ʾ�˵�
		//1.����Ҫ���֣�2.��ͷ������3.�˳���Ϸ
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ����Ϊ��"+ a);
		//printMenu();
		System.out.println("���������ѡ��\n1.����Ҫ���֣�\n2.��ͷ������\n3.�˳���Ϸ");
		return sc.nextInt();
	}
}


