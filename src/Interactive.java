package sys.shell;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import lib.Log;
import sys.Shell;

public class Interactive {
  public static void load() {
    Log.log("[Intetactive.load] Reading user prompt (FileReader + BuffetedReader)");
    try {
      /* Read user prompt */
      BufferedReader reader = new BufferedReader(new FileReader("./data/term/prompt.inf"));
      /* Read */
      String prompt = reader.readLine();
      /* Close */
      reader.close();
      /* Terminal loop */
      Log.log("[Interactive.load] Launching terminal loop");
      while (true) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        System.out.print("\n" + prompt);
      }
    } catch (IOException e) {
      Log.log("[Interactive.load] IOException");
      e.printStackTrace();
    }
  }
}
