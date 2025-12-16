class BankAccount {
    // ENCAPSULATION (KAPSÜLLEME):
    // Bakiye (balance) dışarıdan direkt değiştirilemez (private),
    // sadece metodlar aracılığıyla değiştirilebilir.
    private String owner;
    protected double balance; // 'protected' yaptık ki alt sınıf erişebilsin

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Para Yatırma
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " hesabına " + amount + " TL yatırıldı.");
        }
    }

    // Para Çekme
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(owner + " hesabından " + amount + " TL çekildi.");
        } else {
            System.out.println("Yetersiz bakiye veya hatalı tutar!");
        }
    }

    // Bilgi Gösterme
    public void showInfo() {
        System.out.println("Hesap Sahibi: " + owner);
        System.out.println("Güncel Bakiye: " + balance + " TL");
        System.out.println("-------------------------");
    }
}

