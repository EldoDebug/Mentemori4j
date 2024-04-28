package me.eldodebug.mentemori.response;

import com.google.gson.annotations.SerializedName;

public abstract class Response {

	@SerializedName("status")
	public int status;
	
	@SerializedName("timestamp")
	public long timestamp;
	
	public Response(int status, long timestamp) {
		this.status = status;
		this.timestamp = timestamp;
	}
}
