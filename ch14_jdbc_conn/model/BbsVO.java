package ch14_jdbc_conn.model;

public class BbsVO {
	private int  bbs_No;
	private String bbs_Title;
	private String  author_Id;
	private String	update_Dt;
	
	
	// 생성자	
	public BbsVO(int bbs_No, String bbs_Title, String author_Id, String update_Dt) {
		super();
		this.bbs_No = bbs_No;
		this.bbs_Title = bbs_Title;
		this.author_Id = author_Id;
		this.update_Dt = update_Dt;
	}
	public BbsVO() {
		
	}
	

	public int getBbs_No() {
		return bbs_No;
	}


	public void setBbs_No(int bbs_No) {
		this.bbs_No = bbs_No;
	}


	public String getBbs_Title() {
		return bbs_Title;
	}


	public void setBbs_Title(String bbs_Title) {
		this.bbs_Title = bbs_Title;
	}


	public String getAuthor_Id() {
		return author_Id;
	}


	public void setAuthor_Id(String author_Id) {
		this.author_Id = author_Id;
	}


	public String getUpdate_Dt() {
		return update_Dt;
	}


	public void setUpdate_Dt(String update_Dt) {
		this.update_Dt = update_Dt;
	}

	
	@Override
	public String toString() {
		return "BbsVO [bbs_No=" + bbs_No + ", bbs_Title=" + bbs_Title + ", author_Id=" + author_Id + ", update_Dt="
				+ update_Dt + "]";
	}
	
	
	
	
}