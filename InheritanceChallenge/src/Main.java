public class Main {
    public static void main(String[] args) {
        Employee Kapil = new Employee("Kapil","12/09/2001","12/09/2024");
        System.out.println(Kapil);
        System.out.println("Age: "+Kapil.getAge());
        System.out.println("Pay: " + Kapil.collectPay());

        SalariedEmployee Disha = new SalariedEmployee("Disha","06/12/2002","12/09/2023",3500000);
        System.out.println(Disha);
        System.out.println("Disha's Paycheck = Rs." + Disha.collectPay());

        Disha.retire();
        System.out.println("Disha's Paycheck = Rs." + Disha.collectPay());

        HourlyEmployee saumya = new HourlyEmployee("Saumya" ,"06/09/2002","12/09/2023",3500);
        System.out.println(saumya);
        System.out.println("Saumya's Paycheck = Rs." + saumya.collectPay());
        System.out.println("Saumya's Holiday Pay = Rs." + saumya.getDoublePay());
    }
}