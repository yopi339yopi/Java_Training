public class Test2{
  public static void main(String[] args) {
    int age = 19;
    /*
    条件分岐..if文の基本構成

    if (条件式){
      命令文;
    }else if (条件式){
      命令文;
    }else{
      命令文
    }

    関係演算子
    「==」  左辺と右辺が等しい
    「!=」  左辺と右辺が等しくない
    「>」   左辺が右辺より大きい
    「<」   左辺が右辺より小さい
    「>=」  左辺が右辺以上
    「<=」  左辺が右辺未満

    論理演算子
    「&&」  論理積---左辺と右辺が両方true
    a > 0 && b < 0    変数aが0より大きく「かつ」変数bが0より小さい

    「||」  論理和---左辺と右辺のどちらかがtrue
    a > 0 || b < 0    変数aが0より大きい「または」変数bが0より小さい

    「^」   排他的論理和---左辺と右辺のどちらかがtrueで他方がfalse
    a > 0 ^ b < 0     変数aが0より大きく「かつ」変数bが0より大きい
                      又は、変数aが0より小さく「かつ」変数bが0より小さい

    「!」   否定---右辺がfalseの時にtrue
    !(a > 0)          変数aが0より小さい時にtrue

    */

    if (age < 4){  // もし(if)、条件式がtrueならば
      System.out.println("無料です。");  // 命令文を実行
    }else if (age < 13){  // ifがfalseで、条件式がtrueならば
      System.out.println("子供料金です。");  // 命令文を実行
    }else{  // どの条件式もfalseならば
      System.out.println("大人料金です。");  // 命令文を実行
    }

    /*
    三項演算子の基本構成
    変数 = (条件式) ? 値1 : 値2
    */

    int age2 = 15 + (int)(Math.random()*10);
    String str = (age2 >= 20) ? "成人です。" : "未成年です。";
    System.out.println(age2 + "は、" + str);


    /*
    条件分岐..switch文の基本構成

    switch (式){
      case 値1:
        命令文;
        break;
      case 値2:
        命令文;
        break;
      default:
        命令文;
    }
    */

    int score = (int)(Math.random()*5);

    switch (score){ // scoreの値を確認
      case 1:   // score == 1 の場合
        System.out.println("Morning");  // 命令文を実行
        break;  // 処理の終了 switch文から抜ける
      case 2:   // score == 2 の場合
        System.out.println("Hello");  // 命令文を実行
      case 3:   // score == 3、又は、case 2:にbreak文が無い為、score == 2 の場合
        System.out.println("Evening");
        break;
      default:  // scoreの値が、1〜3以外の場合
        System.out.println("Bye");
    }   // switchブロック
    System.out.println(score);  // scoreの値に関わらずに実行



    // 乱数
    System.out.println(Math.random());
    //「Math.random」で、0〜1未満のランダムな値を出力

    int i = (int)(Math.random()*10);
    // 「(int)」で型を変換(キャスト)。
    // 「*10」で、0〜10未満のランダムな値を出力
    System.out.println(i);

    if (i >= 8){
      System.out.println("大吉");
    }else if (i >= 5){
      System.out.println("中吉");
    }else if (i >= 2){
      System.out.println("小吉");
    }else{
      System.out.println("吉");
    }

    int j = (int)(Math.random()*4);
    // 「*4」で、0〜4の値を出力
    System.out.println(j);

    int k = 1 + (int)(Math.random()*6);
    // 1に乱数を足すことで、1〜6の値を出力
    System.out.println(k);

    int p = 2 * (1+(int)(Math.random()*4));
    // 1〜4の乱数に、2を掛けることで、2〜8の値を出力
    System.out.println(p);

    int q = -5 + (int)(Math.random()*11);
    // -5に0〜11の乱数を足すことで、-5〜5の値を出力
    System.out.println(q);

  }
}
