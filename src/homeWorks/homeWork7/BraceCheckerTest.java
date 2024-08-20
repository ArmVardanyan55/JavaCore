package homeWorks.homeWork7;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "Hel}lo f(rom [Java]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }

}
