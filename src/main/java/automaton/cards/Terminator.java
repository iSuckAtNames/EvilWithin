package automaton.cards;

import automaton.AutomatonChar;
import automaton.AutomatonMod;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class Terminator extends AbstractBronzeCard {

    public final static String ID = makeID("Terminator");

    //stupid intellij stuff attack, enemy, common

    private static final int DAMAGE = 5;
    private static final int UPG_DAMAGE = 2;

    public Terminator() {
        super(ID, 1, CardType.ATTACK, CardRarity.COMMON, CardTarget.ENEMY);
        baseDamage = DAMAGE;
        thisEncodes();
        tags.add(AutomatonMod.SPECIAL_COMPILE_TEXT);
    }

    @Override
    public void onCompilePreCardEffectEmbed(boolean forGameplay) {
        if (lastCard() && forGameplay) {
            baseDamage *= 2;
            damage *= 2;
        }
    }

    @Override
    public String getSpecialCompileText() {
        if (lastCard()) {
            return " - #yTerminator doubles its damage.";
        }
        return "";
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        dmg(m, AbstractGameAction.AttackEffect.LIGHTNING);
    }

    public void upp() {
        upgradeDamage(UPG_DAMAGE);
    }
}