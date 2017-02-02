import myGrammar.CalculatorBaseListener;
import myGrammar.CalculatorParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by webpigeon on 25/01/17.
 */
public class MyCalculatorListener extends CalculatorBaseListener {

    @Override
    public void enterNumber(@NotNull CalculatorParser.NumberContext ctx) {
        System.out.println("found number: "+ctx.getText());
    }

    @Override
    public void enterExpression(@NotNull CalculatorParser.ExpressionContext ctx) {
        System.out.println("found expression: "+ctx.getText()+" depth: "+ctx.depth());
    }
}
