package prob7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );

		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;  // 최고 점수
		int totalScore = 0;   // 점수 합계


		/* 코드를 작성하세요 */
		Set<String> set = map.keySet();
		for(String key:set){
			int score = map.get(key);
			totalScore+=score;
			if(score >= maxScore){maxScore = score; name = key;}
		}
		System.out.println(name+": "+ maxScore + "\ntotalScore: " +totalScore);
	}

}
