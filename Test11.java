// オーバーロード / 「this」について / クラス変数

/*
＊オーバーロード
同じメソッド名やコンストラクタを複数宣言すること。
指定される引数のタイプによって区別されるため、引数のタイプが異なる必要がある。


＊「this」
thisは自分自身を参照することができる。

自分自身の変数にアクセス
「this.変数名」

自分自身のメソッドにアクセス
「this.メソッド名(引数)」

自分自身のコンストラクタを実行
「this(引数)」

「this」は自分自身だと明らかな場合は、省略することが出来る。


＊クラス変数
複数のインスタンスに共通する情報
例:犬
インスタンス変数 -> 名前、性別、毛の色
クラス変数       -> 足の本数、尻尾の有無

宣言のときに「static」をつけ、初期化しておく。

基本構文
class クラス名{
  static 型 クラス変数名 = 初期値
}

利用時には「クラス名.クラス変数名」でアクセスする。
this同様に明らかな場合は省略が可能。


*/

public class Test11{
  public static void main(String[] args) {
    Point p1 = new Point();
    p1.set(10,0);

    Point p2 = new Point();
    p2.set(p1);

    System.out.println("p1のxは " + p1.x + "、p1のyは " + p1.y + " です。");
    System.out.println("p2のxは " + p2.x + "、p2のyは " + p2.y + " です。");

    System.out.println(Point.counter);  // クラス変数の利用
  }
}

class Point {
  static int counter = 0; // クラス変数
  int x;                  // インスタンス変数
  int y;

  void set(int x, int y){ // setメソッドを宣言 -> オーバーロード
    this.x = x;
    this.y = y;
  }

  void set(Point p){      // setメソッドを宣言 -> オーバーロード
    this.x = p.x;
    this.y = p.y;
  }
}
