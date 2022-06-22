public class Palindromtest {
    public static void main(String[] args) {

        // args[0] as upper case
        String text = args[0].toUpperCase();
        int front = 0, end = text.length()-1;

        for (int i = 0; front <= end; i++) {
            // ignore whitespaces at front
            while (text.charAt(front) == ' ') {
                front++;
            }
            // ignore whitespaces at end
            while (text.charAt(end) == ' ') {
                end--;
            }
            // check for inequality
            if (text.charAt(front)!=text.charAt(end)) {
                System.out.println(false);
                System.out.println(front);
                return;
            }
            front++; end--;
        }
        System.out.println(true);
    }
}