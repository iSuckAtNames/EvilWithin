package automaton.cards;

import automaton.AutomatonMod;
import automaton.powers.NextFunctionFreePower;
import automaton.powers.NextFunctionNoExhaustPower;
import automaton.powers.RemoveNextErrorPower;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class Overheat extends AbstractBronzeCard {

    public final static String ID = makeID("Overheat");

    //stupid intellij stuff attack, enemy, common

    private static final int DAMAGE = 18;
    private static final int UPG_DAMAGE = 6;

    public Overheat() {
        super(ID, 2, CardType.ATTACK, CardRarity.COMMON, CardTarget.ENEMY);
        baseDamage = DAMAGE;
        baseMagicNumber = magicNumber = 1;
        AutomatonMod.loadJokeCardImage(this, AutomatonMod.makeBetaCardPath("Overheat.png"));
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        dmg(m, AbstractGameAction.AttackEffect.FIRE);
        applyToSelf(new NextFunctionFreePower(magicNumber));
    }

    public void upp() {
        upgradeDamage(UPG_DAMAGE);
    }
}