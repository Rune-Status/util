package util.flagviewer;

enum Flag {
	WALL_NORTHWEST(Flags.WALL_NORTHWEST),
	WALL_NORTH(Flags.WALL_NORTH),
	WALL_NORTHEAST(Flags.WALL_NORTHEAST),
	WALL_EAST(Flags.WALL_EAST),
	WALL_SOUTHEAST(Flags.WALL_SOUTHEAST),
	WALL_SOUTH(Flags.WALL_SOUTH),
	WALL_SOUTHWEST(Flags.WALL_SOUTHWEST),
	WALL_WEST(Flags.WALL_WEST),
	OBJECT_TILE(Flags.OBJECT_TILE),
	WALL_BLOCK_NORTHWEST(Flags.WALL_BLOCK_NORTHWEST),
	WALL_BLOCK_NORTH(Flags.WALL_BLOCK_NORTH),
	WALL_BLOCK_NORTHEAST(Flags.WALL_BLOCK_NORTHEAST),
	WALL_BLOCK_EAST(Flags.WALL_BLOCK_EAST),
	WALL_BLOCK_SOUTHEAST(Flags.WALL_BLOCK_SOUTHEAST),
	WALL_BLOCK_SOUTH(Flags.WALL_BLOCK_SOUTH),
	WALL_BLOCK_SOUTHWEST(Flags.WALL_BLOCK_SOUTHWEST),
	WALL_BLOCK_WEST(Flags.WALL_BLOCK_WEST),
	OBJECT_BLOCK(Flags.OBJECT_BLOCK),
	DECORATION_BLOCK(Flags.DECORATION_BLOCK),
	WALL_ALLOW_RANGE_NORTHWEST(Flags.WALL_ALLOW_RANGE_NORTHWEST),
	WALL_ALLOW_RANGE_NORTH(Flags.WALL_ALLOW_RANGE_NORTH),
	WALL_ALLOW_RANGE_NORTHEAST(Flags.WALL_ALLOW_RANGE_NORTHEAST),
	WALL_ALLOW_RANGE_EAST(Flags.WALL_ALLOW_RANGE_EAST),
	WALL_ALLOW_RANGE_SOUTHEAST(Flags.WALL_ALLOW_RANGE_SOUTHEAST),
	WALL_ALLOW_RANGE_SOUTH(Flags.WALL_ALLOW_RANGE_SOUTH),
	WALL_ALLOW_RANGE_SOUTHWEST(Flags.WALL_ALLOW_RANGE_SOUTHWEST),
	WALL_ALLOW_RANGE_WEST(Flags.WALL_ALLOW_RANGE_WEST),
	OBJECT_ALLOW_RANGE(Flags.OBJECT_ALLOW_RANGE),
	BLOCKED(Flags.BLOCKED),

	WATER_BLOCK(0x200000);

	private final int mask;

	private Flag(int mask) {
		this.mask = mask;
	}

	int getMask() {
		return mask;
	}

	static Flag getFlag(final long value) {
		for (final Flag flag : Flag.values()) {
			if (flag.getMask() == value) {
				return flag;
			}
		}
		return null;
	}

}
