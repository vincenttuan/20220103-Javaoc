package com.study.ocp.day16;

public class ATM {
	public static void main(String[] args) {
		Account account = new Account(10000); 
		System.out.printf("帳戶餘額 $%,d\n", account.getBalance());
		System.out.println("提款...");
		Thread t1 = new Thread(new Withdraw(account, 5000), "小明"); // 小明要去提款$5,000
		Thread t2 = new Thread(new Withdraw(account, 4000), "小華"); // 小華要去提款$4,000
		Thread t3 = new Thread(new Withdraw(account, 3000), "小英"); // 小英要去提款$3,000
		// 開始提款作業
		t1.start();
		t2.start();
		t3.start();
		
		StringBuilder s1; // Non-Thread-Safe (單工用, 只用在某一方法中)
		StringBuffer s2;  // Thread-Safe(多執行緒用, 建立物件變數)
	}
}
