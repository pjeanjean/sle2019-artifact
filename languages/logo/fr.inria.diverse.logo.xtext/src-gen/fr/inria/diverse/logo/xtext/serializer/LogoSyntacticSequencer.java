/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package fr.inria.diverse.logo.xtext.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.logo.xtext.services.LogoGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LogoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LogoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_NotOpposite_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_NotOpposite_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LogoGrammarAccess) access;
		match_NotOpposite_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0());
		match_NotOpposite_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_NotOpposite_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_NotOpposite_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NotOpposite_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_NotOpposite_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=NotOpposite
	 *     (rule start) (ambiguity) ':' name=ID
	 *     (rule start) (ambiguity) 'and' expressions+=EqualsGreaterLower
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'not' expression=NotOpposite
	 *     (rule start) (ambiguity) 'or' expressions+=EqualsGreaterLower
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {Div.leftExpression=}
	 *     (rule start) (ambiguity) {Equals.leftExpression=}
	 *     (rule start) (ambiguity) {Greater.leftExpression=}
	 *     (rule start) (ambiguity) {Lower.leftExpression=}
	 *     (rule start) (ambiguity) {Minus.leftExpression=}
	 *     (rule start) (ambiguity) {Mult.leftExpression=}
	 *     (rule start) (ambiguity) {Plus.leftExpression=}
	 */
	protected void emit_NotOpposite_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'and' expressions+=EqualsGreaterLower
	 *     (rule start) (ambiguity) 'or' expressions+=EqualsGreaterLower
	 *     (rule start) (ambiguity) {Div.leftExpression=}
	 *     (rule start) (ambiguity) {Equals.leftExpression=}
	 *     (rule start) (ambiguity) {Greater.leftExpression=}
	 *     (rule start) (ambiguity) {Lower.leftExpression=}
	 *     (rule start) (ambiguity) {Minus.leftExpression=}
	 *     (rule start) (ambiguity) {Mult.leftExpression=}
	 *     (rule start) (ambiguity) {Plus.leftExpression=}
	 */
	protected void emit_NotOpposite_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
