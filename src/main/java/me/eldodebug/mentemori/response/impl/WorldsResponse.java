package me.eldodebug.mentemori.response.impl;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.eldodebug.mentemori.response.Response;
import me.eldodebug.mentemori.response.data.WorldData;

public class WorldsResponse extends Response {

	@SerializedName("data")
	public List<WorldData> data;

	public WorldsResponse(int status, long timestamp, List<WorldData> data) {
		super(status, timestamp);
		this.data = data;
	}
}
