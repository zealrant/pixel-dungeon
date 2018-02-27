package com.watabou.pixeldungeon.actors.mobs.npcs;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.scenes.GameScene;
import com.watabou.pixeldungeon.windows.WndFortuneTeller;

public class FortuneTeller extends NPC {

	@Override
	public void interact() {
		GameScene.show( new WndFortuneTeller( this, Dungeon.hero ) );

	}

	public static String verify(Item item, Item item2) {
		// TODO Auto-generated method stub
		return null;
	}

}
