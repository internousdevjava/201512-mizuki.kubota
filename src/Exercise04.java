class Exercise04{
  public static void main(String[] args){

    //Studentクラスで要素が5つの配列を生成する
    Student[] students = new Student[5];
    students[0] = new Student("織田信二",77,82);
    students[1] = new Student("小松里奈",40,97);
    students[2] = new Student("鈴木千佳",90,49);
    students[3] = new Student("筑井喜一",75,81);
    students[4] = new Student("野並由佳",71,72);
    //国語の合計点を格納する変数
    int ktotal = 0;
    //算数の合計点を格納する変数
    int stotal = 0;
    for(int i = 0; i < students.length; i++){
      //国語の合計を求める
      ktotal = ktotal + students[i].getKokugo();
      //算数の合計を求める
      stotal = stotal + students[i].getSansu();
    }
    //それぞれの合計点を画面に表示
    System.out.println("国語の合計は"+ktotal);
    System.out.println("算数の合計は"+stotal);

  }
}