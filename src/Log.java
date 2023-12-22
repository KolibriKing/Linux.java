package lib;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Log {
  public static void log(String str) {
    try {
      FileWriter fw = new FileWriter("./sys.log", true);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(str);
      bw.newLine();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
