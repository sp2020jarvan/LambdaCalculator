/*
 * Forall.java
 *
 * Created on May 29, 2006, 3:35 PM
 */

package lambdacalc.logic;

/**
 * The universal quantifier.
 */
public class ForAll extends PropositionalBinder {
    /**
     * The unicode universal quantifier symbol.
     */
    public static final char SYMBOL = '\u2200';
    
    /**
     * Constructs the binder.
     * @param ident the identifier the binder binds, which may
     * be a constant to capture student errors.
     * @param innerExpr the inner expression
     * @param hasPeriod indicates whether this binder's string
     * representation includes a period after the identifier.
     */
    public ForAll(Identifier ident, Expr innerExpr, boolean hasPeriod) {
        super(ident, innerExpr, hasPeriod);
    }    

    public String getSymbol() {
        return String.valueOf(SYMBOL);
    }

    protected Binder create(Identifier variable, Expr inner) {
        return new ForAll(variable, inner, hasPeriod());
    }
}