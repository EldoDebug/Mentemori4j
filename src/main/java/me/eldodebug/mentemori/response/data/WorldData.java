package me.eldodebug.mentemori.response.data;

import com.google.gson.annotations.SerializedName;

public class WorldData {

	@SerializedName("world_id")
	public long worldId;

	@SerializedName("server")
	public String server;

	@SerializedName("temple")
	public boolean temple;

	@SerializedName("ranking")
	public boolean ranking;

	@SerializedName("localgvg")
	public boolean localgvg;

	public WorldData(int worldId, String server, boolean temple, boolean ranking, boolean localgvg) {
		this.worldId = worldId;
		this.server = server;
		this.temple = temple;
		this.ranking = ranking;
		this.localgvg = localgvg;
	}
}
