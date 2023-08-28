package ch14_jdbc_conn.model;

public class CheckVO {
	private int bbs_No;
	private String bbs_Title;           
	private String bbs_Content; 
	private String author_Id;
	
	public CheckVO(int bbs_No, String bbs_Title, String bbs_Content, String author_Id) {
		super();
		this.bbs_No = bbs_No;
		this.bbs_Title = bbs_Title;
		this.bbs_Content = bbs_Content;
		this.author_Id = author_Id;	
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

	public String getBbs_Content() {
		return bbs_Content;
	}

	public void setBbs_Content(String bbs_Content) {
		this.bbs_Content = bbs_Content;
	}

	public String getAuthor_Id() {
		return author_Id;
	}

	public void setAuthor_Id(String author_Id) {
		this.author_Id = author_Id;
	}

	@Override
	public String toString() {
		return "CheckVO [bbs_No=" + bbs_No + ", bbs_Title=" + bbs_Title + ", bbs_Content=" + bbs_Content
				+ ", author_Id=" + author_Id + "]";
	}
	
	
	}

	