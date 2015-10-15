package Qaaaa.test;

public class UserInfo {
	public UserInfo(){};
	
	public UserInfo(int user_id,String user_name){
		this.s_user_id=user_id;
		this.s_user_name=user_name;
	}
	
	private int s_user_id;
	private String  s_user_name;
	
	public int getUserId(){
		return this.s_user_id;
	}
	
	public void UpdateUserId(int userid){
		this.s_user_id=userid;
	}
}
