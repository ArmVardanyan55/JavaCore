package classWork.classWork7.stringExample;

public class StringBuilderExample {

    public static void main(String[] args) {
        String text = "count";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("count: ");
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
    }

}
