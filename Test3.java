public class Test3{
  public static void main(String[] args) {
    // 繰り返し処理   その１
    /*
    for文の基本構文

    for ( 最初の処理; 条件式; 命令文の後に行う処理){
      命令文
    }
    1.最初の処理を行う。
    2.条件式がtrueならば、命令文の実行。
      条件式がfalseならば、繰り返し処理を終了。
    3.命令文が実行された場合、後の処理を行う。
    */

    for ( int i = 0; i < 5; i++){ // ** for文はここから
    // for (変数iに0を代入、iが5未満か判断、命令文が実行された後、iに1を足す)
      System.out.println("こんにちは");  // 命令文
    } // ** ここまで


    int sum = 0;  // 変数sumに0を代入
    for (int i = 1; i <= 100; i++){ // ** for文はここから
    // for (変数iに1を代入、iが100以下か判断、命令文が実行された後、iに1を足す)
      sum += i; // 変数sumにiを足していく
      System.out.println("sumに " + i + " を足しました");
    } // ** ここまで
    System.out.println(sum);


    int num = 0;
    for (int i = 1; i <= 100; i++){ // ** for文はここから
      if (i % 2 == 0){
        num += i;
        System.out.println("numに " + i + " を足しました");
      }
    } // ** ここまで
    System.out.println(num);


    /*
    変数のスコープ

    変数には使える範囲が決まっている
    宣言された場所のブロック内{}でしか使えない

    public class Xyz{
      public static void main(String[] args) {
        int sum = 0;  // 変数sumはmainブロックで宣言
        for (int i = 0; i < 5; i++){  // 変数iはfor文ブロックで宣言
          sum += i;   // main内なのでsumが使える
        }
        System.out.println(sum)
        System.out.println(i)   // for文ブロックの外なので、変数iは使えない
      }
    }
    */

  }
}
