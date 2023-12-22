package sys;

import java.util.ArrayList;

public class ShellCommand {
  String cmd;
  ArrayList<String> args = new ArrayList<String>();
  public void ShellCommand(String rawCmd) {
    String lastArg;
    boolean readArg = false;
    for (int i = 0; i < rawCmd.length(); i++) {
    }
    /*$TODO: Here i need to make something like this JavaScript code
     for (char of string) {
    if (char != ' ') {
      laststr += char;
      if (i == string.length - 1) {
        result.push(laststr);
        laststr = '';
      }
    } else {
      result.push(laststr);
      laststr = '';
    }
    i++;
  }*/
  }
}
