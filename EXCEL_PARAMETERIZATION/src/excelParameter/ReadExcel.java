package excelParameter;

public class ReadExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\QA_WEEKEND_BATCH\\EXCEL_PARAMETERIZATION\\src\\TestData\\TESTSUITE.xlsx");
		
		int rows=xls.getRowCount("GMAIL");
		System.out.println(rows);
		
		String value=xls.getCellData("GMAIL", "STATUS", 5);
	//	System.out.println(value);

		for(int i=0;i<=rows;i++)
		{
			String C1=xls.getCellData("GMAIL", "TCID", i);
			String C2=xls.getCellData("GMAIL", "TESTCASE", i);
			String C3=xls.getCellData("GMAIL", "STATUS", i);
			System.out.println(C1+" | "+C2+" | "+C3);
		}
		
	}

}
