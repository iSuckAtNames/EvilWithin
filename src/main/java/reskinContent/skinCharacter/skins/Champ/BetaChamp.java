package reskinContent.skinCharacter.skins.Champ;

import champ.ChampChar;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import reskinContent.skinCharacter.AbstractSkin;

public class BetaChamp extends AbstractSkin {

    public BetaChamp() {
        this.NAME = CardCrawlGame.languagePack.getUIString("reskinContent:ReSkinChamp").TEXT[1];
        this.DESCRIPTION = CardCrawlGame.languagePack.getCharacterString(ChampChar.ID).TEXT[0];
        this.portraitStatic_IMG = ImageMaster.loadImage("reskinContent/img/ChampMod/BetaChamp/portrait_beta.png");
        this.SHOULDER1 = "champResources/images/char/mainChar/shoulder.png";
        this.SHOULDER2 = "champResources/images/char/mainChar/shoulderR.png";
        this.CORPSE = "champResources/images/char/mainChar/corpse.png";
        this.atlasURL = "reskinContent/img/ChampMod/BetaChamp/animation/BetaChamp.atlas";
        this.jsonURL = "reskinContent/img/ChampMod/BetaChamp/animation/BetaChamp.json";
        this.renderscale = 1.0f;
    }
}

