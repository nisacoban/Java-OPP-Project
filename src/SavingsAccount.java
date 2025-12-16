// 2. KALITIM (INHERITANCE)
// BankAccount sınıfının tüm özelliklerini alır, üzerine faiz özelliği ekler.
class SavingsAccount extends BankAccount {
    private double interestRate; // Faiz oranı

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner, balance); // Üst sınıfın (BankAccount) kurucusunu çağırır
        this.interestRate = interestRate;
    }

    // Bu sınıfa özel metod: Faiz Ekle
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Faiz eklendi: " + interest + " TL");
    }
}
