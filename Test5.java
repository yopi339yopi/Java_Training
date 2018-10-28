public class Test5{
  public static void main(String[] args) {
    // 繰り返し処理 その３

    // 「break」による、処理の終了
    int sum = 0;                        // 変数sumを宣言、0を代入
    for (int i = 1; i <= 10; i++){      // for文の始まり
      sum += i;                         // 変数sumにiを足していく
      System.out.println(i + " を加えました");
      if (sum > 20){                    // if文による条件分岐
        System.out.println("合計が 20 を超えました");
        break;                          // breakで、for文を終了
      }                                 // if文の終了
    }
    System.out.println("合計は " + sum + " です。");



    // 「continue」による、処理のスキップ
    int num = 0;                        // 変数numを宣言、0を代入
    for (int i = 1; i <= 10; i++){      // for文の始まり
      if (i % 2 == 0){                  // if文による条件分岐
        continue;                       // continueで、処理をスキップ
      }                                 // if文の終了
      num += i;                         // 変数numにiを足していく
      System.out.println(i + " を加えました");
    }
    System.out.println("合計は " + num + " です。");



    // 繰り返し処理のネスト(入れ子)
    for (int a = 1; a <= 3; a++){     // ☆
      System.out.println("a = " + a);
      for (int b = 1; b <= 3; b++){   // □
        System.out.println("b = " + a + "-" + b);
      }
    }
    /*
    1.外側のfor文(☆)の命令文を実行
    2.内側のfor文(□)で、変数bが宣言され、命令文を実行
    3.□で、条件式がfalseになるまで繰り返し
    4.☆に戻る

    ☆の命令文は3回実行される
    □の命令文は9回実行される
    */

    for (int i = 1; i <= 9; i++){
      for (int j = 1; j <= 9; j++){
        String str = i + " * " + j + " = " + (i*j) + " ";
        if (i*j < 10){
          System.out.print(str + " ");
        }else{
          System.out.print(str);
        }
      }
      System.out.println();
    }
  }
}
