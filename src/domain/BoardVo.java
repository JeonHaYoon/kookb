/**
 * vo
 * big_board sql  컬럼명 입력
 * 생성자 2개
 * toString() 오버라이드
 * getters&setters 추가
 * 
 * DATETIME 데이터타입(년월일시분초)-> Timestamp 로 지정
 * 년월일만 나타낸다면 Date 
 * 
 * Date는 java.sql import를 해줘야한다.
 * 
 */
package domain;

import java.sql.Timestamp;

public class BoardVo {

	//field
	private int bo_num;
	private String bo_category;
	private String bo_title;
	private String bo_content;
	private String bo_mb_id;
	private String bo_mb_name;
	private int bo_hit;
	private Timestamp bo_inputdate;
	private String bo_ip;
	
	
	
	//생성자
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BoardVo(int bo_num, String bo_category, String bo_title, String bo_content, String bo_mb_id,
			String bo_mb_name, int bo_hit, Timestamp bo_inputdate, String bo_ip) {
		super();
		this.bo_num = bo_num;
		this.bo_category = bo_category;
		this.bo_title = bo_title;
		this.bo_content = bo_content;
		this.bo_mb_id = bo_mb_id;
		this.bo_mb_name = bo_mb_name;
		this.bo_hit = bo_hit;
		this.bo_inputdate = bo_inputdate;
		this.bo_ip = bo_ip;
	}

	
	//toString

	@Override
	public String toString() {
		return "BoardVo [bo_num=" + bo_num + ", bo_category=" + bo_category + ", bo_title=" + bo_title + ", bo_content="
				+ bo_content + ", bo_mb_id=" + bo_mb_id + ", bo_mb_name=" + bo_mb_name + ", bo_hit=" + bo_hit
				+ ", bo_inputdate=" + bo_inputdate + ", bo_ip=" + bo_ip + "]";
	}


	
	//메서드
	public int getBo_num() {
		return bo_num;
	}


	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}


	public String getBo_category() {
		return bo_category;
	}


	public void setBo_category(String bo_category) {
		this.bo_category = bo_category;
	}


	public String getBo_title() {
		return bo_title;
	}


	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}


	public String getBo_content() {
		return bo_content;
	}


	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}


	public String getBo_mb_id() {
		return bo_mb_id;
	}


	public void setBo_mb_id(String bo_mb_id) {
		this.bo_mb_id = bo_mb_id;
	}


	public String getBo_mb_name() {
		return bo_mb_name;
	}


	public void setBo_mb_name(String bo_mb_name) {
		this.bo_mb_name = bo_mb_name;
	}


	public int getBo_hit() {
		return bo_hit;
	}


	public void setBo_hit(int bo_hit) {
		this.bo_hit = bo_hit;
	}


	public Timestamp getBo_inputdate() {
		return bo_inputdate;
	}


	public void setBo_inputdate(Timestamp bo_inputdate) {
		this.bo_inputdate = bo_inputdate;
	}


	public String getBo_ip() {
		return bo_ip;
	}


	public void setBo_ip(String bo_ip) {
		this.bo_ip = bo_ip;
	}
	
	
	
}
