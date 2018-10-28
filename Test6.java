public class Test6{
  public static void main(String[] args) {
    // 配列

    /*
    配列の基本的な使用方法
    1.配列を表す変数の宣言
    2.配列の要素を確保
    3.配列に値を入れる
    */

    int[] scores;           // 配列の変数を宣言
    scores = new int[5];    // 「new」で、配列を実体化。「[5]」は要素数を定義
    scores[0] = 50;         // 「[0]」は、要素の番号。50を代入
    scores[1] = 40;
    scores[2] = 70;
    scores[3] = 88;
    scores[4] = 12;

    for (int i = 0; i < 5; i++){
      System.out.println(scores[i]);
      // 配列scoresの[i]番目の要素を出力
    }


    System.out.println();     // 結果確認時の見た目用の空行


    int[] numbers = {30, 40, 66, 90, 30};
    // 配列の宣言と同時に、要素の数・代入を行う

    for (int i = 0; i < numbers.length; i++){
    // numbers.lengthで、配列numbersの要素数を取得
      System.out.println(numbers[i]);
      // 配列numbersの[i]番目の要素を出力
    }


    System.out.println();     // 結果確認時の見た目用の空行



    // 多次元配列(配列の配列)
    // ざっくりと言えば、行と列のようなもの
    int[][] points = new int[2][3];
    // 2次元配列pointsの宣言と、2行・3列で実体化
    points[0][0] = 50;
    // pointsの要素に、値を代入
    points[0][1] = 58;
    points[0][2] = 53;
    points[1][0] = 60;
    points[1][1] = 67;
    points[1][2] = 90;

    System.out.println(points[0][2]);     // 要素を指定して値を出力

    for (int i = 0; i < 2; i++){          // 行の数だけ繰り返す
      for (int k = 0; k < 3; k++){        // 列の数だけ繰り返す
        System.out.println(points[i][k]); // 各要素の出力
      }
    }


    System.out.println();     // 結果確認時の見た目用の空行


    System.out.println(points.length);    //pointsの要素数の取得
    /*
    結果は「2」が出力される
    .lengthだけでは、配列名に続く初めの[]の数(行数)しか取得できない
    */


    System.out.println();     // 結果確認時の見た目用の空行


    int[][] numbers2 = {{30, 40, 50},{33, 2, 55}};
    // 配列の宣言と同時に、各要素に値を代入
    System.out.println(numbers2[1][0]);   // 要素を指定して値を出力
  }
}
