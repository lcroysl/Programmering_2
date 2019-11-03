package things;

public class Counter {
	
	
	
	
	public static String counter(String expression) {
		Addition add = new Addition();
		Subtraktion sub = new Subtraktion();
		Division div = new Division();
		Multiplikation multi = new Multiplikation();
		
		double tal1 = 0;
		double tal2 = 0;
		double Sum = 0;
		String txt = expression;
		
		
		
		if(txt.contains("-")){
			String[] txts = txt.split("(\\-)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = sub.calc(tal1, tal2);
			String subtxt = Double.toString(Sum);
			return subtxt;
		}
		
		else if(txt.contains("+")){
			String[] txts = txt.split("(\\+)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = add.calc(tal1, tal2);
			String addtxt = Double.toString(Sum);
			return addtxt;
		}
		
		else if(txt.contains("÷")) {
			String[] txts = txt.split("(\\÷)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = div.calc(tal1, tal2);
			String divtxt = Double.toString(Sum);
			return divtxt;
		}
		
		else if(txt.contains("*")) {
			String[] txts = txt.split("(\\*)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = multi.calc(tal1, tal2);
			String multitxt = Double.toString(Sum);
			return multitxt;
		}
		
		return "0";
		
		
		
	}
	
}


