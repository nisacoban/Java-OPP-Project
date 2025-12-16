public class Main {
    public static void main(String[] args) {
        // Normal bir hesap açalım
        System.out.println("--- Normal Hesap ---");
        BankAccount hesaba1 = new BankAccount("Ahmet Yılmaz", 1000);
        hesaba1.deposit(500);
        hesaba1.withdraw(200);
        hesaba1.showInfo();

        // Vadeli (Faizli) hesap açalım
        System.out.println("--- Vadeli Hesap ---");
        SavingsAccount vadeliHesap = new SavingsAccount("Ayşe Demir", 2000, 5); // %5 faiz
        vadeliHesap.addInterest(); // Faizi işlet
        vadeliHesap.withdraw(3000); // Yetersiz bakiye denemesi
        vadeliHesap.showInfo();
    }
}