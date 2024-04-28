package me.eldodebug.mentemori.response.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TempleData {

	@SerializedName("world_id")
	public int worldId;
	
	@SerializedName("quest_ids")
	public List<Long> questIds;

	public TempleData(int worldId, List<Long> questIds) {
		this.worldId = worldId;
		this.questIds = questIds;
	}
}
