/*
「javac」でコンパイルし、バイトコードに変換し、実行される。
実行は、「java」+「ファイル名」。

命令文の最後には「；」セミコロンをつける。
*/

// ファイル名と同じクラス名
public class Test{  // クラス名の頭文字は大文字
  // プログラムは、「main」から実行される
  public static void main(String[] args) {  //{}に囲まれた範囲をブロックと呼ぶ
    // 標準出力
    // System.out... コンピュータ側から見て出力
    // 文字列を表示する
    // ダブルクオーテーションで囲む
    System.out.print("Hello again ");   // printで改行なしで表示
    System.out.println("Hello");        // printlnで改行つきで表示
    // 「\」は、エスケープシークエンス
    System.out.println("Hello\"Java\"Training");


    // 数値を表示
    // ダブルクオーテーションがいらない
    System.out.print(14);               // 文字列と違い、スペースは入れられない
    System.out.println(2);


    // 変数の宣言
    // 型名 変数名 = 値;
    // 変数名は入れ物の名前
    int i = 0;           // int型は、整数
    System.out.println(i);

    double d = 3.14;     // double型は、浮動小数点数
    System.out.println(d);

    String s = "ろ";     // String型は、文字・文字列
    String s2 = "ろっくんろーる";
    System.out.println(s);
    System.out.println(s2);

    char a = 'あ';       // char型は、1文字
    System.out.println(a);

    boolean boo = false; // boolean型は、真偽値
    boolean foo = true;  // クオーテーションは、付けない
    System.out.println(boo);
    System.out.println(foo);


    // 式とオペランド
    System.out.println(2 + 3);
    /*
    「2 + 3」の範囲を、「式」と呼ぶ。
    「+」や「-」など、演算に用いる記号が「演算子」。
    「2」や「3」など、演算子の対象となる値を「オペランド」。

    演算子の種類
    「+」加算 足す
    「-」減算 引く
    「*」乗算 掛ける
    「/」除算 割る
    「%」剰余 余り

    「+=」加算代入  左辺の変数に右辺を足した値を、代入
    「-=」減算代入  左辺の変数に右辺を引いた値を、代入
    「*=」乗算代入  左辺の変数に右辺を掛けた値を、代入
    「/=」除算代入  左辺の変数に右辺で割った値を、代入
    「%=」剰余代入  左辺の変数に右辺で割った余りの値を、代入
    「++」インクリメント  左辺の変数の値を、１増やす
    「--」デクリメント    左辺の変数の値を、１減らす
    */


    //型変換
    double b = 6.5;
    System.out.println(b);
    
    int q = (int)b; // double型を「(int)」で、int型に変換
    System.out.println(q);
    /*
    「キャスト」とも呼ばれる
    大きな型を小さな型に変換する
    */


    // 文字列の結合
    String st1 = "こんにちは。 ";
    String st2 = "こんばんは。 ";
    System.out.println(st1 + st2);  //「+」で、文字列を結合できる。

  }
}
