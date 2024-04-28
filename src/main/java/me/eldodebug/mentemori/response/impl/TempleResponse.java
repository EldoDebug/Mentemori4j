package me.eldodebug.mentemori.response.impl;

import com.google.gson.annotations.SerializedName;

import me.eldodebug.mentemori.response.Response;
import me.eldodebug.mentemori.response.data.TempleData;

public class TempleResponse extends Response {

	@SerializedName("data")
	public TempleData data;

	public TempleResponse(int status, long timestamp, TempleData data) {
		super(status, timestamp);
		this.data = data;
	}
}
