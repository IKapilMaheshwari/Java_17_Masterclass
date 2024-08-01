public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "John";
                case 3 -> "Jack";
                case 4 -> "Jane";
                case 5 -> "Michael";
                default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006","Ram","05/11/1985","Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007","Bill","05/11/1985","Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}