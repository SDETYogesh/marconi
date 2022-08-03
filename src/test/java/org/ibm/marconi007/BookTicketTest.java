package org.ibm.marconi007;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicketTest {
	@Test(dataProvider = "dataProvider_bookTicketTest")
	public void bookTicketTest(String src,String dst) {
		System.out.println("Data provider from"+src+"to"+ dst);
	}
	@DataProvider
	public Object[][] dataProvider_bookTicketTest() {
		Object[][] objArr = new Object[5][2];
	    objArr[0][0]= "Benglore";
	    objArr[0][1]= "Pune";
	    
	    objArr[1][0]= "Benglore";
	    objArr[1][1]= "Goa";
	    
	    objArr[2][0]= "Benglore";
	    objArr[2][1]= "Delhi";
	    
	    objArr[3][0]= "Benglore";
	    objArr[3][1]= "Manali";
	    
	    objArr[4][0]= "Benglore";
	    objArr[4][1]= "Mumbai";
	   
	    return objArr;
		
	}

}
