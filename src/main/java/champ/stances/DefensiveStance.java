package champ.stances;

import champ.ChampChar;
import champ.ChampMod;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;
import com.megacrit.cardcrawl.actions.animations.VFXAction;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.actions.common.ReducePowerAction;
import com.megacrit.cardcrawl.actions.watcher.ChangeStanceAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.ThornsPower;
import com.megacrit.cardcrawl.stances.AbstractStance;
import com.megacrit.cardcrawl.stances.NeutralStance;
import com.megacrit.cardcrawl.vfx.BorderFlashEffect;
import com.megacrit.cardcrawl.vfx.combat.IntenseZoomEffect;
import com.megacrit.cardcrawl.vfx.stance.StanceAuraEffect;
import guardian.GuardianMod;
import guardian.characters.GuardianCharacter;
import guardian.powers.DefensiveModeBooster;
import guardian.powers.DontLeaveDefensiveModePower;
import guardian.relics.DefensiveModeMoreBlock;
import guardian.vfx.DefensiveModeStanceParticleEffect;

public class DefensiveStance extends AbstractChampStance {

    public static final String STANCE_ID = "champ:DefensiveStance";
    private static long sfxId = -1L;

    public DefensiveStance() {
        this.ID = STANCE_ID;// 21
        this.name = ChampChar.characterStrings.TEXT[4];
        this.updateDescription();// 23
    }// 24

    @Override
    public void onEnterStance() {
        super.onEnterStance();
    }

    @Override
    public void onExitStance() {
        super.onExitStance();
    }


    @Override
    public void updateDescription() {
        this.description = ChampChar.characterStrings.TEXT[7];
    }
}
