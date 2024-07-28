package School;

class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000; // Assuming total fees for every student is $30,000
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name
                + "\nTotal fees paid so far: $" + feesPaid;
    }
}
