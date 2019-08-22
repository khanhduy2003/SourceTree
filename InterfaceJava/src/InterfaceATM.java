import java.util.Scanner;

interface ATM {
	boolean withdraw(int a, double b);

	boolean deposit(int a, double b);

	double queryBalance(int a);

	boolean login(String a, String b);

	boolean logout(String a);

	class ATMimpl implements ATM {
		int idATM, accountid;
		Scanner scanner = new Scanner(System.in);

		public boolean withdraw(int a, double b) {
			System.out.println("Moi Nhap so tien muon rut : ");
			a = scanner.nextInt();
			if (a <= queryBalance(a)) {
				System.out.println("Rut Thanh Cong");
				return true;
			} else {
				System.out.println("So Du khong DU !");
				return false;
			}
		}

		public boolean deposit(int a, double b) {
			System.out.println("Nhap So Tien Muon Gui :");
			a = scanner.nextInt();
			if (a > 0) {
				System.out.println("Gui Thanh Cong , So Du Hien Tai :" + (queryBalance(a) + a));
			} else {
				System.out.println("So Khong Hop le !");
			}
			return true;
		}

		public boolean login(String a, String b) {
			a = scanner.nextLine();
			b = scanner.nextLine();
			System.out.println("Dang Nhap Thanh Cong!");
			return true;
		}

		public boolean logout(String a) {
			a = scanner.nextLine();
			System.out.println("Da Dang Xuat!");
			return true;
		}

		public double queryBalance(int a) {
			int a1 = 1000;
			System.out.println("So Du Hien Tai : " + a1);
			return 0;
		}
		}

}


