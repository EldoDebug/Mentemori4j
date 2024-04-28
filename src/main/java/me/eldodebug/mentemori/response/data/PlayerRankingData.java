package me.eldodebug.mentemori.response.data;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class PlayerRankingData {

	@SerializedName("world_id")
	public long worldId;

	@SerializedName("rankings")
	public Ranking rankings;

	@SerializedName("player_info")
	public Map<String, PlayerInfo> playerInfo;

	public PlayerRankingData(long worldId, Ranking rankings, Map<String, PlayerInfo> playerInfo) {
		this.worldId = worldId;
		this.rankings = rankings;
		this.playerInfo = playerInfo;
	}

	public static final class Ranking {

		@SerializedName("bp")
		public List<BpRanking> bpRanking;

		@SerializedName("rank")
		public List<RankRanking> rankRanking;

		@SerializedName("quest")
		public List<QuestRanking> questRanking;

		@SerializedName("tower")
		public List<TowerRanking> towerRanking;

		@SerializedName("tower_red")
		public List<TowerRanking> towerRedRanking;

		@SerializedName("tower_green")
		public List<TowerRanking> towerGreenRanking;

		@SerializedName("tower_blue")
		public List<TowerRanking> towerBlueRanking;

		@SerializedName("tower_yellow")
		public List<TowerRanking> towerYellowRanking;

		public Ranking(List<BpRanking> bpRanking, List<RankRanking> rankRanking, List<QuestRanking> questRanking,
				List<TowerRanking> towerRanking, List<TowerRanking> towerRedRanking,
				List<TowerRanking> towerGreenRanking, List<TowerRanking> towerBlueRanking,
				List<TowerRanking> towerYellowRanking) {
			this.bpRanking = bpRanking;
			this.rankRanking = rankRanking;
			this.questRanking = questRanking;
			this.towerRanking = towerRanking;
			this.towerRedRanking = towerRedRanking;
			this.towerGreenRanking = towerGreenRanking;
			this.towerBlueRanking = towerBlueRanking;
			this.towerYellowRanking = towerYellowRanking;
		}

		public static final class BpRanking extends RankingBase {

			@SerializedName("bp")
			public int bp;

			public BpRanking(int id, String name, int bp) {
				super(id, name);
				this.bp = bp;
			}
		}

		public static final class RankRanking extends RankingBase {

			@SerializedName("rank")
			public int rank;

			public RankRanking(long id, String name, int rank) {
				super(id, name);
				this.rank = rank;
			}
		}

		public static final class QuestRanking extends RankingBase {

			@SerializedName("quest_id")
			public long questId;

			public QuestRanking(long id, String name, long questId) {
				super(id, name);
				this.questId = questId;
			}
		}

		public static final class TowerRanking extends RankingBase {

			@SerializedName("tower_id")
			public long towerId;

			public TowerRanking(long id, String name, long towerId) {
				super(id, name);
				this.towerId = towerId;
			}
		}

		public static class RankingBase {

			@SerializedName("id")
			public long id;

			@SerializedName("name")
			public String name;

			public RankingBase(long id, String name) {
				this.id = id;
				this.name = name;
			}
		}
	}

	public static class PlayerInfo {

		@SerializedName("id")
		public long id;

		@SerializedName("name")
		public String name;

		@SerializedName("bp")
		public BigInteger bp;

		@SerializedName("rank")
		public int rank;

		@SerializedName("quest_id")
		public long questId;

		@SerializedName("tower_id")
		public long towerId;

		@SerializedName("icon_id")
		public long iconId;

		@SerializedName("guild_id")
		public long guildId;

		@SerializedName("guild_name")
		public String guildName;

		@SerializedName("guild_join_time")
		public long guildJoinTime;

		@SerializedName("guild_position")
		public int guildPosition;

		@SerializedName("prev_legend_league_class")
		public int prevLegendLeagueClass;

		public PlayerInfo(long id, String name, BigInteger bp, int rank, long questId, long towerId, long iconId, long guildId,
				String guildName, long guildJoinTime, int guildPosition, int prevLegendLeagueClass) {
			this.id = id;
			this.name = name;
			this.bp = bp;
			this.rank = rank;
			this.questId = questId;
			this.towerId = towerId;
			this.iconId = iconId;
			this.guildId = guildId;
			this.guildName = guildName;
			this.guildJoinTime = guildJoinTime;
			this.guildPosition = guildPosition;
			this.prevLegendLeagueClass = prevLegendLeagueClass;
		}
	}
}
