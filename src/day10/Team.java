package day10;

public class Team {
    private Player hosiiPlayer;

    public Team(Player hosiiPlayer) {
        this.hosiiPlayer = hosiiPlayer;
    }

    public Player sellplayer(String position, double offer) {
        if (!hosiiPlayer.getPosition().equals(position)) {
            System.out.println("구단: 저희 구단이 원하는 포지션과 다릅니다.");
            return null;
        }

        if (offer < hosiiPlayer.getValue()) {
            System.out.println("구단: 제시액이 부족합니다.");
            return null;
        }

        System.out.println("구단: 협상 성공!");
        return hosiiPlayer;
    }
}

