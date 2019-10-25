package things;

public class Counter {
	
	public String counter() {
		
		Addition add = new Addition();
		Buttons b = new Buttons();
		double tal1 = 0;
		double tal2 = 0;
		double Sum = 0;
		String txt = b.inputField.getText();
		String[] txts = {};
		
		if(txt.contains("+")){
			txts = txt.split("+");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[2]);
			Sum = add.calc(tal1, tal2);
		}
		String Sumtxt = Double.toString(Sum);
		return Sumtxt;
	}
	
	
}


