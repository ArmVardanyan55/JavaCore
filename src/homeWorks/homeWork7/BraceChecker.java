package homeWorks.homeWork7;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check(){
        Stack stack = new Stack();
        boolean b = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        b = false;
                        System.out.println("Error closed " + c + " but not opened at " + i);
                    } else if (pop != '(') {
                        b = false;
                        System.out.println("Error closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        b = false;
                        System.out.println("Error closed " + c + " but not opened at " + i);
                    } else if (pop != '{') {
                        b = false;
                        System.out.println("Error closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        b = false;
                        System.out.println("Error closed " + c + " but not opened at " + i);
                    } else if (pop != '[') {
                        b = false;
                        System.out.println("Error closed " + c + " but opened " + (char) pop + " at: " + i);
                    }
                    break;

            }
        }
        while (!stack.isEmpty()) {
            b = false;
            System.out.println("Error opened " + (char) stack.pop() + " but not closed");
        }

        if (b) {
            System.out.println("Ok");
        }

    }

}
