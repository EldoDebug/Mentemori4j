package me.eldodebug.mentemori.response.impl;

import com.google.gson.annotations.SerializedName;

import me.eldodebug.mentemori.response.Response;
import me.eldodebug.mentemori.response.data.PlayerRankingData;

public class PlayerRankingResponse extends Response {

	@SerializedName("data")
	public PlayerRankingData data;

	public PlayerRankingResponse(int status, long timestamp, PlayerRankingData data) {
		super(status, timestamp);
		this.data = data;
	}
}
