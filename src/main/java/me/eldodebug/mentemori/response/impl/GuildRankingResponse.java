package me.eldodebug.mentemori.response.impl;

import com.google.gson.annotations.SerializedName;

import me.eldodebug.mentemori.response.Response;
import me.eldodebug.mentemori.response.data.GuildRankingData;

public class GuildRankingResponse extends Response {

	@SerializedName("data")
	public GuildRankingData data;

	public GuildRankingResponse(int status, long timestamp, GuildRankingData data) {
		super(status, timestamp);
		this.data = data;
	}
}
