/**
 * 
 * 성적 프로그램 ->obj6
 * @author BigData18
 *
 */
public class Record {
	String name;
	int kor;
	int eng;
	int code;
		
	public void Record() {}

	public Record(String name, int kor, int eng, int code) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.code = code;
	}

	@Override
	public String toString() {
		return "Record [name=" + name + ", kor=" + kor + ", eng=" + eng + ", code=" + code + "]";
	}
	
	
}
