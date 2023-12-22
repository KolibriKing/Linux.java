package sys.err;

import java.io.IOException;

public class IOErrorScreen {
  public static void show(IOException e) {
    System.out.println("\033[1;91mError: IOException (File operation error)\033[0m, stack trace:");
    e.printStackTrace();
    System.out.println("\n\033[1;3m\033[34mIf all needed files exist and have permissions but you still get this error, please report it on GitHub");
  }
}
