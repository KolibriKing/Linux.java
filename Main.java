import sys.Kernel;
import lib.Log;

class Main {
  public static void main(String[] args) {
    /* Main has only 1 function to exexute everything faster */
    Log.log("Main: running Kernel.loadmain");
    Kernel.loadmain();
  }
}
