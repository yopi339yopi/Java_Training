import java.util.Scanner;

public class Janken{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int win = 0;
    int lose = 0;
    int drow = 0;
    String[] rsp = {"グー","チョキ","パー"};

    System.out.println("じゃんけん  スタート！");

    boolean playing = true;

    while(playing) {
      System.out.println("何を出しますか？");
      System.out.println("[0]:グー・[1]:チョキ・[2]:パー・[9]:やめる");

      int player = s.nextInt();
      if (player == 9){
        playing = false;
        break;
      }else if (player != 0 && player != 1 && player != 2 && player != 9){
        System.out.println("正しく入力してください");
        continue;
      }

      int com = (int)(Math.random()*3);

      System.out.println("あなた：" + rsp[player] + "  " +
                        "コンピュータ：" + rsp[com]);

      if ((com + 3 - player) % 3 == 1){
        System.out.println("あなたの勝ちです");
        win++;
      }else if (com == player){
        System.out.println("あいこでしょ");
        drow++;
        continue;
      }else{
        System.out.println("あなたの負けです");
        lose++;
      }
    }

    System.out.println("ゲーム終了");
    System.out.println("スコアは" + win + "勝" + lose + "敗" +
                      drow + "分けでした。");
  }
}
