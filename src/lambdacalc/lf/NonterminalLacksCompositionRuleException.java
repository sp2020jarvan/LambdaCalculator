package lambdacalc.lf;

public class NonterminalLacksCompositionRuleException extends MeaningEvaluationException {

    public NonterminalLacksCompositionRuleException(Nonterminal  nonterminal) {
        super("The nonterminal " + (nonterminal.getLabel() == null ? nonterminal.toString() : nonterminal.getLabel()) + " has not been assigned a composition rule.");
    }

}