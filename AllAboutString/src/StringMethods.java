public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "12/09/2001";
        int startingIndex = birthDate.indexOf("2001");
        System.out.println("starting index: " + startingIndex);
        System.out.println("birth year: " + birthDate.substring(startingIndex));

        System.out.println("Month: " + birthDate.substring(3, 5));

        String newDate = String.join("/","25","11","1982");
        System.out.println("New date: " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("New date: " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("New date: " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982"); //Method Chaining
        System.out.println("New date: " + newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replace("/","---"));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
