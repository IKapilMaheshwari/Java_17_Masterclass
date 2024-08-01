public class Main {
    public static void main(String[] args) {
        printInformation("Hello world!");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf("r"));
        System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf("l"));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf("l"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf("l",3));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf("l",8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("Values match starting with 'Hello'");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("Values match ending with 'World'");
        }
        if(helloWorld.contains("World")){
            System.out.println("Values match containing 'World'");
        }
        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match containing 'Hello World'");
        }
    }
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length of string: %d\n", length);

        if(string.isEmpty()){
            System.out.println("Empty string");
            return;
        }

        if(string.isBlank()){
            System.out.println("Blank string");
        }

        System.out.printf("First character: %c %n",string.charAt(0));
        System.out.printf("Last character: %c %n",string.charAt(length-1));
    }

}