package tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Game {
	public String solve(String input) {
		List<String> rightList = new ArrayList<String>(Arrays.asList("1","2","3","4")) ;
//		Random random = new Random();
//		for (int i = 0; i < 4; i++) {
//			rightList.add(String.valueOf(random.nextInt(10)));
//		}
		String outPutString = "";
		List<String> inputList = Arrays.asList(input.split(" "));
		List<String> inputListCopy = new ArrayList<String>(inputList);
		if (new HashSet<String>(inputList).size()<4) {
			return "输入错误，再次输入";
		}
		inputListCopy.retainAll(rightList);
		int count = 0;
		for (int j = 0; j < 4; j++) {
			if (inputList.get(j).equals(rightList.get(j))) {
				count++;
			}
		}
		if(count==4) {
			return "胜利";
		}
		outPutString += (String.valueOf(count) + "A" + String.valueOf(inputListCopy.size() - count) + "B");
		return outPutString;
	}
}
