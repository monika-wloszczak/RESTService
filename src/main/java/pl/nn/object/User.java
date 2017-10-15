package pl.nn.object;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pl.nn.serializer.JsonDateSerializer;

public class User {
	long id;
	String login;
	String name;
	String type;
	String avatarUrl;
	
	Date createdAt;

	public User(long id, String login, String name, String type, String avatarUrl, Date createdAt) {
		super();
		this.id = id;
		this.login = login;
		this.name = name;
		this.type = type;
		this.avatarUrl = avatarUrl;
		this.createdAt = createdAt;
	}

	public User() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("avatarUrl")
	public String getAvatarUrl() {
		return avatarUrl;
	}

	@JsonProperty("avatar_url")
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	@JsonProperty("createdAt")
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "{<br>id='" + id + "', <br>login='" + login + "',<br> name='" + name + "',<br> type='" + type
				+ "', avatarUrl='" + avatarUrl + "', createdAt='" + createdAt + "'<br>}";
	}

}
