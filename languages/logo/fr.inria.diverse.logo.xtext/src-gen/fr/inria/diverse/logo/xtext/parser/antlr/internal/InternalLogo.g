/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
grammar InternalLogo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.inria.diverse.logo.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.inria.diverse.logo.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.logo.xtext.services.LogoGrammarAccess;

}

@parser::members {

 	private LogoGrammarAccess grammarAccess;

    public InternalLogoParser(TokenStream input, LogoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Logo";
   	}

   	@Override
   	protected LogoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLogo
entryRuleLogo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLogoRule()); }
	iv_ruleLogo=ruleLogo
	{ $current=$iv_ruleLogo.current; }
	EOF;

// Rule Logo
ruleLogo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLogoAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLogoRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"fr.inria.diverse.logo.xtext.Logo.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getColonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getRightParserRuleCall_0());
		}
		this_Right_0=ruleRight
		{
			$current = $this_Right_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getLeftParserRuleCall_1());
		}
		this_Left_1=ruleLeft
		{
			$current = $this_Left_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getForwardParserRuleCall_2());
		}
		this_Forward_2=ruleForward
		{
			$current = $this_Forward_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getPenDownParserRuleCall_3());
		}
		this_PenDown_3=rulePenDown
		{
			$current = $this_PenDown_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getPenUpParserRuleCall_4());
		}
		this_PenUp_4=rulePenUp
		{
			$current = $this_PenUp_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getProcedureDefinitionParserRuleCall_5());
		}
		this_ProcedureDefinition_5=ruleProcedureDefinition
		{
			$current = $this_ProcedureDefinition_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getProcedureCallParserRuleCall_6());
		}
		this_ProcedureCall_6=ruleProcedureCall
		{
			$current = $this_ProcedureCall_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_7());
		}
		this_ControlStatement_7=ruleControlStatement
		{
			$current = $this_ControlStatement_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_8());
		}
		this_Block_8=ruleBlock
		{
			$current = $this_Block_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getEqualsGreaterLowerParserRuleCall_0());
		}
		this_EqualsGreaterLower_0=ruleEqualsGreaterLower
		{
			$current = $this_EqualsGreaterLower_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getExtendedExpressionParserRuleCall_1());
		}
		this_ExtendedExpression_1=ruleExtendedExpression
		{
			$current = $this_ExtendedExpression_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExtendedExpression
entryRuleExtendedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendedExpressionRule()); }
	iv_ruleExtendedExpression=ruleExtendedExpression
	{ $current=$iv_ruleExtendedExpression.current; }
	EOF;

// Rule ExtendedExpression
ruleExtendedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExtendedExpressionAccess().getOrParserRuleCall_0());
		}
		this_Or_0=ruleOr
		{
			$current = $this_Or_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExtendedExpressionAccess().getAndParserRuleCall_1());
		}
		this_And_1=ruleAnd
		{
			$current = $this_And_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConstantAccess().getIntValueParserRuleCall_0());
		}
		this_IntValue_0=ruleIntValue
		{
			$current = $this_IntValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConstantAccess().getBoolValueParserRuleCall_1());
		}
		this_BoolValue_1=ruleBoolValue
		{
			$current = $this_BoolValue_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRight
entryRuleRight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightRule()); }
	iv_ruleRight=ruleRight
	{ $current=$iv_ruleRight.current; }
	EOF;

// Rule Right
ruleRight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='right'
		{
			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRightAccess().getAngleExpressionParserRuleCall_1_0());
				}
				lv_angle_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRule());
					}
					set(
						$current,
						"angle",
						lv_angle_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLeft
entryRuleLeft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeftRule()); }
	iv_ruleLeft=ruleLeft
	{ $current=$iv_ruleLeft.current; }
	EOF;

// Rule Left
ruleLeft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='left'
		{
			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLeftKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLeftAccess().getAngleExpressionParserRuleCall_1_0());
				}
				lv_angle_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLeftRule());
					}
					set(
						$current,
						"angle",
						lv_angle_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleForward
entryRuleForward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForwardRule()); }
	iv_ruleForward=ruleForward
	{ $current=$iv_ruleForward.current; }
	EOF;

// Rule Forward
ruleForward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='forward'
		{
			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForwardAccess().getStepExpressionParserRuleCall_1_0());
				}
				lv_step_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForwardRule());
					}
					set(
						$current,
						"step",
						lv_step_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePenDown
entryRulePenDown returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPenDownRule()); }
	iv_rulePenDown=rulePenDown
	{ $current=$iv_rulePenDown.current; }
	EOF;

