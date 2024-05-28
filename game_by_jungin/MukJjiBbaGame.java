import java.util.Random;
import java.util.Scanner;

public class MukJjiBbaGame {
    // 묵찌빠 옵션을 정의합니다.
    enum MukJjiBba {
        MUK("묵"), JJI("찌"), BBA("빠");

        private final String koreanName;

        MukJjiBba(String koreanName) {
            this.koreanName = koreanName;
        }

        @Override
        public String toString() {
            return koreanName;
        }

        public static MukJjiBba fromString(String text) {
            for (MukJjiBba choice : MukJjiBba.values()) {
                if (choice.koreanName.equals(text)) {
                    return choice;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MukJjiBba playerChoice;
        MukJjiBba computerChoice;
        boolean playerTurn = true;

        System.out.println("묵찌빠 게임을 시작합니다!");

        while (true) {
            playerChoice = getPlayerChoice(scanner);
            computerChoice = getRandomChoice(random);
            System.out.println("플레이어의 선택: " + playerChoice);
            System.out.println("컴퓨터의 선택: " + computerChoice);

            if (playerChoice == computerChoice) {
                System.out.println((playerTurn ? "플레이어" : "컴퓨터") + "의 승리!");
                break;
            } else {
                playerTurn = determineTurn(playerChoice, computerChoice, playerTurn);
                System.out.println((playerTurn ? "플레이어" : "컴퓨터") + "의 턴입니다.");
            }
        }
        scanner.close();
    }

    private static MukJjiBba getPlayerChoice(Scanner scanner) {
        MukJjiBba choice = null;
        while (choice == null) {
            System.out.print("묵찌빠 중 하나를 선택하세요 (묵, 찌, 빠): ");
            choice = MukJjiBba.fromString(scanner.nextLine().trim());
            if (choice == null) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        return choice;
    }

    private static MukJjiBba getRandomChoice(Random random) {
        return MukJjiBba.values()[random.nextInt(MukJjiBba.values().length)];
    }

    private static boolean determineTurn(MukJjiBba playerChoice, MukJjiBba computerChoice, boolean playerTurn) {
        if ((playerChoice == MukJjiBba.MUK && computerChoice == MukJjiBba.JJI) ||
                (playerChoice == MukJjiBba.JJI && computerChoice == MukJjiBba.BBA) ||
                (playerChoice == MukJjiBba.BBA && computerChoice == MukJjiBba.MUK)) {
            return true;  // 플레이어의 턴 유지
        } else {
            return false;  // 컴퓨터의 턴으로 변경
        }
    }
}

