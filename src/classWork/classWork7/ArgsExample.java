package classWork.classWork7;

public class ArgsExample {

    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }

        String calculatorType = "Standard";
        if (args.length > 0) {
            calculatorType = args[0];
        }
        System.out.println(calculatorType);
    }

}
