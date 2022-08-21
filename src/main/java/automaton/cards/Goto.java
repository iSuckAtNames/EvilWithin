package automaton.cards;

import automaton.AutomatonMod;
import automaton.cards.encodedcards.EncodedInsight;
import com.megacrit.cardcrawl.actions.common.DrawCardAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class Goto extends AbstractBronzeCard {

    public final static String ID = makeID("Goto");

    //stupid intellij stuff skill, self, basic

    public Goto() {
        super(ID, 1, CardType.SKILL, CardRarity.BASIC, CardTarget.SELF);
        baseMagicNumber = magicNumber = 2;
        cardsToPreview = new EncodedInsight();

        tags.add(AutomatonMod.ENCODES);
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        atb(new DrawCardAction(magicNumber));
        addCardToFunction(cardsToPreview.makeStatEquivalentCopy());
    }

    public void upp() {
        upgradeMagicNumber(1);
        rawDescription = UPGRADE_DESCRIPTION;
        cardsToPreview.upgrade();
        initializeDescription();
    }
}