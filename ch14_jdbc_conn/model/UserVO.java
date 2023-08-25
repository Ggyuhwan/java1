package ch14_jdbc_conn.model;
// value obejct
public class UserVO {
	private String userId;
	private String userPw;
	private String userNm;
	private String userMail;
	private int userMileage;
	private String create_dt;
	private String update_Dt;
	private String useYn;
	
// 생성자
	public UserVO(String userId, String userPw, String userNm) { 
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userNm = userNm;
	}
	public UserVO() {
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public int getUserMileage() {
		return userMileage;
	}
	public void setUserMileage(int userMileage) {
		this.userMileage = userMileage;
	}
	public String getCreatr_dt() {
		return create_dt;
	}
	public void setCreatr_dt(String creatr_dt) {
		this.create_dt = creatr_dt;
	}
	public String getUpdate_Dt() {
		return update_Dt;
	}
	public void setUpdate_Dt(String update_Dt) {
		this.update_Dt = update_Dt;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userNm=" + userNm + ", userMail=" + userMail
				+ ", userMileage=" + userMileage + ", create_dt=" + create_dt + ", update_Dt=" + update_Dt + ", useYn="
				+ useYn + "]";
	}
	
	
}
