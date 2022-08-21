package automaton.cards;

import automaton.AutomatonMod;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class DefendPrimer extends AbstractBronzeCard {

    public final static String ID = makeID("DefendPrimer");

    //stupid intellij stuff attack, enemy, special

    private static final int DAMAGE = 5;
    private static final int UPG_DAMAGE = 2;

    public DefendPrimer() {
        super(ID, 0, CardType.SKILL, CardRarity.SPECIAL, CardTarget.ENEMY, CardColor.COLORLESS);
        AutomatonMod.loadJokeCardImage(this, AutomatonMod.makeBetaCardPath("MinorBeam.png"));
        isEthereal = true;
        exhaust = true;
        cardsToPreview = new Defend();
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        addCardToFunction(cardsToPreview.makeStatEquivalentCopy());
    }

    public void upp() {
        rawDescription = UPGRADE_DESCRIPTION;
        initializeDescription();
        cardsToPreview.upgrade();
    }
}