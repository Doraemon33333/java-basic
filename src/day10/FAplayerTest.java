package day10;

public class FAplayerTest {
    public static void main(String[] args) {
        Player suzuki = new Player("스즈키 세이야", "외야수", 100000000);
        Player kikuchi = new Player("키쿠치 유세이", "투수", 150000000);

        Team LAD = new Team(suzuki);
        Team LAA = new Team(kikuchi);

        Agent agent1 = new Agent(130000000);


        agent1.buyplayer(LAD, "외야수");
        System.out.println();
        agent1.buyplayer(LAD, "투수");
        //agent1.buyplayer(LAA, "투수");

    }
}
