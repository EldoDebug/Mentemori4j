package me.eldodebug.mentemori.response.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class WorldGroupData {

	@SerializedName("group_id")
	public long groupId;

	@SerializedName("worlds")
	public List<Integer> worlds;

	@SerializedName("legendleague")
	public boolean legendLeague;

	@SerializedName("globalgvg")
	public boolean globalgvg;

	public WorldGroupData(int groupId, List<Integer> worlds, boolean legendLeague, boolean globalgvg) {
		this.groupId = groupId;
		this.worlds = worlds;
		this.legendLeague = legendLeague;
		this.globalgvg = globalgvg;
	}
}
