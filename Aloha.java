import java.io.*;
public class Aloha{
  public static void main(String[] args) {
    try{
    //準備
    File f = new File("aloha.txt");
    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);
    //読み書き
    int n = 30;
    for (int i = 0;i <= n ; i++ ) {
      pw.print("Aloha!");
      if (i< n-1 ) {
        pw.print(",");
      }
    }

    //閉じる
    pw.close();
  }catch(IOException e){
    System.out.println("ファイルエラーです");
    e.printStackTrace();
  }
  }
}
