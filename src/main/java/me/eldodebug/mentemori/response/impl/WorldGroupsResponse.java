package me.eldodebug.mentemori.response.impl;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import me.eldodebug.mentemori.response.Response;
import me.eldodebug.mentemori.response.data.WorldGroupData;

public class WorldGroupsResponse extends Response {

	@SerializedName("data")
	public List<WorldGroupData> data;

	public WorldGroupsResponse(int status, long timestamp, List<WorldGroupData> data) {
		super(status, timestamp);
		this.data = data;
	}
}