// Rule PenDown
rulePenDown returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPenDownAccess().getPenDownAction_0(),
					$current);
			}
		)
		otherlv_1='pendown'
		{
			newLeafNode(otherlv_1, grammarAccess.getPenDownAccess().getPendownKeyword_1());
		}
	)
;

// Entry rule entryRulePenUp
entryRulePenUp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPenUpRule()); }
	iv_rulePenUp=rulePenUp
	{ $current=$iv_rulePenUp.current; }
	EOF;

// Rule PenUp
rulePenUp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPenUpAccess().getPenUpAction_0(),
					$current);
			}
		)
		otherlv_1='penup'
		{
			newLeafNode(otherlv_1, grammarAccess.getPenUpAccess().getPenupKeyword_1());
		}
	)
;

// Entry rule entryRuleProcedureDefinition
entryRuleProcedureDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcedureDefinitionRule()); }
	iv_ruleProcedureDefinition=ruleProcedureDefinition
	{ $current=$iv_ruleProcedureDefinition.current; }
	EOF;

// Rule ProcedureDefinition
ruleProcedureDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='to'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcedureDefinitionAccess().getToKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcedureDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcedureDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureDefinitionAccess().getParametersParameterParserRuleCall_2_0());
				}
				lv_parameters_2_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureDefinitionRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_2_0,
						"fr.inria.diverse.logo.xtext.Logo.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureDefinitionAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureDefinitionRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"fr.inria.diverse.logo.xtext.Logo.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getProcedureDefinitionAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleProcedureCall
entryRuleProcedureCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcedureCallRule()); }
	iv_ruleProcedureCall=ruleProcedureCall
	{ $current=$iv_ruleProcedureCall.current; }
	EOF;

// Rule ProcedureCall
ruleProcedureCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcedureCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureCallAccess().getParameterValuesExpressionParserRuleCall_1_0());
				}
				lv_parameterValues_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureCallRule());
					}
					add(
						$current,
						"parameterValues",
						lv_parameterValues_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	iv_ruleBlock=ruleBlock
	{ $current=$iv_ruleBlock.current; }
	EOF;

// Rule Block
ruleBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
				}
				lv_statements_1_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlockRule());
					}
					add(
						$current,
						"statements",
						lv_statements_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_2=']'
		{
			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleControlStatement
entryRuleControlStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getControlStatementRule()); }
	iv_ruleControlStatement=ruleControlStatement
	{ $current=$iv_ruleControlStatement.current; }
	EOF;

// Rule ControlStatement
ruleControlStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getIfParserRuleCall_0());
		}
		this_If_0=ruleIf
		{
			$current = $this_If_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getIfElseParserRuleCall_1());
		}
		this_IfElse_1=ruleIfElse
		{
			$current = $this_IfElse_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getWhileParserRuleCall_2());
		}
		this_While_2=ruleWhile
		{
			$current = $this_While_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getRepeatParserRuleCall_3());
		}
		this_Repeat_3=ruleRepeat
		{
			$current = $this_Repeat_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_0_0());
					}
					lv_condition_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfRule());
						}
						set(
							$current,
							"condition",
							lv_condition_1_0,
							"fr.inria.diverse.logo.xtext.Logo.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftSquareBracketKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_1_1_0());
						}
						lv_condition_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfRule());
							}
							set(
								$current,
								"condition",
								lv_condition_3_0,
								"fr.inria.diverse.logo.xtext.Logo.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=']'
				{
					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getRightSquareBracketKeyword_1_1_2());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_2_0());
				}
				lv_ifBlock_5_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"ifBlock",
						lv_ifBlock_5_0,
						"fr.inria.diverse.logo.xtext.Logo.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIfElse
entryRuleIfElse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfElseRule()); }
	iv_ruleIfElse=ruleIfElse
	{ $current=$iv_ruleIfElse.current; }
	EOF;

// Rule IfElse
ruleIfElse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ifelse'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfelseKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0_0());
					}
					lv_condition_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfElseRule());
						}
						set(
							$current,
							"condition",
							lv_condition_1_0,
							"fr.inria.diverse.logo.xtext.Logo.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getLeftSquareBracketKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_1_1_0());
						}
						lv_condition_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfElseRule());
							}
							set(
								$current,
								"condition",
								lv_condition_3_0,
								"fr.inria.diverse.logo.xtext.Logo.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=']'
				{
					newLeafNode(otherlv_4, grammarAccess.getIfElseAccess().getRightSquareBracketKeyword_1_1_2());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIfElseAccess().getIfBlockBlockParserRuleCall_2_0());
				}
				lv_ifBlock_5_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfElseRule());
					}
					set(
						$current,
						"ifBlock",
						lv_ifBlock_5_0,
						"fr.inria.diverse.logo.xtext.Logo.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIfElseAccess().getElseBlockBlockParserRuleCall_3_0());
				}
				lv_elseBlock_6_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfElseRule());
					}
					set(
						$current,
						"elseBlock",
						lv_elseBlock_6_0,
						"fr.inria.diverse.logo.xtext.Logo.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWhile
entryRuleWhile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileRule()); }
	iv_ruleWhile=ruleWhile
	{ $current=$iv_ruleWhile.current; }
	EOF;

