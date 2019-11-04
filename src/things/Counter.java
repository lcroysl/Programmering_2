package things;

public class Counter {
	
	
	
	
	public static String counter(String expression) {
		Addition add = new Addition();
		Subtraktion sub = new Subtraktion();
		Division div = new Division();
		Multiplikation multi = new Multiplikation();
		Rot rot = new Rot();
		Modulus mod = new Modulus();
		
		double tal1 = 0;
		double tal2 = 0;
		double Rotsum = 0;
		double Sum = 0;
		String result = "";
		String txt = expression;
		
		
		if (txt.contains("R")) {
			String[] ohj = {"(\\+)", "(\\-)", "(\\*)","(\\÷)"};
			for(String j : ohj) {
				String[] txts = txt.split(j);
				
				if (txts.length == 1) {
					String str1 = txt;
					if(str1.contains("R")) {
						String[] str1split = str1.split("R");
						tal1 = Double.parseDouble(str1split[1]);
					Rotsum = Rot.Rotur(tal1);
					String Rottxt = Double.toString(Rotsum);
					result = Rottxt;
					}
				}
				else if (txts.length == 2)
				{
					String str1 = txts[0];
					String str2 = txts[1];
					if(str1.contains("R")) {
						String[] str1split = str1.split("R");
						tal1 = Double.parseDouble(str1split[1]);
						System.out.println(str1split[1]);
						Rotsum = rot.calc(tal1,tal2);
					}
					else if(str2.contains("R")) {
						String[] str2split = str2.split("R");
						tal2 = Double.parseDouble(str2split[1]);
						Rotsum = rot.calc(tal1,tal2);
					}
					String Rottxt = Double.toString(Rotsum);
					result = Rottxt;
				}
			}
		}		
		else if(txt.contains("-")){
			String[] txts = txt.split("(\\-)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = sub.calc(tal1, tal2);
			String subtxt = Double.toString(Sum);
			result = subtxt;
		}
		
		else if(txt.contains("+")){
			String[] txts = txt.split("(\\+)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = add.calc(tal1, tal2);
			String addtxt = Double.toString(Sum);
			result = addtxt;
		}
		
		else if(txt.contains("÷")) {
			String[] txts = txt.split("(\\÷)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = div.calc(tal1, tal2);
			String divtxt = Double.toString(Sum);
			result = divtxt;
		}
		
		else if(txt.contains("*")) {
			String[] txts = txt.split("(\\*)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = multi.calc(tal1, tal2);
			String multitxt = Double.toString(Sum);
			result = multitxt;
		}
		
		else if(txt.contains("%")) {
			String[] txts = txt.split("(\\%)");
			tal1 = Double.parseDouble(txts[0]);
			tal2 = Double.parseDouble(txts[1]);
			Sum = mod.calc(tal1, tal2);
			String modtxt = Double.toString(Sum);
			result = modtxt;
		}
		
		
			
		
		
		return result;
		
		
		
	}
	
}


