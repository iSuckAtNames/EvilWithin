//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package champ.actions;

import champ.ChampMod;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.helpers.GetAllInBattleInstances;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class OpenerReduceCostAction extends AbstractGameAction {
    UUID uuid;
    private AbstractCard card = null;

    public OpenerReduceCostAction() {

    }

    public void update() {

        if (AbstractDungeon.player.hand.size() > 0){
            ArrayList<AbstractCard> validCards = new ArrayList<>();


            for (AbstractCard c : AbstractDungeon.player.hand.group){
                if (c.costForTurn > 0){
                    if (!c.hasTag(ChampMod.OPENER)){
                        validCards.add(c);
                    }
                }
            }

            if (validCards.size() > 0){
                card = validCards.get(AbstractDungeon.cardRng.random(0,validCards.size() - 1));
            }
        }
        if (card != null) {

            card.costForTurn = card.costForTurn - 1;
            card.isCostModifiedForTurn = true;
        }

        this.isDone = true;
    }
}
