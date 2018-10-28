// クラスの基本
/*
Javaはオブジェクト志向言語
オブジェクト＝プログラムの部品
オブジェクトがどのようなものか記述したものが「クラス」
Javaプログラミング＝クラスを定義する

クラス..共通する情報・機能を抽象化したもの
[自動車][人][犬][モンスター]などの、概念や大まかな分類

インスタンス..具体的なオブジェクト
[ハイエース][父・母][ポチ][スライム]など、個人や個体の持つ名前などの情報
*/

public class Test7{
  public static void main(String[] args) {
    Book b = new Book();    // bという本を実体化
    b.name = "beck";        // bの名前を設定
    b.price = 500;          // bの価格を設定

    Book b2 = new Book();   // b2という本を生成
    b2.name = "Rookies";    // b2の名前を設定
    b2.price = 600;         // b2の価格を設定

    System.out.println(b.name + "は、" + b.price + "円です。");
    System.out.println(b2.name + "は、" + b2.price + "円です。");


    Dog d = new Dog();      // dという犬を実体化
    d.name = "Taro";        // dの名前を設定

    Dog d2 = new Dog();     // d2という犬を実体化
    d2.name = "Hanako";     // d2の名前を設定

    System.out.println("名前は、" + d.name + "です。");
    System.out.println("名前は、" + d2.name + "です。");


    Monster m0 = new Monster();   // m0というモンスターを実体化
    m0.name = "スライム";         // m0の名前を設定
    m0.hp = 10;                   // m0のHPを設定
    m0.mp = 3;                    // m0のMPを設定
    m0.dropitem = "薬草";         // m0のドロップアイテムを設定

    Monster m1 = new Monster();   // m1というモンスターを実体化
    m1.name = "オーク";           // m1の名前を設定
    m1.hp = 20;                   // m1のHPを設定
    m1.mp = 5;                    // m1のMPを設定
    m1.dropitem = "ひのきの棒";   // m1のドロップアイテムを設定

    System.out.println(m0.name + "が現れた。[hp:" +
                      m0.hp + " mp:" + m0.mp + "]");

    System.out.println(m1.name + "が現れた。[hp:" +
                      m1.hp + " mp:" + m1.mp + "]");

    System.out.println(m0.name + "を倒した。[" +
                      m0.dropitem + "]を手に入れた");

    System.out.println(m1.name + "を倒した。[" +
                      m1.dropitem + "]を手に入れた");


    Monster[] monsters = new Monster[3];  // 配列monstersを定義
    monsters[0] = m0;                     // 要素に代入
    monsters[1] = m1;
    monsters[2] = m0;

    for (int i = 0; i < monsters.length; i++){
      if (monsters[i] == null) continue;  // 配列の要素が何も無い場合の処理
      System.out.println(monsters[i].name + "が現れた。[hp:" +
                        monsters[i].hp + " MP:" + monsters[i].mp + "]");
    }
  }
}

class Book{       // 本とは何ですか？ -> 概念を定義
  String name;    // 名前があります -> 名前という情報
  int price;      // 価格があります -> 価格という情報
}

class Dog{        // 犬とは何ですか？ -> 概念を定義
  String name;    // 名前があります -> 名前という情報
}

class Monster{    // モンスターとは何ですか？ -> 概念を定義
  String name;    // 名前があります -> 名前という情報
  int hp;         // HPがあります -> HPという情報
  int mp;         // MPがあります -> MPという情報
  String dropitem;// アイテムを落とします -> 落とすアイテムという情報
}
