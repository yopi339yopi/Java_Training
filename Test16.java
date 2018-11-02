// 抽象クラス・メソッド / インターフェース

/*
＊抽象クラス / アブストラクト・クラス
インスタンスを作れないクラスで、子クラスが無いと意味が無いクラス。
抽象的な概念であるクラスに付ける。
抽象的である為に、インスタンスを作る必要性がない。
「abstract」という修飾子を付けて宣言する。

基本構文
(アクセス修飾子) abstract class クラス名{

}

クラス名 変数名 = new クラス名(); -> 実行出来ない


＊抽象メソッド / アブストラクト・メソッド
抽象クラスの中にしか作れない。
「abstract」修飾子を付けて宣言する。
実体の無いメソッド。
[子クラスで必ずオーバーライドしなければならない]
*子クラスが抽象クラスならば、この限りではない。
必ず、子クラスで内容を実装する。

メソッドは実在するが、内容は子クラスで定義するという「約束」を表す。


＊インターフェース
複数のクラスを継承したいときに使う概念。
クラスが持つべきメソッド(約束ごと)を記したルールブック。
宣言することで、継承関係にないクラス間でポリモーフィズムを使用できる。

基本構文
interface インターフェース名{
  メソッドの宣言
}

class クラス名 implements インターフェース名{
  クラスの内容
}

「instanceof」で、インターフェースを持っているか確認
*/

public class Test16{
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle();
    shapes[1] = new Circle();
    shapes[2] = new Polyline();


    for (int i = 0; i < shapes.length; i++){
      shapes[i].draw();                     // ポリモーフィズム
      if (shapes[i] instanceof CalcArea){
        // shapes[i]が、インターフェースを実装しているか「instanceof」で確認
        CalcArea a = (CalcArea)shapes[i];
        // インターフェース型の変数に、キャスト(型変換)
        System.out.println(a.getArea());
      } else {
        System.out.println("面積は求められない");
      }
    }
  }
}


abstract class Shape{      // Shapeという、抽象クラス
  abstract void draw();    // drowという、抽象メソッド
}

interface CalcArea{        // インターフェースでCalcAriaというルールブックを設定
  double getArea();        // getAreaというメソッドを持つという約束
}

class Rectangle extends Shape implements CalcArea {
  // RectangleクラスはShapeクラスの子クラスで、インターフェースを持つ
  double width;
  double height;
  Rectangle(){
    this.width = this.height = 1;     // コンストラクタ
  }

  void draw(){
    System.out.println("□");         // 長方形を描画
  }

  public double getArea(){            // どこからでもアクセス出来るようにpublic
    return this.width * this.height;  // インターフェースのgetAreaメソッド
  }
}

class Circle extends Shape implements CalcArea{
  // CircleクラスはShapeクラスの子クラスで、インターフェースを持つ
  double r;
  Circle() {
    this.r = 1;                       // コンストラクタ
  }

  void draw(){
    System.out.println("○");         // 円を描画
  }

  public double getArea(){            // どこからでもアクセス出来るようにpublic
    return this.r * this.r * Math.PI; // インターフェースのgetAreaメソッド
  }
}

class Polyline extends Shape{         // 抽象クラスの子クラス
  void draw(){                        // 抽象メソッドのオーバーライド
    System.out.println("W");          // 折れ線を描画
  }
}
