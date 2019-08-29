package com.vn;

import java.util.ArrayList;
import java.util.Scanner;

public class CanBoManager {
	public static ArrayList<CanBo> list = new ArrayList<CanBo>();
	private Scanner in;

	public void menu() {
		System.out.println("1:Input Can Bo ");
		System.out.println("2: Print List ");
		System.out.println("3: Searching for employee");
		System.out.println("4: Exit");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println("Nhap lua chon");
		do {
			switch (input) {
			case 1:
				inputList();
				break;
			case 2:
				printList();
				break;
			case 3:
				Searching();
				break;
			case 4:
				break;

			}
		} while (input != 4);
	}

	public void inputList() {
		System.out.println("Moi Chon Loai Can Bo Muon Nhap : Cong Nhan , Ki Su , Nhan Vien");
		in = new Scanner(System.in);
		String type;
		do {
			type = in.nextLine();
			int soluong;
			if (type == "Cong Nhan") {
				System.out.println("Hay nhap so luong Cong Nhan ma ban muon");
				soluong = in.nextInt();
				CanBo Worker;
				for (int i = 0; i < soluong; i++) {
					System.out.println("Cong nhan :" + i);
					System.out.println("Nhap ten");
					String name = in.nextLine();
					System.out.println("Nhap tuoi");
					int age = in.nextInt();
					System.out.println("Hay nhap gioi tinh");
					String gender = in.nextLine();
					System.out.println("Hay nhap dia chi");
					String address = in.nextLine();
					System.out.println("Hay nhap bac");
					String level = in.nextLine();
					Worker = new Worker(name, age, gender, address, level);
					list.add(Worker);
				}
			} else if (type == "Nhan Vien") {
				System.out.println("Hay nhap so luong Nhan Vien ma ban muon");
				soluong = in.nextInt();
				CanBo Employee;
				for (int i = 0; i < soluong; i++) {
					System.out.println("Nhap ten cua Nhan vien ");
					String name = in.nextLine();
					System.out.println("Nhap tuoi cua nhan vien");
					int age = in.nextInt();
					System.out.println("Nhap gioi tinh");
					String gender = in.nextLine();
					System.out.println("Nhap dia chi cua nhan vien");
					String address = in.nextLine();
					System.out.println("nhap Cong viec quan ly cua nhan vien");
					String job = in.nextLine();
					Employee = new Employee(name, age, gender, address, job);
					list.add(Employee);
				}
			} else if (type == "Ky Su") {
				System.out.println("Hay nhap so luong Ky Su ma ban muon");
				soluong = in.nextInt();
				CanBo Engineer;
				for (int i = 0; i < soluong; i++) {
					System.out.println("Cong nhan :" + i);
					System.out.println("Nhap ten");
					String name = in.nextLine();
					System.out.println("Nhap tuoi");
					int age = in.nextInt();
					System.out.println("Hay nhap gioi tinh");
					String gender = in.nextLine();
					System.out.println("Hay nhap dia chi");
					String address = in.nextLine();
					System.out.println("Hay nhap bac");
					String branch = in.nextLine();
					Engineer = new Engineer(name, age, gender, address, branch);
					list.add(Engineer);
				}
			} else {
				System.out.println("Error , Moi nhap lai ");
			}
		} while (type != "Cong Nhan" || type == "Nhan Vien" || type == "Ky Su");
	}

	public void printList()

	{
		if (list.size() != 0) {
			for (CanBo ds : list) {
				System.out.println("Ten " + CanBo.name + " tuoi " + CanBo.birthday + " gioi tinh " + CanBo.gender
						+ " dia chi " + CanBo.address);
			}
		} else {
			System.out.println("Ban chua tao Nhan vien nao !");
		}
	}

	public void Searching() {
		Scanner in = new Scanner(System.in);
		if (list.size() == 0) {
			System.out.println("Ban chua tao nhan vien nao !");
		} else {
			String inputName = in.nextLine();
			int i = 0;
			for (CanBo checkName : list) {
				if (inputName == checkName.name) {
					System.out.println("Ten " + checkName.name + " tuoi " + checkName.birthday + " gioi tinh "
							+ checkName.gender + " dia chi " + checkName.address);
				} else {
					System.out.println("Nhan vien do khong ton tai !");
				}
				i++;
			}
		}
	}
}
