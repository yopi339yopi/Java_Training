// ポリモーフィズム(多態性) / キャスト(型変換) その２

/*
親クラスと、同じ親クラスを継承している子クラスに共通するメソッドを実行出来る機能。
同じ型の変数でも、インスタンスによって動作が異なる。
クラスによって自動的に動作が切り替わる。

メソッドの引数として子クラスのインスタンスを渡すことで、メソッドが実行できる。

基本構文
void メソッド名(親クラスの型 変数){
  メソッドの呼び出し;
}


＊キャスト その２
親クラスの型に代入された子クラスの参照をサブクラスの型にキャスト(変換)出来る。
クラスによって使えないメソッドがあり、使う為に再度代入する。
あまり使われない。

基本構文
親クラス 変数名a = new 子クラス();     // 代入
子クラス 変数名b = (子クラス)変数名a;  // 再度代入
変数名b.メソッド名();

*/

public class Test14{
  public static void main(String[] args) {
    Person[] persons = new Person[3];     // 配列personsを定義
    persons[0] = new Person();            // Personクラスのインスタンス
    persons[1] = new Student();           // Studentクラスのインスタンス
    persons[2] = new Teacher();           // Teacherクラスのインスタンス

    for (int i = 0; i < 3; i++){
      persons[i].work();
      // ごちゃ混ぜのインスタンスの同じメソッドを実行
    }

    Person p = new Teacher();// Personクラスの変数pに、Teacherインスタンスを代入
    //p.makeTest();          // Personクラスでは、makeTestを実行できない
    Teacher t = (Teacher)p;  // Teacherクラスの変数tに、pを再度代入
    t.makeTest();            // tであればmakeTestが実行出来る。
  }
}

class Person{                       // Personクラス
  void work(){                      // workメソッド
    System.out.println("人です");
  }
}

class Student extends Person{       // Personクラスの子クラスStudent
  void work(){                      // workメソッド
    System.out.println("学生です");
  }
}

class Teacher extends Person{       // Personクラスの子クラスTeacher
  void work(){                      // workメソッド
    System.out.println("教員です");
  }

  void makeTest(){
    System.out.println("テストを作ります");
  }
}
