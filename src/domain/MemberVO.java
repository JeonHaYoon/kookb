/**
 * 
 * 멤버관련 
 */
package domain;

import java.sql.Timestamp;

public class MemberVO {	
	private String mb_id;
	private String mb_pw;
	private String mb_name;
	private String mb_email;
	private String mb_zipcode;
	private String mb_doroAddr;
	private String mb_gujusoAddr;
	private String mb_detailAddr;
	private String mb_phone;
	private String mb_bitrh;
	private String mb_gender;
	private Timestamp mb_joindate;
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//로그인에 필요한 id, pw , 필요한 것만 따로 생성

	public MemberVO(String mb_id, String mb_pw) {
		super();
		this.mb_id = mb_id;
		this.mb_pw = mb_pw;
	}



	public MemberVO(String mb_id, String mb_pw, String mb_name, String mb_email, String mb_zipcode, String mb_doroAddr,
			String mb_gujusoAddr, String mb_detailAddr, String mb_phone, String mb_bitrh, String mb_gender,
			Timestamp mb_joindate) {
		super();
		this.mb_id = mb_id;
		this.mb_pw = mb_pw;
		this.mb_name = mb_name;
		this.mb_email = mb_email;
		this.mb_zipcode = mb_zipcode;
		this.mb_doroAddr = mb_doroAddr;
		this.mb_gujusoAddr = mb_gujusoAddr;
		this.mb_detailAddr = mb_detailAddr;
		this.mb_phone = mb_phone;
		this.mb_bitrh = mb_bitrh;
		this.mb_gender = mb_gender;
		this.mb_joindate = mb_joindate;
	}


	@Override
	public String toString() {
		return "MemberVo [mb_id=" + mb_id + ", mb_pw=" + mb_pw + ", mb_name=" + mb_name + ", mb_email=" + mb_email
				+ ", mb_zipcode=" + mb_zipcode + ", mb_doroAddr=" + mb_doroAddr + ", mb_gujusoAddr=" + mb_gujusoAddr
				+ ", mb_detailAddr=" + mb_detailAddr + ", mb_phone=" + mb_phone + ", mb_bitrh=" + mb_bitrh
				+ ", mb_gender=" + mb_gender + ", mb_joindate=" + mb_joindate + "]";
	}


	public String getMb_id() {
		return mb_id;
	}


	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}


	public String getMb_pw() {
		return mb_pw;
	}


	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}


	public String getMb_name() {
		return mb_name;
	}


	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}


	public String getMb_email() {
		return mb_email;
	}


	public void setMb_email(String mb_email) {
		this.mb_email = mb_email;
	}


	public String getMb_zipcode() {
		return mb_zipcode;
	}


	public void setMb_zipcode(String mb_zipcode) {
		this.mb_zipcode = mb_zipcode;
	}


	public String getMb_doroAddr() {
		return mb_doroAddr;
	}


	public void setMb_doroAddr(String mb_doroAddr) {
		this.mb_doroAddr = mb_doroAddr;
	}


	public String getMb_gujusoAddr() {
		return mb_gujusoAddr;
	}


	public void setMb_gujusoAddr(String mb_gujusoAddr) {
		this.mb_gujusoAddr = mb_gujusoAddr;
	}


	public String getMb_detailAddr() {
		return mb_detailAddr;
	}


	public void setMb_detailAddr(String mb_detailAddr) {
		this.mb_detailAddr = mb_detailAddr;
	}


	public String getMb_phone() {
		return mb_phone;
	}


	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}


	public String getMb_bitrh() {
		return mb_bitrh;
	}


	public void setMb_bitrh(String mb_bitrh) {
		this.mb_bitrh = mb_bitrh;
	}


	public String getMb_gender() {
		return mb_gender;
	}


	public void setMb_gender(String mb_gender) {
		this.mb_gender = mb_gender;
	}


	public Timestamp getMb_joindate() {
		return mb_joindate;
	}


	public void setMb_joindate(Timestamp mb_joindate) {
		this.mb_joindate = mb_joindate;
	}


	
	
	
	
}
