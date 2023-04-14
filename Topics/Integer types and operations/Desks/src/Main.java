import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();

        int groupADesks = groupA / 2;
        int groupBDesks = groupB / 2;
        int groupCDesks = groupC / 2;

        int aRem = groupA % 2;
        int bRem = groupB % 2;
        int cRem = groupC % 2;

        int totalDesks = (groupADesks + groupBDesks + groupCDesks);
        totalDesks += (aRem + bRem + cRem);
        System.out.println(totalDesks);
    }
}