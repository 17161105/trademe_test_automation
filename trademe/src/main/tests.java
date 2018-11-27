package main;

import org.testng.annotations.Test;
import methods.*;
import objectrepository.*;

public class tests {

	@Test(priority=0)
	public static void testDriver() {
		Common.initialiseDriver();
	}
	
	@Test(priority=1)
	public static void testUrl() {
		Common.openPage();
	}
	
	@Test(priority=2)
	public static void testSearch() {
		Common.searchString();
	}

}
