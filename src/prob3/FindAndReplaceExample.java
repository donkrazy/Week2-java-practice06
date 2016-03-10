package prob3;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 Java 언어로 개발 될 수 있습니다.";
        if(str.contains("Java")){
            System.out.println("자바 문자열이 포함되어 있습니다.");
            System.out.println(str.replace("Java", "자바"));
        }
	}

}
