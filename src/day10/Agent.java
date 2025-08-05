package day10;

public class Agent {
    private double offer;

    public Agent(double offer) {

        this.offer = offer;
    }

    public void buyplayer(Team team, String position) {
        System.out.println(" 에이전트가 협상 테이블에 앉았습니다.");
        Player player = team.sellplayer(position, offer);

        if (player != null) {
            System.out.println("에이전트: " + player.getName() + " 계약 성사!");
        } else {
            System.out.println("에이전트: 협상 실패. 다음 기회에.");
        }
    }
}
