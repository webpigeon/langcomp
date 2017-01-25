import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by webpigeon on 25/01/17.
 */
public class CalculatorListener extends calculatorBaseListener {

    @Override
    public void enterNumber(@NotNull calculatorParser.NumberContext ctx) {
        System.out.println("found number: "+ctx.getText());
    }

    @Override
    public void enterExpression(@NotNull calculatorParser.ExpressionContext ctx) {
        System.out.println("found expression: "+ctx.getText()+" depth: "+ctx.depth());
    }
}
