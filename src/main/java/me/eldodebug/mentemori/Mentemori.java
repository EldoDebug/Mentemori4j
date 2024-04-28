package me.eldodebug.mentemori;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import me.eldodebug.mentemori.response.impl.GuildRankingResponse;
import me.eldodebug.mentemori.response.impl.PlayerRankingResponse;
import me.eldodebug.mentemori.response.impl.TempleResponse;
import me.eldodebug.mentemori.response.impl.WorldGroupsResponse;
import me.eldodebug.mentemori.response.impl.WorldsResponse;
import me.eldodebug.mentemori.utils.HttpUtils;

public class Mentemori {

	private static final Gson GSON = new Gson();

	/*
	 * More information https://mentemori.icu/
	 */
	private static final String API_URL = "https://api.mentemori.icu/";

	/*
	 * List of worlds with data available, as well as what data is available
	 * https://api.mentemori.icu/worlds
	 */
	public static WorldsResponse getWorlds() {

		String response = HttpUtils.readResponse(API_URL + "worlds", null);
		WorldsResponse result = GSON.fromJson(response, WorldsResponse.class);

		return result;
	}

	/*
	 * List of world groups, as well as what data is available
	 * https://api.mentemori.icu/wgroups
	 */
	public static WorldGroupsResponse getWorldGroups() {

		String response = HttpUtils.readResponse(API_URL + "wgroups", null);
		WorldGroupsResponse result = GSON.fromJson(response, WorldGroupsResponse.class);

		return result;
	}

	/*
	 * Player rankings for a world. Includes BP, Player Rank, Story, and Tower
	 * rankings. 
	 * https://api.mentemori.icu/[world_id]/player_ranking/latest
	 */
	public static PlayerRankingResponse getPlayerRanking(int worldId) {

		String response = HttpUtils.readResponse(API_URL + worldId + "/player_ranking/latest", null);
		PlayerRankingResponse result = GSON.fromJson(response, PlayerRankingResponse.class);

		return result;
	}

	/*
	 * Guild rankings for a world. Includes BP, Guild Level, and Guild Stock
	 * rankings. 
	 * https://api.mentemori.icu/[world_id]/guild_ranking/latest
	 */
	public static GuildRankingResponse getGuildRanking(int worldId) {

		String response = HttpUtils.readResponse(API_URL + worldId + "/guild_ranking/latest", null);

		/*
		 * Json in Guild Ranking is broken and needs to be fixed by making it a
		 * JsonObject.class Converting to json with String as response will result in an
		 * error with duplicate keys
		 */
		GuildRankingResponse result = GSON.fromJson(GSON.fromJson(response, JsonObject.class),
				GuildRankingResponse.class);

		return result;
	}
	
	/*
	 * Temple data for a world.
	 * https://api.mentemori.icu/[world_id]/temple/latest
	 */
	public static TempleResponse getTemple(int worldId) {

		String response = HttpUtils.readResponse(API_URL + worldId + "/temple/latest", null);
		TempleResponse result = GSON.fromJson(response, TempleResponse.class);

		return result;
	}
}
