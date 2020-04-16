package pojo_learning;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "userName", "passWord" })
public class ReadingJSON_Pojo {
	@JsonProperty("userName")
	private String userName;
	@JsonProperty("passWord")
	private String passWord;

	@JsonProperty("userName")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("userName")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty("passWord")
	public String getPassWord() {
		return passWord;
	}

	@JsonProperty("passWord")
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
