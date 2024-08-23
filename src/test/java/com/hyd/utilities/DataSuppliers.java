package com.hyd.utilities;

import org.testng.annotations.*;

public class DataSuppliers {
	
	@DataProvider
	public Object[][] AuthenticationData() {
		Object[][] userData = new Object[1][2];
		userData[0][0] = "harsha_chanti@yahoo.co.in";
		userData[0][1] = "";
		return userData;
	}
}
