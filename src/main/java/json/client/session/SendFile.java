package json.client.session;

public class SendFile {

	private String friendname;
	private String usernmae;
	private byte[] content;
	private String filename;
	
	public String getFriendname() {
		return friendname;
	}
	public void setFriendname(String friendname) {
		this.friendname = friendname;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUsernmae() {
		return usernmae;
	}
	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}	
}
