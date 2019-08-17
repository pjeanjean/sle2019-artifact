package fr.inria.diverse.logo.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.diverse.logo.xtext.services.LogoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLogoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "':'", "'right'", "'left'", "'forward'", "'pendown'", "'penup'", "'to'", "'end'", "'['", "']'", "'if'", "'ifelse'", "'while'", "'repeat'", "'and'", "'or'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'not'", "'true'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLogoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogo.g"; }


    	private LogoGrammarAccess grammarAccess;

    	public void setGrammarAccess(LogoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLogo"
    // InternalLogo.g:54:1: entryRuleLogo : ruleLogo EOF ;
    public final void entryRuleLogo() throws RecognitionException {
        try {
            // InternalLogo.g:55:1: ( ruleLogo EOF )
            // InternalLogo.g:56:1: ruleLogo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogo"


    // $ANTLR start "ruleLogo"
    // InternalLogo.g:63:1: ruleLogo : ( ( ( rule__Logo__StatementsAssignment ) ) ( ( rule__Logo__StatementsAssignment )* ) ) ;
    public final void ruleLogo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:67:2: ( ( ( ( rule__Logo__StatementsAssignment ) ) ( ( rule__Logo__StatementsAssignment )* ) ) )
            // InternalLogo.g:68:2: ( ( ( rule__Logo__StatementsAssignment ) ) ( ( rule__Logo__StatementsAssignment )* ) )
            {
            // InternalLogo.g:68:2: ( ( ( rule__Logo__StatementsAssignment ) ) ( ( rule__Logo__StatementsAssignment )* ) )
            // InternalLogo.g:69:3: ( ( rule__Logo__StatementsAssignment ) ) ( ( rule__Logo__StatementsAssignment )* )
            {
            // InternalLogo.g:69:3: ( ( rule__Logo__StatementsAssignment ) )
            // InternalLogo.g:70:4: ( rule__Logo__StatementsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogoAccess().getStatementsAssignment()); 
            }
            // InternalLogo.g:71:4: ( rule__Logo__StatementsAssignment )
            // InternalLogo.g:71:5: rule__Logo__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Logo__StatementsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogoAccess().getStatementsAssignment()); 
            }

            }

            // InternalLogo.g:74:3: ( ( rule__Logo__StatementsAssignment )* )
            // InternalLogo.g:75:4: ( rule__Logo__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogoAccess().getStatementsAssignment()); 
            }
            // InternalLogo.g:76:4: ( rule__Logo__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=18)||LA1_0==20||(LA1_0>=22 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogo.g:76:5: rule__Logo__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Logo__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogoAccess().getStatementsAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogo"


    // $ANTLR start "entryRuleParameter"
    // InternalLogo.g:86:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalLogo.g:87:1: ( ruleParameter EOF )
            // InternalLogo.g:88:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalLogo.g:95:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:99:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalLogo.g:100:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalLogo.g:100:2: ( ( rule__Parameter__Group__0 ) )
            // InternalLogo.g:101:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalLogo.g:102:3: ( rule__Parameter__Group__0 )
            // InternalLogo.g:102:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStatement"
    // InternalLogo.g:111:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalLogo.g:112:1: ( ruleStatement EOF )
            // InternalLogo.g:113:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLogo.g:120:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:124:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalLogo.g:125:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalLogo.g:125:2: ( ( rule__Statement__Alternatives ) )
            // InternalLogo.g:126:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalLogo.g:127:3: ( rule__Statement__Alternatives )
            // InternalLogo.g:127:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalLogo.g:136:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalLogo.g:137:1: ( ruleExpression EOF )
            // InternalLogo.g:138:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLogo.g:145:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:149:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalLogo.g:150:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalLogo.g:150:2: ( ( rule__Expression__Alternatives ) )
            // InternalLogo.g:151:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalLogo.g:152:3: ( rule__Expression__Alternatives )
            // InternalLogo.g:152:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExtendedExpression"
    // InternalLogo.g:161:1: entryRuleExtendedExpression : ruleExtendedExpression EOF ;
    public final void entryRuleExtendedExpression() throws RecognitionException {
        try {
            // InternalLogo.g:162:1: ( ruleExtendedExpression EOF )
            // InternalLogo.g:163:1: ruleExtendedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExtendedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtendedExpression"


    // $ANTLR start "ruleExtendedExpression"
    // InternalLogo.g:170:1: ruleExtendedExpression : ( ( rule__ExtendedExpression__Alternatives ) ) ;
    public final void ruleExtendedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:174:2: ( ( ( rule__ExtendedExpression__Alternatives ) ) )
            // InternalLogo.g:175:2: ( ( rule__ExtendedExpression__Alternatives ) )
            {
            // InternalLogo.g:175:2: ( ( rule__ExtendedExpression__Alternatives ) )
            // InternalLogo.g:176:3: ( rule__ExtendedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedExpressionAccess().getAlternatives()); 
            }
            // InternalLogo.g:177:3: ( rule__ExtendedExpression__Alternatives )
            // InternalLogo.g:177:4: rule__ExtendedExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtendedExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalLogo.g:186:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalLogo.g:187:1: ( ruleConstant EOF )
            // InternalLogo.g:188:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalLogo.g:195:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:199:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalLogo.g:200:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalLogo.g:200:2: ( ( rule__Constant__Alternatives ) )
            // InternalLogo.g:201:3: ( rule__Constant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // InternalLogo.g:202:3: ( rule__Constant__Alternatives )
            // InternalLogo.g:202:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleRight"
    // InternalLogo.g:211:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalLogo.g:212:1: ( ruleRight EOF )
            // InternalLogo.g:213:1: ruleRight EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRightRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRightRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalLogo.g:220:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:224:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalLogo.g:225:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalLogo.g:225:2: ( ( rule__Right__Group__0 ) )
            // InternalLogo.g:226:3: ( rule__Right__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRightAccess().getGroup()); 
            }
            // InternalLogo.g:227:3: ( rule__Right__Group__0 )
            // InternalLogo.g:227:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRightAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleLeft"
    // InternalLogo.g:236:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalLogo.g:237:1: ( ruleLeft EOF )
            // InternalLogo.g:238:1: ruleLeft EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeftRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeftRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalLogo.g:245:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:249:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalLogo.g:250:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalLogo.g:250:2: ( ( rule__Left__Group__0 ) )
            // InternalLogo.g:251:3: ( rule__Left__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeftAccess().getGroup()); 
            }
            // InternalLogo.g:252:3: ( rule__Left__Group__0 )
            // InternalLogo.g:252:4: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeftAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleForward"
    // InternalLogo.g:261:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalLogo.g:262:1: ( ruleForward EOF )
            // InternalLogo.g:263:1: ruleForward EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForwardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForwardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalLogo.g:270:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:274:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalLogo.g:275:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalLogo.g:275:2: ( ( rule__Forward__Group__0 ) )
            // InternalLogo.g:276:3: ( rule__Forward__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForwardAccess().getGroup()); 
            }
            // InternalLogo.g:277:3: ( rule__Forward__Group__0 )
            // InternalLogo.g:277:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForwardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRulePenDown"
    // InternalLogo.g:286:1: entryRulePenDown : rulePenDown EOF ;
    public final void entryRulePenDown() throws RecognitionException {
        try {
            // InternalLogo.g:287:1: ( rulePenDown EOF )
            // InternalLogo.g:288:1: rulePenDown EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenDownRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePenDown();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenDownRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // InternalLogo.g:295:1: rulePenDown : ( ( rule__PenDown__Group__0 ) ) ;
    public final void rulePenDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:299:2: ( ( ( rule__PenDown__Group__0 ) ) )
            // InternalLogo.g:300:2: ( ( rule__PenDown__Group__0 ) )
            {
            // InternalLogo.g:300:2: ( ( rule__PenDown__Group__0 ) )
            // InternalLogo.g:301:3: ( rule__PenDown__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenDownAccess().getGroup()); 
            }
            // InternalLogo.g:302:3: ( rule__PenDown__Group__0 )
            // InternalLogo.g:302:4: rule__PenDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PenDown__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenDownAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // InternalLogo.g:311:1: entryRulePenUp : rulePenUp EOF ;
    public final void entryRulePenUp() throws RecognitionException {
        try {
            // InternalLogo.g:312:1: ( rulePenUp EOF )
            // InternalLogo.g:313:1: rulePenUp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenUpRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePenUp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenUpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // InternalLogo.g:320:1: rulePenUp : ( ( rule__PenUp__Group__0 ) ) ;
    public final void rulePenUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:324:2: ( ( ( rule__PenUp__Group__0 ) ) )
            // InternalLogo.g:325:2: ( ( rule__PenUp__Group__0 ) )
            {
            // InternalLogo.g:325:2: ( ( rule__PenUp__Group__0 ) )
            // InternalLogo.g:326:3: ( rule__PenUp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenUpAccess().getGroup()); 
            }
            // InternalLogo.g:327:3: ( rule__PenUp__Group__0 )
            // InternalLogo.g:327:4: rule__PenUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PenUp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenUpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleProcedureDefinition"
    // InternalLogo.g:336:1: entryRuleProcedureDefinition : ruleProcedureDefinition EOF ;
    public final void entryRuleProcedureDefinition() throws RecognitionException {
        try {
            // InternalLogo.g:337:1: ( ruleProcedureDefinition EOF )
            // InternalLogo.g:338:1: ruleProcedureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProcedureDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedureDefinition"


    // $ANTLR start "ruleProcedureDefinition"
    // InternalLogo.g:345:1: ruleProcedureDefinition : ( ( rule__ProcedureDefinition__Group__0 ) ) ;
    public final void ruleProcedureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:349:2: ( ( ( rule__ProcedureDefinition__Group__0 ) ) )
            // InternalLogo.g:350:2: ( ( rule__ProcedureDefinition__Group__0 ) )
            {
            // InternalLogo.g:350:2: ( ( rule__ProcedureDefinition__Group__0 ) )
            // InternalLogo.g:351:3: ( rule__ProcedureDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getGroup()); 
            }
            // InternalLogo.g:352:3: ( rule__ProcedureDefinition__Group__0 )
            // InternalLogo.g:352:4: rule__ProcedureDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedureDefinition"


    // $ANTLR start "entryRuleProcedureCall"
    // InternalLogo.g:361:1: entryRuleProcedureCall : ruleProcedureCall EOF ;
    public final void entryRuleProcedureCall() throws RecognitionException {
        try {
            // InternalLogo.g:362:1: ( ruleProcedureCall EOF )
            // InternalLogo.g:363:1: ruleProcedureCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProcedureCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedureCall"


    // $ANTLR start "ruleProcedureCall"
    // InternalLogo.g:370:1: ruleProcedureCall : ( ( rule__ProcedureCall__Group__0 ) ) ;
    public final void ruleProcedureCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:374:2: ( ( ( rule__ProcedureCall__Group__0 ) ) )
            // InternalLogo.g:375:2: ( ( rule__ProcedureCall__Group__0 ) )
            {
            // InternalLogo.g:375:2: ( ( rule__ProcedureCall__Group__0 ) )
            // InternalLogo.g:376:3: ( rule__ProcedureCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getGroup()); 
            }
            // InternalLogo.g:377:3: ( rule__ProcedureCall__Group__0 )
            // InternalLogo.g:377:4: rule__ProcedureCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedureCall"


    // $ANTLR start "entryRuleBlock"
    // InternalLogo.g:386:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalLogo.g:387:1: ( ruleBlock EOF )
            // InternalLogo.g:388:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalLogo.g:395:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:399:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalLogo.g:400:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalLogo.g:400:2: ( ( rule__Block__Group__0 ) )
            // InternalLogo.g:401:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalLogo.g:402:3: ( rule__Block__Group__0 )
            // InternalLogo.g:402:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleControlStatement"
    // InternalLogo.g:411:1: entryRuleControlStatement : ruleControlStatement EOF ;
    public final void entryRuleControlStatement() throws RecognitionException {
        try {
            // InternalLogo.g:412:1: ( ruleControlStatement EOF )
            // InternalLogo.g:413:1: ruleControlStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleControlStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalLogo.g:420:1: ruleControlStatement : ( ( rule__ControlStatement__Alternatives ) ) ;
    public final void ruleControlStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:424:2: ( ( ( rule__ControlStatement__Alternatives ) ) )
            // InternalLogo.g:425:2: ( ( rule__ControlStatement__Alternatives ) )
            {
            // InternalLogo.g:425:2: ( ( rule__ControlStatement__Alternatives ) )
            // InternalLogo.g:426:3: ( rule__ControlStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getControlStatementAccess().getAlternatives()); 
            }
            // InternalLogo.g:427:3: ( rule__ControlStatement__Alternatives )
            // InternalLogo.g:427:4: rule__ControlStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ControlStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getControlStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleIf"
    // InternalLogo.g:436:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalLogo.g:437:1: ( ruleIf EOF )
            // InternalLogo.g:438:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalLogo.g:445:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:449:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalLogo.g:450:2: ( ( rule__If__Group__0 ) )
            {
            // InternalLogo.g:450:2: ( ( rule__If__Group__0 ) )
            // InternalLogo.g:451:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalLogo.g:452:3: ( rule__If__Group__0 )
            // InternalLogo.g:452:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleIfElse"
    // InternalLogo.g:461:1: entryRuleIfElse : ruleIfElse EOF ;
    public final void entryRuleIfElse() throws RecognitionException {
        try {
            // InternalLogo.g:462:1: ( ruleIfElse EOF )
            // InternalLogo.g:463:1: ruleIfElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalLogo.g:470:1: ruleIfElse : ( ( rule__IfElse__Group__0 ) ) ;
    public final void ruleIfElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:474:2: ( ( ( rule__IfElse__Group__0 ) ) )
            // InternalLogo.g:475:2: ( ( rule__IfElse__Group__0 ) )
            {
            // InternalLogo.g:475:2: ( ( rule__IfElse__Group__0 ) )
            // InternalLogo.g:476:3: ( rule__IfElse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getGroup()); 
            }
            // InternalLogo.g:477:3: ( rule__IfElse__Group__0 )
            // InternalLogo.g:477:4: rule__IfElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleWhile"
    // InternalLogo.g:486:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalLogo.g:487:1: ( ruleWhile EOF )
            // InternalLogo.g:488:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalLogo.g:495:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:499:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalLogo.g:500:2: ( ( rule__While__Group__0 ) )
            {
            // InternalLogo.g:500:2: ( ( rule__While__Group__0 ) )
            // InternalLogo.g:501:3: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // InternalLogo.g:502:3: ( rule__While__Group__0 )
            // InternalLogo.g:502:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleRepeat"
    // InternalLogo.g:511:1: entryRuleRepeat : ruleRepeat EOF ;
    public final void entryRuleRepeat() throws RecognitionException {
        try {
            // InternalLogo.g:512:1: ( ruleRepeat EOF )
            // InternalLogo.g:513:1: ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRepeat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalLogo.g:520:1: ruleRepeat : ( ( rule__Repeat__Group__0 ) ) ;
    public final void ruleRepeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:524:2: ( ( ( rule__Repeat__Group__0 ) ) )
            // InternalLogo.g:525:2: ( ( rule__Repeat__Group__0 ) )
            {
            // InternalLogo.g:525:2: ( ( rule__Repeat__Group__0 ) )
            // InternalLogo.g:526:3: ( rule__Repeat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getGroup()); 
            }
            // InternalLogo.g:527:3: ( rule__Repeat__Group__0 )
            // InternalLogo.g:527:4: rule__Repeat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleAnd"
    // InternalLogo.g:536:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalLogo.g:537:1: ( ruleAnd EOF )
            // InternalLogo.g:538:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLogo.g:545:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:549:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalLogo.g:550:2: ( ( rule__And__Group__0 ) )
            {
            // InternalLogo.g:550:2: ( ( rule__And__Group__0 ) )
            // InternalLogo.g:551:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalLogo.g:552:3: ( rule__And__Group__0 )
            // InternalLogo.g:552:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLogo.g:561:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalLogo.g:562:1: ( ruleOr EOF )
            // InternalLogo.g:563:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLogo.g:570:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:574:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalLogo.g:575:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalLogo.g:575:2: ( ( rule__Or__Group__0 ) )
            // InternalLogo.g:576:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalLogo.g:577:3: ( rule__Or__Group__0 )
            // InternalLogo.g:577:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleEqualsGreaterLower"
    // InternalLogo.g:586:1: entryRuleEqualsGreaterLower : ruleEqualsGreaterLower EOF ;
    public final void entryRuleEqualsGreaterLower() throws RecognitionException {
        try {
            // InternalLogo.g:587:1: ( ruleEqualsGreaterLower EOF )
            // InternalLogo.g:588:1: ruleEqualsGreaterLower EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualsGreaterLower"


    // $ANTLR start "ruleEqualsGreaterLower"
    // InternalLogo.g:595:1: ruleEqualsGreaterLower : ( ( rule__EqualsGreaterLower__Group__0 ) ) ;
    public final void ruleEqualsGreaterLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:599:2: ( ( ( rule__EqualsGreaterLower__Group__0 ) ) )
            // InternalLogo.g:600:2: ( ( rule__EqualsGreaterLower__Group__0 ) )
            {
            // InternalLogo.g:600:2: ( ( rule__EqualsGreaterLower__Group__0 ) )
            // InternalLogo.g:601:3: ( rule__EqualsGreaterLower__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getGroup()); 
            }
            // InternalLogo.g:602:3: ( rule__EqualsGreaterLower__Group__0 )
            // InternalLogo.g:602:4: rule__EqualsGreaterLower__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualsGreaterLower"


    // $ANTLR start "entryRulePlusMinus"
    // InternalLogo.g:611:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalLogo.g:612:1: ( rulePlusMinus EOF )
            // InternalLogo.g:613:1: rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalLogo.g:620:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:624:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalLogo.g:625:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalLogo.g:625:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalLogo.g:626:3: ( rule__PlusMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getGroup()); 
            }
            // InternalLogo.g:627:3: ( rule__PlusMinus__Group__0 )
            // InternalLogo.g:627:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalLogo.g:636:1: entryRuleMultDiv : ruleMultDiv EOF ;
    public final void entryRuleMultDiv() throws RecognitionException {
        try {
            // InternalLogo.g:637:1: ( ruleMultDiv EOF )
            // InternalLogo.g:638:1: ruleMultDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalLogo.g:645:1: ruleMultDiv : ( ( rule__MultDiv__Group__0 ) ) ;
    public final void ruleMultDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:649:2: ( ( ( rule__MultDiv__Group__0 ) ) )
            // InternalLogo.g:650:2: ( ( rule__MultDiv__Group__0 ) )
            {
            // InternalLogo.g:650:2: ( ( rule__MultDiv__Group__0 ) )
            // InternalLogo.g:651:3: ( rule__MultDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getGroup()); 
            }
            // InternalLogo.g:652:3: ( rule__MultDiv__Group__0 )
            // InternalLogo.g:652:4: rule__MultDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRuleNotOpposite"
    // InternalLogo.g:661:1: entryRuleNotOpposite : ruleNotOpposite EOF ;
    public final void entryRuleNotOpposite() throws RecognitionException {
        try {
            // InternalLogo.g:662:1: ( ruleNotOpposite EOF )
            // InternalLogo.g:663:1: ruleNotOpposite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotOpposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotOpposite"


    // $ANTLR start "ruleNotOpposite"
    // InternalLogo.g:670:1: ruleNotOpposite : ( ( rule__NotOpposite__Alternatives ) ) ;
    public final void ruleNotOpposite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:674:2: ( ( ( rule__NotOpposite__Alternatives ) ) )
            // InternalLogo.g:675:2: ( ( rule__NotOpposite__Alternatives ) )
            {
            // InternalLogo.g:675:2: ( ( rule__NotOpposite__Alternatives ) )
            // InternalLogo.g:676:3: ( rule__NotOpposite__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getAlternatives()); 
            }
            // InternalLogo.g:677:3: ( rule__NotOpposite__Alternatives )
            // InternalLogo.g:677:4: rule__NotOpposite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotOpposite"


    // $ANTLR start "entryRuleVariableRead"
    // InternalLogo.g:686:1: entryRuleVariableRead : ruleVariableRead EOF ;
    public final void entryRuleVariableRead() throws RecognitionException {
        try {
            // InternalLogo.g:687:1: ( ruleVariableRead EOF )
            // InternalLogo.g:688:1: ruleVariableRead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableRead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableRead"


    // $ANTLR start "ruleVariableRead"
    // InternalLogo.g:695:1: ruleVariableRead : ( ( rule__VariableRead__Group__0 ) ) ;
    public final void ruleVariableRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:699:2: ( ( ( rule__VariableRead__Group__0 ) ) )
            // InternalLogo.g:700:2: ( ( rule__VariableRead__Group__0 ) )
            {
            // InternalLogo.g:700:2: ( ( rule__VariableRead__Group__0 ) )
            // InternalLogo.g:701:3: ( rule__VariableRead__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReadAccess().getGroup()); 
            }
            // InternalLogo.g:702:3: ( rule__VariableRead__Group__0 )
            // InternalLogo.g:702:4: rule__VariableRead__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableRead__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReadAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableRead"


    // $ANTLR start "entryRuleIntValue"
    // InternalLogo.g:711:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalLogo.g:712:1: ( ruleIntValue EOF )
            // InternalLogo.g:713:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalLogo.g:720:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:724:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalLogo.g:725:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalLogo.g:725:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalLogo.g:726:3: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalLogo.g:727:3: ( rule__IntValue__ValueAssignment )
            // InternalLogo.g:727:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalLogo.g:736:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalLogo.g:737:1: ( ruleBoolValue EOF )
            // InternalLogo.g:738:1: ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalLogo.g:745:1: ruleBoolValue : ( ( rule__BoolValue__Group__0 ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:749:2: ( ( ( rule__BoolValue__Group__0 ) ) )
            // InternalLogo.g:750:2: ( ( rule__BoolValue__Group__0 ) )
            {
            // InternalLogo.g:750:2: ( ( rule__BoolValue__Group__0 ) )
            // InternalLogo.g:751:3: ( rule__BoolValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getGroup()); 
            }
            // InternalLogo.g:752:3: ( rule__BoolValue__Group__0 )
            // InternalLogo.g:752:4: rule__BoolValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalLogo.g:760:1: rule__Statement__Alternatives : ( ( ruleRight ) | ( ruleLeft ) | ( ruleForward ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleProcedureDefinition ) | ( ruleProcedureCall ) | ( ruleControlStatement ) | ( ruleBlock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:764:1: ( ( ruleRight ) | ( ruleLeft ) | ( ruleForward ) | ( rulePenDown ) | ( rulePenUp ) | ( ruleProcedureDefinition ) | ( ruleProcedureCall ) | ( ruleControlStatement ) | ( ruleBlock ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case RULE_ID:
                {
                alt2=7;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt2=8;
                }
                break;
            case 20:
                {
                alt2=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLogo.g:765:2: ( ruleRight )
                    {
                    // InternalLogo.g:765:2: ( ruleRight )
                    // InternalLogo.g:766:3: ruleRight
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRightParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRightParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:771:2: ( ruleLeft )
                    {
                    // InternalLogo.g:771:2: ( ruleLeft )
                    // InternalLogo.g:772:3: ruleLeft
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLeftParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLeft();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLeftParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogo.g:777:2: ( ruleForward )
                    {
                    // InternalLogo.g:777:2: ( ruleForward )
                    // InternalLogo.g:778:3: ruleForward
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForwardParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForwardParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogo.g:783:2: ( rulePenDown )
                    {
                    // InternalLogo.g:783:2: ( rulePenDown )
                    // InternalLogo.g:784:3: rulePenDown
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPenDownParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePenDown();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPenDownParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLogo.g:789:2: ( rulePenUp )
                    {
                    // InternalLogo.g:789:2: ( rulePenUp )
                    // InternalLogo.g:790:3: rulePenUp
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getPenUpParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePenUp();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getPenUpParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLogo.g:795:2: ( ruleProcedureDefinition )
                    {
                    // InternalLogo.g:795:2: ( ruleProcedureDefinition )
                    // InternalLogo.g:796:3: ruleProcedureDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getProcedureDefinitionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProcedureDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getProcedureDefinitionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalLogo.g:801:2: ( ruleProcedureCall )
                    {
                    // InternalLogo.g:801:2: ( ruleProcedureCall )
                    // InternalLogo.g:802:3: ruleProcedureCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getProcedureCallParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProcedureCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getProcedureCallParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalLogo.g:807:2: ( ruleControlStatement )
                    {
                    // InternalLogo.g:807:2: ( ruleControlStatement )
                    // InternalLogo.g:808:3: ruleControlStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleControlStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalLogo.g:813:2: ( ruleBlock )
                    {
                    // InternalLogo.g:813:2: ( ruleBlock )
                    // InternalLogo.g:814:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalLogo.g:823:1: rule__Expression__Alternatives : ( ( ruleEqualsGreaterLower ) | ( ruleExtendedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:827:1: ( ( ruleEqualsGreaterLower ) | ( ruleExtendedExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=11 && LA3_0<=12)||LA3_0==32||LA3_0==35||(LA3_0>=37 && LA3_0<=38)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=26 && LA3_0<=27)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLogo.g:828:2: ( ruleEqualsGreaterLower )
                    {
                    // InternalLogo.g:828:2: ( ruleEqualsGreaterLower )
                    // InternalLogo.g:829:3: ruleEqualsGreaterLower
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getEqualsGreaterLowerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEqualsGreaterLower();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getEqualsGreaterLowerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:834:2: ( ruleExtendedExpression )
                    {
                    // InternalLogo.g:834:2: ( ruleExtendedExpression )
                    // InternalLogo.g:835:3: ruleExtendedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getExtendedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExtendedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getExtendedExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__ExtendedExpression__Alternatives"
    // InternalLogo.g:844:1: rule__ExtendedExpression__Alternatives : ( ( ruleOr ) | ( ruleAnd ) );
    public final void rule__ExtendedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:848:1: ( ( ruleOr ) | ( ruleAnd ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLogo.g:849:2: ( ruleOr )
                    {
                    // InternalLogo.g:849:2: ( ruleOr )
                    // InternalLogo.g:850:3: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedExpressionAccess().getOrParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedExpressionAccess().getOrParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:855:2: ( ruleAnd )
                    {
                    // InternalLogo.g:855:2: ( ruleAnd )
                    // InternalLogo.g:856:3: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedExpressionAccess().getAndParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedExpressionAccess().getAndParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedExpression__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalLogo.g:865:1: rule__Constant__Alternatives : ( ( ruleIntValue ) | ( ruleBoolValue ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:869:1: ( ( ruleIntValue ) | ( ruleBoolValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==11||LA5_0==38) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLogo.g:870:2: ( ruleIntValue )
                    {
                    // InternalLogo.g:870:2: ( ruleIntValue )
                    // InternalLogo.g:871:3: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:876:2: ( ruleBoolValue )
                    {
                    // InternalLogo.g:876:2: ( ruleBoolValue )
                    // InternalLogo.g:877:3: ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getBoolValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getBoolValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__ControlStatement__Alternatives"
    // InternalLogo.g:886:1: rule__ControlStatement__Alternatives : ( ( ruleIf ) | ( ruleIfElse ) | ( ruleWhile ) | ( ruleRepeat ) );
    public final void rule__ControlStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:890:1: ( ( ruleIf ) | ( ruleIfElse ) | ( ruleWhile ) | ( ruleRepeat ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLogo.g:891:2: ( ruleIf )
                    {
                    // InternalLogo.g:891:2: ( ruleIf )
                    // InternalLogo.g:892:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlStatementAccess().getIfParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlStatementAccess().getIfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:897:2: ( ruleIfElse )
                    {
                    // InternalLogo.g:897:2: ( ruleIfElse )
                    // InternalLogo.g:898:3: ruleIfElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlStatementAccess().getIfElseParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfElse();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlStatementAccess().getIfElseParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogo.g:903:2: ( ruleWhile )
                    {
                    // InternalLogo.g:903:2: ( ruleWhile )
                    // InternalLogo.g:904:3: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlStatementAccess().getWhileParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlStatementAccess().getWhileParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogo.g:909:2: ( ruleRepeat )
                    {
                    // InternalLogo.g:909:2: ( ruleRepeat )
                    // InternalLogo.g:910:3: ruleRepeat
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getControlStatementAccess().getRepeatParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRepeat();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getControlStatementAccess().getRepeatParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ControlStatement__Alternatives"


    // $ANTLR start "rule__If__Alternatives_1"
    // InternalLogo.g:919:1: rule__If__Alternatives_1 : ( ( ( rule__If__ConditionAssignment_1_0 ) ) | ( ( rule__If__Group_1_1__0 ) ) );
    public final void rule__If__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:923:1: ( ( ( rule__If__ConditionAssignment_1_0 ) ) | ( ( rule__If__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=11 && LA7_0<=12)||(LA7_0>=26 && LA7_0<=27)||LA7_0==32||LA7_0==35||(LA7_0>=37 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLogo.g:924:2: ( ( rule__If__ConditionAssignment_1_0 ) )
                    {
                    // InternalLogo.g:924:2: ( ( rule__If__ConditionAssignment_1_0 ) )
                    // InternalLogo.g:925:3: ( rule__If__ConditionAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getConditionAssignment_1_0()); 
                    }
                    // InternalLogo.g:926:3: ( rule__If__ConditionAssignment_1_0 )
                    // InternalLogo.g:926:4: rule__If__ConditionAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__ConditionAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getConditionAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:930:2: ( ( rule__If__Group_1_1__0 ) )
                    {
                    // InternalLogo.g:930:2: ( ( rule__If__Group_1_1__0 ) )
                    // InternalLogo.g:931:3: ( rule__If__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_1_1()); 
                    }
                    // InternalLogo.g:932:3: ( rule__If__Group_1_1__0 )
                    // InternalLogo.g:932:4: rule__If__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Alternatives_1"


    // $ANTLR start "rule__IfElse__Alternatives_1"
    // InternalLogo.g:940:1: rule__IfElse__Alternatives_1 : ( ( ( rule__IfElse__ConditionAssignment_1_0 ) ) | ( ( rule__IfElse__Group_1_1__0 ) ) );
    public final void rule__IfElse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:944:1: ( ( ( rule__IfElse__ConditionAssignment_1_0 ) ) | ( ( rule__IfElse__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=11 && LA8_0<=12)||(LA8_0>=26 && LA8_0<=27)||LA8_0==32||LA8_0==35||(LA8_0>=37 && LA8_0<=38)) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLogo.g:945:2: ( ( rule__IfElse__ConditionAssignment_1_0 ) )
                    {
                    // InternalLogo.g:945:2: ( ( rule__IfElse__ConditionAssignment_1_0 ) )
                    // InternalLogo.g:946:3: ( rule__IfElse__ConditionAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfElseAccess().getConditionAssignment_1_0()); 
                    }
                    // InternalLogo.g:947:3: ( rule__IfElse__ConditionAssignment_1_0 )
                    // InternalLogo.g:947:4: rule__IfElse__ConditionAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfElse__ConditionAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfElseAccess().getConditionAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:951:2: ( ( rule__IfElse__Group_1_1__0 ) )
                    {
                    // InternalLogo.g:951:2: ( ( rule__IfElse__Group_1_1__0 ) )
                    // InternalLogo.g:952:3: ( rule__IfElse__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfElseAccess().getGroup_1_1()); 
                    }
                    // InternalLogo.g:953:3: ( rule__IfElse__Group_1_1__0 )
                    // InternalLogo.g:953:4: rule__IfElse__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfElse__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfElseAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Alternatives_1"


    // $ANTLR start "rule__While__Alternatives_1"
    // InternalLogo.g:961:1: rule__While__Alternatives_1 : ( ( ( rule__While__ConditionAssignment_1_0 ) ) | ( ( rule__While__Group_1_1__0 ) ) );
    public final void rule__While__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:965:1: ( ( ( rule__While__ConditionAssignment_1_0 ) ) | ( ( rule__While__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=11 && LA9_0<=12)||(LA9_0>=26 && LA9_0<=27)||LA9_0==32||LA9_0==35||(LA9_0>=37 && LA9_0<=38)) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLogo.g:966:2: ( ( rule__While__ConditionAssignment_1_0 ) )
                    {
                    // InternalLogo.g:966:2: ( ( rule__While__ConditionAssignment_1_0 ) )
                    // InternalLogo.g:967:3: ( rule__While__ConditionAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getConditionAssignment_1_0()); 
                    }
                    // InternalLogo.g:968:3: ( rule__While__ConditionAssignment_1_0 )
                    // InternalLogo.g:968:4: rule__While__ConditionAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__ConditionAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getConditionAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:972:2: ( ( rule__While__Group_1_1__0 ) )
                    {
                    // InternalLogo.g:972:2: ( ( rule__While__Group_1_1__0 ) )
                    // InternalLogo.g:973:3: ( rule__While__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWhileAccess().getGroup_1_1()); 
                    }
                    // InternalLogo.g:974:3: ( rule__While__Group_1_1__0 )
                    // InternalLogo.g:974:4: rule__While__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__While__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWhileAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Alternatives_1"


    // $ANTLR start "rule__EqualsGreaterLower__Alternatives_1_0"
    // InternalLogo.g:982:1: rule__EqualsGreaterLower__Alternatives_1_0 : ( ( ( rule__EqualsGreaterLower__Group_1_0_0__0 ) ) | ( ( rule__EqualsGreaterLower__Group_1_0_1__0 ) ) | ( ( rule__EqualsGreaterLower__Group_1_0_2__0 ) ) );
    public final void rule__EqualsGreaterLower__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:986:1: ( ( ( rule__EqualsGreaterLower__Group_1_0_0__0 ) ) | ( ( rule__EqualsGreaterLower__Group_1_0_1__0 ) ) | ( ( rule__EqualsGreaterLower__Group_1_0_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLogo.g:987:2: ( ( rule__EqualsGreaterLower__Group_1_0_0__0 ) )
                    {
                    // InternalLogo.g:987:2: ( ( rule__EqualsGreaterLower__Group_1_0_0__0 ) )
                    // InternalLogo.g:988:3: ( rule__EqualsGreaterLower__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_0()); 
                    }
                    // InternalLogo.g:989:3: ( rule__EqualsGreaterLower__Group_1_0_0__0 )
                    // InternalLogo.g:989:4: rule__EqualsGreaterLower__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualsGreaterLower__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:993:2: ( ( rule__EqualsGreaterLower__Group_1_0_1__0 ) )
                    {
                    // InternalLogo.g:993:2: ( ( rule__EqualsGreaterLower__Group_1_0_1__0 ) )
                    // InternalLogo.g:994:3: ( rule__EqualsGreaterLower__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_1()); 
                    }
                    // InternalLogo.g:995:3: ( rule__EqualsGreaterLower__Group_1_0_1__0 )
                    // InternalLogo.g:995:4: rule__EqualsGreaterLower__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualsGreaterLower__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogo.g:999:2: ( ( rule__EqualsGreaterLower__Group_1_0_2__0 ) )
                    {
                    // InternalLogo.g:999:2: ( ( rule__EqualsGreaterLower__Group_1_0_2__0 ) )
                    // InternalLogo.g:1000:3: ( rule__EqualsGreaterLower__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_2()); 
                    }
                    // InternalLogo.g:1001:3: ( rule__EqualsGreaterLower__Group_1_0_2__0 )
                    // InternalLogo.g:1001:4: rule__EqualsGreaterLower__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualsGreaterLower__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Alternatives_1_0"


    // $ANTLR start "rule__PlusMinus__Alternatives_1_0_0"
    // InternalLogo.g:1009:1: rule__PlusMinus__Alternatives_1_0_0 : ( ( ( rule__PlusMinus__Group_1_0_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_0_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1013:1: ( ( ( rule__PlusMinus__Group_1_0_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_0_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLogo.g:1014:2: ( ( rule__PlusMinus__Group_1_0_0_0__0 ) )
                    {
                    // InternalLogo.g:1014:2: ( ( rule__PlusMinus__Group_1_0_0_0__0 ) )
                    // InternalLogo.g:1015:3: ( rule__PlusMinus__Group_1_0_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusMinusAccess().getGroup_1_0_0_0()); 
                    }
                    // InternalLogo.g:1016:3: ( rule__PlusMinus__Group_1_0_0_0__0 )
                    // InternalLogo.g:1016:4: rule__PlusMinus__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusMinusAccess().getGroup_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1020:2: ( ( rule__PlusMinus__Group_1_0_0_1__0 ) )
                    {
                    // InternalLogo.g:1020:2: ( ( rule__PlusMinus__Group_1_0_0_1__0 ) )
                    // InternalLogo.g:1021:3: ( rule__PlusMinus__Group_1_0_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusMinusAccess().getGroup_1_0_0_1()); 
                    }
                    // InternalLogo.g:1022:3: ( rule__PlusMinus__Group_1_0_0_1__0 )
                    // InternalLogo.g:1022:4: rule__PlusMinus__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusMinusAccess().getGroup_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Alternatives_1_0_0"


    // $ANTLR start "rule__MultDiv__Alternatives_1_0"
    // InternalLogo.g:1030:1: rule__MultDiv__Alternatives_1_0 : ( ( ( rule__MultDiv__Group_1_0_0__0 ) ) | ( ( rule__MultDiv__Group_1_0_1__0 ) ) );
    public final void rule__MultDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1034:1: ( ( ( rule__MultDiv__Group_1_0_0__0 ) ) | ( ( rule__MultDiv__Group_1_0_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLogo.g:1035:2: ( ( rule__MultDiv__Group_1_0_0__0 ) )
                    {
                    // InternalLogo.g:1035:2: ( ( rule__MultDiv__Group_1_0_0__0 ) )
                    // InternalLogo.g:1036:3: ( rule__MultDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalLogo.g:1037:3: ( rule__MultDiv__Group_1_0_0__0 )
                    // InternalLogo.g:1037:4: rule__MultDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1041:2: ( ( rule__MultDiv__Group_1_0_1__0 ) )
                    {
                    // InternalLogo.g:1041:2: ( ( rule__MultDiv__Group_1_0_1__0 ) )
                    // InternalLogo.g:1042:3: ( rule__MultDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalLogo.g:1043:3: ( rule__MultDiv__Group_1_0_1__0 )
                    // InternalLogo.g:1043:4: rule__MultDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultDivAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Alternatives_1_0"


    // $ANTLR start "rule__NotOpposite__Alternatives"
    // InternalLogo.g:1051:1: rule__NotOpposite__Alternatives : ( ( ruleConstant ) | ( ruleVariableRead ) | ( ( rule__NotOpposite__Group_2__0 ) ) | ( ( rule__NotOpposite__Group_3__0 ) ) | ( ( rule__NotOpposite__Group_4__0 ) ) );
    public final void rule__NotOpposite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1055:1: ( ( ruleConstant ) | ( ruleVariableRead ) | ( ( rule__NotOpposite__Group_2__0 ) ) | ( ( rule__NotOpposite__Group_3__0 ) ) | ( ( rule__NotOpposite__Group_4__0 ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 11:
            case 38:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 32:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalLogo.g:1056:2: ( ruleConstant )
                    {
                    // InternalLogo.g:1056:2: ( ruleConstant )
                    // InternalLogo.g:1057:3: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOppositeAccess().getConstantParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOppositeAccess().getConstantParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1062:2: ( ruleVariableRead )
                    {
                    // InternalLogo.g:1062:2: ( ruleVariableRead )
                    // InternalLogo.g:1063:3: ruleVariableRead
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOppositeAccess().getVariableReadParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableRead();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOppositeAccess().getVariableReadParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogo.g:1068:2: ( ( rule__NotOpposite__Group_2__0 ) )
                    {
                    // InternalLogo.g:1068:2: ( ( rule__NotOpposite__Group_2__0 ) )
                    // InternalLogo.g:1069:3: ( rule__NotOpposite__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOppositeAccess().getGroup_2()); 
                    }
                    // InternalLogo.g:1070:3: ( rule__NotOpposite__Group_2__0 )
                    // InternalLogo.g:1070:4: rule__NotOpposite__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotOpposite__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOppositeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogo.g:1074:2: ( ( rule__NotOpposite__Group_3__0 ) )
                    {
                    // InternalLogo.g:1074:2: ( ( rule__NotOpposite__Group_3__0 ) )
                    // InternalLogo.g:1075:3: ( rule__NotOpposite__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOppositeAccess().getGroup_3()); 
                    }
                    // InternalLogo.g:1076:3: ( rule__NotOpposite__Group_3__0 )
                    // InternalLogo.g:1076:4: rule__NotOpposite__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotOpposite__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOppositeAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLogo.g:1080:2: ( ( rule__NotOpposite__Group_4__0 ) )
                    {
                    // InternalLogo.g:1080:2: ( ( rule__NotOpposite__Group_4__0 ) )
                    // InternalLogo.g:1081:3: ( rule__NotOpposite__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOppositeAccess().getGroup_4()); 
                    }
                    // InternalLogo.g:1082:3: ( rule__NotOpposite__Group_4__0 )
                    // InternalLogo.g:1082:4: rule__NotOpposite__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotOpposite__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotOppositeAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Alternatives"


    // $ANTLR start "rule__BoolValue__Alternatives_1"
    // InternalLogo.g:1090:1: rule__BoolValue__Alternatives_1 : ( ( ( rule__BoolValue__ValueAssignment_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolValue__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1094:1: ( ( ( rule__BoolValue__ValueAssignment_1_0 ) ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==11) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLogo.g:1095:2: ( ( rule__BoolValue__ValueAssignment_1_0 ) )
                    {
                    // InternalLogo.g:1095:2: ( ( rule__BoolValue__ValueAssignment_1_0 ) )
                    // InternalLogo.g:1096:3: ( rule__BoolValue__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolValueAccess().getValueAssignment_1_0()); 
                    }
                    // InternalLogo.g:1097:3: ( rule__BoolValue__ValueAssignment_1_0 )
                    // InternalLogo.g:1097:4: rule__BoolValue__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolValue__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolValueAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1101:2: ( 'false' )
                    {
                    // InternalLogo.g:1101:2: ( 'false' )
                    // InternalLogo.g:1102:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoolValueAccess().getFalseKeyword_1_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoolValueAccess().getFalseKeyword_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Alternatives_1"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalLogo.g:1111:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1115:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalLogo.g:1116:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalLogo.g:1123:1: rule__Parameter__Group__0__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1127:1: ( ( ':' ) )
            // InternalLogo.g:1128:1: ( ':' )
            {
            // InternalLogo.g:1128:1: ( ':' )
            // InternalLogo.g:1129:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getColonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalLogo.g:1138:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1142:1: ( rule__Parameter__Group__1__Impl )
            // InternalLogo.g:1143:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalLogo.g:1149:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1153:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalLogo.g:1154:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalLogo.g:1154:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalLogo.g:1155:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalLogo.g:1156:2: ( rule__Parameter__NameAssignment_1 )
            // InternalLogo.g:1156:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalLogo.g:1165:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1169:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalLogo.g:1170:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Right__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalLogo.g:1177:1: rule__Right__Group__0__Impl : ( 'right' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1181:1: ( ( 'right' ) )
            // InternalLogo.g:1182:1: ( 'right' )
            {
            // InternalLogo.g:1182:1: ( 'right' )
            // InternalLogo.g:1183:2: 'right'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRightAccess().getRightKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRightAccess().getRightKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalLogo.g:1192:1: rule__Right__Group__1 : rule__Right__Group__1__Impl ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1196:1: ( rule__Right__Group__1__Impl )
            // InternalLogo.g:1197:2: rule__Right__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalLogo.g:1203:1: rule__Right__Group__1__Impl : ( ( rule__Right__AngleAssignment_1 ) ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1207:1: ( ( ( rule__Right__AngleAssignment_1 ) ) )
            // InternalLogo.g:1208:1: ( ( rule__Right__AngleAssignment_1 ) )
            {
            // InternalLogo.g:1208:1: ( ( rule__Right__AngleAssignment_1 ) )
            // InternalLogo.g:1209:2: ( rule__Right__AngleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRightAccess().getAngleAssignment_1()); 
            }
            // InternalLogo.g:1210:2: ( rule__Right__AngleAssignment_1 )
            // InternalLogo.g:1210:3: rule__Right__AngleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Right__AngleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRightAccess().getAngleAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // InternalLogo.g:1219:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1223:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalLogo.g:1224:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Left__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Left__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // InternalLogo.g:1231:1: rule__Left__Group__0__Impl : ( 'left' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1235:1: ( ( 'left' ) )
            // InternalLogo.g:1236:1: ( 'left' )
            {
            // InternalLogo.g:1236:1: ( 'left' )
            // InternalLogo.g:1237:2: 'left'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeftAccess().getLeftKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeftAccess().getLeftKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // InternalLogo.g:1246:1: rule__Left__Group__1 : rule__Left__Group__1__Impl ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1250:1: ( rule__Left__Group__1__Impl )
            // InternalLogo.g:1251:2: rule__Left__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // InternalLogo.g:1257:1: rule__Left__Group__1__Impl : ( ( rule__Left__AngleAssignment_1 ) ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1261:1: ( ( ( rule__Left__AngleAssignment_1 ) ) )
            // InternalLogo.g:1262:1: ( ( rule__Left__AngleAssignment_1 ) )
            {
            // InternalLogo.g:1262:1: ( ( rule__Left__AngleAssignment_1 ) )
            // InternalLogo.g:1263:2: ( rule__Left__AngleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeftAccess().getAngleAssignment_1()); 
            }
            // InternalLogo.g:1264:2: ( rule__Left__AngleAssignment_1 )
            // InternalLogo.g:1264:3: rule__Left__AngleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Left__AngleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeftAccess().getAngleAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalLogo.g:1273:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1277:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalLogo.g:1278:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Forward__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalLogo.g:1285:1: rule__Forward__Group__0__Impl : ( 'forward' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1289:1: ( ( 'forward' ) )
            // InternalLogo.g:1290:1: ( 'forward' )
            {
            // InternalLogo.g:1290:1: ( 'forward' )
            // InternalLogo.g:1291:2: 'forward'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForwardAccess().getForwardKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForwardAccess().getForwardKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalLogo.g:1300:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1304:1: ( rule__Forward__Group__1__Impl )
            // InternalLogo.g:1305:2: rule__Forward__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalLogo.g:1311:1: rule__Forward__Group__1__Impl : ( ( rule__Forward__StepAssignment_1 ) ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1315:1: ( ( ( rule__Forward__StepAssignment_1 ) ) )
            // InternalLogo.g:1316:1: ( ( rule__Forward__StepAssignment_1 ) )
            {
            // InternalLogo.g:1316:1: ( ( rule__Forward__StepAssignment_1 ) )
            // InternalLogo.g:1317:2: ( rule__Forward__StepAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForwardAccess().getStepAssignment_1()); 
            }
            // InternalLogo.g:1318:2: ( rule__Forward__StepAssignment_1 )
            // InternalLogo.g:1318:3: rule__Forward__StepAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Forward__StepAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForwardAccess().getStepAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__PenDown__Group__0"
    // InternalLogo.g:1327:1: rule__PenDown__Group__0 : rule__PenDown__Group__0__Impl rule__PenDown__Group__1 ;
    public final void rule__PenDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1331:1: ( rule__PenDown__Group__0__Impl rule__PenDown__Group__1 )
            // InternalLogo.g:1332:2: rule__PenDown__Group__0__Impl rule__PenDown__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PenDown__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PenDown__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0"


    // $ANTLR start "rule__PenDown__Group__0__Impl"
    // InternalLogo.g:1339:1: rule__PenDown__Group__0__Impl : ( () ) ;
    public final void rule__PenDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1343:1: ( ( () ) )
            // InternalLogo.g:1344:1: ( () )
            {
            // InternalLogo.g:1344:1: ( () )
            // InternalLogo.g:1345:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenDownAccess().getPenDownAction_0()); 
            }
            // InternalLogo.g:1346:2: ()
            // InternalLogo.g:1346:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenDownAccess().getPenDownAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__0__Impl"


    // $ANTLR start "rule__PenDown__Group__1"
    // InternalLogo.g:1354:1: rule__PenDown__Group__1 : rule__PenDown__Group__1__Impl ;
    public final void rule__PenDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1358:1: ( rule__PenDown__Group__1__Impl )
            // InternalLogo.g:1359:2: rule__PenDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenDown__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1"


    // $ANTLR start "rule__PenDown__Group__1__Impl"
    // InternalLogo.g:1365:1: rule__PenDown__Group__1__Impl : ( 'pendown' ) ;
    public final void rule__PenDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1369:1: ( ( 'pendown' ) )
            // InternalLogo.g:1370:1: ( 'pendown' )
            {
            // InternalLogo.g:1370:1: ( 'pendown' )
            // InternalLogo.g:1371:2: 'pendown'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenDownAccess().getPendownKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenDownAccess().getPendownKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenDown__Group__1__Impl"


    // $ANTLR start "rule__PenUp__Group__0"
    // InternalLogo.g:1381:1: rule__PenUp__Group__0 : rule__PenUp__Group__0__Impl rule__PenUp__Group__1 ;
    public final void rule__PenUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1385:1: ( rule__PenUp__Group__0__Impl rule__PenUp__Group__1 )
            // InternalLogo.g:1386:2: rule__PenUp__Group__0__Impl rule__PenUp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PenUp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PenUp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0"


    // $ANTLR start "rule__PenUp__Group__0__Impl"
    // InternalLogo.g:1393:1: rule__PenUp__Group__0__Impl : ( () ) ;
    public final void rule__PenUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1397:1: ( ( () ) )
            // InternalLogo.g:1398:1: ( () )
            {
            // InternalLogo.g:1398:1: ( () )
            // InternalLogo.g:1399:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenUpAccess().getPenUpAction_0()); 
            }
            // InternalLogo.g:1400:2: ()
            // InternalLogo.g:1400:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenUpAccess().getPenUpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__0__Impl"


    // $ANTLR start "rule__PenUp__Group__1"
    // InternalLogo.g:1408:1: rule__PenUp__Group__1 : rule__PenUp__Group__1__Impl ;
    public final void rule__PenUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1412:1: ( rule__PenUp__Group__1__Impl )
            // InternalLogo.g:1413:2: rule__PenUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenUp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1"


    // $ANTLR start "rule__PenUp__Group__1__Impl"
    // InternalLogo.g:1419:1: rule__PenUp__Group__1__Impl : ( 'penup' ) ;
    public final void rule__PenUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1423:1: ( ( 'penup' ) )
            // InternalLogo.g:1424:1: ( 'penup' )
            {
            // InternalLogo.g:1424:1: ( 'penup' )
            // InternalLogo.g:1425:2: 'penup'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPenUpAccess().getPenupKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPenUpAccess().getPenupKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenUp__Group__1__Impl"


    // $ANTLR start "rule__ProcedureDefinition__Group__0"
    // InternalLogo.g:1435:1: rule__ProcedureDefinition__Group__0 : rule__ProcedureDefinition__Group__0__Impl rule__ProcedureDefinition__Group__1 ;
    public final void rule__ProcedureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1439:1: ( rule__ProcedureDefinition__Group__0__Impl rule__ProcedureDefinition__Group__1 )
            // InternalLogo.g:1440:2: rule__ProcedureDefinition__Group__0__Impl rule__ProcedureDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProcedureDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__0"


    // $ANTLR start "rule__ProcedureDefinition__Group__0__Impl"
    // InternalLogo.g:1447:1: rule__ProcedureDefinition__Group__0__Impl : ( 'to' ) ;
    public final void rule__ProcedureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1451:1: ( ( 'to' ) )
            // InternalLogo.g:1452:1: ( 'to' )
            {
            // InternalLogo.g:1452:1: ( 'to' )
            // InternalLogo.g:1453:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getToKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getToKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__0__Impl"


    // $ANTLR start "rule__ProcedureDefinition__Group__1"
    // InternalLogo.g:1462:1: rule__ProcedureDefinition__Group__1 : rule__ProcedureDefinition__Group__1__Impl rule__ProcedureDefinition__Group__2 ;
    public final void rule__ProcedureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1466:1: ( rule__ProcedureDefinition__Group__1__Impl rule__ProcedureDefinition__Group__2 )
            // InternalLogo.g:1467:2: rule__ProcedureDefinition__Group__1__Impl rule__ProcedureDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ProcedureDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__1"


    // $ANTLR start "rule__ProcedureDefinition__Group__1__Impl"
    // InternalLogo.g:1474:1: rule__ProcedureDefinition__Group__1__Impl : ( ( rule__ProcedureDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProcedureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1478:1: ( ( ( rule__ProcedureDefinition__NameAssignment_1 ) ) )
            // InternalLogo.g:1479:1: ( ( rule__ProcedureDefinition__NameAssignment_1 ) )
            {
            // InternalLogo.g:1479:1: ( ( rule__ProcedureDefinition__NameAssignment_1 ) )
            // InternalLogo.g:1480:2: ( rule__ProcedureDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalLogo.g:1481:2: ( rule__ProcedureDefinition__NameAssignment_1 )
            // InternalLogo.g:1481:3: rule__ProcedureDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__1__Impl"


    // $ANTLR start "rule__ProcedureDefinition__Group__2"
    // InternalLogo.g:1489:1: rule__ProcedureDefinition__Group__2 : rule__ProcedureDefinition__Group__2__Impl rule__ProcedureDefinition__Group__3 ;
    public final void rule__ProcedureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1493:1: ( rule__ProcedureDefinition__Group__2__Impl rule__ProcedureDefinition__Group__3 )
            // InternalLogo.g:1494:2: rule__ProcedureDefinition__Group__2__Impl rule__ProcedureDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ProcedureDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__2"


    // $ANTLR start "rule__ProcedureDefinition__Group__2__Impl"
    // InternalLogo.g:1501:1: rule__ProcedureDefinition__Group__2__Impl : ( ( rule__ProcedureDefinition__ParametersAssignment_2 )* ) ;
    public final void rule__ProcedureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1505:1: ( ( ( rule__ProcedureDefinition__ParametersAssignment_2 )* ) )
            // InternalLogo.g:1506:1: ( ( rule__ProcedureDefinition__ParametersAssignment_2 )* )
            {
            // InternalLogo.g:1506:1: ( ( rule__ProcedureDefinition__ParametersAssignment_2 )* )
            // InternalLogo.g:1507:2: ( rule__ProcedureDefinition__ParametersAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getParametersAssignment_2()); 
            }
            // InternalLogo.g:1508:2: ( rule__ProcedureDefinition__ParametersAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLogo.g:1508:3: rule__ProcedureDefinition__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ProcedureDefinition__ParametersAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getParametersAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__2__Impl"


    // $ANTLR start "rule__ProcedureDefinition__Group__3"
    // InternalLogo.g:1516:1: rule__ProcedureDefinition__Group__3 : rule__ProcedureDefinition__Group__3__Impl rule__ProcedureDefinition__Group__4 ;
    public final void rule__ProcedureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1520:1: ( rule__ProcedureDefinition__Group__3__Impl rule__ProcedureDefinition__Group__4 )
            // InternalLogo.g:1521:2: rule__ProcedureDefinition__Group__3__Impl rule__ProcedureDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ProcedureDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__3"


    // $ANTLR start "rule__ProcedureDefinition__Group__3__Impl"
    // InternalLogo.g:1528:1: rule__ProcedureDefinition__Group__3__Impl : ( ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) ) ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* ) ) ;
    public final void rule__ProcedureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1532:1: ( ( ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) ) ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* ) ) )
            // InternalLogo.g:1533:1: ( ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) ) ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* ) )
            {
            // InternalLogo.g:1533:1: ( ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) ) ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* ) )
            // InternalLogo.g:1534:2: ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) ) ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* )
            {
            // InternalLogo.g:1534:2: ( ( rule__ProcedureDefinition__StatementsAssignment_3 ) )
            // InternalLogo.g:1535:3: ( rule__ProcedureDefinition__StatementsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getStatementsAssignment_3()); 
            }
            // InternalLogo.g:1536:3: ( rule__ProcedureDefinition__StatementsAssignment_3 )
            // InternalLogo.g:1536:4: rule__ProcedureDefinition__StatementsAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__ProcedureDefinition__StatementsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getStatementsAssignment_3()); 
            }

            }

            // InternalLogo.g:1539:2: ( ( rule__ProcedureDefinition__StatementsAssignment_3 )* )
            // InternalLogo.g:1540:3: ( rule__ProcedureDefinition__StatementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getStatementsAssignment_3()); 
            }
            // InternalLogo.g:1541:3: ( rule__ProcedureDefinition__StatementsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=13 && LA16_0<=18)||LA16_0==20||(LA16_0>=22 && LA16_0<=25)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLogo.g:1541:4: rule__ProcedureDefinition__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ProcedureDefinition__StatementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getStatementsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__3__Impl"


    // $ANTLR start "rule__ProcedureDefinition__Group__4"
    // InternalLogo.g:1550:1: rule__ProcedureDefinition__Group__4 : rule__ProcedureDefinition__Group__4__Impl ;
    public final void rule__ProcedureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1554:1: ( rule__ProcedureDefinition__Group__4__Impl )
            // InternalLogo.g:1555:2: rule__ProcedureDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__4"


    // $ANTLR start "rule__ProcedureDefinition__Group__4__Impl"
    // InternalLogo.g:1561:1: rule__ProcedureDefinition__Group__4__Impl : ( 'end' ) ;
    public final void rule__ProcedureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1565:1: ( ( 'end' ) )
            // InternalLogo.g:1566:1: ( 'end' )
            {
            // InternalLogo.g:1566:1: ( 'end' )
            // InternalLogo.g:1567:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getEndKeyword_4()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getEndKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__Group__4__Impl"


    // $ANTLR start "rule__ProcedureCall__Group__0"
    // InternalLogo.g:1577:1: rule__ProcedureCall__Group__0 : rule__ProcedureCall__Group__0__Impl rule__ProcedureCall__Group__1 ;
    public final void rule__ProcedureCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1581:1: ( rule__ProcedureCall__Group__0__Impl rule__ProcedureCall__Group__1 )
            // InternalLogo.g:1582:2: rule__ProcedureCall__Group__0__Impl rule__ProcedureCall__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ProcedureCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProcedureCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__Group__0"


    // $ANTLR start "rule__ProcedureCall__Group__0__Impl"
    // InternalLogo.g:1589:1: rule__ProcedureCall__Group__0__Impl : ( ( rule__ProcedureCall__DefinitionAssignment_0 ) ) ;
    public final void rule__ProcedureCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1593:1: ( ( ( rule__ProcedureCall__DefinitionAssignment_0 ) ) )
            // InternalLogo.g:1594:1: ( ( rule__ProcedureCall__DefinitionAssignment_0 ) )
            {
            // InternalLogo.g:1594:1: ( ( rule__ProcedureCall__DefinitionAssignment_0 ) )
            // InternalLogo.g:1595:2: ( rule__ProcedureCall__DefinitionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getDefinitionAssignment_0()); 
            }
            // InternalLogo.g:1596:2: ( rule__ProcedureCall__DefinitionAssignment_0 )
            // InternalLogo.g:1596:3: rule__ProcedureCall__DefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureCall__DefinitionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getDefinitionAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__Group__0__Impl"


    // $ANTLR start "rule__ProcedureCall__Group__1"
    // InternalLogo.g:1604:1: rule__ProcedureCall__Group__1 : rule__ProcedureCall__Group__1__Impl ;
    public final void rule__ProcedureCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1608:1: ( rule__ProcedureCall__Group__1__Impl )
            // InternalLogo.g:1609:2: rule__ProcedureCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcedureCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__Group__1"


    // $ANTLR start "rule__ProcedureCall__Group__1__Impl"
    // InternalLogo.g:1615:1: rule__ProcedureCall__Group__1__Impl : ( ( rule__ProcedureCall__ParameterValuesAssignment_1 )* ) ;
    public final void rule__ProcedureCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1619:1: ( ( ( rule__ProcedureCall__ParameterValuesAssignment_1 )* ) )
            // InternalLogo.g:1620:1: ( ( rule__ProcedureCall__ParameterValuesAssignment_1 )* )
            {
            // InternalLogo.g:1620:1: ( ( rule__ProcedureCall__ParameterValuesAssignment_1 )* )
            // InternalLogo.g:1621:2: ( rule__ProcedureCall__ParameterValuesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getParameterValuesAssignment_1()); 
            }
            // InternalLogo.g:1622:2: ( rule__ProcedureCall__ParameterValuesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT||(LA17_0>=11 && LA17_0<=12)||(LA17_0>=26 && LA17_0<=27)||LA17_0==32||LA17_0==35||(LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLogo.g:1622:3: rule__ProcedureCall__ParameterValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ProcedureCall__ParameterValuesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getParameterValuesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalLogo.g:1631:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1635:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalLogo.g:1636:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalLogo.g:1643:1: rule__Block__Group__0__Impl : ( '[' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1647:1: ( ( '[' ) )
            // InternalLogo.g:1648:1: ( '[' )
            {
            // InternalLogo.g:1648:1: ( '[' )
            // InternalLogo.g:1649:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalLogo.g:1658:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1662:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalLogo.g:1663:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalLogo.g:1670:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1674:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalLogo.g:1675:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalLogo.g:1675:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalLogo.g:1676:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalLogo.g:1676:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalLogo.g:1677:3: ( rule__Block__StatementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            }
            // InternalLogo.g:1678:3: ( rule__Block__StatementsAssignment_1 )
            // InternalLogo.g:1678:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Block__StatementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            }

            }

            // InternalLogo.g:1681:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalLogo.g:1682:3: ( rule__Block__StatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            }
            // InternalLogo.g:1683:3: ( rule__Block__StatementsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=13 && LA18_0<=18)||LA18_0==20||(LA18_0>=22 && LA18_0<=25)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLogo.g:1683:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalLogo.g:1692:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1696:1: ( rule__Block__Group__2__Impl )
            // InternalLogo.g:1697:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalLogo.g:1703:1: rule__Block__Group__2__Impl : ( ']' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1707:1: ( ( ']' ) )
            // InternalLogo.g:1708:1: ( ']' )
            {
            // InternalLogo.g:1708:1: ( ']' )
            // InternalLogo.g:1709:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalLogo.g:1719:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1723:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalLogo.g:1724:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalLogo.g:1731:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1735:1: ( ( 'if' ) )
            // InternalLogo.g:1736:1: ( 'if' )
            {
            // InternalLogo.g:1736:1: ( 'if' )
            // InternalLogo.g:1737:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalLogo.g:1746:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1750:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalLogo.g:1751:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalLogo.g:1758:1: rule__If__Group__1__Impl : ( ( rule__If__Alternatives_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1762:1: ( ( ( rule__If__Alternatives_1 ) ) )
            // InternalLogo.g:1763:1: ( ( rule__If__Alternatives_1 ) )
            {
            // InternalLogo.g:1763:1: ( ( rule__If__Alternatives_1 ) )
            // InternalLogo.g:1764:2: ( rule__If__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_1()); 
            }
            // InternalLogo.g:1765:2: ( rule__If__Alternatives_1 )
            // InternalLogo.g:1765:3: rule__If__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalLogo.g:1773:1: rule__If__Group__2 : rule__If__Group__2__Impl ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1777:1: ( rule__If__Group__2__Impl )
            // InternalLogo.g:1778:2: rule__If__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalLogo.g:1784:1: rule__If__Group__2__Impl : ( ( rule__If__IfBlockAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1788:1: ( ( ( rule__If__IfBlockAssignment_2 ) ) )
            // InternalLogo.g:1789:1: ( ( rule__If__IfBlockAssignment_2 ) )
            {
            // InternalLogo.g:1789:1: ( ( rule__If__IfBlockAssignment_2 ) )
            // InternalLogo.g:1790:2: ( rule__If__IfBlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfBlockAssignment_2()); 
            }
            // InternalLogo.g:1791:2: ( rule__If__IfBlockAssignment_2 )
            // InternalLogo.g:1791:3: rule__If__IfBlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__IfBlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfBlockAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group_1_1__0"
    // InternalLogo.g:1800:1: rule__If__Group_1_1__0 : rule__If__Group_1_1__0__Impl rule__If__Group_1_1__1 ;
    public final void rule__If__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1804:1: ( rule__If__Group_1_1__0__Impl rule__If__Group_1_1__1 )
            // InternalLogo.g:1805:2: rule__If__Group_1_1__0__Impl rule__If__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__If__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__0"


    // $ANTLR start "rule__If__Group_1_1__0__Impl"
    // InternalLogo.g:1812:1: rule__If__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__If__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1816:1: ( ( '[' ) )
            // InternalLogo.g:1817:1: ( '[' )
            {
            // InternalLogo.g:1817:1: ( '[' )
            // InternalLogo.g:1818:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__0__Impl"


    // $ANTLR start "rule__If__Group_1_1__1"
    // InternalLogo.g:1827:1: rule__If__Group_1_1__1 : rule__If__Group_1_1__1__Impl rule__If__Group_1_1__2 ;
    public final void rule__If__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1831:1: ( rule__If__Group_1_1__1__Impl rule__If__Group_1_1__2 )
            // InternalLogo.g:1832:2: rule__If__Group_1_1__1__Impl rule__If__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__If__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__1"


    // $ANTLR start "rule__If__Group_1_1__1__Impl"
    // InternalLogo.g:1839:1: rule__If__Group_1_1__1__Impl : ( ( rule__If__ConditionAssignment_1_1_1 ) ) ;
    public final void rule__If__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1843:1: ( ( ( rule__If__ConditionAssignment_1_1_1 ) ) )
            // InternalLogo.g:1844:1: ( ( rule__If__ConditionAssignment_1_1_1 ) )
            {
            // InternalLogo.g:1844:1: ( ( rule__If__ConditionAssignment_1_1_1 ) )
            // InternalLogo.g:1845:2: ( rule__If__ConditionAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionAssignment_1_1_1()); 
            }
            // InternalLogo.g:1846:2: ( rule__If__ConditionAssignment_1_1_1 )
            // InternalLogo.g:1846:3: rule__If__ConditionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__1__Impl"


    // $ANTLR start "rule__If__Group_1_1__2"
    // InternalLogo.g:1854:1: rule__If__Group_1_1__2 : rule__If__Group_1_1__2__Impl ;
    public final void rule__If__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1858:1: ( rule__If__Group_1_1__2__Impl )
            // InternalLogo.g:1859:2: rule__If__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__2"


    // $ANTLR start "rule__If__Group_1_1__2__Impl"
    // InternalLogo.g:1865:1: rule__If__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__If__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1869:1: ( ( ']' ) )
            // InternalLogo.g:1870:1: ( ']' )
            {
            // InternalLogo.g:1870:1: ( ']' )
            // InternalLogo.g:1871:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getRightSquareBracketKeyword_1_1_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getRightSquareBracketKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_1_1__2__Impl"


    // $ANTLR start "rule__IfElse__Group__0"
    // InternalLogo.g:1881:1: rule__IfElse__Group__0 : rule__IfElse__Group__0__Impl rule__IfElse__Group__1 ;
    public final void rule__IfElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1885:1: ( rule__IfElse__Group__0__Impl rule__IfElse__Group__1 )
            // InternalLogo.g:1886:2: rule__IfElse__Group__0__Impl rule__IfElse__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__IfElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__0"


    // $ANTLR start "rule__IfElse__Group__0__Impl"
    // InternalLogo.g:1893:1: rule__IfElse__Group__0__Impl : ( 'ifelse' ) ;
    public final void rule__IfElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1897:1: ( ( 'ifelse' ) )
            // InternalLogo.g:1898:1: ( 'ifelse' )
            {
            // InternalLogo.g:1898:1: ( 'ifelse' )
            // InternalLogo.g:1899:2: 'ifelse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfelseKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfelseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__0__Impl"


    // $ANTLR start "rule__IfElse__Group__1"
    // InternalLogo.g:1908:1: rule__IfElse__Group__1 : rule__IfElse__Group__1__Impl rule__IfElse__Group__2 ;
    public final void rule__IfElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1912:1: ( rule__IfElse__Group__1__Impl rule__IfElse__Group__2 )
            // InternalLogo.g:1913:2: rule__IfElse__Group__1__Impl rule__IfElse__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__IfElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__1"


    // $ANTLR start "rule__IfElse__Group__1__Impl"
    // InternalLogo.g:1920:1: rule__IfElse__Group__1__Impl : ( ( rule__IfElse__Alternatives_1 ) ) ;
    public final void rule__IfElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1924:1: ( ( ( rule__IfElse__Alternatives_1 ) ) )
            // InternalLogo.g:1925:1: ( ( rule__IfElse__Alternatives_1 ) )
            {
            // InternalLogo.g:1925:1: ( ( rule__IfElse__Alternatives_1 ) )
            // InternalLogo.g:1926:2: ( rule__IfElse__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getAlternatives_1()); 
            }
            // InternalLogo.g:1927:2: ( rule__IfElse__Alternatives_1 )
            // InternalLogo.g:1927:3: rule__IfElse__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__1__Impl"


    // $ANTLR start "rule__IfElse__Group__2"
    // InternalLogo.g:1935:1: rule__IfElse__Group__2 : rule__IfElse__Group__2__Impl rule__IfElse__Group__3 ;
    public final void rule__IfElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1939:1: ( rule__IfElse__Group__2__Impl rule__IfElse__Group__3 )
            // InternalLogo.g:1940:2: rule__IfElse__Group__2__Impl rule__IfElse__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__IfElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__2"


    // $ANTLR start "rule__IfElse__Group__2__Impl"
    // InternalLogo.g:1947:1: rule__IfElse__Group__2__Impl : ( ( rule__IfElse__IfBlockAssignment_2 ) ) ;
    public final void rule__IfElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1951:1: ( ( ( rule__IfElse__IfBlockAssignment_2 ) ) )
            // InternalLogo.g:1952:1: ( ( rule__IfElse__IfBlockAssignment_2 ) )
            {
            // InternalLogo.g:1952:1: ( ( rule__IfElse__IfBlockAssignment_2 ) )
            // InternalLogo.g:1953:2: ( rule__IfElse__IfBlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfBlockAssignment_2()); 
            }
            // InternalLogo.g:1954:2: ( rule__IfElse__IfBlockAssignment_2 )
            // InternalLogo.g:1954:3: rule__IfElse__IfBlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__IfBlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfBlockAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__2__Impl"


    // $ANTLR start "rule__IfElse__Group__3"
    // InternalLogo.g:1962:1: rule__IfElse__Group__3 : rule__IfElse__Group__3__Impl ;
    public final void rule__IfElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1966:1: ( rule__IfElse__Group__3__Impl )
            // InternalLogo.g:1967:2: rule__IfElse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__3"


    // $ANTLR start "rule__IfElse__Group__3__Impl"
    // InternalLogo.g:1973:1: rule__IfElse__Group__3__Impl : ( ( rule__IfElse__ElseBlockAssignment_3 ) ) ;
    public final void rule__IfElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1977:1: ( ( ( rule__IfElse__ElseBlockAssignment_3 ) ) )
            // InternalLogo.g:1978:1: ( ( rule__IfElse__ElseBlockAssignment_3 ) )
            {
            // InternalLogo.g:1978:1: ( ( rule__IfElse__ElseBlockAssignment_3 ) )
            // InternalLogo.g:1979:2: ( rule__IfElse__ElseBlockAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getElseBlockAssignment_3()); 
            }
            // InternalLogo.g:1980:2: ( rule__IfElse__ElseBlockAssignment_3 )
            // InternalLogo.g:1980:3: rule__IfElse__ElseBlockAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__ElseBlockAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getElseBlockAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group__3__Impl"


    // $ANTLR start "rule__IfElse__Group_1_1__0"
    // InternalLogo.g:1989:1: rule__IfElse__Group_1_1__0 : rule__IfElse__Group_1_1__0__Impl rule__IfElse__Group_1_1__1 ;
    public final void rule__IfElse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:1993:1: ( rule__IfElse__Group_1_1__0__Impl rule__IfElse__Group_1_1__1 )
            // InternalLogo.g:1994:2: rule__IfElse__Group_1_1__0__Impl rule__IfElse__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__IfElse__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__0"


    // $ANTLR start "rule__IfElse__Group_1_1__0__Impl"
    // InternalLogo.g:2001:1: rule__IfElse__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__IfElse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2005:1: ( ( '[' ) )
            // InternalLogo.g:2006:1: ( '[' )
            {
            // InternalLogo.g:2006:1: ( '[' )
            // InternalLogo.g:2007:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__0__Impl"


    // $ANTLR start "rule__IfElse__Group_1_1__1"
    // InternalLogo.g:2016:1: rule__IfElse__Group_1_1__1 : rule__IfElse__Group_1_1__1__Impl rule__IfElse__Group_1_1__2 ;
    public final void rule__IfElse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2020:1: ( rule__IfElse__Group_1_1__1__Impl rule__IfElse__Group_1_1__2 )
            // InternalLogo.g:2021:2: rule__IfElse__Group_1_1__1__Impl rule__IfElse__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__IfElse__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfElse__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__1"


    // $ANTLR start "rule__IfElse__Group_1_1__1__Impl"
    // InternalLogo.g:2028:1: rule__IfElse__Group_1_1__1__Impl : ( ( rule__IfElse__ConditionAssignment_1_1_1 ) ) ;
    public final void rule__IfElse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2032:1: ( ( ( rule__IfElse__ConditionAssignment_1_1_1 ) ) )
            // InternalLogo.g:2033:1: ( ( rule__IfElse__ConditionAssignment_1_1_1 ) )
            {
            // InternalLogo.g:2033:1: ( ( rule__IfElse__ConditionAssignment_1_1_1 ) )
            // InternalLogo.g:2034:2: ( rule__IfElse__ConditionAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getConditionAssignment_1_1_1()); 
            }
            // InternalLogo.g:2035:2: ( rule__IfElse__ConditionAssignment_1_1_1 )
            // InternalLogo.g:2035:3: rule__IfElse__ConditionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__ConditionAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getConditionAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__1__Impl"


    // $ANTLR start "rule__IfElse__Group_1_1__2"
    // InternalLogo.g:2043:1: rule__IfElse__Group_1_1__2 : rule__IfElse__Group_1_1__2__Impl ;
    public final void rule__IfElse__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2047:1: ( rule__IfElse__Group_1_1__2__Impl )
            // InternalLogo.g:2048:2: rule__IfElse__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfElse__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__2"


    // $ANTLR start "rule__IfElse__Group_1_1__2__Impl"
    // InternalLogo.g:2054:1: rule__IfElse__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__IfElse__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2058:1: ( ( ']' ) )
            // InternalLogo.g:2059:1: ( ']' )
            {
            // InternalLogo.g:2059:1: ( ']' )
            // InternalLogo.g:2060:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getRightSquareBracketKeyword_1_1_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getRightSquareBracketKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__Group_1_1__2__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalLogo.g:2070:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2074:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalLogo.g:2075:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalLogo.g:2082:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2086:1: ( ( 'while' ) )
            // InternalLogo.g:2087:1: ( 'while' )
            {
            // InternalLogo.g:2087:1: ( 'while' )
            // InternalLogo.g:2088:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalLogo.g:2097:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2101:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalLogo.g:2102:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalLogo.g:2109:1: rule__While__Group__1__Impl : ( ( rule__While__Alternatives_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2113:1: ( ( ( rule__While__Alternatives_1 ) ) )
            // InternalLogo.g:2114:1: ( ( rule__While__Alternatives_1 ) )
            {
            // InternalLogo.g:2114:1: ( ( rule__While__Alternatives_1 ) )
            // InternalLogo.g:2115:2: ( rule__While__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getAlternatives_1()); 
            }
            // InternalLogo.g:2116:2: ( rule__While__Alternatives_1 )
            // InternalLogo.g:2116:3: rule__While__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__While__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalLogo.g:2124:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2128:1: ( rule__While__Group__2__Impl )
            // InternalLogo.g:2129:2: rule__While__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalLogo.g:2135:1: rule__While__Group__2__Impl : ( ( rule__While__BlockAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2139:1: ( ( ( rule__While__BlockAssignment_2 ) ) )
            // InternalLogo.g:2140:1: ( ( rule__While__BlockAssignment_2 ) )
            {
            // InternalLogo.g:2140:1: ( ( rule__While__BlockAssignment_2 ) )
            // InternalLogo.g:2141:2: ( rule__While__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            }
            // InternalLogo.g:2142:2: ( rule__While__BlockAssignment_2 )
            // InternalLogo.g:2142:3: rule__While__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__While__BlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group_1_1__0"
    // InternalLogo.g:2151:1: rule__While__Group_1_1__0 : rule__While__Group_1_1__0__Impl rule__While__Group_1_1__1 ;
    public final void rule__While__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2155:1: ( rule__While__Group_1_1__0__Impl rule__While__Group_1_1__1 )
            // InternalLogo.g:2156:2: rule__While__Group_1_1__0__Impl rule__While__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__While__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__0"


    // $ANTLR start "rule__While__Group_1_1__0__Impl"
    // InternalLogo.g:2163:1: rule__While__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__While__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2167:1: ( ( '[' ) )
            // InternalLogo.g:2168:1: ( '[' )
            {
            // InternalLogo.g:2168:1: ( '[' )
            // InternalLogo.g:2169:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getLeftSquareBracketKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__0__Impl"


    // $ANTLR start "rule__While__Group_1_1__1"
    // InternalLogo.g:2178:1: rule__While__Group_1_1__1 : rule__While__Group_1_1__1__Impl rule__While__Group_1_1__2 ;
    public final void rule__While__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2182:1: ( rule__While__Group_1_1__1__Impl rule__While__Group_1_1__2 )
            // InternalLogo.g:2183:2: rule__While__Group_1_1__1__Impl rule__While__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__While__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__1"


    // $ANTLR start "rule__While__Group_1_1__1__Impl"
    // InternalLogo.g:2190:1: rule__While__Group_1_1__1__Impl : ( ( rule__While__ConditionAssignment_1_1_1 ) ) ;
    public final void rule__While__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2194:1: ( ( ( rule__While__ConditionAssignment_1_1_1 ) ) )
            // InternalLogo.g:2195:1: ( ( rule__While__ConditionAssignment_1_1_1 ) )
            {
            // InternalLogo.g:2195:1: ( ( rule__While__ConditionAssignment_1_1_1 ) )
            // InternalLogo.g:2196:2: ( rule__While__ConditionAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionAssignment_1_1_1()); 
            }
            // InternalLogo.g:2197:2: ( rule__While__ConditionAssignment_1_1_1 )
            // InternalLogo.g:2197:3: rule__While__ConditionAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__1__Impl"


    // $ANTLR start "rule__While__Group_1_1__2"
    // InternalLogo.g:2205:1: rule__While__Group_1_1__2 : rule__While__Group_1_1__2__Impl ;
    public final void rule__While__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2209:1: ( rule__While__Group_1_1__2__Impl )
            // InternalLogo.g:2210:2: rule__While__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__2"


    // $ANTLR start "rule__While__Group_1_1__2__Impl"
    // InternalLogo.g:2216:1: rule__While__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__While__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2220:1: ( ( ']' ) )
            // InternalLogo.g:2221:1: ( ']' )
            {
            // InternalLogo.g:2221:1: ( ']' )
            // InternalLogo.g:2222:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getRightSquareBracketKeyword_1_1_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getRightSquareBracketKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group_1_1__2__Impl"


    // $ANTLR start "rule__Repeat__Group__0"
    // InternalLogo.g:2232:1: rule__Repeat__Group__0 : rule__Repeat__Group__0__Impl rule__Repeat__Group__1 ;
    public final void rule__Repeat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2236:1: ( rule__Repeat__Group__0__Impl rule__Repeat__Group__1 )
            // InternalLogo.g:2237:2: rule__Repeat__Group__0__Impl rule__Repeat__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Repeat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__0"


    // $ANTLR start "rule__Repeat__Group__0__Impl"
    // InternalLogo.g:2244:1: rule__Repeat__Group__0__Impl : ( 'repeat' ) ;
    public final void rule__Repeat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2248:1: ( ( 'repeat' ) )
            // InternalLogo.g:2249:1: ( 'repeat' )
            {
            // InternalLogo.g:2249:1: ( 'repeat' )
            // InternalLogo.g:2250:2: 'repeat'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__0__Impl"


    // $ANTLR start "rule__Repeat__Group__1"
    // InternalLogo.g:2259:1: rule__Repeat__Group__1 : rule__Repeat__Group__1__Impl rule__Repeat__Group__2 ;
    public final void rule__Repeat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2263:1: ( rule__Repeat__Group__1__Impl rule__Repeat__Group__2 )
            // InternalLogo.g:2264:2: rule__Repeat__Group__1__Impl rule__Repeat__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Repeat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__1"


    // $ANTLR start "rule__Repeat__Group__1__Impl"
    // InternalLogo.g:2271:1: rule__Repeat__Group__1__Impl : ( ( rule__Repeat__ConditionAssignment_1 ) ) ;
    public final void rule__Repeat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2275:1: ( ( ( rule__Repeat__ConditionAssignment_1 ) ) )
            // InternalLogo.g:2276:1: ( ( rule__Repeat__ConditionAssignment_1 ) )
            {
            // InternalLogo.g:2276:1: ( ( rule__Repeat__ConditionAssignment_1 ) )
            // InternalLogo.g:2277:2: ( rule__Repeat__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getConditionAssignment_1()); 
            }
            // InternalLogo.g:2278:2: ( rule__Repeat__ConditionAssignment_1 )
            // InternalLogo.g:2278:3: rule__Repeat__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__1__Impl"


    // $ANTLR start "rule__Repeat__Group__2"
    // InternalLogo.g:2286:1: rule__Repeat__Group__2 : rule__Repeat__Group__2__Impl ;
    public final void rule__Repeat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2290:1: ( rule__Repeat__Group__2__Impl )
            // InternalLogo.g:2291:2: rule__Repeat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__2"


    // $ANTLR start "rule__Repeat__Group__2__Impl"
    // InternalLogo.g:2297:1: rule__Repeat__Group__2__Impl : ( ( rule__Repeat__BlockAssignment_2 ) ) ;
    public final void rule__Repeat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2301:1: ( ( ( rule__Repeat__BlockAssignment_2 ) ) )
            // InternalLogo.g:2302:1: ( ( rule__Repeat__BlockAssignment_2 ) )
            {
            // InternalLogo.g:2302:1: ( ( rule__Repeat__BlockAssignment_2 ) )
            // InternalLogo.g:2303:2: ( rule__Repeat__BlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getBlockAssignment_2()); 
            }
            // InternalLogo.g:2304:2: ( rule__Repeat__BlockAssignment_2 )
            // InternalLogo.g:2304:3: rule__Repeat__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Repeat__BlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getBlockAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__Group__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalLogo.g:2313:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2317:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalLogo.g:2318:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalLogo.g:2325:1: rule__And__Group__0__Impl : ( 'and' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2329:1: ( ( 'and' ) )
            // InternalLogo.g:2330:1: ( 'and' )
            {
            // InternalLogo.g:2330:1: ( 'and' )
            // InternalLogo.g:2331:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalLogo.g:2340:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2344:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalLogo.g:2345:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalLogo.g:2352:1: rule__And__Group__1__Impl : ( ( rule__And__ExpressionsAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2356:1: ( ( ( rule__And__ExpressionsAssignment_1 ) ) )
            // InternalLogo.g:2357:1: ( ( rule__And__ExpressionsAssignment_1 ) )
            {
            // InternalLogo.g:2357:1: ( ( rule__And__ExpressionsAssignment_1 ) )
            // InternalLogo.g:2358:2: ( rule__And__ExpressionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpressionsAssignment_1()); 
            }
            // InternalLogo.g:2359:2: ( rule__And__ExpressionsAssignment_1 )
            // InternalLogo.g:2359:3: rule__And__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__And__ExpressionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpressionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalLogo.g:2367:1: rule__And__Group__2 : rule__And__Group__2__Impl ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2371:1: ( rule__And__Group__2__Impl )
            // InternalLogo.g:2372:2: rule__And__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalLogo.g:2378:1: rule__And__Group__2__Impl : ( ( ( rule__And__Group_2__0 ) ) ( ( rule__And__Group_2__0 )* ) ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2382:1: ( ( ( ( rule__And__Group_2__0 ) ) ( ( rule__And__Group_2__0 )* ) ) )
            // InternalLogo.g:2383:1: ( ( ( rule__And__Group_2__0 ) ) ( ( rule__And__Group_2__0 )* ) )
            {
            // InternalLogo.g:2383:1: ( ( ( rule__And__Group_2__0 ) ) ( ( rule__And__Group_2__0 )* ) )
            // InternalLogo.g:2384:2: ( ( rule__And__Group_2__0 ) ) ( ( rule__And__Group_2__0 )* )
            {
            // InternalLogo.g:2384:2: ( ( rule__And__Group_2__0 ) )
            // InternalLogo.g:2385:3: ( rule__And__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_2()); 
            }
            // InternalLogo.g:2386:3: ( rule__And__Group_2__0 )
            // InternalLogo.g:2386:4: rule__And__Group_2__0
            {
            pushFollow(FOLLOW_17);
            rule__And__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_2()); 
            }

            }

            // InternalLogo.g:2389:2: ( ( rule__And__Group_2__0 )* )
            // InternalLogo.g:2390:3: ( rule__And__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_2()); 
            }
            // InternalLogo.g:2391:3: ( rule__And__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalLogo.g:2391:4: rule__And__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__And__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group_2__0"
    // InternalLogo.g:2401:1: rule__And__Group_2__0 : rule__And__Group_2__0__Impl ;
    public final void rule__And__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2405:1: ( rule__And__Group_2__0__Impl )
            // InternalLogo.g:2406:2: rule__And__Group_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__0"


    // $ANTLR start "rule__And__Group_2__0__Impl"
    // InternalLogo.g:2412:1: rule__And__Group_2__0__Impl : ( ( rule__And__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__And__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2416:1: ( ( ( rule__And__ExpressionsAssignment_2_0 ) ) )
            // InternalLogo.g:2417:1: ( ( rule__And__ExpressionsAssignment_2_0 ) )
            {
            // InternalLogo.g:2417:1: ( ( rule__And__ExpressionsAssignment_2_0 ) )
            // InternalLogo.g:2418:2: ( rule__And__ExpressionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpressionsAssignment_2_0()); 
            }
            // InternalLogo.g:2419:2: ( rule__And__ExpressionsAssignment_2_0 )
            // InternalLogo.g:2419:3: rule__And__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__And__ExpressionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpressionsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_2__0__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalLogo.g:2428:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2432:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalLogo.g:2433:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalLogo.g:2440:1: rule__Or__Group__0__Impl : ( 'or' ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2444:1: ( ( 'or' ) )
            // InternalLogo.g:2445:1: ( 'or' )
            {
            // InternalLogo.g:2445:1: ( 'or' )
            // InternalLogo.g:2446:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalLogo.g:2455:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2459:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // InternalLogo.g:2460:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalLogo.g:2467:1: rule__Or__Group__1__Impl : ( ( rule__Or__ExpressionsAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2471:1: ( ( ( rule__Or__ExpressionsAssignment_1 ) ) )
            // InternalLogo.g:2472:1: ( ( rule__Or__ExpressionsAssignment_1 ) )
            {
            // InternalLogo.g:2472:1: ( ( rule__Or__ExpressionsAssignment_1 ) )
            // InternalLogo.g:2473:2: ( rule__Or__ExpressionsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpressionsAssignment_1()); 
            }
            // InternalLogo.g:2474:2: ( rule__Or__ExpressionsAssignment_1 )
            // InternalLogo.g:2474:3: rule__Or__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__ExpressionsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpressionsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // InternalLogo.g:2482:1: rule__Or__Group__2 : rule__Or__Group__2__Impl ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2486:1: ( rule__Or__Group__2__Impl )
            // InternalLogo.g:2487:2: rule__Or__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // InternalLogo.g:2493:1: rule__Or__Group__2__Impl : ( ( ( rule__Or__Group_2__0 ) ) ( ( rule__Or__Group_2__0 )* ) ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2497:1: ( ( ( ( rule__Or__Group_2__0 ) ) ( ( rule__Or__Group_2__0 )* ) ) )
            // InternalLogo.g:2498:1: ( ( ( rule__Or__Group_2__0 ) ) ( ( rule__Or__Group_2__0 )* ) )
            {
            // InternalLogo.g:2498:1: ( ( ( rule__Or__Group_2__0 ) ) ( ( rule__Or__Group_2__0 )* ) )
            // InternalLogo.g:2499:2: ( ( rule__Or__Group_2__0 ) ) ( ( rule__Or__Group_2__0 )* )
            {
            // InternalLogo.g:2499:2: ( ( rule__Or__Group_2__0 ) )
            // InternalLogo.g:2500:3: ( rule__Or__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_2()); 
            }
            // InternalLogo.g:2501:3: ( rule__Or__Group_2__0 )
            // InternalLogo.g:2501:4: rule__Or__Group_2__0
            {
            pushFollow(FOLLOW_17);
            rule__Or__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_2()); 
            }

            }

            // InternalLogo.g:2504:2: ( ( rule__Or__Group_2__0 )* )
            // InternalLogo.g:2505:3: ( rule__Or__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_2()); 
            }
            // InternalLogo.g:2506:3: ( rule__Or__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalLogo.g:2506:4: rule__Or__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Or__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group_2__0"
    // InternalLogo.g:2516:1: rule__Or__Group_2__0 : rule__Or__Group_2__0__Impl ;
    public final void rule__Or__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2520:1: ( rule__Or__Group_2__0__Impl )
            // InternalLogo.g:2521:2: rule__Or__Group_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__0"


    // $ANTLR start "rule__Or__Group_2__0__Impl"
    // InternalLogo.g:2527:1: rule__Or__Group_2__0__Impl : ( ( rule__Or__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__Or__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2531:1: ( ( ( rule__Or__ExpressionsAssignment_2_0 ) ) )
            // InternalLogo.g:2532:1: ( ( rule__Or__ExpressionsAssignment_2_0 ) )
            {
            // InternalLogo.g:2532:1: ( ( rule__Or__ExpressionsAssignment_2_0 ) )
            // InternalLogo.g:2533:2: ( rule__Or__ExpressionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpressionsAssignment_2_0()); 
            }
            // InternalLogo.g:2534:2: ( rule__Or__ExpressionsAssignment_2_0 )
            // InternalLogo.g:2534:3: rule__Or__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Or__ExpressionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpressionsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_2__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group__0"
    // InternalLogo.g:2543:1: rule__EqualsGreaterLower__Group__0 : rule__EqualsGreaterLower__Group__0__Impl rule__EqualsGreaterLower__Group__1 ;
    public final void rule__EqualsGreaterLower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2547:1: ( rule__EqualsGreaterLower__Group__0__Impl rule__EqualsGreaterLower__Group__1 )
            // InternalLogo.g:2548:2: rule__EqualsGreaterLower__Group__0__Impl rule__EqualsGreaterLower__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EqualsGreaterLower__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group__0"


    // $ANTLR start "rule__EqualsGreaterLower__Group__0__Impl"
    // InternalLogo.g:2555:1: rule__EqualsGreaterLower__Group__0__Impl : ( rulePlusMinus ) ;
    public final void rule__EqualsGreaterLower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2559:1: ( ( rulePlusMinus ) )
            // InternalLogo.g:2560:1: ( rulePlusMinus )
            {
            // InternalLogo.g:2560:1: ( rulePlusMinus )
            // InternalLogo.g:2561:2: rulePlusMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getPlusMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getPlusMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group__1"
    // InternalLogo.g:2570:1: rule__EqualsGreaterLower__Group__1 : rule__EqualsGreaterLower__Group__1__Impl ;
    public final void rule__EqualsGreaterLower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2574:1: ( rule__EqualsGreaterLower__Group__1__Impl )
            // InternalLogo.g:2575:2: rule__EqualsGreaterLower__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group__1"


    // $ANTLR start "rule__EqualsGreaterLower__Group__1__Impl"
    // InternalLogo.g:2581:1: rule__EqualsGreaterLower__Group__1__Impl : ( ( rule__EqualsGreaterLower__Group_1__0 )* ) ;
    public final void rule__EqualsGreaterLower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2585:1: ( ( ( rule__EqualsGreaterLower__Group_1__0 )* ) )
            // InternalLogo.g:2586:1: ( ( rule__EqualsGreaterLower__Group_1__0 )* )
            {
            // InternalLogo.g:2586:1: ( ( rule__EqualsGreaterLower__Group_1__0 )* )
            // InternalLogo.g:2587:2: ( rule__EqualsGreaterLower__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1()); 
            }
            // InternalLogo.g:2588:2: ( rule__EqualsGreaterLower__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=28 && LA21_0<=30)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLogo.g:2588:3: rule__EqualsGreaterLower__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EqualsGreaterLower__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group__1__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1__0"
    // InternalLogo.g:2597:1: rule__EqualsGreaterLower__Group_1__0 : rule__EqualsGreaterLower__Group_1__0__Impl rule__EqualsGreaterLower__Group_1__1 ;
    public final void rule__EqualsGreaterLower__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2601:1: ( rule__EqualsGreaterLower__Group_1__0__Impl rule__EqualsGreaterLower__Group_1__1 )
            // InternalLogo.g:2602:2: rule__EqualsGreaterLower__Group_1__0__Impl rule__EqualsGreaterLower__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__EqualsGreaterLower__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1__0"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1__0__Impl"
    // InternalLogo.g:2609:1: rule__EqualsGreaterLower__Group_1__0__Impl : ( ( rule__EqualsGreaterLower__Alternatives_1_0 ) ) ;
    public final void rule__EqualsGreaterLower__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2613:1: ( ( ( rule__EqualsGreaterLower__Alternatives_1_0 ) ) )
            // InternalLogo.g:2614:1: ( ( rule__EqualsGreaterLower__Alternatives_1_0 ) )
            {
            // InternalLogo.g:2614:1: ( ( rule__EqualsGreaterLower__Alternatives_1_0 ) )
            // InternalLogo.g:2615:2: ( rule__EqualsGreaterLower__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getAlternatives_1_0()); 
            }
            // InternalLogo.g:2616:2: ( rule__EqualsGreaterLower__Alternatives_1_0 )
            // InternalLogo.g:2616:3: rule__EqualsGreaterLower__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1__1"
    // InternalLogo.g:2624:1: rule__EqualsGreaterLower__Group_1__1 : rule__EqualsGreaterLower__Group_1__1__Impl ;
    public final void rule__EqualsGreaterLower__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2628:1: ( rule__EqualsGreaterLower__Group_1__1__Impl )
            // InternalLogo.g:2629:2: rule__EqualsGreaterLower__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1__1"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1__1__Impl"
    // InternalLogo.g:2635:1: rule__EqualsGreaterLower__Group_1__1__Impl : ( ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__EqualsGreaterLower__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2639:1: ( ( ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 ) ) )
            // InternalLogo.g:2640:1: ( ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 ) )
            {
            // InternalLogo.g:2640:1: ( ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 ) )
            // InternalLogo.g:2641:2: ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionAssignment_1_1()); 
            }
            // InternalLogo.g:2642:2: ( rule__EqualsGreaterLower__RightExpressionAssignment_1_1 )
            // InternalLogo.g:2642:3: rule__EqualsGreaterLower__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__RightExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1__1__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_0__0"
    // InternalLogo.g:2651:1: rule__EqualsGreaterLower__Group_1_0_0__0 : rule__EqualsGreaterLower__Group_1_0_0__0__Impl rule__EqualsGreaterLower__Group_1_0_0__1 ;
    public final void rule__EqualsGreaterLower__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2655:1: ( rule__EqualsGreaterLower__Group_1_0_0__0__Impl rule__EqualsGreaterLower__Group_1_0_0__1 )
            // InternalLogo.g:2656:2: rule__EqualsGreaterLower__Group_1_0_0__0__Impl rule__EqualsGreaterLower__Group_1_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__EqualsGreaterLower__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_0__0"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_0__0__Impl"
    // InternalLogo.g:2663:1: rule__EqualsGreaterLower__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2667:1: ( ( () ) )
            // InternalLogo.g:2668:1: ( () )
            {
            // InternalLogo.g:2668:1: ( () )
            // InternalLogo.g:2669:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getEqualsLeftExpressionAction_1_0_0_0()); 
            }
            // InternalLogo.g:2670:2: ()
            // InternalLogo.g:2670:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getEqualsLeftExpressionAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_0__1"
    // InternalLogo.g:2678:1: rule__EqualsGreaterLower__Group_1_0_0__1 : rule__EqualsGreaterLower__Group_1_0_0__1__Impl ;
    public final void rule__EqualsGreaterLower__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2682:1: ( rule__EqualsGreaterLower__Group_1_0_0__1__Impl )
            // InternalLogo.g:2683:2: rule__EqualsGreaterLower__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_0__1"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_0__1__Impl"
    // InternalLogo.g:2689:1: rule__EqualsGreaterLower__Group_1_0_0__1__Impl : ( '=' ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2693:1: ( ( '=' ) )
            // InternalLogo.g:2694:1: ( '=' )
            {
            // InternalLogo.g:2694:1: ( '=' )
            // InternalLogo.g:2695:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_1__0"
    // InternalLogo.g:2705:1: rule__EqualsGreaterLower__Group_1_0_1__0 : rule__EqualsGreaterLower__Group_1_0_1__0__Impl rule__EqualsGreaterLower__Group_1_0_1__1 ;
    public final void rule__EqualsGreaterLower__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2709:1: ( rule__EqualsGreaterLower__Group_1_0_1__0__Impl rule__EqualsGreaterLower__Group_1_0_1__1 )
            // InternalLogo.g:2710:2: rule__EqualsGreaterLower__Group_1_0_1__0__Impl rule__EqualsGreaterLower__Group_1_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__EqualsGreaterLower__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_1__0"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_1__0__Impl"
    // InternalLogo.g:2717:1: rule__EqualsGreaterLower__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2721:1: ( ( () ) )
            // InternalLogo.g:2722:1: ( () )
            {
            // InternalLogo.g:2722:1: ( () )
            // InternalLogo.g:2723:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getGreaterLeftExpressionAction_1_0_1_0()); 
            }
            // InternalLogo.g:2724:2: ()
            // InternalLogo.g:2724:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getGreaterLeftExpressionAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_1__1"
    // InternalLogo.g:2732:1: rule__EqualsGreaterLower__Group_1_0_1__1 : rule__EqualsGreaterLower__Group_1_0_1__1__Impl ;
    public final void rule__EqualsGreaterLower__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2736:1: ( rule__EqualsGreaterLower__Group_1_0_1__1__Impl )
            // InternalLogo.g:2737:2: rule__EqualsGreaterLower__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_1__1"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_1__1__Impl"
    // InternalLogo.g:2743:1: rule__EqualsGreaterLower__Group_1_0_1__1__Impl : ( '>' ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2747:1: ( ( '>' ) )
            // InternalLogo.g:2748:1: ( '>' )
            {
            // InternalLogo.g:2748:1: ( '>' )
            // InternalLogo.g:2749:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getGreaterThanSignKeyword_1_0_1_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getGreaterThanSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_2__0"
    // InternalLogo.g:2759:1: rule__EqualsGreaterLower__Group_1_0_2__0 : rule__EqualsGreaterLower__Group_1_0_2__0__Impl rule__EqualsGreaterLower__Group_1_0_2__1 ;
    public final void rule__EqualsGreaterLower__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2763:1: ( rule__EqualsGreaterLower__Group_1_0_2__0__Impl rule__EqualsGreaterLower__Group_1_0_2__1 )
            // InternalLogo.g:2764:2: rule__EqualsGreaterLower__Group_1_0_2__0__Impl rule__EqualsGreaterLower__Group_1_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__EqualsGreaterLower__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_2__0"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_2__0__Impl"
    // InternalLogo.g:2771:1: rule__EqualsGreaterLower__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2775:1: ( ( () ) )
            // InternalLogo.g:2776:1: ( () )
            {
            // InternalLogo.g:2776:1: ( () )
            // InternalLogo.g:2777:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getLowerLeftExpressionAction_1_0_2_0()); 
            }
            // InternalLogo.g:2778:2: ()
            // InternalLogo.g:2778:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getLowerLeftExpressionAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_2__1"
    // InternalLogo.g:2786:1: rule__EqualsGreaterLower__Group_1_0_2__1 : rule__EqualsGreaterLower__Group_1_0_2__1__Impl ;
    public final void rule__EqualsGreaterLower__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2790:1: ( rule__EqualsGreaterLower__Group_1_0_2__1__Impl )
            // InternalLogo.g:2791:2: rule__EqualsGreaterLower__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualsGreaterLower__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_2__1"


    // $ANTLR start "rule__EqualsGreaterLower__Group_1_0_2__1__Impl"
    // InternalLogo.g:2797:1: rule__EqualsGreaterLower__Group_1_0_2__1__Impl : ( '<' ) ;
    public final void rule__EqualsGreaterLower__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2801:1: ( ( '<' ) )
            // InternalLogo.g:2802:1: ( '<' )
            {
            // InternalLogo.g:2802:1: ( '<' )
            // InternalLogo.g:2803:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getLessThanSignKeyword_1_0_2_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getLessThanSignKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalLogo.g:2813:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2817:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalLogo.g:2818:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalLogo.g:2825:1: rule__PlusMinus__Group__0__Impl : ( ruleMultDiv ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2829:1: ( ( ruleMultDiv ) )
            // InternalLogo.g:2830:1: ( ruleMultDiv )
            {
            // InternalLogo.g:2830:1: ( ruleMultDiv )
            // InternalLogo.g:2831:2: ruleMultDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalLogo.g:2840:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2844:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalLogo.g:2845:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalLogo.g:2851:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Group_1__0 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2855:1: ( ( ( rule__PlusMinus__Group_1__0 )* ) )
            // InternalLogo.g:2856:1: ( ( rule__PlusMinus__Group_1__0 )* )
            {
            // InternalLogo.g:2856:1: ( ( rule__PlusMinus__Group_1__0 )* )
            // InternalLogo.g:2857:2: ( rule__PlusMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            }
            // InternalLogo.g:2858:2: ( rule__PlusMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalLogo.g:2858:3: rule__PlusMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PlusMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__0"
    // InternalLogo.g:2867:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2871:1: ( rule__PlusMinus__Group_1__0__Impl )
            // InternalLogo.g:2872:2: rule__PlusMinus__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1__0__Impl"
    // InternalLogo.g:2878:1: rule__PlusMinus__Group_1__0__Impl : ( ( rule__PlusMinus__Group_1_0__0 ) ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2882:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) )
            // InternalLogo.g:2883:1: ( ( rule__PlusMinus__Group_1_0__0 ) )
            {
            // InternalLogo.g:2883:1: ( ( rule__PlusMinus__Group_1_0__0 ) )
            // InternalLogo.g:2884:2: ( rule__PlusMinus__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
            }
            // InternalLogo.g:2885:2: ( rule__PlusMinus__Group_1_0__0 )
            // InternalLogo.g:2885:3: rule__PlusMinus__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0"
    // InternalLogo.g:2894:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2898:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalLogo.g:2899:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__PlusMinus__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0__Impl"
    // InternalLogo.g:2906:1: rule__PlusMinus__Group_1_0__0__Impl : ( ( rule__PlusMinus__Alternatives_1_0_0 ) ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2910:1: ( ( ( rule__PlusMinus__Alternatives_1_0_0 ) ) )
            // InternalLogo.g:2911:1: ( ( rule__PlusMinus__Alternatives_1_0_0 ) )
            {
            // InternalLogo.g:2911:1: ( ( rule__PlusMinus__Alternatives_1_0_0 ) )
            // InternalLogo.g:2912:2: ( rule__PlusMinus__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getAlternatives_1_0_0()); 
            }
            // InternalLogo.g:2913:2: ( rule__PlusMinus__Alternatives_1_0_0 )
            // InternalLogo.g:2913:3: rule__PlusMinus__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1"
    // InternalLogo.g:2921:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2925:1: ( rule__PlusMinus__Group_1_0__1__Impl )
            // InternalLogo.g:2926:2: rule__PlusMinus__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1__Impl"
    // InternalLogo.g:2932:1: rule__PlusMinus__Group_1_0__1__Impl : ( ( rule__PlusMinus__RightExpressionAssignment_1_0_1 ) ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2936:1: ( ( ( rule__PlusMinus__RightExpressionAssignment_1_0_1 ) ) )
            // InternalLogo.g:2937:1: ( ( rule__PlusMinus__RightExpressionAssignment_1_0_1 ) )
            {
            // InternalLogo.g:2937:1: ( ( rule__PlusMinus__RightExpressionAssignment_1_0_1 ) )
            // InternalLogo.g:2938:2: ( rule__PlusMinus__RightExpressionAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getRightExpressionAssignment_1_0_1()); 
            }
            // InternalLogo.g:2939:2: ( rule__PlusMinus__RightExpressionAssignment_1_0_1 )
            // InternalLogo.g:2939:3: rule__PlusMinus__RightExpressionAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightExpressionAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getRightExpressionAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_0__0"
    // InternalLogo.g:2948:1: rule__PlusMinus__Group_1_0_0_0__0 : rule__PlusMinus__Group_1_0_0_0__0__Impl rule__PlusMinus__Group_1_0_0_0__1 ;
    public final void rule__PlusMinus__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2952:1: ( rule__PlusMinus__Group_1_0_0_0__0__Impl rule__PlusMinus__Group_1_0_0_0__1 )
            // InternalLogo.g:2953:2: rule__PlusMinus__Group_1_0_0_0__0__Impl rule__PlusMinus__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__PlusMinus__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_0__0__Impl"
    // InternalLogo.g:2960:1: rule__PlusMinus__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2964:1: ( ( () ) )
            // InternalLogo.g:2965:1: ( () )
            {
            // InternalLogo.g:2965:1: ( () )
            // InternalLogo.g:2966:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getPlusLeftExpressionAction_1_0_0_0_0()); 
            }
            // InternalLogo.g:2967:2: ()
            // InternalLogo.g:2967:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getPlusLeftExpressionAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_0__1"
    // InternalLogo.g:2975:1: rule__PlusMinus__Group_1_0_0_0__1 : rule__PlusMinus__Group_1_0_0_0__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2979:1: ( rule__PlusMinus__Group_1_0_0_0__1__Impl )
            // InternalLogo.g:2980:2: rule__PlusMinus__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_0__1__Impl"
    // InternalLogo.g:2986:1: rule__PlusMinus__Group_1_0_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:2990:1: ( ( '+' ) )
            // InternalLogo.g:2991:1: ( '+' )
            {
            // InternalLogo.g:2991:1: ( '+' )
            // InternalLogo.g:2992:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_1__0"
    // InternalLogo.g:3002:1: rule__PlusMinus__Group_1_0_0_1__0 : rule__PlusMinus__Group_1_0_0_1__0__Impl rule__PlusMinus__Group_1_0_0_1__1 ;
    public final void rule__PlusMinus__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3006:1: ( rule__PlusMinus__Group_1_0_0_1__0__Impl rule__PlusMinus__Group_1_0_0_1__1 )
            // InternalLogo.g:3007:2: rule__PlusMinus__Group_1_0_0_1__0__Impl rule__PlusMinus__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusMinus__Group_1_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_1__0__Impl"
    // InternalLogo.g:3014:1: rule__PlusMinus__Group_1_0_0_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3018:1: ( ( () ) )
            // InternalLogo.g:3019:1: ( () )
            {
            // InternalLogo.g:3019:1: ( () )
            // InternalLogo.g:3020:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getMinusLeftExpressionAction_1_0_0_1_0()); 
            }
            // InternalLogo.g:3021:2: ()
            // InternalLogo.g:3021:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getMinusLeftExpressionAction_1_0_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_1__1"
    // InternalLogo.g:3029:1: rule__PlusMinus__Group_1_0_0_1__1 : rule__PlusMinus__Group_1_0_0_1__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3033:1: ( rule__PlusMinus__Group_1_0_0_1__1__Impl )
            // InternalLogo.g:3034:2: rule__PlusMinus__Group_1_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0_1__1__Impl"
    // InternalLogo.g:3040:1: rule__PlusMinus__Group_1_0_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3044:1: ( ( '-' ) )
            // InternalLogo.g:3045:1: ( '-' )
            {
            // InternalLogo.g:3045:1: ( '-' )
            // InternalLogo.g:3046:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__MultDiv__Group__0"
    // InternalLogo.g:3056:1: rule__MultDiv__Group__0 : rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1 ;
    public final void rule__MultDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3060:1: ( rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1 )
            // InternalLogo.g:3061:2: rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MultDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group__0"


    // $ANTLR start "rule__MultDiv__Group__0__Impl"
    // InternalLogo.g:3068:1: rule__MultDiv__Group__0__Impl : ( ruleNotOpposite ) ;
    public final void rule__MultDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3072:1: ( ( ruleNotOpposite ) )
            // InternalLogo.g:3073:1: ( ruleNotOpposite )
            {
            // InternalLogo.g:3073:1: ( ruleNotOpposite )
            // InternalLogo.g:3074:2: ruleNotOpposite
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getNotOppositeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNotOpposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getNotOppositeParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group__0__Impl"


    // $ANTLR start "rule__MultDiv__Group__1"
    // InternalLogo.g:3083:1: rule__MultDiv__Group__1 : rule__MultDiv__Group__1__Impl ;
    public final void rule__MultDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3087:1: ( rule__MultDiv__Group__1__Impl )
            // InternalLogo.g:3088:2: rule__MultDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group__1"


    // $ANTLR start "rule__MultDiv__Group__1__Impl"
    // InternalLogo.g:3094:1: rule__MultDiv__Group__1__Impl : ( ( rule__MultDiv__Group_1__0 )* ) ;
    public final void rule__MultDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3098:1: ( ( ( rule__MultDiv__Group_1__0 )* ) )
            // InternalLogo.g:3099:1: ( ( rule__MultDiv__Group_1__0 )* )
            {
            // InternalLogo.g:3099:1: ( ( rule__MultDiv__Group_1__0 )* )
            // InternalLogo.g:3100:2: ( rule__MultDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getGroup_1()); 
            }
            // InternalLogo.g:3101:2: ( rule__MultDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=33 && LA23_0<=34)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLogo.g:3101:3: rule__MultDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__MultDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group__1__Impl"


    // $ANTLR start "rule__MultDiv__Group_1__0"
    // InternalLogo.g:3110:1: rule__MultDiv__Group_1__0 : rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1 ;
    public final void rule__MultDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3114:1: ( rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1 )
            // InternalLogo.g:3115:2: rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__MultDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1__0"


    // $ANTLR start "rule__MultDiv__Group_1__0__Impl"
    // InternalLogo.g:3122:1: rule__MultDiv__Group_1__0__Impl : ( ( rule__MultDiv__Alternatives_1_0 ) ) ;
    public final void rule__MultDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3126:1: ( ( ( rule__MultDiv__Alternatives_1_0 ) ) )
            // InternalLogo.g:3127:1: ( ( rule__MultDiv__Alternatives_1_0 ) )
            {
            // InternalLogo.g:3127:1: ( ( rule__MultDiv__Alternatives_1_0 ) )
            // InternalLogo.g:3128:2: ( rule__MultDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getAlternatives_1_0()); 
            }
            // InternalLogo.g:3129:2: ( rule__MultDiv__Alternatives_1_0 )
            // InternalLogo.g:3129:3: rule__MultDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MultDiv__Group_1__1"
    // InternalLogo.g:3137:1: rule__MultDiv__Group_1__1 : rule__MultDiv__Group_1__1__Impl ;
    public final void rule__MultDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3141:1: ( rule__MultDiv__Group_1__1__Impl )
            // InternalLogo.g:3142:2: rule__MultDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1__1"


    // $ANTLR start "rule__MultDiv__Group_1__1__Impl"
    // InternalLogo.g:3148:1: rule__MultDiv__Group_1__1__Impl : ( ( rule__MultDiv__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__MultDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3152:1: ( ( ( rule__MultDiv__RightExpressionAssignment_1_1 ) ) )
            // InternalLogo.g:3153:1: ( ( rule__MultDiv__RightExpressionAssignment_1_1 ) )
            {
            // InternalLogo.g:3153:1: ( ( rule__MultDiv__RightExpressionAssignment_1_1 ) )
            // InternalLogo.g:3154:2: ( rule__MultDiv__RightExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getRightExpressionAssignment_1_1()); 
            }
            // InternalLogo.g:3155:2: ( rule__MultDiv__RightExpressionAssignment_1_1 )
            // InternalLogo.g:3155:3: rule__MultDiv__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__RightExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getRightExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MultDiv__Group_1_0_0__0"
    // InternalLogo.g:3164:1: rule__MultDiv__Group_1_0_0__0 : rule__MultDiv__Group_1_0_0__0__Impl rule__MultDiv__Group_1_0_0__1 ;
    public final void rule__MultDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3168:1: ( rule__MultDiv__Group_1_0_0__0__Impl rule__MultDiv__Group_1_0_0__1 )
            // InternalLogo.g:3169:2: rule__MultDiv__Group_1_0_0__0__Impl rule__MultDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_27);
            rule__MultDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MultDiv__Group_1_0_0__0__Impl"
    // InternalLogo.g:3176:1: rule__MultDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3180:1: ( ( () ) )
            // InternalLogo.g:3181:1: ( () )
            {
            // InternalLogo.g:3181:1: ( () )
            // InternalLogo.g:3182:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getMultLeftExpressionAction_1_0_0_0()); 
            }
            // InternalLogo.g:3183:2: ()
            // InternalLogo.g:3183:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getMultLeftExpressionAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultDiv__Group_1_0_0__1"
    // InternalLogo.g:3191:1: rule__MultDiv__Group_1_0_0__1 : rule__MultDiv__Group_1_0_0__1__Impl ;
    public final void rule__MultDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3195:1: ( rule__MultDiv__Group_1_0_0__1__Impl )
            // InternalLogo.g:3196:2: rule__MultDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MultDiv__Group_1_0_0__1__Impl"
    // InternalLogo.g:3202:1: rule__MultDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3206:1: ( ( '*' ) )
            // InternalLogo.g:3207:1: ( '*' )
            {
            // InternalLogo.g:3207:1: ( '*' )
            // InternalLogo.g:3208:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultDiv__Group_1_0_1__0"
    // InternalLogo.g:3218:1: rule__MultDiv__Group_1_0_1__0 : rule__MultDiv__Group_1_0_1__0__Impl rule__MultDiv__Group_1_0_1__1 ;
    public final void rule__MultDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3222:1: ( rule__MultDiv__Group_1_0_1__0__Impl rule__MultDiv__Group_1_0_1__1 )
            // InternalLogo.g:3223:2: rule__MultDiv__Group_1_0_1__0__Impl rule__MultDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MultDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MultDiv__Group_1_0_1__0__Impl"
    // InternalLogo.g:3230:1: rule__MultDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3234:1: ( ( () ) )
            // InternalLogo.g:3235:1: ( () )
            {
            // InternalLogo.g:3235:1: ( () )
            // InternalLogo.g:3236:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getDivLeftExpressionAction_1_0_1_0()); 
            }
            // InternalLogo.g:3237:2: ()
            // InternalLogo.g:3237:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getDivLeftExpressionAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultDiv__Group_1_0_1__1"
    // InternalLogo.g:3245:1: rule__MultDiv__Group_1_0_1__1 : rule__MultDiv__Group_1_0_1__1__Impl ;
    public final void rule__MultDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3249:1: ( rule__MultDiv__Group_1_0_1__1__Impl )
            // InternalLogo.g:3250:2: rule__MultDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MultDiv__Group_1_0_1__1__Impl"
    // InternalLogo.g:3256:1: rule__MultDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3260:1: ( ( '/' ) )
            // InternalLogo.g:3261:1: ( '/' )
            {
            // InternalLogo.g:3261:1: ( '/' )
            // InternalLogo.g:3262:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__NotOpposite__Group_2__0"
    // InternalLogo.g:3272:1: rule__NotOpposite__Group_2__0 : rule__NotOpposite__Group_2__0__Impl rule__NotOpposite__Group_2__1 ;
    public final void rule__NotOpposite__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3276:1: ( rule__NotOpposite__Group_2__0__Impl rule__NotOpposite__Group_2__1 )
            // InternalLogo.g:3277:2: rule__NotOpposite__Group_2__0__Impl rule__NotOpposite__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__NotOpposite__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__0"


    // $ANTLR start "rule__NotOpposite__Group_2__0__Impl"
    // InternalLogo.g:3284:1: rule__NotOpposite__Group_2__0__Impl : ( '(' ) ;
    public final void rule__NotOpposite__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3288:1: ( ( '(' ) )
            // InternalLogo.g:3289:1: ( '(' )
            {
            // InternalLogo.g:3289:1: ( '(' )
            // InternalLogo.g:3290:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__0__Impl"


    // $ANTLR start "rule__NotOpposite__Group_2__1"
    // InternalLogo.g:3299:1: rule__NotOpposite__Group_2__1 : rule__NotOpposite__Group_2__1__Impl rule__NotOpposite__Group_2__2 ;
    public final void rule__NotOpposite__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3303:1: ( rule__NotOpposite__Group_2__1__Impl rule__NotOpposite__Group_2__2 )
            // InternalLogo.g:3304:2: rule__NotOpposite__Group_2__1__Impl rule__NotOpposite__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__NotOpposite__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__1"


    // $ANTLR start "rule__NotOpposite__Group_2__1__Impl"
    // InternalLogo.g:3311:1: rule__NotOpposite__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__NotOpposite__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3315:1: ( ( ruleExpression ) )
            // InternalLogo.g:3316:1: ( ruleExpression )
            {
            // InternalLogo.g:3316:1: ( ruleExpression )
            // InternalLogo.g:3317:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getExpressionParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__1__Impl"


    // $ANTLR start "rule__NotOpposite__Group_2__2"
    // InternalLogo.g:3326:1: rule__NotOpposite__Group_2__2 : rule__NotOpposite__Group_2__2__Impl ;
    public final void rule__NotOpposite__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3330:1: ( rule__NotOpposite__Group_2__2__Impl )
            // InternalLogo.g:3331:2: rule__NotOpposite__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__2"


    // $ANTLR start "rule__NotOpposite__Group_2__2__Impl"
    // InternalLogo.g:3337:1: rule__NotOpposite__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NotOpposite__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3341:1: ( ( ')' ) )
            // InternalLogo.g:3342:1: ( ')' )
            {
            // InternalLogo.g:3342:1: ( ')' )
            // InternalLogo.g:3343:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_2__2__Impl"


    // $ANTLR start "rule__NotOpposite__Group_3__0"
    // InternalLogo.g:3353:1: rule__NotOpposite__Group_3__0 : rule__NotOpposite__Group_3__0__Impl rule__NotOpposite__Group_3__1 ;
    public final void rule__NotOpposite__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3357:1: ( rule__NotOpposite__Group_3__0__Impl rule__NotOpposite__Group_3__1 )
            // InternalLogo.g:3358:2: rule__NotOpposite__Group_3__0__Impl rule__NotOpposite__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__NotOpposite__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__0"


    // $ANTLR start "rule__NotOpposite__Group_3__0__Impl"
    // InternalLogo.g:3365:1: rule__NotOpposite__Group_3__0__Impl : ( () ) ;
    public final void rule__NotOpposite__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3369:1: ( ( () ) )
            // InternalLogo.g:3370:1: ( () )
            {
            // InternalLogo.g:3370:1: ( () )
            // InternalLogo.g:3371:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getNotAction_3_0()); 
            }
            // InternalLogo.g:3372:2: ()
            // InternalLogo.g:3372:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getNotAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__0__Impl"


    // $ANTLR start "rule__NotOpposite__Group_3__1"
    // InternalLogo.g:3380:1: rule__NotOpposite__Group_3__1 : rule__NotOpposite__Group_3__1__Impl rule__NotOpposite__Group_3__2 ;
    public final void rule__NotOpposite__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3384:1: ( rule__NotOpposite__Group_3__1__Impl rule__NotOpposite__Group_3__2 )
            // InternalLogo.g:3385:2: rule__NotOpposite__Group_3__1__Impl rule__NotOpposite__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__NotOpposite__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__1"


    // $ANTLR start "rule__NotOpposite__Group_3__1__Impl"
    // InternalLogo.g:3392:1: rule__NotOpposite__Group_3__1__Impl : ( 'not' ) ;
    public final void rule__NotOpposite__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3396:1: ( ( 'not' ) )
            // InternalLogo.g:3397:1: ( 'not' )
            {
            // InternalLogo.g:3397:1: ( 'not' )
            // InternalLogo.g:3398:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getNotKeyword_3_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getNotKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__1__Impl"


    // $ANTLR start "rule__NotOpposite__Group_3__2"
    // InternalLogo.g:3407:1: rule__NotOpposite__Group_3__2 : rule__NotOpposite__Group_3__2__Impl ;
    public final void rule__NotOpposite__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3411:1: ( rule__NotOpposite__Group_3__2__Impl )
            // InternalLogo.g:3412:2: rule__NotOpposite__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__2"


    // $ANTLR start "rule__NotOpposite__Group_3__2__Impl"
    // InternalLogo.g:3418:1: rule__NotOpposite__Group_3__2__Impl : ( ( rule__NotOpposite__ExpressionAssignment_3_2 ) ) ;
    public final void rule__NotOpposite__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3422:1: ( ( ( rule__NotOpposite__ExpressionAssignment_3_2 ) ) )
            // InternalLogo.g:3423:1: ( ( rule__NotOpposite__ExpressionAssignment_3_2 ) )
            {
            // InternalLogo.g:3423:1: ( ( rule__NotOpposite__ExpressionAssignment_3_2 ) )
            // InternalLogo.g:3424:2: ( rule__NotOpposite__ExpressionAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getExpressionAssignment_3_2()); 
            }
            // InternalLogo.g:3425:2: ( rule__NotOpposite__ExpressionAssignment_3_2 )
            // InternalLogo.g:3425:3: rule__NotOpposite__ExpressionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__ExpressionAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getExpressionAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_3__2__Impl"


    // $ANTLR start "rule__NotOpposite__Group_4__0"
    // InternalLogo.g:3434:1: rule__NotOpposite__Group_4__0 : rule__NotOpposite__Group_4__0__Impl rule__NotOpposite__Group_4__1 ;
    public final void rule__NotOpposite__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3438:1: ( rule__NotOpposite__Group_4__0__Impl rule__NotOpposite__Group_4__1 )
            // InternalLogo.g:3439:2: rule__NotOpposite__Group_4__0__Impl rule__NotOpposite__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__NotOpposite__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__0"


    // $ANTLR start "rule__NotOpposite__Group_4__0__Impl"
    // InternalLogo.g:3446:1: rule__NotOpposite__Group_4__0__Impl : ( () ) ;
    public final void rule__NotOpposite__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3450:1: ( ( () ) )
            // InternalLogo.g:3451:1: ( () )
            {
            // InternalLogo.g:3451:1: ( () )
            // InternalLogo.g:3452:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getOppositeAction_4_0()); 
            }
            // InternalLogo.g:3453:2: ()
            // InternalLogo.g:3453:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getOppositeAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__0__Impl"


    // $ANTLR start "rule__NotOpposite__Group_4__1"
    // InternalLogo.g:3461:1: rule__NotOpposite__Group_4__1 : rule__NotOpposite__Group_4__1__Impl rule__NotOpposite__Group_4__2 ;
    public final void rule__NotOpposite__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3465:1: ( rule__NotOpposite__Group_4__1__Impl rule__NotOpposite__Group_4__2 )
            // InternalLogo.g:3466:2: rule__NotOpposite__Group_4__1__Impl rule__NotOpposite__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__NotOpposite__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__1"


    // $ANTLR start "rule__NotOpposite__Group_4__1__Impl"
    // InternalLogo.g:3473:1: rule__NotOpposite__Group_4__1__Impl : ( '-' ) ;
    public final void rule__NotOpposite__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3477:1: ( ( '-' ) )
            // InternalLogo.g:3478:1: ( '-' )
            {
            // InternalLogo.g:3478:1: ( '-' )
            // InternalLogo.g:3479:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getHyphenMinusKeyword_4_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getHyphenMinusKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__1__Impl"


    // $ANTLR start "rule__NotOpposite__Group_4__2"
    // InternalLogo.g:3488:1: rule__NotOpposite__Group_4__2 : rule__NotOpposite__Group_4__2__Impl ;
    public final void rule__NotOpposite__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3492:1: ( rule__NotOpposite__Group_4__2__Impl )
            // InternalLogo.g:3493:2: rule__NotOpposite__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__2"


    // $ANTLR start "rule__NotOpposite__Group_4__2__Impl"
    // InternalLogo.g:3499:1: rule__NotOpposite__Group_4__2__Impl : ( ( rule__NotOpposite__ExpressionAssignment_4_2 ) ) ;
    public final void rule__NotOpposite__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3503:1: ( ( ( rule__NotOpposite__ExpressionAssignment_4_2 ) ) )
            // InternalLogo.g:3504:1: ( ( rule__NotOpposite__ExpressionAssignment_4_2 ) )
            {
            // InternalLogo.g:3504:1: ( ( rule__NotOpposite__ExpressionAssignment_4_2 ) )
            // InternalLogo.g:3505:2: ( rule__NotOpposite__ExpressionAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getExpressionAssignment_4_2()); 
            }
            // InternalLogo.g:3506:2: ( rule__NotOpposite__ExpressionAssignment_4_2 )
            // InternalLogo.g:3506:3: rule__NotOpposite__ExpressionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__NotOpposite__ExpressionAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getExpressionAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__Group_4__2__Impl"


    // $ANTLR start "rule__VariableRead__Group__0"
    // InternalLogo.g:3515:1: rule__VariableRead__Group__0 : rule__VariableRead__Group__0__Impl rule__VariableRead__Group__1 ;
    public final void rule__VariableRead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3519:1: ( rule__VariableRead__Group__0__Impl rule__VariableRead__Group__1 )
            // InternalLogo.g:3520:2: rule__VariableRead__Group__0__Impl rule__VariableRead__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableRead__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableRead__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRead__Group__0"


    // $ANTLR start "rule__VariableRead__Group__0__Impl"
    // InternalLogo.g:3527:1: rule__VariableRead__Group__0__Impl : ( ':' ) ;
    public final void rule__VariableRead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3531:1: ( ( ':' ) )
            // InternalLogo.g:3532:1: ( ':' )
            {
            // InternalLogo.g:3532:1: ( ':' )
            // InternalLogo.g:3533:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReadAccess().getColonKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReadAccess().getColonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRead__Group__0__Impl"


    // $ANTLR start "rule__VariableRead__Group__1"
    // InternalLogo.g:3542:1: rule__VariableRead__Group__1 : rule__VariableRead__Group__1__Impl ;
    public final void rule__VariableRead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3546:1: ( rule__VariableRead__Group__1__Impl )
            // InternalLogo.g:3547:2: rule__VariableRead__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableRead__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRead__Group__1"


    // $ANTLR start "rule__VariableRead__Group__1__Impl"
    // InternalLogo.g:3553:1: rule__VariableRead__Group__1__Impl : ( ( rule__VariableRead__NameAssignment_1 ) ) ;
    public final void rule__VariableRead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3557:1: ( ( ( rule__VariableRead__NameAssignment_1 ) ) )
            // InternalLogo.g:3558:1: ( ( rule__VariableRead__NameAssignment_1 ) )
            {
            // InternalLogo.g:3558:1: ( ( rule__VariableRead__NameAssignment_1 ) )
            // InternalLogo.g:3559:2: ( rule__VariableRead__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReadAccess().getNameAssignment_1()); 
            }
            // InternalLogo.g:3560:2: ( rule__VariableRead__NameAssignment_1 )
            // InternalLogo.g:3560:3: rule__VariableRead__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableRead__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReadAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRead__Group__1__Impl"


    // $ANTLR start "rule__BoolValue__Group__0"
    // InternalLogo.g:3569:1: rule__BoolValue__Group__0 : rule__BoolValue__Group__0__Impl rule__BoolValue__Group__1 ;
    public final void rule__BoolValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3573:1: ( rule__BoolValue__Group__0__Impl rule__BoolValue__Group__1 )
            // InternalLogo.g:3574:2: rule__BoolValue__Group__0__Impl rule__BoolValue__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__BoolValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoolValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Group__0"


    // $ANTLR start "rule__BoolValue__Group__0__Impl"
    // InternalLogo.g:3581:1: rule__BoolValue__Group__0__Impl : ( () ) ;
    public final void rule__BoolValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3585:1: ( ( () ) )
            // InternalLogo.g:3586:1: ( () )
            {
            // InternalLogo.g:3586:1: ( () )
            // InternalLogo.g:3587:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getBoolValueAction_0()); 
            }
            // InternalLogo.g:3588:2: ()
            // InternalLogo.g:3588:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getBoolValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Group__0__Impl"


    // $ANTLR start "rule__BoolValue__Group__1"
    // InternalLogo.g:3596:1: rule__BoolValue__Group__1 : rule__BoolValue__Group__1__Impl ;
    public final void rule__BoolValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3600:1: ( rule__BoolValue__Group__1__Impl )
            // InternalLogo.g:3601:2: rule__BoolValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Group__1"


    // $ANTLR start "rule__BoolValue__Group__1__Impl"
    // InternalLogo.g:3607:1: rule__BoolValue__Group__1__Impl : ( ( rule__BoolValue__Alternatives_1 ) ) ;
    public final void rule__BoolValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3611:1: ( ( ( rule__BoolValue__Alternatives_1 ) ) )
            // InternalLogo.g:3612:1: ( ( rule__BoolValue__Alternatives_1 ) )
            {
            // InternalLogo.g:3612:1: ( ( rule__BoolValue__Alternatives_1 ) )
            // InternalLogo.g:3613:2: ( rule__BoolValue__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getAlternatives_1()); 
            }
            // InternalLogo.g:3614:2: ( rule__BoolValue__Alternatives_1 )
            // InternalLogo.g:3614:3: rule__BoolValue__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolValue__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__Group__1__Impl"


    // $ANTLR start "rule__Logo__StatementsAssignment"
    // InternalLogo.g:3623:1: rule__Logo__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Logo__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3627:1: ( ( ruleStatement ) )
            // InternalLogo.g:3628:2: ( ruleStatement )
            {
            // InternalLogo.g:3628:2: ( ruleStatement )
            // InternalLogo.g:3629:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogoAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogoAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logo__StatementsAssignment"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalLogo.g:3638:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3642:1: ( ( RULE_ID ) )
            // InternalLogo.g:3643:2: ( RULE_ID )
            {
            // InternalLogo.g:3643:2: ( RULE_ID )
            // InternalLogo.g:3644:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Right__AngleAssignment_1"
    // InternalLogo.g:3653:1: rule__Right__AngleAssignment_1 : ( ruleExpression ) ;
    public final void rule__Right__AngleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3657:1: ( ( ruleExpression ) )
            // InternalLogo.g:3658:2: ( ruleExpression )
            {
            // InternalLogo.g:3658:2: ( ruleExpression )
            // InternalLogo.g:3659:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRightAccess().getAngleExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRightAccess().getAngleExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__AngleAssignment_1"


    // $ANTLR start "rule__Left__AngleAssignment_1"
    // InternalLogo.g:3668:1: rule__Left__AngleAssignment_1 : ( ruleExpression ) ;
    public final void rule__Left__AngleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3672:1: ( ( ruleExpression ) )
            // InternalLogo.g:3673:2: ( ruleExpression )
            {
            // InternalLogo.g:3673:2: ( ruleExpression )
            // InternalLogo.g:3674:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLeftAccess().getAngleExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLeftAccess().getAngleExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__AngleAssignment_1"


    // $ANTLR start "rule__Forward__StepAssignment_1"
    // InternalLogo.g:3683:1: rule__Forward__StepAssignment_1 : ( ruleExpression ) ;
    public final void rule__Forward__StepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3687:1: ( ( ruleExpression ) )
            // InternalLogo.g:3688:2: ( ruleExpression )
            {
            // InternalLogo.g:3688:2: ( ruleExpression )
            // InternalLogo.g:3689:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForwardAccess().getStepExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForwardAccess().getStepExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__StepAssignment_1"


    // $ANTLR start "rule__ProcedureDefinition__NameAssignment_1"
    // InternalLogo.g:3698:1: rule__ProcedureDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcedureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3702:1: ( ( RULE_ID ) )
            // InternalLogo.g:3703:2: ( RULE_ID )
            {
            // InternalLogo.g:3703:2: ( RULE_ID )
            // InternalLogo.g:3704:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__NameAssignment_1"


    // $ANTLR start "rule__ProcedureDefinition__ParametersAssignment_2"
    // InternalLogo.g:3713:1: rule__ProcedureDefinition__ParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__ProcedureDefinition__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3717:1: ( ( ruleParameter ) )
            // InternalLogo.g:3718:2: ( ruleParameter )
            {
            // InternalLogo.g:3718:2: ( ruleParameter )
            // InternalLogo.g:3719:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getParametersParameterParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getParametersParameterParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__ParametersAssignment_2"


    // $ANTLR start "rule__ProcedureDefinition__StatementsAssignment_3"
    // InternalLogo.g:3728:1: rule__ProcedureDefinition__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ProcedureDefinition__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3732:1: ( ( ruleStatement ) )
            // InternalLogo.g:3733:2: ( ruleStatement )
            {
            // InternalLogo.g:3733:2: ( ruleStatement )
            // InternalLogo.g:3734:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureDefinition__StatementsAssignment_3"


    // $ANTLR start "rule__ProcedureCall__DefinitionAssignment_0"
    // InternalLogo.g:3743:1: rule__ProcedureCall__DefinitionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProcedureCall__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3747:1: ( ( ( RULE_ID ) ) )
            // InternalLogo.g:3748:2: ( ( RULE_ID ) )
            {
            // InternalLogo.g:3748:2: ( ( RULE_ID ) )
            // InternalLogo.g:3749:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionCrossReference_0_0()); 
            }
            // InternalLogo.g:3750:3: ( RULE_ID )
            // InternalLogo.g:3751:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__DefinitionAssignment_0"


    // $ANTLR start "rule__ProcedureCall__ParameterValuesAssignment_1"
    // InternalLogo.g:3762:1: rule__ProcedureCall__ParameterValuesAssignment_1 : ( ruleExpression ) ;
    public final void rule__ProcedureCall__ParameterValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3766:1: ( ( ruleExpression ) )
            // InternalLogo.g:3767:2: ( ruleExpression )
            {
            // InternalLogo.g:3767:2: ( ruleExpression )
            // InternalLogo.g:3768:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcedureCallAccess().getParameterValuesExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcedureCallAccess().getParameterValuesExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcedureCall__ParameterValuesAssignment_1"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalLogo.g:3777:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3781:1: ( ( ruleStatement ) )
            // InternalLogo.g:3782:2: ( ruleStatement )
            {
            // InternalLogo.g:3782:2: ( ruleStatement )
            // InternalLogo.g:3783:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__If__ConditionAssignment_1_0"
    // InternalLogo.g:3792:1: rule__If__ConditionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__If__ConditionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3796:1: ( ( ruleExpression ) )
            // InternalLogo.g:3797:2: ( ruleExpression )
            {
            // InternalLogo.g:3797:2: ( ruleExpression )
            // InternalLogo.g:3798:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_1_0"


    // $ANTLR start "rule__If__ConditionAssignment_1_1_1"
    // InternalLogo.g:3807:1: rule__If__ConditionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__If__ConditionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3811:1: ( ( ruleExpression ) )
            // InternalLogo.g:3812:2: ( ruleExpression )
            {
            // InternalLogo.g:3812:2: ( ruleExpression )
            // InternalLogo.g:3813:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_1_1_1"


    // $ANTLR start "rule__If__IfBlockAssignment_2"
    // InternalLogo.g:3822:1: rule__If__IfBlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__If__IfBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3826:1: ( ( ruleBlock ) )
            // InternalLogo.g:3827:2: ( ruleBlock )
            {
            // InternalLogo.g:3827:2: ( ruleBlock )
            // InternalLogo.g:3828:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__IfBlockAssignment_2"


    // $ANTLR start "rule__IfElse__ConditionAssignment_1_0"
    // InternalLogo.g:3837:1: rule__IfElse__ConditionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__IfElse__ConditionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3841:1: ( ( ruleExpression ) )
            // InternalLogo.g:3842:2: ( ruleExpression )
            {
            // InternalLogo.g:3842:2: ( ruleExpression )
            // InternalLogo.g:3843:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__ConditionAssignment_1_0"


    // $ANTLR start "rule__IfElse__ConditionAssignment_1_1_1"
    // InternalLogo.g:3852:1: rule__IfElse__ConditionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__IfElse__ConditionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3856:1: ( ( ruleExpression ) )
            // InternalLogo.g:3857:2: ( ruleExpression )
            {
            // InternalLogo.g:3857:2: ( ruleExpression )
            // InternalLogo.g:3858:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__ConditionAssignment_1_1_1"


    // $ANTLR start "rule__IfElse__IfBlockAssignment_2"
    // InternalLogo.g:3867:1: rule__IfElse__IfBlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__IfElse__IfBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3871:1: ( ( ruleBlock ) )
            // InternalLogo.g:3872:2: ( ruleBlock )
            {
            // InternalLogo.g:3872:2: ( ruleBlock )
            // InternalLogo.g:3873:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getIfBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getIfBlockBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__IfBlockAssignment_2"


    // $ANTLR start "rule__IfElse__ElseBlockAssignment_3"
    // InternalLogo.g:3882:1: rule__IfElse__ElseBlockAssignment_3 : ( ruleBlock ) ;
    public final void rule__IfElse__ElseBlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3886:1: ( ( ruleBlock ) )
            // InternalLogo.g:3887:2: ( ruleBlock )
            {
            // InternalLogo.g:3887:2: ( ruleBlock )
            // InternalLogo.g:3888:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseAccess().getElseBlockBlockParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseAccess().getElseBlockBlockParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfElse__ElseBlockAssignment_3"


    // $ANTLR start "rule__While__ConditionAssignment_1_0"
    // InternalLogo.g:3897:1: rule__While__ConditionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3901:1: ( ( ruleExpression ) )
            // InternalLogo.g:3902:2: ( ruleExpression )
            {
            // InternalLogo.g:3902:2: ( ruleExpression )
            // InternalLogo.g:3903:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionAssignment_1_0"


    // $ANTLR start "rule__While__ConditionAssignment_1_1_1"
    // InternalLogo.g:3912:1: rule__While__ConditionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3916:1: ( ( ruleExpression ) )
            // InternalLogo.g:3917:2: ( ruleExpression )
            {
            // InternalLogo.g:3917:2: ( ruleExpression )
            // InternalLogo.g:3918:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionAssignment_1_1_1"


    // $ANTLR start "rule__While__BlockAssignment_2"
    // InternalLogo.g:3927:1: rule__While__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__While__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3931:1: ( ( ruleBlock ) )
            // InternalLogo.g:3932:2: ( ruleBlock )
            {
            // InternalLogo.g:3932:2: ( ruleBlock )
            // InternalLogo.g:3933:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__BlockAssignment_2"


    // $ANTLR start "rule__Repeat__ConditionAssignment_1"
    // InternalLogo.g:3942:1: rule__Repeat__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Repeat__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3946:1: ( ( ruleExpression ) )
            // InternalLogo.g:3947:2: ( ruleExpression )
            {
            // InternalLogo.g:3947:2: ( ruleExpression )
            // InternalLogo.g:3948:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getConditionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getConditionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__ConditionAssignment_1"


    // $ANTLR start "rule__Repeat__BlockAssignment_2"
    // InternalLogo.g:3957:1: rule__Repeat__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__Repeat__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3961:1: ( ( ruleBlock ) )
            // InternalLogo.g:3962:2: ( ruleBlock )
            {
            // InternalLogo.g:3962:2: ( ruleBlock )
            // InternalLogo.g:3963:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repeat__BlockAssignment_2"


    // $ANTLR start "rule__And__ExpressionsAssignment_1"
    // InternalLogo.g:3972:1: rule__And__ExpressionsAssignment_1 : ( ruleEqualsGreaterLower ) ;
    public final void rule__And__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3976:1: ( ( ruleEqualsGreaterLower ) )
            // InternalLogo.g:3977:2: ( ruleEqualsGreaterLower )
            {
            // InternalLogo.g:3977:2: ( ruleEqualsGreaterLower )
            // InternalLogo.g:3978:3: ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpressionsAssignment_1"


    // $ANTLR start "rule__And__ExpressionsAssignment_2_0"
    // InternalLogo.g:3987:1: rule__And__ExpressionsAssignment_2_0 : ( ruleEqualsGreaterLower ) ;
    public final void rule__And__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:3991:1: ( ( ruleEqualsGreaterLower ) )
            // InternalLogo.g:3992:2: ( ruleEqualsGreaterLower )
            {
            // InternalLogo.g:3992:2: ( ruleEqualsGreaterLower )
            // InternalLogo.g:3993:3: ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpressionsAssignment_2_0"


    // $ANTLR start "rule__Or__ExpressionsAssignment_1"
    // InternalLogo.g:4002:1: rule__Or__ExpressionsAssignment_1 : ( ruleEqualsGreaterLower ) ;
    public final void rule__Or__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4006:1: ( ( ruleEqualsGreaterLower ) )
            // InternalLogo.g:4007:2: ( ruleEqualsGreaterLower )
            {
            // InternalLogo.g:4007:2: ( ruleEqualsGreaterLower )
            // InternalLogo.g:4008:3: ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpressionsAssignment_1"


    // $ANTLR start "rule__Or__ExpressionsAssignment_2_0"
    // InternalLogo.g:4017:1: rule__Or__ExpressionsAssignment_2_0 : ( ruleEqualsGreaterLower ) ;
    public final void rule__Or__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4021:1: ( ( ruleEqualsGreaterLower ) )
            // InternalLogo.g:4022:2: ( ruleEqualsGreaterLower )
            {
            // InternalLogo.g:4022:2: ( ruleEqualsGreaterLower )
            // InternalLogo.g:4023:3: ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpressionsAssignment_2_0"


    // $ANTLR start "rule__EqualsGreaterLower__RightExpressionAssignment_1_1"
    // InternalLogo.g:4032:1: rule__EqualsGreaterLower__RightExpressionAssignment_1_1 : ( rulePlusMinus ) ;
    public final void rule__EqualsGreaterLower__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4036:1: ( ( rulePlusMinus ) )
            // InternalLogo.g:4037:2: ( rulePlusMinus )
            {
            // InternalLogo.g:4037:2: ( rulePlusMinus )
            // InternalLogo.g:4038:3: rulePlusMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionPlusMinusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionPlusMinusParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualsGreaterLower__RightExpressionAssignment_1_1"


    // $ANTLR start "rule__PlusMinus__RightExpressionAssignment_1_0_1"
    // InternalLogo.g:4047:1: rule__PlusMinus__RightExpressionAssignment_1_0_1 : ( ruleMultDiv ) ;
    public final void rule__PlusMinus__RightExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4051:1: ( ( ruleMultDiv ) )
            // InternalLogo.g:4052:2: ( ruleMultDiv )
            {
            // InternalLogo.g:4052:2: ( ruleMultDiv )
            // InternalLogo.g:4053:3: ruleMultDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusMinusAccess().getRightExpressionMultDivParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusMinusAccess().getRightExpressionMultDivParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__RightExpressionAssignment_1_0_1"


    // $ANTLR start "rule__MultDiv__RightExpressionAssignment_1_1"
    // InternalLogo.g:4062:1: rule__MultDiv__RightExpressionAssignment_1_1 : ( ruleNotOpposite ) ;
    public final void rule__MultDiv__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4066:1: ( ( ruleNotOpposite ) )
            // InternalLogo.g:4067:2: ( ruleNotOpposite )
            {
            // InternalLogo.g:4067:2: ( ruleNotOpposite )
            // InternalLogo.g:4068:3: ruleNotOpposite
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultDivAccess().getRightExpressionNotOppositeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNotOpposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultDivAccess().getRightExpressionNotOppositeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__RightExpressionAssignment_1_1"


    // $ANTLR start "rule__NotOpposite__ExpressionAssignment_3_2"
    // InternalLogo.g:4077:1: rule__NotOpposite__ExpressionAssignment_3_2 : ( ruleNotOpposite ) ;
    public final void rule__NotOpposite__ExpressionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4081:1: ( ( ruleNotOpposite ) )
            // InternalLogo.g:4082:2: ( ruleNotOpposite )
            {
            // InternalLogo.g:4082:2: ( ruleNotOpposite )
            // InternalLogo.g:4083:3: ruleNotOpposite
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNotOpposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__ExpressionAssignment_3_2"


    // $ANTLR start "rule__NotOpposite__ExpressionAssignment_4_2"
    // InternalLogo.g:4092:1: rule__NotOpposite__ExpressionAssignment_4_2 : ( ruleNotOpposite ) ;
    public final void rule__NotOpposite__ExpressionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4096:1: ( ( ruleNotOpposite ) )
            // InternalLogo.g:4097:2: ( ruleNotOpposite )
            {
            // InternalLogo.g:4097:2: ( ruleNotOpposite )
            // InternalLogo.g:4098:3: ruleNotOpposite
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNotOpposite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotOpposite__ExpressionAssignment_4_2"


    // $ANTLR start "rule__VariableRead__NameAssignment_1"
    // InternalLogo.g:4107:1: rule__VariableRead__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableRead__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4111:1: ( ( RULE_ID ) )
            // InternalLogo.g:4112:2: ( RULE_ID )
            {
            // InternalLogo.g:4112:2: ( RULE_ID )
            // InternalLogo.g:4113:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReadAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReadAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableRead__NameAssignment_1"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalLogo.g:4122:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4126:1: ( ( RULE_INT ) )
            // InternalLogo.g:4127:2: ( RULE_INT )
            {
            // InternalLogo.g:4127:2: ( RULE_INT )
            // InternalLogo.g:4128:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__BoolValue__ValueAssignment_1_0"
    // InternalLogo.g:4137:1: rule__BoolValue__ValueAssignment_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolValue__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLogo.g:4141:1: ( ( ( 'true' ) ) )
            // InternalLogo.g:4142:2: ( ( 'true' ) )
            {
            // InternalLogo.g:4142:2: ( ( 'true' ) )
            // InternalLogo.g:4143:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0()); 
            }
            // InternalLogo.g:4144:3: ( 'true' )
            // InternalLogo.g:4145:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolValue__ValueAssignment_1_0"

    // $ANTLR start synpred32_InternalLogo
    public final void synpred32_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:2391:4: ( rule__And__Group_2__0 )
        // InternalLogo.g:2391:4: rule__And__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__And__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalLogo

    // $ANTLR start synpred33_InternalLogo
    public final void synpred33_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:2506:4: ( rule__Or__Group_2__0 )
        // InternalLogo.g:2506:4: rule__Or__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__Or__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalLogo

    // $ANTLR start synpred35_InternalLogo
    public final void synpred35_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:2858:3: ( rule__PlusMinus__Group_1__0 )
        // InternalLogo.g:2858:3: rule__PlusMinus__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__PlusMinus__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalLogo

    // Delegated rules

    public final boolean synpred35_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\1\32\uffff";
    static final String dfa_3s = "\1\4\20\uffff\7\0\3\uffff";
    static final String dfa_4s = "\1\46\20\uffff\7\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\2\30\uffff\1\1";
    static final String dfa_6s = "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\21\5\uffff\1\23\1\24\17\1\4\uffff\1\27\2\uffff\1\25\1\1\1\26\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2391:3: ( rule__And__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_17 = input.LA(1);

                         
                        int index19_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_18 = input.LA(1);

                         
                        int index19_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_19 = input.LA(1);

                         
                        int index19_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_20 = input.LA(1);

                         
                        int index19_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_21 = input.LA(1);

                         
                        int index19_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_22 = input.LA(1);

                         
                        int index19_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_23 = input.LA(1);

                         
                        int index19_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2506:3: ( rule__Or__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_17 = input.LA(1);

                         
                        int index20_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_18 = input.LA(1);

                         
                        int index20_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_19 = input.LA(1);

                         
                        int index20_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_20 = input.LA(1);

                         
                        int index20_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_21 = input.LA(1);

                         
                        int index20_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_22 = input.LA(1);

                         
                        int index20_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_23 = input.LA(1);

                         
                        int index20_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\36\uffff";
    static final String dfa_9s = "\1\1\35\uffff";
    static final String dfa_10s = "\1\4\31\uffff\1\0\3\uffff";
    static final String dfa_11s = "\1\46\31\uffff\1\0\3\uffff";
    static final String dfa_12s = "\1\uffff\1\2\33\uffff\1\1";
    static final String dfa_13s = "\32\uffff\1\0\3\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\5\uffff\24\1\1\35\1\32\2\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2858:2: ( rule__PlusMinus__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_26 = input.LA(1);

                         
                        int index22_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalLogo()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003D7E012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000690C001820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003D7F010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003D7F012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000690C001822L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003D7E010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000690C101820L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000006900001820L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006900001822L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000820L});

}