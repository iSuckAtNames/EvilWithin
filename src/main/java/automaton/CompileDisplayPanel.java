package automaton;

import automaton.cards.AbstractBronzeCard;
import com.megacrit.cardcrawl.cards.AbstractCard;

public class CompileDisplayPanel extends EasyInfoDisplayPanel {

    public CompileDisplayPanel() {
        super(600, 900, 200);
    } // NOTE: X, Y, Width are all multipled by settings.scale on constructor, so use values like this.

    @Override
    public String getTitle() {
        return "When Compiled:";
    }

    @Override
    public String getDescription() {
        boolean flip = false;
        StringBuilder s = new StringBuilder();
        if (FunctionHelper.held != null && FunctionHelper.doStuff)
            for (AbstractCard card : FunctionHelper.held.group) {
                if (card.hasTag(AutomatonMod.SPECIAL_COMPILE_TEXT) && card instanceof AbstractBronzeCard) {
                    String x = ((AbstractBronzeCard) card).getSpecialCompileText();
                    if (!x.equals("")) {
                        flip = true;
                        s.append(((AbstractBronzeCard) card).getSpecialCompileText());
                        s.append(" NL ");
                    }
                }
                else if (card.rawDescription.contains("bronze:Compile")) {
                    flip = true;
                    String[] splitText = card.rawDescription.split("bronze:Compile");
                    String compileText = splitText[1];
                    s.append(compileText.replaceAll("bronze:", "#y").replaceAll("!D!", String.valueOf(card.damage)).replaceAll("!B!", String.valueOf(card.block)).replaceAll("!M!", String.valueOf(card.magicNumber)).replaceAll("!bauto!", (String.valueOf(((AbstractBronzeCard) card).auto))).replace("*", "#y"));
                    //TODO: Get this to recognize regular keywords and #y them? Not too necessary.
                    s.append(" NL ");
                }
            }
        if (!flip) {
            return "NORENDER";
        }
        return s.toString();
    }

    @Override
    public RENDER_TIMING getTiming() {
        return RENDER_TIMING.TIMING_ENERGYPANEL_RENDER;
    }
}
