public class Test4{
  public static void main(String[] args) {
    //繰り返し処理 その２
    /*
    while文の基本構文

    変数の宣言
    while (条件式){
      命令文
    }
    1.条件式がtrueである限り命令文を繰り返す。
    2.条件式がfalseになった時に処理を終了する。

    */

    int i = 0;                      // 変数iの宣言、0を代入
    while (i < 5){                  // while文の始まり
    // while (変数iが、5未満か判断)
      System.out.println("Hello");  // 命令文1
      i ++;                         // 命令文2
      // 命令文2が無いと、「無限ループ」になる
    }                               // while文の終わり


    /*
    do ~ while文の基本構文

    変数の宣言
    do {
      命令文
    } while(条件式);
    1.必ず1回、命令文を実行する。
    2.条件式がtrueなら「do{}」の命令文に戻る。
    3.条件式がfalseなら処理の終了。

    */

    int j = 0;                // 変数jの宣言、0を代入
    do {                      // do ~ while文の始まり
      System.out.println(j);  // 命令文1
      j++;                    // 命令文2
      // 命令文2がないと「無限ループ」になる
    }while (j < 5);           // do ~ while文の終わり
    // while (変数jが、5未満か判断)

  }
}
