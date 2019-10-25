package things;

public class Counter {
	
	public Counter() {
		Buttons b = new Buttons();
		
		String txt = b.inputField.getText();
		
		int index = 0;
		
		for(char c : txt.toCharArray()) {
			if(c == '+') {
				String tal1 = txt.substring(0, index);
				String tal2 = txt.substring(index+1, txt.length()-1);

			}
			index++;
		}
		
	}
	
	
}


