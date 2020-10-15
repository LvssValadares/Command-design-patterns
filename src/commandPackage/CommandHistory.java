package commandPackage;

import java.util.ArrayList; 

class CommandHistory{
	   private ArrayList<ICommand> history = new ArrayList<ICommand>();
	   private int lastExecuted = -1;
	   public void add(ICommand command) {
		   if (lastExecuted != history.size()-1)
			   history.subList(lastExecuted+1, history.size()).clear();
		   history.add(command);
	      command.redo();
	      lastExecuted = history.size()-1;
	   }
	   public boolean moveBack() {
	      if (lastExecuted >= 0) {
	         history.get(lastExecuted--).undo();
	         return true;
	     } else return false;
	   }
	   public boolean moveFront() {
	      if (lastExecuted < history.size()-1) {
	         history.get(++lastExecuted).redo();
	         return true;
	     } else return false;
	   }    
	   public void print() {
	      if (lastExecuted == -1)
	         System.out.println("> ");
	      for (int i = 0; i < history.size(); ++i)
	         System.out.println(((lastExecuted == i) ? "> ":"  ") + history.get(i));
	   }
}