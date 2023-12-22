package sys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import lib.Log;
import sys.err.IOErrorScreen;
import sys.shell.Interactive;

public class Kernel {
  public static void loadmain() {
    Log.log("[sys.Kernel] Reading kernel load option (data/kernel/lopt.inf)");
    try {
      /* Kernel option file reader */
      BufferedReader reader = new BufferedReader(new FileReader("./data/kernel/lopt.inf"));
      /* Read */
      String opt = reader.readLine();
      /* Close */
      reader.close();
      /* Process */
      Log.log("[sys.Kernel] Finished reading file, content: " + opt);
      switch (opt) {
        case "interactive":
          Interactive.load();
	  break;
        default:
	    Log.log("[sys.Kernel] Content didn't match any option");
	    System.out.println("\033cError: no matching kernel load option, system cannot proceed");
      }
    } catch (IOException e) {
      Log.log("[sys.Kernel] Reading file failed, showing error screen");
      IOErrorScreen.show(e);
    }
  }
}