// Rule While
ruleWhile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0_0());
					}
					lv_condition_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhileRule());
						}
						set(
							$current,
							"condition",
							lv_condition_1_0,
							"fr.inria.diverse.logo.xtext.Logo.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getLeftSquareBracketKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_1_1_0());
						}
						lv_condition_3_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWhileRule());
							}
							set(
								$current,
								"condition",
								lv_condition_3_0,
								"fr.inria.diverse.logo.xtext.Logo.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=']'
				{
					newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getRightSquareBracketKeyword_1_1_2());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0());
				}
				lv_block_5_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"block",
						lv_block_5_0,
						"fr.inria.diverse.logo.xtext.Logo.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRepeat
entryRuleRepeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRepeatRule()); }
	iv_ruleRepeat=ruleRepeat
	{ $current=$iv_ruleRepeat.current; }
	EOF;

// Rule Repeat
ruleRepeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='repeat'
		{
			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRepeatAccess().getConditionExpressionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRepeatRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"fr.inria.diverse.logo.xtext.Logo.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0());
				}
				lv_block_2_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRepeatRule());
					}
					set(
						$current,
						"block",
						lv_block_2_0,
						"fr.inria.diverse.logo.xtext.Logo.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='and'
		{
			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0());
				}
				lv_expressions_1_0=ruleEqualsGreaterLower
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_1_0,
						"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			((
				(
					ruleEqualsGreaterLower
				)
			)
			)=>
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0());
					}
					lv_expressions_2_0=ruleEqualsGreaterLower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_2_0,
							"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	iv_ruleOr=ruleOr
	{ $current=$iv_ruleOr.current; }
	EOF;

// Rule Or
ruleOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='or'
		{
			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0());
				}
				lv_expressions_1_0=ruleEqualsGreaterLower
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_1_0,
						"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			((
				(
					ruleEqualsGreaterLower
				)
			)
			)=>
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0());
					}
					lv_expressions_2_0=ruleEqualsGreaterLower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_2_0,
							"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleEqualsGreaterLower
entryRuleEqualsGreaterLower returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualsGreaterLowerRule()); }
	iv_ruleEqualsGreaterLower=ruleEqualsGreaterLower
	{ $current=$iv_ruleEqualsGreaterLower.current; }
	EOF;

// Rule EqualsGreaterLower
ruleEqualsGreaterLower returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualsGreaterLowerAccess().getPlusMinusParserRuleCall_0());
		}
		this_PlusMinus_0=rulePlusMinus
		{
			$current = $this_PlusMinus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getEqualsGreaterLowerAccess().getEqualsLeftExpressionAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='='
					{
						newLeafNode(otherlv_2, grammarAccess.getEqualsGreaterLowerAccess().getEqualsSignKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getEqualsGreaterLowerAccess().getGreaterLeftExpressionAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='>'
					{
						newLeafNode(otherlv_4, grammarAccess.getEqualsGreaterLowerAccess().getGreaterThanSignKeyword_1_0_1_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getEqualsGreaterLowerAccess().getLowerLeftExpressionAction_1_0_2_0(),
								$current);
						}
					)
					otherlv_6='<'
					{
						newLeafNode(otherlv_6, grammarAccess.getEqualsGreaterLowerAccess().getLessThanSignKeyword_1_0_2_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionPlusMinusParserRuleCall_1_1_0());
					}
					lv_rightExpression_7_0=rulePlusMinus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEqualsGreaterLowerRule());
						}
						set(
							$current,
							"rightExpression",
							lv_rightExpression_7_0,
							"fr.inria.diverse.logo.xtext.Logo.PlusMinus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); }
	iv_rulePlusMinus=rulePlusMinus
	{ $current=$iv_rulePlusMinus.current; }
	EOF;

// Rule PlusMinus
rulePlusMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
		}
		this_MultDiv_0=ruleMultDiv
		{
			$current = $this_MultDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			((
				(
					(
						(
						)
						'+'
					)
					    |
					(
						(
						)
						'-'
					)
				)
				(
					(
						ruleMultDiv
					)
				)
			)
			)=>
			(
				(
					(
						(
							{
								$current = forceCreateModelElementAndSet(
									grammarAccess.getPlusMinusAccess().getPlusLeftExpressionAction_1_0_0_0_0(),
									$current);
							}
						)
						otherlv_2='+'
						{
							newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_0_1());
						}
					)
					    |
					(
						(
							{
								$current = forceCreateModelElementAndSet(
									grammarAccess.getPlusMinusAccess().getMinusLeftExpressionAction_1_0_0_1_0(),
									$current);
							}
						)
						otherlv_4='-'
						{
							newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_0_1_1());
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightExpressionMultDivParserRuleCall_1_0_1_0());
						}
						lv_rightExpression_5_0=ruleMultDiv
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPlusMinusRule());
							}
							set(
								$current,
								"rightExpression",
								lv_rightExpression_5_0,
								"fr.inria.diverse.logo.xtext.Logo.MultDiv");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleMultDiv
entryRuleMultDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultDivRule()); }
	iv_ruleMultDiv=ruleMultDiv
	{ $current=$iv_ruleMultDiv.current; }
	EOF;

// Rule MultDiv
ruleMultDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultDivAccess().getNotOppositeParserRuleCall_0());
		}
		this_NotOpposite_0=ruleNotOpposite
		{
			$current = $this_NotOpposite_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMultDivAccess().getMultLeftExpressionAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='*'
					{
						newLeafNode(otherlv_2, grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMultDivAccess().getDivLeftExpressionAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='/'
					{
						newLeafNode(otherlv_4, grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultDivAccess().getRightExpressionNotOppositeParserRuleCall_1_1_0());
					}
					lv_rightExpression_5_0=ruleNotOpposite
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultDivRule());
						}
						set(
							$current,
							"rightExpression",
							lv_rightExpression_5_0,
							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNotOpposite
entryRuleNotOpposite returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNotOppositeRule()); }
	iv_ruleNotOpposite=ruleNotOpposite
	{ $current=$iv_ruleNotOpposite.current; }
	EOF;

// Rule NotOpposite
ruleNotOpposite returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNotOppositeAccess().getConstantParserRuleCall_0());
		}
		this_Constant_0=ruleConstant
		{
			$current = $this_Constant_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNotOppositeAccess().getVariableReadParserRuleCall_1());
		}
		this_VariableRead_1=ruleVariableRead
		{
			$current = $this_VariableRead_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionParserRuleCall_2_1());
			}
			this_Expression_3=ruleExpression
			{
				$current = $this_Expression_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getNotOppositeAccess().getRightParenthesisKeyword_2_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNotOppositeAccess().getNotAction_3_0(),
						$current);
				}
			)
			otherlv_6='not'
			{
				newLeafNode(otherlv_6, grammarAccess.getNotOppositeAccess().getNotKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_3_2_0());
					}
					lv_expression_7_0=ruleNotOpposite
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNotOppositeRule());
						}
						set(
							$current,
							"expression",
							lv_expression_7_0,
							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNotOppositeAccess().getOppositeAction_4_0(),
						$current);
				}
			)
			otherlv_9='-'
			{
				newLeafNode(otherlv_9, grammarAccess.getNotOppositeAccess().getHyphenMinusKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_4_2_0());
					}
					lv_expression_10_0=ruleNotOpposite
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNotOppositeRule());
						}
						set(
							$current,
							"expression",
							lv_expression_10_0,
							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleVariableRead
entryRuleVariableRead returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableReadRule()); }
	iv_ruleVariableRead=ruleVariableRead
	{ $current=$iv_ruleVariableRead.current; }
	EOF;

// Rule VariableRead
ruleVariableRead returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableReadAccess().getColonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableReadAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableReadRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current; }
	EOF;

// Rule IntValue
ruleIntValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntValueRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleBoolValue
entryRuleBoolValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolValueRule()); }
	iv_ruleBoolValue=ruleBoolValue
	{ $current=$iv_ruleBoolValue.current; }
	EOF;

// Rule BoolValue
ruleBoolValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBoolValueAccess().getBoolValueAction_0(),
					$current);
			}
		)
		(
			(
				(
					lv_value_1_0='true'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBoolValueRule());
						}
						setWithLastConsumed($current, "value", true, "true");
					}
				)
			)
			    |
			otherlv_2='false'
			{
				newLeafNode(otherlv_2, grammarAccess.getBoolValueAccess().getFalseKeyword_1_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
