package me.eldodebug.mentemori.response.data;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class GuildRankingData {

	@SerializedName("world_id")
	public long worldId;

	@SerializedName("rankings")
	public Ranking rankings;

	@SerializedName("guild_info")
	public Map<String, GuildInfo> guildInfo;

	public GuildRankingData(long worldId, Ranking rankings, Map<String, GuildInfo> guildInfo) {
		this.worldId = worldId;
		this.rankings = rankings;
		this.guildInfo = guildInfo;
	}

	public static final class Ranking {

		@SerializedName("bp")
		public List<BpRanking> bpRanking;

		@SerializedName("level")
		public List<LevelRanking> levelRanking;

		@SerializedName("stock")
		public List<StockRanking> stockRanking;

		public Ranking(List<BpRanking> bpRanking, List<LevelRanking> levelRanking, List<StockRanking> stockRanking) {
			this.bpRanking = bpRanking;
			this.levelRanking = levelRanking;
			this.stockRanking = stockRanking;
		}

		public static final class BpRanking extends RankingBase {

			@SerializedName("bp")
			public BigInteger bp;

			public BpRanking(int id, String name, BigInteger bp) {
				super(id, name);
				this.bp = bp;
			}
		}

		public static final class LevelRanking extends RankingBase {

			@SerializedName("level")
			public int level;

			public LevelRanking(long id, String name, int level) {
				super(id, name);
				this.level = level;
			}
		}

		public static final class StockRanking extends RankingBase {

			@SerializedName("stock")
			public int stock;

			public StockRanking(long id, String name, int stock) {
				super(id, name);
				this.stock = stock;
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

	public static final class GuildInfo {

		@SerializedName("id")
		public long id;

		@SerializedName("name")
		public String name;

		@SerializedName("bp")
		public BigInteger bp;

		@SerializedName("level")
		public int level;

		@SerializedName("stock")
		public int stock;

		@SerializedName("exp")
		public int exp;

		@SerializedName("num_members")
		public int numMenbers;

		@SerializedName("leader_id")
		public long leaderId;

		@SerializedName("leader_name")
		public String leaderName;

		@SerializedName("policy")
		public int policy;

		@SerializedName("description")
		public String description;

		@SerializedName("free_join")
		public boolean freeJoin;

		@SerializedName("bp_requirement")
		public int bpRequirement;

		public GuildInfo(long id, String name, BigInteger bp, int level, int stock, int exp, int numMenbers, long leaderId,
				String leaderName, int policy, String description, boolean freeJoin, int bpRequirement) {
			this.id = id;
			this.name = name;
			this.bp = bp;
			this.level = level;
			this.stock = stock;
			this.exp = exp;
			this.numMenbers = numMenbers;
			this.leaderId = leaderId;
			this.leaderName = leaderName;
			this.policy = policy;
			this.description = description;
			this.freeJoin = freeJoin;
			this.bpRequirement = bpRequirement;
		}
	}
}
