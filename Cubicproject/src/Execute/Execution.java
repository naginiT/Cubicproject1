package Execute;

import org.testng.annotations.Test;

import Operation.Login_operation;
import Repository.Inspectelement;
import Repository.Openbrowser;

public class Execution {
	@Test
	public static void perform() throws Exception {
		Openbrowser.open();
		Login_operation.show();
		
		
		
//		
	}

}
