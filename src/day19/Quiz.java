package day19;

import java.util.*;

public class Quiz {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 성씨 데이터 (Kanji → 히라가나)
        Map<String, String> surnames = new LinkedHashMap<>();
        surnames.put("佐藤", "さとう");
        surnames.put("鈴木", "すずき");
        surnames.put("高橋", "たかはし");
        surnames.put("田中", "たなか");
        surnames.put("伊藤", "いとう");
        surnames.put("渡辺", "わたなべ");
        surnames.put("山本", "やまもと");
        surnames.put("中村", "なかむら");
        surnames.put("小林", "こばやし");
        surnames.put("加藤", "かとう");
        surnames.put("吉田", "よしだ");
        surnames.put("山田", "やまだ");
        surnames.put("佐々木", "ささき");
        surnames.put("山口", "やまぐち");
        surnames.put("井上", "いのうえ");
        surnames.put("松本", "まつもと");
        surnames.put("斎藤", "さいとう");
        surnames.put("青木", "あおき");
        surnames.put("森", "もり");
        surnames.put("池田", "いけだ");
        surnames.put("橋本", "はしもと");
        surnames.put("山崎", "やまざき"); // 'やまさき' 도 있음
        surnames.put("阿部", "あべ");
        surnames.put("石井", "いしい");
        surnames.put("前田", "まえだ");
        surnames.put("村上", "むらかみ");
        surnames.put("遠藤", "えんどう");
        surnames.put("長谷川", "はせがわ");
        surnames.put("後藤", "ごとう");
        surnames.put("小川", "おがわ");
        surnames.put("岡田", "おかだ");
        surnames.put("藤井", "ふじい");
        surnames.put("西村", "にしむら");
        surnames.put("福田", "ふくだ");
        surnames.put("中川", "なかがわ");
        surnames.put("高木", "たかぎ");
        surnames.put("工藤", "くどう");
        surnames.put("上田", "うえだ");
        surnames.put("杉山", "すぎやま");
        surnames.put("藤田", "ふじた");
        surnames.put("近藤", "こんどう");
        surnames.put("原田", "はらだ");
        surnames.put("森田", "もりた");
        surnames.put("柴田", "しばた");
        surnames.put("安藤", "あんどう");
        surnames.put("大野", "おおの");
        surnames.put("松田", "まつだ");
        surnames.put("平野", "ひらの");
        surnames.put("野村", "のむら");
        surnames.put("金子", "かねこ");
        List<String> kanjiList = new ArrayList<>(surnames.keySet());
        Collections.shuffle(kanjiList);

        int correct = 0;
        int total = 5; // 출제 개수 (원하면 조정 가능)

        System.out.println("=== 일본 성씨 한자 → 히라가나 퀴즈 ===");
        System.out.println("정답 입력 / 'exit' 입력하면 종료\n");

        for (int i = 0; i < total; i++) {
            String kanji = kanjiList.get(i);
            String answer = surnames.get(kanji);

            System.out.printf("[%d/%d] 한자: %s → 히라가나 입력: ",
                    i + 1, total, kanji);
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.equals(answer)) {
                System.out.println("⭕ 정답!\n");
                correct++;
            } else {
                System.out.printf("❌ 오답! 정답은 %s\n\n", answer);
            }
        }

        System.out.printf("퀴즈 종료! 맞힌 개수: %d/%d\n", correct, total);
        sc.close();
    }
}


