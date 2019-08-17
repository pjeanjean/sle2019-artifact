package org.tetrabox.minijava.xtext.ide.contentassist.antlr.internal;

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
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'true'", "'false'", "'private'", "'protected'", "'public'", "'package'", "'import'", "'.'", "'.*'", "'class'", "'{'", "'}'", "'extends'", "'implements'", "','", "'interface'", "'('", "')'", "'='", "'System'", "'out'", "'println'", "'return'", "'if'", "'else'", "'while'", "'for'", "'['", "']'", "'int'", "'boolean'", "'String'", "'void'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'%'", "'+'", "'-'", "'*'", "'/'", "'length'", "'!'", "'\\'\\'\\''", "'this'", "'super'", "'null'", "'new'", "'abstract'", "'static'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava.g"; }


    	private MiniJavaGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:54:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMiniJava.g:55:1: ( ruleProgram EOF )
            // InternalMiniJava.g:56:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:63:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:67:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMiniJava.g:68:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMiniJava.g:68:2: ( ( rule__Program__Group__0 ) )
            // InternalMiniJava.g:69:3: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // InternalMiniJava.g:70:3: ( rule__Program__Group__0 )
            // InternalMiniJava.g:70:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava.g:79:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMiniJava.g:80:1: ( ruleImport EOF )
            // InternalMiniJava.g:81:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava.g:88:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:92:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMiniJava.g:93:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMiniJava.g:93:2: ( ( rule__Import__Group__0 ) )
            // InternalMiniJava.g:94:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMiniJava.g:95:3: ( rule__Import__Group__0 )
            // InternalMiniJava.g:95:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:104:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMiniJava.g:105:1: ( ruleQualifiedName EOF )
            // InternalMiniJava.g:106:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:113:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:117:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMiniJava.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMiniJava.g:118:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMiniJava.g:119:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMiniJava.g:120:3: ( rule__QualifiedName__Group__0 )
            // InternalMiniJava.g:120:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava.g:129:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMiniJava.g:130:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava.g:131:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava.g:138:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:142:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMiniJava.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMiniJava.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMiniJava.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMiniJava.g:145:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMiniJava.g:145:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMiniJava.g:154:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:155:1: ( ruleTypeDeclaration EOF )
            // InternalMiniJava.g:156:1: ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationRule()); 
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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMiniJava.g:163:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Alternatives ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:167:2: ( ( ( rule__TypeDeclaration__Alternatives ) ) )
            // InternalMiniJava.g:168:2: ( ( rule__TypeDeclaration__Alternatives ) )
            {
            // InternalMiniJava.g:168:2: ( ( rule__TypeDeclaration__Alternatives ) )
            // InternalMiniJava.g:169:3: ( rule__TypeDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeDeclarationAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:170:3: ( rule__TypeDeclaration__Alternatives )
            // InternalMiniJava.g:170:4: rule__TypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeDeclarationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleClazz"
    // InternalMiniJava.g:179:1: entryRuleClazz : ruleClazz EOF ;
    public final void entryRuleClazz() throws RecognitionException {
        try {
            // InternalMiniJava.g:180:1: ( ruleClazz EOF )
            // InternalMiniJava.g:181:1: ruleClazz EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClazz();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzRule()); 
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
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // InternalMiniJava.g:188:1: ruleClazz : ( ( rule__Clazz__Group__0 ) ) ;
    public final void ruleClazz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:192:2: ( ( ( rule__Clazz__Group__0 ) ) )
            // InternalMiniJava.g:193:2: ( ( rule__Clazz__Group__0 ) )
            {
            // InternalMiniJava.g:193:2: ( ( rule__Clazz__Group__0 ) )
            // InternalMiniJava.g:194:3: ( rule__Clazz__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getGroup()); 
            }
            // InternalMiniJava.g:195:3: ( rule__Clazz__Group__0 )
            // InternalMiniJava.g:195:4: rule__Clazz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getGroup()); 
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
    // $ANTLR end "ruleClazz"


    // $ANTLR start "entryRuleInterface"
    // InternalMiniJava.g:204:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalMiniJava.g:205:1: ( ruleInterface EOF )
            // InternalMiniJava.g:206:1: ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMiniJava.g:213:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:217:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalMiniJava.g:218:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalMiniJava.g:218:2: ( ( rule__Interface__Group__0 ) )
            // InternalMiniJava.g:219:3: ( rule__Interface__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup()); 
            }
            // InternalMiniJava.g:220:3: ( rule__Interface__Group__0 )
            // InternalMiniJava.g:220:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup()); 
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:229:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMiniJava.g:230:1: ( ruleMember EOF )
            // InternalMiniJava.g:231:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:238:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:242:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalMiniJava.g:243:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalMiniJava.g:243:2: ( ( rule__Member__Alternatives ) )
            // InternalMiniJava.g:244:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:245:3: ( rule__Member__Alternatives )
            // InternalMiniJava.g:245:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:254:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalMiniJava.g:255:1: ( ruleMethod EOF )
            // InternalMiniJava.g:256:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava.g:263:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:267:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalMiniJava.g:268:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalMiniJava.g:268:2: ( ( rule__Method__Group__0 ) )
            // InternalMiniJava.g:269:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalMiniJava.g:270:3: ( rule__Method__Group__0 )
            // InternalMiniJava.g:270:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:279:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:280:1: ( ruleParameter EOF )
            // InternalMiniJava.g:281:1: ruleParameter EOF
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
    // InternalMiniJava.g:288:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:292:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMiniJava.g:293:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMiniJava.g:293:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMiniJava.g:294:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalMiniJava.g:295:3: ( rule__Parameter__Group__0 )
            // InternalMiniJava.g:295:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:304:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMiniJava.g:305:1: ( ruleField EOF )
            // InternalMiniJava.g:306:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava.g:313:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:317:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMiniJava.g:318:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMiniJava.g:318:2: ( ( rule__Field__Group__0 ) )
            // InternalMiniJava.g:319:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalMiniJava.g:320:3: ( rule__Field__Group__0 )
            // InternalMiniJava.g:320:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava.g:329:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMiniJava.g:330:1: ( ruleBlock EOF )
            // InternalMiniJava.g:331:1: ruleBlock EOF
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
    // InternalMiniJava.g:338:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:342:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMiniJava.g:343:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMiniJava.g:343:2: ( ( rule__Block__Group__0 ) )
            // InternalMiniJava.g:344:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalMiniJava.g:345:3: ( rule__Block__Group__0 )
            // InternalMiniJava.g:345:4: rule__Block__Group__0
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


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:354:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:355:1: ( ruleStatement EOF )
            // InternalMiniJava.g:356:1: ruleStatement EOF
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
    // InternalMiniJava.g:363:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:367:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:368:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:368:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:369:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:370:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:370:4: rule__Statement__Alternatives
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


    // $ANTLR start "entryRulePrintStatement"
    // InternalMiniJava.g:379:1: entryRulePrintStatement : rulePrintStatement EOF ;
    public final void entryRulePrintStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:380:1: ( rulePrintStatement EOF )
            // InternalMiniJava.g:381:1: rulePrintStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrintStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementRule()); 
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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalMiniJava.g:388:1: rulePrintStatement : ( ( rule__PrintStatement__Group__0 ) ) ;
    public final void rulePrintStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:392:2: ( ( ( rule__PrintStatement__Group__0 ) ) )
            // InternalMiniJava.g:393:2: ( ( rule__PrintStatement__Group__0 ) )
            {
            // InternalMiniJava.g:393:2: ( ( rule__PrintStatement__Group__0 ) )
            // InternalMiniJava.g:394:3: ( rule__PrintStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:395:3: ( rule__PrintStatement__Group__0 )
            // InternalMiniJava.g:395:4: rule__PrintStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getGroup()); 
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
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava.g:404:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalMiniJava.g:405:1: ( ruleReturn EOF )
            // InternalMiniJava.g:406:1: ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnRule()); 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava.g:413:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:417:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalMiniJava.g:418:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalMiniJava.g:418:2: ( ( rule__Return__Group__0 ) )
            // InternalMiniJava.g:419:3: ( rule__Return__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getGroup()); 
            }
            // InternalMiniJava.g:420:3: ( rule__Return__Group__0 )
            // InternalMiniJava.g:420:4: rule__Return__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getGroup()); 
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava.g:429:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:430:1: ( ruleIfStatement EOF )
            // InternalMiniJava.g:431:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava.g:438:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:442:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMiniJava.g:443:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMiniJava.g:443:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMiniJava.g:444:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:445:3: ( rule__IfStatement__Group__0 )
            // InternalMiniJava.g:445:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMiniJava.g:454:1: entryRuleWhileStatement : ruleWhileStatement EOF ;
    public final void entryRuleWhileStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:455:1: ( ruleWhileStatement EOF )
            // InternalMiniJava.g:456:1: ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhileStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementRule()); 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMiniJava.g:463:1: ruleWhileStatement : ( ( rule__WhileStatement__Group__0 ) ) ;
    public final void ruleWhileStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:467:2: ( ( ( rule__WhileStatement__Group__0 ) ) )
            // InternalMiniJava.g:468:2: ( ( rule__WhileStatement__Group__0 ) )
            {
            // InternalMiniJava.g:468:2: ( ( rule__WhileStatement__Group__0 ) )
            // InternalMiniJava.g:469:3: ( rule__WhileStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:470:3: ( rule__WhileStatement__Group__0 )
            // InternalMiniJava.g:470:4: rule__WhileStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMiniJava.g:479:1: entryRuleForStatement : ruleForStatement EOF ;
    public final void entryRuleForStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:480:1: ( ruleForStatement EOF )
            // InternalMiniJava.g:481:1: ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementRule()); 
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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMiniJava.g:488:1: ruleForStatement : ( ( rule__ForStatement__Group__0 ) ) ;
    public final void ruleForStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:492:2: ( ( ( rule__ForStatement__Group__0 ) ) )
            // InternalMiniJava.g:493:2: ( ( rule__ForStatement__Group__0 ) )
            {
            // InternalMiniJava.g:493:2: ( ( rule__ForStatement__Group__0 ) )
            // InternalMiniJava.g:494:3: ( rule__ForStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getGroup()); 
            }
            // InternalMiniJava.g:495:3: ( rule__ForStatement__Group__0 )
            // InternalMiniJava.g:495:4: rule__ForStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleTypeRef"
    // InternalMiniJava.g:504:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:505:1: ( ruleTypeRef EOF )
            // InternalMiniJava.g:506:1: ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefRule()); 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalMiniJava.g:513:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:517:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // InternalMiniJava.g:518:2: ( ( rule__TypeRef__Group__0 ) )
            {
            // InternalMiniJava.g:518:2: ( ( rule__TypeRef__Group__0 ) )
            // InternalMiniJava.g:519:3: ( rule__TypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getGroup()); 
            }
            // InternalMiniJava.g:520:3: ( rule__TypeRef__Group__0 )
            // InternalMiniJava.g:520:4: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getGroup()); 
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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleSingleTypeRef"
    // InternalMiniJava.g:529:1: entryRuleSingleTypeRef : ruleSingleTypeRef EOF ;
    public final void entryRuleSingleTypeRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:530:1: ( ruleSingleTypeRef EOF )
            // InternalMiniJava.g:531:1: ruleSingleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefRule()); 
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
    // $ANTLR end "entryRuleSingleTypeRef"


    // $ANTLR start "ruleSingleTypeRef"
    // InternalMiniJava.g:538:1: ruleSingleTypeRef : ( ( rule__SingleTypeRef__Alternatives ) ) ;
    public final void ruleSingleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:542:2: ( ( ( rule__SingleTypeRef__Alternatives ) ) )
            // InternalMiniJava.g:543:2: ( ( rule__SingleTypeRef__Alternatives ) )
            {
            // InternalMiniJava.g:543:2: ( ( rule__SingleTypeRef__Alternatives ) )
            // InternalMiniJava.g:544:3: ( rule__SingleTypeRef__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:545:3: ( rule__SingleTypeRef__Alternatives )
            // InternalMiniJava.g:545:4: rule__SingleTypeRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSingleTypeRef"


    // $ANTLR start "entryRuleClassRef"
    // InternalMiniJava.g:554:1: entryRuleClassRef : ruleClassRef EOF ;
    public final void entryRuleClassRef() throws RecognitionException {
        try {
            // InternalMiniJava.g:555:1: ( ruleClassRef EOF )
            // InternalMiniJava.g:556:1: ruleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefRule()); 
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
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalMiniJava.g:563:1: ruleClassRef : ( ( rule__ClassRef__ReferencedClassAssignment ) ) ;
    public final void ruleClassRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:567:2: ( ( ( rule__ClassRef__ReferencedClassAssignment ) ) )
            // InternalMiniJava.g:568:2: ( ( rule__ClassRef__ReferencedClassAssignment ) )
            {
            // InternalMiniJava.g:568:2: ( ( rule__ClassRef__ReferencedClassAssignment ) )
            // InternalMiniJava.g:569:3: ( rule__ClassRef__ReferencedClassAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassAssignment()); 
            }
            // InternalMiniJava.g:570:3: ( rule__ClassRef__ReferencedClassAssignment )
            // InternalMiniJava.g:570:4: rule__ClassRef__ReferencedClassAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassRef__ReferencedClassAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassAssignment()); 
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
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleTypedDeclaration"
    // InternalMiniJava.g:579:1: entryRuleTypedDeclaration : ruleTypedDeclaration EOF ;
    public final void entryRuleTypedDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:580:1: ( ruleTypedDeclaration EOF )
            // InternalMiniJava.g:581:1: ruleTypedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationRule()); 
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
    // $ANTLR end "entryRuleTypedDeclaration"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava.g:588:1: ruleTypedDeclaration : ( ( rule__TypedDeclaration__Alternatives ) ) ;
    public final void ruleTypedDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:592:2: ( ( ( rule__TypedDeclaration__Alternatives ) ) )
            // InternalMiniJava.g:593:2: ( ( rule__TypedDeclaration__Alternatives ) )
            {
            // InternalMiniJava.g:593:2: ( ( rule__TypedDeclaration__Alternatives ) )
            // InternalMiniJava.g:594:3: ( rule__TypedDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedDeclarationAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:595:3: ( rule__TypedDeclaration__Alternatives )
            // InternalMiniJava.g:595:4: rule__TypedDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypedDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedDeclarationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava.g:604:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalMiniJava.g:605:1: ( ruleSymbol EOF )
            // InternalMiniJava.g:606:1: ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolRule()); 
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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava.g:613:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:617:2: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalMiniJava.g:618:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalMiniJava.g:618:2: ( ( rule__Symbol__Alternatives ) )
            // InternalMiniJava.g:619:3: ( rule__Symbol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:620:3: ( rule__Symbol__Alternatives )
            // InternalMiniJava.g:620:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava.g:629:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMiniJava.g:630:1: ( ruleVariableDeclaration EOF )
            // InternalMiniJava.g:631:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava.g:638:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:642:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMiniJava.g:643:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMiniJava.g:643:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMiniJava.g:644:3: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalMiniJava.g:645:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMiniJava.g:645:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava.g:654:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalMiniJava.g:655:1: ( ruleAssignment EOF )
            // InternalMiniJava.g:656:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava.g:663:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:667:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalMiniJava.g:668:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalMiniJava.g:668:2: ( ( rule__Assignment__Group__0 ) )
            // InternalMiniJava.g:669:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalMiniJava.g:670:3: ( rule__Assignment__Group__0 )
            // InternalMiniJava.g:670:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignee"
    // InternalMiniJava.g:679:1: entryRuleAssignee : ruleAssignee EOF ;
    public final void entryRuleAssignee() throws RecognitionException {
        try {
            // InternalMiniJava.g:680:1: ( ruleAssignee EOF )
            // InternalMiniJava.g:681:1: ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeRule()); 
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
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalMiniJava.g:688:1: ruleAssignee : ( ( rule__Assignee__Alternatives ) ) ;
    public final void ruleAssignee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:692:2: ( ( ( rule__Assignee__Alternatives ) ) )
            // InternalMiniJava.g:693:2: ( ( rule__Assignee__Alternatives ) )
            {
            // InternalMiniJava.g:693:2: ( ( rule__Assignee__Alternatives ) )
            // InternalMiniJava.g:694:3: ( rule__Assignee__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssigneeAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:695:3: ( rule__Assignee__Alternatives )
            // InternalMiniJava.g:695:4: rule__Assignee__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignee__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssigneeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:704:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:705:1: ( ruleExpression EOF )
            // InternalMiniJava.g:706:1: ruleExpression EOF
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
    // InternalMiniJava.g:713:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:717:2: ( ( ruleOr ) )
            // InternalMiniJava.g:718:2: ( ruleOr )
            {
            // InternalMiniJava.g:718:2: ( ruleOr )
            // InternalMiniJava.g:719:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
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


    // $ANTLR start "entryRuleOr"
    // InternalMiniJava.g:729:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMiniJava.g:730:1: ( ruleOr EOF )
            // InternalMiniJava.g:731:1: ruleOr EOF
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
    // InternalMiniJava.g:738:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:742:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMiniJava.g:743:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMiniJava.g:743:2: ( ( rule__Or__Group__0 ) )
            // InternalMiniJava.g:744:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalMiniJava.g:745:3: ( rule__Or__Group__0 )
            // InternalMiniJava.g:745:4: rule__Or__Group__0
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


    // $ANTLR start "entryRuleAnd"
    // InternalMiniJava.g:754:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMiniJava.g:755:1: ( ruleAnd EOF )
            // InternalMiniJava.g:756:1: ruleAnd EOF
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
    // InternalMiniJava.g:763:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:767:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMiniJava.g:768:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMiniJava.g:768:2: ( ( rule__And__Group__0 ) )
            // InternalMiniJava.g:769:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalMiniJava.g:770:3: ( rule__And__Group__0 )
            // InternalMiniJava.g:770:4: rule__And__Group__0
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


    // $ANTLR start "entryRuleEquality"
    // InternalMiniJava.g:779:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMiniJava.g:780:1: ( ruleEquality EOF )
            // InternalMiniJava.g:781:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniJava.g:788:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:792:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMiniJava.g:793:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMiniJava.g:793:2: ( ( rule__Equality__Group__0 ) )
            // InternalMiniJava.g:794:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalMiniJava.g:795:3: ( rule__Equality__Group__0 )
            // InternalMiniJava.g:795:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniJava.g:804:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMiniJava.g:805:1: ( ruleComparison EOF )
            // InternalMiniJava.g:806:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniJava.g:813:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:817:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMiniJava.g:818:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMiniJava.g:818:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMiniJava.g:819:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalMiniJava.g:820:3: ( rule__Comparison__Group__0 )
            // InternalMiniJava.g:820:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleModulo"
    // InternalMiniJava.g:829:1: entryRuleModulo : ruleModulo EOF ;
    public final void entryRuleModulo() throws RecognitionException {
        try {
            // InternalMiniJava.g:830:1: ( ruleModulo EOF )
            // InternalMiniJava.g:831:1: ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloRule()); 
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
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMiniJava.g:838:1: ruleModulo : ( ( rule__Modulo__Group__0 ) ) ;
    public final void ruleModulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:842:2: ( ( ( rule__Modulo__Group__0 ) ) )
            // InternalMiniJava.g:843:2: ( ( rule__Modulo__Group__0 ) )
            {
            // InternalMiniJava.g:843:2: ( ( rule__Modulo__Group__0 ) )
            // InternalMiniJava.g:844:3: ( rule__Modulo__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getGroup()); 
            }
            // InternalMiniJava.g:845:3: ( rule__Modulo__Group__0 )
            // InternalMiniJava.g:845:4: rule__Modulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getGroup()); 
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
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniJava.g:854:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMiniJava.g:855:1: ( rulePlusOrMinus EOF )
            // InternalMiniJava.g:856:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniJava.g:863:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:867:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMiniJava.g:868:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMiniJava.g:868:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMiniJava.g:869:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalMiniJava.g:870:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMiniJava.g:870:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniJava.g:879:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMiniJava.g:880:1: ( ruleMulOrDiv EOF )
            // InternalMiniJava.g:881:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniJava.g:888:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:892:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMiniJava.g:893:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMiniJava.g:893:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMiniJava.g:894:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalMiniJava.g:895:3: ( rule__MulOrDiv__Group__0 )
            // InternalMiniJava.g:895:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleArrayAccess"
    // InternalMiniJava.g:904:1: entryRuleArrayAccess : ruleArrayAccess EOF ;
    public final void entryRuleArrayAccess() throws RecognitionException {
        try {
            // InternalMiniJava.g:905:1: ( ruleArrayAccess EOF )
            // InternalMiniJava.g:906:1: ruleArrayAccess EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessRule()); 
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
    // $ANTLR end "entryRuleArrayAccess"


    // $ANTLR start "ruleArrayAccess"
    // InternalMiniJava.g:913:1: ruleArrayAccess : ( ( rule__ArrayAccess__Group__0 ) ) ;
    public final void ruleArrayAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:917:2: ( ( ( rule__ArrayAccess__Group__0 ) ) )
            // InternalMiniJava.g:918:2: ( ( rule__ArrayAccess__Group__0 ) )
            {
            // InternalMiniJava.g:918:2: ( ( rule__ArrayAccess__Group__0 ) )
            // InternalMiniJava.g:919:3: ( rule__ArrayAccess__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getGroup()); 
            }
            // InternalMiniJava.g:920:3: ( rule__ArrayAccess__Group__0 )
            // InternalMiniJava.g:920:4: rule__ArrayAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayAccess"


    // $ANTLR start "entryRuleArrayLength"
    // InternalMiniJava.g:929:1: entryRuleArrayLength : ruleArrayLength EOF ;
    public final void entryRuleArrayLength() throws RecognitionException {
        try {
            // InternalMiniJava.g:930:1: ( ruleArrayLength EOF )
            // InternalMiniJava.g:931:1: ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthRule()); 
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
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalMiniJava.g:938:1: ruleArrayLength : ( ( rule__ArrayLength__Group__0 ) ) ;
    public final void ruleArrayLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:942:2: ( ( ( rule__ArrayLength__Group__0 ) ) )
            // InternalMiniJava.g:943:2: ( ( rule__ArrayLength__Group__0 ) )
            {
            // InternalMiniJava.g:943:2: ( ( rule__ArrayLength__Group__0 ) )
            // InternalMiniJava.g:944:3: ( rule__ArrayLength__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getGroup()); 
            }
            // InternalMiniJava.g:945:3: ( rule__ArrayLength__Group__0 )
            // InternalMiniJava.g:945:4: rule__ArrayLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava.g:954:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMiniJava.g:955:1: ( rulePrimary EOF )
            // InternalMiniJava.g:956:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava.g:963:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:967:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMiniJava.g:968:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMiniJava.g:968:2: ( ( rule__Primary__Alternatives ) )
            // InternalMiniJava.g:969:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:970:3: ( rule__Primary__Alternatives )
            // InternalMiniJava.g:970:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava.g:979:1: entryRuleSelectionExpression : ruleSelectionExpression EOF ;
    public final void entryRuleSelectionExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:980:1: ( ruleSelectionExpression EOF )
            // InternalMiniJava.g:981:1: ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionRule()); 
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
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava.g:988:1: ruleSelectionExpression : ( ( rule__SelectionExpression__Group__0 ) ) ;
    public final void ruleSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:992:2: ( ( ( rule__SelectionExpression__Group__0 ) ) )
            // InternalMiniJava.g:993:2: ( ( rule__SelectionExpression__Group__0 ) )
            {
            // InternalMiniJava.g:993:2: ( ( rule__SelectionExpression__Group__0 ) )
            // InternalMiniJava.g:994:3: ( rule__SelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup()); 
            }
            // InternalMiniJava.g:995:3: ( rule__SelectionExpression__Group__0 )
            // InternalMiniJava.g:995:4: rule__SelectionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:1004:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:1005:1: ( ruleTerminalExpression EOF )
            // InternalMiniJava.g:1006:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava.g:1013:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1017:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalMiniJava.g:1018:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalMiniJava.g:1018:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalMiniJava.g:1019:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:1020:3: ( rule__TerminalExpression__Alternatives )
            // InternalMiniJava.g:1020:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava.g:1029:1: ruleAccessLevel : ( ( rule__AccessLevel__Alternatives ) ) ;
    public final void ruleAccessLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1033:1: ( ( ( rule__AccessLevel__Alternatives ) ) )
            // InternalMiniJava.g:1034:2: ( ( rule__AccessLevel__Alternatives ) )
            {
            // InternalMiniJava.g:1034:2: ( ( rule__AccessLevel__Alternatives ) )
            // InternalMiniJava.g:1035:3: ( rule__AccessLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessLevelAccess().getAlternatives()); 
            }
            // InternalMiniJava.g:1036:3: ( rule__AccessLevel__Alternatives )
            // InternalMiniJava.g:1036:4: rule__AccessLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccessLevel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessLevelAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAccessLevel"


    // $ANTLR start "rule__TypeDeclaration__Alternatives"
    // InternalMiniJava.g:1044:1: rule__TypeDeclaration__Alternatives : ( ( ruleClazz ) | ( ruleInterface ) );
    public final void rule__TypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1048:1: ( ( ruleClazz ) | ( ruleInterface ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21||LA1_1==65) ) {
                    alt1=1;
                }
                else if ( (LA1_1==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==21||LA1_2==65) ) {
                    alt1=1;
                }
                else if ( (LA1_2==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==21||LA1_3==65) ) {
                    alt1=1;
                }
                else if ( (LA1_3==27) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 65:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:1049:2: ( ruleClazz )
                    {
                    // InternalMiniJava.g:1049:2: ( ruleClazz )
                    // InternalMiniJava.g:1050:3: ruleClazz
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDeclarationAccess().getClazzParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClazz();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDeclarationAccess().getClazzParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1055:2: ( ruleInterface )
                    {
                    // InternalMiniJava.g:1055:2: ( ruleInterface )
                    // InternalMiniJava.g:1056:3: ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1()); 
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
    // $ANTLR end "rule__TypeDeclaration__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalMiniJava.g:1065:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1069:1: ( ( ruleField ) | ( ruleMethod ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:1070:2: ( ruleField )
                    {
                    // InternalMiniJava.g:1070:2: ( ruleField )
                    // InternalMiniJava.g:1071:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1076:2: ( ruleMethod )
                    {
                    // InternalMiniJava.g:1076:2: ( ruleMethod )
                    // InternalMiniJava.g:1077:3: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Method__Alternatives_8"
    // InternalMiniJava.g:1086:1: rule__Method__Alternatives_8 : ( ( ( rule__Method__BodyAssignment_8_0 ) ) | ( ';' ) );
    public final void rule__Method__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1090:1: ( ( ( rule__Method__BodyAssignment_8_0 ) ) | ( ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
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
                    // InternalMiniJava.g:1091:2: ( ( rule__Method__BodyAssignment_8_0 ) )
                    {
                    // InternalMiniJava.g:1091:2: ( ( rule__Method__BodyAssignment_8_0 ) )
                    // InternalMiniJava.g:1092:3: ( rule__Method__BodyAssignment_8_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getBodyAssignment_8_0()); 
                    }
                    // InternalMiniJava.g:1093:3: ( rule__Method__BodyAssignment_8_0 )
                    // InternalMiniJava.g:1093:4: rule__Method__BodyAssignment_8_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__BodyAssignment_8_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getBodyAssignment_8_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1097:2: ( ';' )
                    {
                    // InternalMiniJava.g:1097:2: ( ';' )
                    // InternalMiniJava.g:1098:3: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodAccess().getSemicolonKeyword_8_1()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodAccess().getSemicolonKeyword_8_1()); 
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
    // $ANTLR end "rule__Method__Alternatives_8"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMiniJava.g:1107:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1111:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:1112:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1112:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMiniJava.g:1113:3: ( rule__Statement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1114:3: ( rule__Statement__Group_0__0 )
                    // InternalMiniJava.g:1114:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1118:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1118:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalMiniJava.g:1119:3: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1120:3: ( rule__Statement__Group_1__0 )
                    // InternalMiniJava.g:1120:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1124:2: ( ruleIfStatement )
                    {
                    // InternalMiniJava.g:1124:2: ( ruleIfStatement )
                    // InternalMiniJava.g:1125:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1130:2: ( ruleWhileStatement )
                    {
                    // InternalMiniJava.g:1130:2: ( ruleWhileStatement )
                    // InternalMiniJava.g:1131:3: ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1136:2: ( ruleForStatement )
                    {
                    // InternalMiniJava.g:1136:2: ( ruleForStatement )
                    // InternalMiniJava.g:1137:3: ruleForStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleForStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1142:2: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:1142:2: ( ( rule__Statement__Group_5__0 ) )
                    // InternalMiniJava.g:1143:3: ( rule__Statement__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // InternalMiniJava.g:1144:3: ( rule__Statement__Group_5__0 )
                    // InternalMiniJava.g:1144:4: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1148:2: ( ruleBlock )
                    {
                    // InternalMiniJava.g:1148:2: ( ruleBlock )
                    // InternalMiniJava.g:1149:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1154:2: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // InternalMiniJava.g:1154:2: ( ( rule__Statement__Group_7__0 ) )
                    // InternalMiniJava.g:1155:3: ( rule__Statement__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // InternalMiniJava.g:1156:3: ( rule__Statement__Group_7__0 )
                    // InternalMiniJava.g:1156:4: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
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


    // $ANTLR start "rule__SingleTypeRef__Alternatives"
    // InternalMiniJava.g:1164:1: rule__SingleTypeRef__Alternatives : ( ( ruleClassRef ) | ( ( rule__SingleTypeRef__Group_1__0 ) ) | ( ( rule__SingleTypeRef__Group_2__0 ) ) | ( ( rule__SingleTypeRef__Group_3__0 ) ) | ( ( rule__SingleTypeRef__Group_4__0 ) ) );
    public final void rule__SingleTypeRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1168:1: ( ( ruleClassRef ) | ( ( rule__SingleTypeRef__Group_1__0 ) ) | ( ( rule__SingleTypeRef__Group_2__0 ) ) | ( ( rule__SingleTypeRef__Group_3__0 ) ) | ( ( rule__SingleTypeRef__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:1169:2: ( ruleClassRef )
                    {
                    // InternalMiniJava.g:1169:2: ( ruleClassRef )
                    // InternalMiniJava.g:1170:3: ruleClassRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1175:2: ( ( rule__SingleTypeRef__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1175:2: ( ( rule__SingleTypeRef__Group_1__0 ) )
                    // InternalMiniJava.g:1176:3: ( rule__SingleTypeRef__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1177:3: ( rule__SingleTypeRef__Group_1__0 )
                    // InternalMiniJava.g:1177:4: rule__SingleTypeRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1181:2: ( ( rule__SingleTypeRef__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1181:2: ( ( rule__SingleTypeRef__Group_2__0 ) )
                    // InternalMiniJava.g:1182:3: ( rule__SingleTypeRef__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1183:3: ( rule__SingleTypeRef__Group_2__0 )
                    // InternalMiniJava.g:1183:4: rule__SingleTypeRef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1187:2: ( ( rule__SingleTypeRef__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:1187:2: ( ( rule__SingleTypeRef__Group_3__0 ) )
                    // InternalMiniJava.g:1188:3: ( rule__SingleTypeRef__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_3()); 
                    }
                    // InternalMiniJava.g:1189:3: ( rule__SingleTypeRef__Group_3__0 )
                    // InternalMiniJava.g:1189:4: rule__SingleTypeRef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1193:2: ( ( rule__SingleTypeRef__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:1193:2: ( ( rule__SingleTypeRef__Group_4__0 ) )
                    // InternalMiniJava.g:1194:3: ( rule__SingleTypeRef__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSingleTypeRefAccess().getGroup_4()); 
                    }
                    // InternalMiniJava.g:1195:3: ( rule__SingleTypeRef__Group_4__0 )
                    // InternalMiniJava.g:1195:4: rule__SingleTypeRef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleTypeRef__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSingleTypeRefAccess().getGroup_4()); 
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
    // $ANTLR end "rule__SingleTypeRef__Alternatives"


    // $ANTLR start "rule__TypedDeclaration__Alternatives"
    // InternalMiniJava.g:1203:1: rule__TypedDeclaration__Alternatives : ( ( ruleSymbol ) | ( ruleMember ) );
    public final void rule__TypedDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1207:1: ( ( ruleSymbol ) | ( ruleMember ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:1208:2: ( ruleSymbol )
                    {
                    // InternalMiniJava.g:1208:2: ( ruleSymbol )
                    // InternalMiniJava.g:1209:3: ruleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1214:2: ( ruleMember )
                    {
                    // InternalMiniJava.g:1214:2: ( ruleMember )
                    // InternalMiniJava.g:1215:3: ruleMember
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMember();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1()); 
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
    // $ANTLR end "rule__TypedDeclaration__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalMiniJava.g:1224:1: rule__Symbol__Alternatives : ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1228:1: ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:1229:2: ( ( ruleParameter ) )
                    {
                    // InternalMiniJava.g:1229:2: ( ( ruleParameter ) )
                    // InternalMiniJava.g:1230:3: ( ruleParameter )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
                    }
                    // InternalMiniJava.g:1231:3: ( ruleParameter )
                    // InternalMiniJava.g:1231:4: ruleParameter
                    {
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1235:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:1235:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:1236:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1()); 
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
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__Assignee__Alternatives"
    // InternalMiniJava.g:1245:1: rule__Assignee__Alternatives : ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) );
    public final void rule__Assignee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1249:1: ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:1250:2: ( ( ruleArrayAccess ) )
                    {
                    // InternalMiniJava.g:1250:2: ( ( ruleArrayAccess ) )
                    // InternalMiniJava.g:1251:3: ( ruleArrayAccess )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0()); 
                    }
                    // InternalMiniJava.g:1252:3: ( ruleArrayAccess )
                    // InternalMiniJava.g:1252:4: ruleArrayAccess
                    {
                    pushFollow(FOLLOW_2);
                    ruleArrayAccess();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1256:2: ( ruleVariableDeclaration )
                    {
                    // InternalMiniJava.g:1256:2: ( ruleVariableDeclaration )
                    // InternalMiniJava.g:1257:3: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1()); 
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
    // $ANTLR end "rule__Assignee__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalMiniJava.g:1266:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1270:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
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
                    // InternalMiniJava.g:1271:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1271:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1272:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1273:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalMiniJava.g:1273:4: rule__Equality__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1277:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1277:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1278:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1279:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalMiniJava.g:1279:4: rule__Equality__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__Equality__Alternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalMiniJava.g:1287:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1291:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
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
                    // InternalMiniJava.g:1292:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1292:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1293:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1294:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalMiniJava.g:1294:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1298:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1298:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1299:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1300:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalMiniJava.g:1300:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1304:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalMiniJava.g:1304:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalMiniJava.g:1305:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // InternalMiniJava.g:1306:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalMiniJava.g:1306:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1310:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalMiniJava.g:1310:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalMiniJava.g:1311:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // InternalMiniJava.g:1312:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalMiniJava.g:1312:4: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
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
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMiniJava.g:1320:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1324:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==54) ) {
                alt11=1;
            }
            else if ( (LA11_0==55) ) {
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
                    // InternalMiniJava.g:1325:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1325:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1326:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1327:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMiniJava.g:1327:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1331:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1331:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1332:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1333:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMiniJava.g:1333:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__Alternatives_1_0"
    // InternalMiniJava.g:1341:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1345:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==56) ) {
                alt12=1;
            }
            else if ( (LA12_0==57) ) {
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
                    // InternalMiniJava.g:1346:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalMiniJava.g:1346:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalMiniJava.g:1347:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniJava.g:1348:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalMiniJava.g:1348:4: rule__MulOrDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1352:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalMiniJava.g:1352:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalMiniJava.g:1353:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniJava.g:1354:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalMiniJava.g:1354:4: rule__MulOrDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMiniJava.g:1362:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleSelectionExpression ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1366:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleSelectionExpression ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 59:
                {
                alt13=2;
                }
                break;
            case 55:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 13:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt13=4;
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
                    // InternalMiniJava.g:1367:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1367:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMiniJava.g:1368:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1369:3: ( rule__Primary__Group_0__0 )
                    // InternalMiniJava.g:1369:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1373:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1373:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMiniJava.g:1374:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1375:3: ( rule__Primary__Group_1__0 )
                    // InternalMiniJava.g:1375:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1379:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1379:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMiniJava.g:1380:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1381:3: ( rule__Primary__Group_2__0 )
                    // InternalMiniJava.g:1381:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1385:2: ( ruleSelectionExpression )
                    {
                    // InternalMiniJava.g:1385:2: ( ruleSelectionExpression )
                    // InternalMiniJava.g:1386:3: ruleSelectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3()); 
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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__SelectionExpression__Alternatives_1"
    // InternalMiniJava.g:1395:1: rule__SelectionExpression__Alternatives_1 : ( ( ( rule__SelectionExpression__Group_1_0__0 ) ) | ( ( rule__SelectionExpression__Group_1_1__0 ) ) );
    public final void rule__SelectionExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1399:1: ( ( ( rule__SelectionExpression__Group_1_0__0 ) ) | ( ( rule__SelectionExpression__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==EOF||LA14_2==11||LA14_2==19||LA14_2==26||(LA14_2>=29 && LA14_2<=30)||(LA14_2>=39 && LA14_2<=40)||(LA14_2>=45 && LA14_2<=57)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==28) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:1400:2: ( ( rule__SelectionExpression__Group_1_0__0 ) )
                    {
                    // InternalMiniJava.g:1400:2: ( ( rule__SelectionExpression__Group_1_0__0 ) )
                    // InternalMiniJava.g:1401:3: ( rule__SelectionExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectionExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalMiniJava.g:1402:3: ( rule__SelectionExpression__Group_1_0__0 )
                    // InternalMiniJava.g:1402:4: rule__SelectionExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectionExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1406:2: ( ( rule__SelectionExpression__Group_1_1__0 ) )
                    {
                    // InternalMiniJava.g:1406:2: ( ( rule__SelectionExpression__Group_1_1__0 ) )
                    // InternalMiniJava.g:1407:3: ( rule__SelectionExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalMiniJava.g:1408:3: ( rule__SelectionExpression__Group_1_1__0 )
                    // InternalMiniJava.g:1408:4: rule__SelectionExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Alternatives_1"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalMiniJava.g:1416:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) | ( ( rule__TerminalExpression__Group_9__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1420:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) | ( ( rule__TerminalExpression__Group_9__0 ) ) )
            int alt15=10;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:1421:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalMiniJava.g:1421:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalMiniJava.g:1422:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalMiniJava.g:1423:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalMiniJava.g:1423:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1427:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1427:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalMiniJava.g:1428:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalMiniJava.g:1429:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalMiniJava.g:1429:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1433:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1433:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalMiniJava.g:1434:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalMiniJava.g:1435:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalMiniJava.g:1435:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1439:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalMiniJava.g:1439:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalMiniJava.g:1440:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalMiniJava.g:1441:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalMiniJava.g:1441:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1445:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalMiniJava.g:1445:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalMiniJava.g:1446:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalMiniJava.g:1447:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalMiniJava.g:1447:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1451:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalMiniJava.g:1451:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalMiniJava.g:1452:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalMiniJava.g:1453:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalMiniJava.g:1453:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1457:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalMiniJava.g:1457:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalMiniJava.g:1458:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }
                    // InternalMiniJava.g:1459:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalMiniJava.g:1459:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1463:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    {
                    // InternalMiniJava.g:1463:2: ( ( rule__TerminalExpression__Group_7__0 ) )
                    // InternalMiniJava.g:1464:3: ( rule__TerminalExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }
                    // InternalMiniJava.g:1465:3: ( rule__TerminalExpression__Group_7__0 )
                    // InternalMiniJava.g:1465:4: rule__TerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1469:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    {
                    // InternalMiniJava.g:1469:2: ( ( rule__TerminalExpression__Group_8__0 ) )
                    // InternalMiniJava.g:1470:3: ( rule__TerminalExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }
                    // InternalMiniJava.g:1471:3: ( rule__TerminalExpression__Group_8__0 )
                    // InternalMiniJava.g:1471:4: rule__TerminalExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:1475:2: ( ( rule__TerminalExpression__Group_9__0 ) )
                    {
                    // InternalMiniJava.g:1475:2: ( ( rule__TerminalExpression__Group_9__0 ) )
                    // InternalMiniJava.g:1476:3: ( rule__TerminalExpression__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_9()); 
                    }
                    // InternalMiniJava.g:1477:3: ( rule__TerminalExpression__Group_9__0 )
                    // InternalMiniJava.g:1477:4: rule__TerminalExpression__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_9()); 
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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__ValueAlternatives_3_1_0"
    // InternalMiniJava.g:1485:1: rule__TerminalExpression__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__TerminalExpression__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1489:1: ( ( 'true' ) | ( 'false' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==13) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniJava.g:1490:2: ( 'true' )
                    {
                    // InternalMiniJava.g:1490:2: ( 'true' )
                    // InternalMiniJava.g:1491:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_3_1_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1496:2: ( 'false' )
                    {
                    // InternalMiniJava.g:1496:2: ( 'false' )
                    // InternalMiniJava.g:1497:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_3_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__AccessLevel__Alternatives"
    // InternalMiniJava.g:1506:1: rule__AccessLevel__Alternatives : ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) );
    public final void rule__AccessLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1510:1: ( ( ( 'private' ) ) | ( ( 'protected' ) ) | ( ( 'public' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt17=1;
                }
                break;
            case 15:
                {
                alt17=2;
                }
                break;
            case 16:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:1511:2: ( ( 'private' ) )
                    {
                    // InternalMiniJava.g:1511:2: ( ( 'private' ) )
                    // InternalMiniJava.g:1512:3: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }
                    // InternalMiniJava.g:1513:3: ( 'private' )
                    // InternalMiniJava.g:1513:4: 'private'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1517:2: ( ( 'protected' ) )
                    {
                    // InternalMiniJava.g:1517:2: ( ( 'protected' ) )
                    // InternalMiniJava.g:1518:3: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }
                    // InternalMiniJava.g:1519:3: ( 'protected' )
                    // InternalMiniJava.g:1519:4: 'protected'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1523:2: ( ( 'public' ) )
                    {
                    // InternalMiniJava.g:1523:2: ( ( 'public' ) )
                    // InternalMiniJava.g:1524:3: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
                    }
                    // InternalMiniJava.g:1525:3: ( 'public' )
                    // InternalMiniJava.g:1525:4: 'public'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__AccessLevel__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMiniJava.g:1533:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1537:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMiniJava.g:1538:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMiniJava.g:1545:1: rule__Program__Group__0__Impl : ( ( rule__Program__Group_0__0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1549:1: ( ( ( rule__Program__Group_0__0 )? ) )
            // InternalMiniJava.g:1550:1: ( ( rule__Program__Group_0__0 )? )
            {
            // InternalMiniJava.g:1550:1: ( ( rule__Program__Group_0__0 )? )
            // InternalMiniJava.g:1551:2: ( rule__Program__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_0()); 
            }
            // InternalMiniJava.g:1552:2: ( rule__Program__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1552:3: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMiniJava.g:1560:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1564:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMiniJava.g:1565:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMiniJava.g:1572:1: rule__Program__Group__1__Impl : ( ( rule__Program__ImportsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1576:1: ( ( ( rule__Program__ImportsAssignment_1 )* ) )
            // InternalMiniJava.g:1577:1: ( ( rule__Program__ImportsAssignment_1 )* )
            {
            // InternalMiniJava.g:1577:1: ( ( rule__Program__ImportsAssignment_1 )* )
            // InternalMiniJava.g:1578:2: ( rule__Program__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
            }
            // InternalMiniJava.g:1579:2: ( rule__Program__ImportsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMiniJava.g:1579:3: rule__Program__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsAssignment_1()); 
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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMiniJava.g:1587:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1591:1: ( rule__Program__Group__2__Impl )
            // InternalMiniJava.g:1592:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMiniJava.g:1598:1: rule__Program__Group__2__Impl : ( ( rule__Program__ClassesAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1602:1: ( ( ( rule__Program__ClassesAssignment_2 )* ) )
            // InternalMiniJava.g:1603:1: ( ( rule__Program__ClassesAssignment_2 )* )
            {
            // InternalMiniJava.g:1603:1: ( ( rule__Program__ClassesAssignment_2 )* )
            // InternalMiniJava.g:1604:2: ( rule__Program__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
            }
            // InternalMiniJava.g:1605:2: ( rule__Program__ClassesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=14 && LA20_0<=16)||LA20_0==21||LA20_0==27||LA20_0==65) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMiniJava.g:1605:3: rule__Program__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesAssignment_2()); 
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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group_0__0"
    // InternalMiniJava.g:1614:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1618:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // InternalMiniJava.g:1619:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__1();

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
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // InternalMiniJava.g:1626:1: rule__Program__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1630:1: ( ( 'package' ) )
            // InternalMiniJava.g:1631:1: ( 'package' )
            {
            // InternalMiniJava.g:1631:1: ( 'package' )
            // InternalMiniJava.g:1632:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getPackageKeyword_0_0()); 
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
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // InternalMiniJava.g:1641:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl rule__Program__Group_0__2 ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1645:1: ( rule__Program__Group_0__1__Impl rule__Program__Group_0__2 )
            // InternalMiniJava.g:1646:2: rule__Program__Group_0__1__Impl rule__Program__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2();

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
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // InternalMiniJava.g:1653:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__NameAssignment_0_1 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1657:1: ( ( ( rule__Program__NameAssignment_0_1 ) ) )
            // InternalMiniJava.g:1658:1: ( ( rule__Program__NameAssignment_0_1 ) )
            {
            // InternalMiniJava.g:1658:1: ( ( rule__Program__NameAssignment_0_1 ) )
            // InternalMiniJava.g:1659:2: ( rule__Program__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
            }
            // InternalMiniJava.g:1660:2: ( rule__Program__NameAssignment_0_1 )
            // InternalMiniJava.g:1660:3: rule__Program__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameAssignment_0_1()); 
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
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0__2"
    // InternalMiniJava.g:1668:1: rule__Program__Group_0__2 : rule__Program__Group_0__2__Impl ;
    public final void rule__Program__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1672:1: ( rule__Program__Group_0__2__Impl )
            // InternalMiniJava.g:1673:2: rule__Program__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_0__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0__2"


    // $ANTLR start "rule__Program__Group_0__2__Impl"
    // InternalMiniJava.g:1679:1: rule__Program__Group_0__2__Impl : ( ';' ) ;
    public final void rule__Program__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1683:1: ( ( ';' ) )
            // InternalMiniJava.g:1684:1: ( ';' )
            {
            // InternalMiniJava.g:1684:1: ( ';' )
            // InternalMiniJava.g:1685:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_0_2()); 
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
    // $ANTLR end "rule__Program__Group_0__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMiniJava.g:1695:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1699:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMiniJava.g:1700:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMiniJava.g:1707:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1711:1: ( ( 'import' ) )
            // InternalMiniJava.g:1712:1: ( 'import' )
            {
            // InternalMiniJava.g:1712:1: ( 'import' )
            // InternalMiniJava.g:1713:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMiniJava.g:1722:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1726:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMiniJava.g:1727:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMiniJava.g:1734:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1738:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMiniJava.g:1739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMiniJava.g:1739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMiniJava.g:1740:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMiniJava.g:1741:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMiniJava.g:1741:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMiniJava.g:1749:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1753:1: ( rule__Import__Group__2__Impl )
            // InternalMiniJava.g:1754:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMiniJava.g:1760:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1764:1: ( ( ';' ) )
            // InternalMiniJava.g:1765:1: ( ';' )
            {
            // InternalMiniJava.g:1765:1: ( ';' )
            // InternalMiniJava.g:1766:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMiniJava.g:1776:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1780:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMiniJava.g:1781:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMiniJava.g:1788:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1792:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1793:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1793:1: ( RULE_ID )
            // InternalMiniJava.g:1794:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMiniJava.g:1803:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1807:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMiniJava.g:1808:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMiniJava.g:1814:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1818:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMiniJava.g:1819:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMiniJava.g:1819:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMiniJava.g:1820:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:1821:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMiniJava.g:1821:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMiniJava.g:1830:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1834:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMiniJava.g:1835:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMiniJava.g:1842:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1846:1: ( ( '.' ) )
            // InternalMiniJava.g:1847:1: ( '.' )
            {
            // InternalMiniJava.g:1847:1: ( '.' )
            // InternalMiniJava.g:1848:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMiniJava.g:1857:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1861:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMiniJava.g:1862:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMiniJava.g:1868:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1872:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1873:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1873:1: ( RULE_ID )
            // InternalMiniJava.g:1874:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMiniJava.g:1884:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1888:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMiniJava.g:1889:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMiniJava.g:1896:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1900:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:1901:1: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:1901:1: ( ruleQualifiedName )
            // InternalMiniJava.g:1902:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMiniJava.g:1911:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1915:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMiniJava.g:1916:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMiniJava.g:1922:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1926:1: ( ( ( '.*' )? ) )
            // InternalMiniJava.g:1927:1: ( ( '.*' )? )
            {
            // InternalMiniJava.g:1927:1: ( ( '.*' )? )
            // InternalMiniJava.g:1928:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMiniJava.g:1929:2: ( '.*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:1929:3: '.*'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Clazz__Group__0"
    // InternalMiniJava.g:1938:1: rule__Clazz__Group__0 : rule__Clazz__Group__0__Impl rule__Clazz__Group__1 ;
    public final void rule__Clazz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1942:1: ( rule__Clazz__Group__0__Impl rule__Clazz__Group__1 )
            // InternalMiniJava.g:1943:2: rule__Clazz__Group__0__Impl rule__Clazz__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Clazz__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__1();

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
    // $ANTLR end "rule__Clazz__Group__0"


    // $ANTLR start "rule__Clazz__Group__0__Impl"
    // InternalMiniJava.g:1950:1: rule__Clazz__Group__0__Impl : ( ( rule__Clazz__AccessLevelAssignment_0 )? ) ;
    public final void rule__Clazz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1954:1: ( ( ( rule__Clazz__AccessLevelAssignment_0 )? ) )
            // InternalMiniJava.g:1955:1: ( ( rule__Clazz__AccessLevelAssignment_0 )? )
            {
            // InternalMiniJava.g:1955:1: ( ( rule__Clazz__AccessLevelAssignment_0 )? )
            // InternalMiniJava.g:1956:2: ( rule__Clazz__AccessLevelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getAccessLevelAssignment_0()); 
            }
            // InternalMiniJava.g:1957:2: ( rule__Clazz__AccessLevelAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=14 && LA23_0<=16)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:1957:3: rule__Clazz__AccessLevelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clazz__AccessLevelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getAccessLevelAssignment_0()); 
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
    // $ANTLR end "rule__Clazz__Group__0__Impl"


    // $ANTLR start "rule__Clazz__Group__1"
    // InternalMiniJava.g:1965:1: rule__Clazz__Group__1 : rule__Clazz__Group__1__Impl rule__Clazz__Group__2 ;
    public final void rule__Clazz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1969:1: ( rule__Clazz__Group__1__Impl rule__Clazz__Group__2 )
            // InternalMiniJava.g:1970:2: rule__Clazz__Group__1__Impl rule__Clazz__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Clazz__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__2();

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
    // $ANTLR end "rule__Clazz__Group__1"


    // $ANTLR start "rule__Clazz__Group__1__Impl"
    // InternalMiniJava.g:1977:1: rule__Clazz__Group__1__Impl : ( ( rule__Clazz__IsabstractAssignment_1 )? ) ;
    public final void rule__Clazz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1981:1: ( ( ( rule__Clazz__IsabstractAssignment_1 )? ) )
            // InternalMiniJava.g:1982:1: ( ( rule__Clazz__IsabstractAssignment_1 )? )
            {
            // InternalMiniJava.g:1982:1: ( ( rule__Clazz__IsabstractAssignment_1 )? )
            // InternalMiniJava.g:1983:2: ( rule__Clazz__IsabstractAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getIsabstractAssignment_1()); 
            }
            // InternalMiniJava.g:1984:2: ( rule__Clazz__IsabstractAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:1984:3: rule__Clazz__IsabstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clazz__IsabstractAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getIsabstractAssignment_1()); 
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
    // $ANTLR end "rule__Clazz__Group__1__Impl"


    // $ANTLR start "rule__Clazz__Group__2"
    // InternalMiniJava.g:1992:1: rule__Clazz__Group__2 : rule__Clazz__Group__2__Impl rule__Clazz__Group__3 ;
    public final void rule__Clazz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1996:1: ( rule__Clazz__Group__2__Impl rule__Clazz__Group__3 )
            // InternalMiniJava.g:1997:2: rule__Clazz__Group__2__Impl rule__Clazz__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Clazz__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__3();

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
    // $ANTLR end "rule__Clazz__Group__2"


    // $ANTLR start "rule__Clazz__Group__2__Impl"
    // InternalMiniJava.g:2004:1: rule__Clazz__Group__2__Impl : ( 'class' ) ;
    public final void rule__Clazz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2008:1: ( ( 'class' ) )
            // InternalMiniJava.g:2009:1: ( 'class' )
            {
            // InternalMiniJava.g:2009:1: ( 'class' )
            // InternalMiniJava.g:2010:2: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getClassKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getClassKeyword_2()); 
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
    // $ANTLR end "rule__Clazz__Group__2__Impl"


    // $ANTLR start "rule__Clazz__Group__3"
    // InternalMiniJava.g:2019:1: rule__Clazz__Group__3 : rule__Clazz__Group__3__Impl rule__Clazz__Group__4 ;
    public final void rule__Clazz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2023:1: ( rule__Clazz__Group__3__Impl rule__Clazz__Group__4 )
            // InternalMiniJava.g:2024:2: rule__Clazz__Group__3__Impl rule__Clazz__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Clazz__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__4();

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
    // $ANTLR end "rule__Clazz__Group__3"


    // $ANTLR start "rule__Clazz__Group__3__Impl"
    // InternalMiniJava.g:2031:1: rule__Clazz__Group__3__Impl : ( ( rule__Clazz__NameAssignment_3 ) ) ;
    public final void rule__Clazz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2035:1: ( ( ( rule__Clazz__NameAssignment_3 ) ) )
            // InternalMiniJava.g:2036:1: ( ( rule__Clazz__NameAssignment_3 ) )
            {
            // InternalMiniJava.g:2036:1: ( ( rule__Clazz__NameAssignment_3 ) )
            // InternalMiniJava.g:2037:2: ( rule__Clazz__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getNameAssignment_3()); 
            }
            // InternalMiniJava.g:2038:2: ( rule__Clazz__NameAssignment_3 )
            // InternalMiniJava.g:2038:3: rule__Clazz__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Clazz__Group__3__Impl"


    // $ANTLR start "rule__Clazz__Group__4"
    // InternalMiniJava.g:2046:1: rule__Clazz__Group__4 : rule__Clazz__Group__4__Impl rule__Clazz__Group__5 ;
    public final void rule__Clazz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2050:1: ( rule__Clazz__Group__4__Impl rule__Clazz__Group__5 )
            // InternalMiniJava.g:2051:2: rule__Clazz__Group__4__Impl rule__Clazz__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Clazz__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__5();

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
    // $ANTLR end "rule__Clazz__Group__4"


    // $ANTLR start "rule__Clazz__Group__4__Impl"
    // InternalMiniJava.g:2058:1: rule__Clazz__Group__4__Impl : ( ( rule__Clazz__Group_4__0 )? ) ;
    public final void rule__Clazz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2062:1: ( ( ( rule__Clazz__Group_4__0 )? ) )
            // InternalMiniJava.g:2063:1: ( ( rule__Clazz__Group_4__0 )? )
            {
            // InternalMiniJava.g:2063:1: ( ( rule__Clazz__Group_4__0 )? )
            // InternalMiniJava.g:2064:2: ( rule__Clazz__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getGroup_4()); 
            }
            // InternalMiniJava.g:2065:2: ( rule__Clazz__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniJava.g:2065:3: rule__Clazz__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clazz__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Clazz__Group__4__Impl"


    // $ANTLR start "rule__Clazz__Group__5"
    // InternalMiniJava.g:2073:1: rule__Clazz__Group__5 : rule__Clazz__Group__5__Impl rule__Clazz__Group__6 ;
    public final void rule__Clazz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2077:1: ( rule__Clazz__Group__5__Impl rule__Clazz__Group__6 )
            // InternalMiniJava.g:2078:2: rule__Clazz__Group__5__Impl rule__Clazz__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Clazz__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__6();

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
    // $ANTLR end "rule__Clazz__Group__5"


    // $ANTLR start "rule__Clazz__Group__5__Impl"
    // InternalMiniJava.g:2085:1: rule__Clazz__Group__5__Impl : ( ( rule__Clazz__Group_5__0 )? ) ;
    public final void rule__Clazz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2089:1: ( ( ( rule__Clazz__Group_5__0 )? ) )
            // InternalMiniJava.g:2090:1: ( ( rule__Clazz__Group_5__0 )? )
            {
            // InternalMiniJava.g:2090:1: ( ( rule__Clazz__Group_5__0 )? )
            // InternalMiniJava.g:2091:2: ( rule__Clazz__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getGroup_5()); 
            }
            // InternalMiniJava.g:2092:2: ( rule__Clazz__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMiniJava.g:2092:3: rule__Clazz__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clazz__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Clazz__Group__5__Impl"


    // $ANTLR start "rule__Clazz__Group__6"
    // InternalMiniJava.g:2100:1: rule__Clazz__Group__6 : rule__Clazz__Group__6__Impl rule__Clazz__Group__7 ;
    public final void rule__Clazz__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2104:1: ( rule__Clazz__Group__6__Impl rule__Clazz__Group__7 )
            // InternalMiniJava.g:2105:2: rule__Clazz__Group__6__Impl rule__Clazz__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Clazz__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__7();

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
    // $ANTLR end "rule__Clazz__Group__6"


    // $ANTLR start "rule__Clazz__Group__6__Impl"
    // InternalMiniJava.g:2112:1: rule__Clazz__Group__6__Impl : ( '{' ) ;
    public final void rule__Clazz__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2116:1: ( ( '{' ) )
            // InternalMiniJava.g:2117:1: ( '{' )
            {
            // InternalMiniJava.g:2117:1: ( '{' )
            // InternalMiniJava.g:2118:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Clazz__Group__6__Impl"


    // $ANTLR start "rule__Clazz__Group__7"
    // InternalMiniJava.g:2127:1: rule__Clazz__Group__7 : rule__Clazz__Group__7__Impl rule__Clazz__Group__8 ;
    public final void rule__Clazz__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2131:1: ( rule__Clazz__Group__7__Impl rule__Clazz__Group__8 )
            // InternalMiniJava.g:2132:2: rule__Clazz__Group__7__Impl rule__Clazz__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Clazz__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__8();

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
    // $ANTLR end "rule__Clazz__Group__7"


    // $ANTLR start "rule__Clazz__Group__7__Impl"
    // InternalMiniJava.g:2139:1: rule__Clazz__Group__7__Impl : ( ( rule__Clazz__MembersAssignment_7 )* ) ;
    public final void rule__Clazz__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2143:1: ( ( ( rule__Clazz__MembersAssignment_7 )* ) )
            // InternalMiniJava.g:2144:1: ( ( rule__Clazz__MembersAssignment_7 )* )
            {
            // InternalMiniJava.g:2144:1: ( ( rule__Clazz__MembersAssignment_7 )* )
            // InternalMiniJava.g:2145:2: ( rule__Clazz__MembersAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getMembersAssignment_7()); 
            }
            // InternalMiniJava.g:2146:2: ( rule__Clazz__MembersAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=14 && LA27_0<=16)||(LA27_0>=41 && LA27_0<=44)||(LA27_0>=65 && LA27_0<=66)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMiniJava.g:2146:3: rule__Clazz__MembersAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Clazz__MembersAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getMembersAssignment_7()); 
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
    // $ANTLR end "rule__Clazz__Group__7__Impl"


    // $ANTLR start "rule__Clazz__Group__8"
    // InternalMiniJava.g:2154:1: rule__Clazz__Group__8 : rule__Clazz__Group__8__Impl ;
    public final void rule__Clazz__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2158:1: ( rule__Clazz__Group__8__Impl )
            // InternalMiniJava.g:2159:2: rule__Clazz__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group__8__Impl();

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
    // $ANTLR end "rule__Clazz__Group__8"


    // $ANTLR start "rule__Clazz__Group__8__Impl"
    // InternalMiniJava.g:2165:1: rule__Clazz__Group__8__Impl : ( '}' ) ;
    public final void rule__Clazz__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2169:1: ( ( '}' ) )
            // InternalMiniJava.g:2170:1: ( '}' )
            {
            // InternalMiniJava.g:2170:1: ( '}' )
            // InternalMiniJava.g:2171:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Clazz__Group__8__Impl"


    // $ANTLR start "rule__Clazz__Group_4__0"
    // InternalMiniJava.g:2181:1: rule__Clazz__Group_4__0 : rule__Clazz__Group_4__0__Impl rule__Clazz__Group_4__1 ;
    public final void rule__Clazz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2185:1: ( rule__Clazz__Group_4__0__Impl rule__Clazz__Group_4__1 )
            // InternalMiniJava.g:2186:2: rule__Clazz__Group_4__0__Impl rule__Clazz__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Clazz__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_4__1();

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
    // $ANTLR end "rule__Clazz__Group_4__0"


    // $ANTLR start "rule__Clazz__Group_4__0__Impl"
    // InternalMiniJava.g:2193:1: rule__Clazz__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Clazz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2197:1: ( ( 'extends' ) )
            // InternalMiniJava.g:2198:1: ( 'extends' )
            {
            // InternalMiniJava.g:2198:1: ( 'extends' )
            // InternalMiniJava.g:2199:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getExtendsKeyword_4_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getExtendsKeyword_4_0()); 
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
    // $ANTLR end "rule__Clazz__Group_4__0__Impl"


    // $ANTLR start "rule__Clazz__Group_4__1"
    // InternalMiniJava.g:2208:1: rule__Clazz__Group_4__1 : rule__Clazz__Group_4__1__Impl ;
    public final void rule__Clazz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2212:1: ( rule__Clazz__Group_4__1__Impl )
            // InternalMiniJava.g:2213:2: rule__Clazz__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_4__1__Impl();

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
    // $ANTLR end "rule__Clazz__Group_4__1"


    // $ANTLR start "rule__Clazz__Group_4__1__Impl"
    // InternalMiniJava.g:2219:1: rule__Clazz__Group_4__1__Impl : ( ( rule__Clazz__SuperClassAssignment_4_1 ) ) ;
    public final void rule__Clazz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2223:1: ( ( ( rule__Clazz__SuperClassAssignment_4_1 ) ) )
            // InternalMiniJava.g:2224:1: ( ( rule__Clazz__SuperClassAssignment_4_1 ) )
            {
            // InternalMiniJava.g:2224:1: ( ( rule__Clazz__SuperClassAssignment_4_1 ) )
            // InternalMiniJava.g:2225:2: ( rule__Clazz__SuperClassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getSuperClassAssignment_4_1()); 
            }
            // InternalMiniJava.g:2226:2: ( rule__Clazz__SuperClassAssignment_4_1 )
            // InternalMiniJava.g:2226:3: rule__Clazz__SuperClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__SuperClassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getSuperClassAssignment_4_1()); 
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
    // $ANTLR end "rule__Clazz__Group_4__1__Impl"


    // $ANTLR start "rule__Clazz__Group_5__0"
    // InternalMiniJava.g:2235:1: rule__Clazz__Group_5__0 : rule__Clazz__Group_5__0__Impl rule__Clazz__Group_5__1 ;
    public final void rule__Clazz__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2239:1: ( rule__Clazz__Group_5__0__Impl rule__Clazz__Group_5__1 )
            // InternalMiniJava.g:2240:2: rule__Clazz__Group_5__0__Impl rule__Clazz__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Clazz__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_5__1();

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
    // $ANTLR end "rule__Clazz__Group_5__0"


    // $ANTLR start "rule__Clazz__Group_5__0__Impl"
    // InternalMiniJava.g:2247:1: rule__Clazz__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Clazz__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2251:1: ( ( 'implements' ) )
            // InternalMiniJava.g:2252:1: ( 'implements' )
            {
            // InternalMiniJava.g:2252:1: ( 'implements' )
            // InternalMiniJava.g:2253:2: 'implements'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementsKeyword_5_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementsKeyword_5_0()); 
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
    // $ANTLR end "rule__Clazz__Group_5__0__Impl"


    // $ANTLR start "rule__Clazz__Group_5__1"
    // InternalMiniJava.g:2262:1: rule__Clazz__Group_5__1 : rule__Clazz__Group_5__1__Impl rule__Clazz__Group_5__2 ;
    public final void rule__Clazz__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2266:1: ( rule__Clazz__Group_5__1__Impl rule__Clazz__Group_5__2 )
            // InternalMiniJava.g:2267:2: rule__Clazz__Group_5__1__Impl rule__Clazz__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Clazz__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_5__2();

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
    // $ANTLR end "rule__Clazz__Group_5__1"


    // $ANTLR start "rule__Clazz__Group_5__1__Impl"
    // InternalMiniJava.g:2274:1: rule__Clazz__Group_5__1__Impl : ( ( rule__Clazz__ImplementzAssignment_5_1 ) ) ;
    public final void rule__Clazz__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2278:1: ( ( ( rule__Clazz__ImplementzAssignment_5_1 ) ) )
            // InternalMiniJava.g:2279:1: ( ( rule__Clazz__ImplementzAssignment_5_1 ) )
            {
            // InternalMiniJava.g:2279:1: ( ( rule__Clazz__ImplementzAssignment_5_1 ) )
            // InternalMiniJava.g:2280:2: ( rule__Clazz__ImplementzAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzAssignment_5_1()); 
            }
            // InternalMiniJava.g:2281:2: ( rule__Clazz__ImplementzAssignment_5_1 )
            // InternalMiniJava.g:2281:3: rule__Clazz__ImplementzAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__ImplementzAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzAssignment_5_1()); 
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
    // $ANTLR end "rule__Clazz__Group_5__1__Impl"


    // $ANTLR start "rule__Clazz__Group_5__2"
    // InternalMiniJava.g:2289:1: rule__Clazz__Group_5__2 : rule__Clazz__Group_5__2__Impl ;
    public final void rule__Clazz__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2293:1: ( rule__Clazz__Group_5__2__Impl )
            // InternalMiniJava.g:2294:2: rule__Clazz__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_5__2__Impl();

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
    // $ANTLR end "rule__Clazz__Group_5__2"


    // $ANTLR start "rule__Clazz__Group_5__2__Impl"
    // InternalMiniJava.g:2300:1: rule__Clazz__Group_5__2__Impl : ( ( rule__Clazz__Group_5_2__0 )* ) ;
    public final void rule__Clazz__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2304:1: ( ( ( rule__Clazz__Group_5_2__0 )* ) )
            // InternalMiniJava.g:2305:1: ( ( rule__Clazz__Group_5_2__0 )* )
            {
            // InternalMiniJava.g:2305:1: ( ( rule__Clazz__Group_5_2__0 )* )
            // InternalMiniJava.g:2306:2: ( rule__Clazz__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getGroup_5_2()); 
            }
            // InternalMiniJava.g:2307:2: ( rule__Clazz__Group_5_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMiniJava.g:2307:3: rule__Clazz__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Clazz__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getGroup_5_2()); 
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
    // $ANTLR end "rule__Clazz__Group_5__2__Impl"


    // $ANTLR start "rule__Clazz__Group_5_2__0"
    // InternalMiniJava.g:2316:1: rule__Clazz__Group_5_2__0 : rule__Clazz__Group_5_2__0__Impl rule__Clazz__Group_5_2__1 ;
    public final void rule__Clazz__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2320:1: ( rule__Clazz__Group_5_2__0__Impl rule__Clazz__Group_5_2__1 )
            // InternalMiniJava.g:2321:2: rule__Clazz__Group_5_2__0__Impl rule__Clazz__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Clazz__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_5_2__1();

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
    // $ANTLR end "rule__Clazz__Group_5_2__0"


    // $ANTLR start "rule__Clazz__Group_5_2__0__Impl"
    // InternalMiniJava.g:2328:1: rule__Clazz__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Clazz__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2332:1: ( ( ',' ) )
            // InternalMiniJava.g:2333:1: ( ',' )
            {
            // InternalMiniJava.g:2333:1: ( ',' )
            // InternalMiniJava.g:2334:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getCommaKeyword_5_2_0()); 
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
    // $ANTLR end "rule__Clazz__Group_5_2__0__Impl"


    // $ANTLR start "rule__Clazz__Group_5_2__1"
    // InternalMiniJava.g:2343:1: rule__Clazz__Group_5_2__1 : rule__Clazz__Group_5_2__1__Impl ;
    public final void rule__Clazz__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2347:1: ( rule__Clazz__Group_5_2__1__Impl )
            // InternalMiniJava.g:2348:2: rule__Clazz__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Clazz__Group_5_2__1"


    // $ANTLR start "rule__Clazz__Group_5_2__1__Impl"
    // InternalMiniJava.g:2354:1: rule__Clazz__Group_5_2__1__Impl : ( ( rule__Clazz__ImplementzAssignment_5_2_1 ) ) ;
    public final void rule__Clazz__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2358:1: ( ( ( rule__Clazz__ImplementzAssignment_5_2_1 ) ) )
            // InternalMiniJava.g:2359:1: ( ( rule__Clazz__ImplementzAssignment_5_2_1 ) )
            {
            // InternalMiniJava.g:2359:1: ( ( rule__Clazz__ImplementzAssignment_5_2_1 ) )
            // InternalMiniJava.g:2360:2: ( rule__Clazz__ImplementzAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzAssignment_5_2_1()); 
            }
            // InternalMiniJava.g:2361:2: ( rule__Clazz__ImplementzAssignment_5_2_1 )
            // InternalMiniJava.g:2361:3: rule__Clazz__ImplementzAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Clazz__ImplementzAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzAssignment_5_2_1()); 
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
    // $ANTLR end "rule__Clazz__Group_5_2__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalMiniJava.g:2370:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2374:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalMiniJava.g:2375:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalMiniJava.g:2382:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__AccessLevelAssignment_0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2386:1: ( ( ( rule__Interface__AccessLevelAssignment_0 )? ) )
            // InternalMiniJava.g:2387:1: ( ( rule__Interface__AccessLevelAssignment_0 )? )
            {
            // InternalMiniJava.g:2387:1: ( ( rule__Interface__AccessLevelAssignment_0 )? )
            // InternalMiniJava.g:2388:2: ( rule__Interface__AccessLevelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAccessLevelAssignment_0()); 
            }
            // InternalMiniJava.g:2389:2: ( rule__Interface__AccessLevelAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=14 && LA29_0<=16)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMiniJava.g:2389:3: rule__Interface__AccessLevelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__AccessLevelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAccessLevelAssignment_0()); 
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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalMiniJava.g:2397:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2401:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalMiniJava.g:2402:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalMiniJava.g:2409:1: rule__Interface__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2413:1: ( ( 'interface' ) )
            // InternalMiniJava.g:2414:1: ( 'interface' )
            {
            // InternalMiniJava.g:2414:1: ( 'interface' )
            // InternalMiniJava.g:2415:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1()); 
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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalMiniJava.g:2424:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2428:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalMiniJava.g:2429:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalMiniJava.g:2436:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2440:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // InternalMiniJava.g:2441:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:2441:1: ( ( rule__Interface__NameAssignment_2 ) )
            // InternalMiniJava.g:2442:2: ( rule__Interface__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            }
            // InternalMiniJava.g:2443:2: ( rule__Interface__NameAssignment_2 )
            // InternalMiniJava.g:2443:3: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalMiniJava.g:2451:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2455:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalMiniJava.g:2456:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalMiniJava.g:2463:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Group_3__0 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2467:1: ( ( ( rule__Interface__Group_3__0 )? ) )
            // InternalMiniJava.g:2468:1: ( ( rule__Interface__Group_3__0 )? )
            {
            // InternalMiniJava.g:2468:1: ( ( rule__Interface__Group_3__0 )? )
            // InternalMiniJava.g:2469:2: ( rule__Interface__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:2470:2: ( rule__Interface__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMiniJava.g:2470:3: rule__Interface__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalMiniJava.g:2478:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2482:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalMiniJava.g:2483:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalMiniJava.g:2490:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2494:1: ( ( '{' ) )
            // InternalMiniJava.g:2495:1: ( '{' )
            {
            // InternalMiniJava.g:2495:1: ( '{' )
            // InternalMiniJava.g:2496:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalMiniJava.g:2505:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2509:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalMiniJava.g:2510:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalMiniJava.g:2517:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__MembersAssignment_5 )* ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2521:1: ( ( ( rule__Interface__MembersAssignment_5 )* ) )
            // InternalMiniJava.g:2522:1: ( ( rule__Interface__MembersAssignment_5 )* )
            {
            // InternalMiniJava.g:2522:1: ( ( rule__Interface__MembersAssignment_5 )* )
            // InternalMiniJava.g:2523:2: ( rule__Interface__MembersAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
            }
            // InternalMiniJava.g:2524:2: ( rule__Interface__MembersAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=14 && LA31_0<=16)||(LA31_0>=41 && LA31_0<=44)||(LA31_0>=65 && LA31_0<=66)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMiniJava.g:2524:3: rule__Interface__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interface__MembersAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersAssignment_5()); 
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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalMiniJava.g:2532:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2536:1: ( rule__Interface__Group__6__Impl )
            // InternalMiniJava.g:2537:2: rule__Interface__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__6__Impl();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalMiniJava.g:2543:1: rule__Interface__Group__6__Impl : ( '}' ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2547:1: ( ( '}' ) )
            // InternalMiniJava.g:2548:1: ( '}' )
            {
            // InternalMiniJava.g:2548:1: ( '}' )
            // InternalMiniJava.g:2549:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group_3__0"
    // InternalMiniJava.g:2559:1: rule__Interface__Group_3__0 : rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 ;
    public final void rule__Interface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2563:1: ( rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1 )
            // InternalMiniJava.g:2564:2: rule__Interface__Group_3__0__Impl rule__Interface__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__1();

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
    // $ANTLR end "rule__Interface__Group_3__0"


    // $ANTLR start "rule__Interface__Group_3__0__Impl"
    // InternalMiniJava.g:2571:1: rule__Interface__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2575:1: ( ( 'extends' ) )
            // InternalMiniJava.g:2576:1: ( 'extends' )
            {
            // InternalMiniJava.g:2576:1: ( 'extends' )
            // InternalMiniJava.g:2577:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0()); 
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
    // $ANTLR end "rule__Interface__Group_3__0__Impl"


    // $ANTLR start "rule__Interface__Group_3__1"
    // InternalMiniJava.g:2586:1: rule__Interface__Group_3__1 : rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 ;
    public final void rule__Interface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2590:1: ( rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2 )
            // InternalMiniJava.g:2591:2: rule__Interface__Group_3__1__Impl rule__Interface__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__Interface__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2();

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
    // $ANTLR end "rule__Interface__Group_3__1"


    // $ANTLR start "rule__Interface__Group_3__1__Impl"
    // InternalMiniJava.g:2598:1: rule__Interface__Group_3__1__Impl : ( ( rule__Interface__ImplementzAssignment_3_1 ) ) ;
    public final void rule__Interface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2602:1: ( ( ( rule__Interface__ImplementzAssignment_3_1 ) ) )
            // InternalMiniJava.g:2603:1: ( ( rule__Interface__ImplementzAssignment_3_1 ) )
            {
            // InternalMiniJava.g:2603:1: ( ( rule__Interface__ImplementzAssignment_3_1 ) )
            // InternalMiniJava.g:2604:2: ( rule__Interface__ImplementzAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzAssignment_3_1()); 
            }
            // InternalMiniJava.g:2605:2: ( rule__Interface__ImplementzAssignment_3_1 )
            // InternalMiniJava.g:2605:3: rule__Interface__ImplementzAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ImplementzAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzAssignment_3_1()); 
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
    // $ANTLR end "rule__Interface__Group_3__1__Impl"


    // $ANTLR start "rule__Interface__Group_3__2"
    // InternalMiniJava.g:2613:1: rule__Interface__Group_3__2 : rule__Interface__Group_3__2__Impl ;
    public final void rule__Interface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2617:1: ( rule__Interface__Group_3__2__Impl )
            // InternalMiniJava.g:2618:2: rule__Interface__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3__2__Impl();

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
    // $ANTLR end "rule__Interface__Group_3__2"


    // $ANTLR start "rule__Interface__Group_3__2__Impl"
    // InternalMiniJava.g:2624:1: rule__Interface__Group_3__2__Impl : ( ( rule__Interface__Group_3_2__0 )* ) ;
    public final void rule__Interface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2628:1: ( ( ( rule__Interface__Group_3_2__0 )* ) )
            // InternalMiniJava.g:2629:1: ( ( rule__Interface__Group_3_2__0 )* )
            {
            // InternalMiniJava.g:2629:1: ( ( rule__Interface__Group_3_2__0 )* )
            // InternalMiniJava.g:2630:2: ( rule__Interface__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
            }
            // InternalMiniJava.g:2631:2: ( rule__Interface__Group_3_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMiniJava.g:2631:3: rule__Interface__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Interface__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__Interface__Group_3__2__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__0"
    // InternalMiniJava.g:2640:1: rule__Interface__Group_3_2__0 : rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 ;
    public final void rule__Interface__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2644:1: ( rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1 )
            // InternalMiniJava.g:2645:2: rule__Interface__Group_3_2__0__Impl rule__Interface__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_2__1();

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
    // $ANTLR end "rule__Interface__Group_3_2__0"


    // $ANTLR start "rule__Interface__Group_3_2__0__Impl"
    // InternalMiniJava.g:2652:1: rule__Interface__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2656:1: ( ( ',' ) )
            // InternalMiniJava.g:2657:1: ( ',' )
            {
            // InternalMiniJava.g:2657:1: ( ',' )
            // InternalMiniJava.g:2658:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__Interface__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface__Group_3_2__1"
    // InternalMiniJava.g:2667:1: rule__Interface__Group_3_2__1 : rule__Interface__Group_3_2__1__Impl ;
    public final void rule__Interface__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2671:1: ( rule__Interface__Group_3_2__1__Impl )
            // InternalMiniJava.g:2672:2: rule__Interface__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_3_2__1"


    // $ANTLR start "rule__Interface__Group_3_2__1__Impl"
    // InternalMiniJava.g:2678:1: rule__Interface__Group_3_2__1__Impl : ( ( rule__Interface__ImplementzAssignment_3_2_1 ) ) ;
    public final void rule__Interface__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2682:1: ( ( ( rule__Interface__ImplementzAssignment_3_2_1 ) ) )
            // InternalMiniJava.g:2683:1: ( ( rule__Interface__ImplementzAssignment_3_2_1 ) )
            {
            // InternalMiniJava.g:2683:1: ( ( rule__Interface__ImplementzAssignment_3_2_1 ) )
            // InternalMiniJava.g:2684:2: ( rule__Interface__ImplementzAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzAssignment_3_2_1()); 
            }
            // InternalMiniJava.g:2685:2: ( rule__Interface__ImplementzAssignment_3_2_1 )
            // InternalMiniJava.g:2685:3: rule__Interface__ImplementzAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ImplementzAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzAssignment_3_2_1()); 
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
    // $ANTLR end "rule__Interface__Group_3_2__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalMiniJava.g:2694:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2698:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalMiniJava.g:2699:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalMiniJava.g:2706:1: rule__Method__Group__0__Impl : ( ( rule__Method__AccessAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2710:1: ( ( ( rule__Method__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:2711:1: ( ( rule__Method__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:2711:1: ( ( rule__Method__AccessAssignment_0 )? )
            // InternalMiniJava.g:2712:2: ( rule__Method__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:2713:2: ( rule__Method__AccessAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=16)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMiniJava.g:2713:3: rule__Method__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAssignment_0()); 
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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalMiniJava.g:2721:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2725:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalMiniJava.g:2726:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalMiniJava.g:2733:1: rule__Method__Group__1__Impl : ( ( rule__Method__IsabstractAssignment_1 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2737:1: ( ( ( rule__Method__IsabstractAssignment_1 )? ) )
            // InternalMiniJava.g:2738:1: ( ( rule__Method__IsabstractAssignment_1 )? )
            {
            // InternalMiniJava.g:2738:1: ( ( rule__Method__IsabstractAssignment_1 )? )
            // InternalMiniJava.g:2739:2: ( rule__Method__IsabstractAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsabstractAssignment_1()); 
            }
            // InternalMiniJava.g:2740:2: ( rule__Method__IsabstractAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMiniJava.g:2740:3: rule__Method__IsabstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__IsabstractAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsabstractAssignment_1()); 
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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalMiniJava.g:2748:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2752:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalMiniJava.g:2753:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalMiniJava.g:2760:1: rule__Method__Group__2__Impl : ( ( rule__Method__IsstaticAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2764:1: ( ( ( rule__Method__IsstaticAssignment_2 )? ) )
            // InternalMiniJava.g:2765:1: ( ( rule__Method__IsstaticAssignment_2 )? )
            {
            // InternalMiniJava.g:2765:1: ( ( rule__Method__IsstaticAssignment_2 )? )
            // InternalMiniJava.g:2766:2: ( rule__Method__IsstaticAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsstaticAssignment_2()); 
            }
            // InternalMiniJava.g:2767:2: ( rule__Method__IsstaticAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMiniJava.g:2767:3: rule__Method__IsstaticAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__IsstaticAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsstaticAssignment_2()); 
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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalMiniJava.g:2775:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2779:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalMiniJava.g:2780:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalMiniJava.g:2787:1: rule__Method__Group__3__Impl : ( ( rule__Method__TypeRefAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2791:1: ( ( ( rule__Method__TypeRefAssignment_3 ) ) )
            // InternalMiniJava.g:2792:1: ( ( rule__Method__TypeRefAssignment_3 ) )
            {
            // InternalMiniJava.g:2792:1: ( ( rule__Method__TypeRefAssignment_3 ) )
            // InternalMiniJava.g:2793:2: ( rule__Method__TypeRefAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeRefAssignment_3()); 
            }
            // InternalMiniJava.g:2794:2: ( rule__Method__TypeRefAssignment_3 )
            // InternalMiniJava.g:2794:3: rule__Method__TypeRefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeRefAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeRefAssignment_3()); 
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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalMiniJava.g:2802:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2806:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalMiniJava.g:2807:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalMiniJava.g:2814:1: rule__Method__Group__4__Impl : ( ( rule__Method__NameAssignment_4 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2818:1: ( ( ( rule__Method__NameAssignment_4 )? ) )
            // InternalMiniJava.g:2819:1: ( ( rule__Method__NameAssignment_4 )? )
            {
            // InternalMiniJava.g:2819:1: ( ( rule__Method__NameAssignment_4 )? )
            // InternalMiniJava.g:2820:2: ( rule__Method__NameAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            }
            // InternalMiniJava.g:2821:2: ( rule__Method__NameAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMiniJava.g:2821:3: rule__Method__NameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__NameAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_4()); 
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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalMiniJava.g:2829:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2833:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalMiniJava.g:2834:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalMiniJava.g:2841:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2845:1: ( ( '(' ) )
            // InternalMiniJava.g:2846:1: ( '(' )
            {
            // InternalMiniJava.g:2846:1: ( '(' )
            // InternalMiniJava.g:2847:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalMiniJava.g:2856:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2860:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalMiniJava.g:2861:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalMiniJava.g:2868:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2872:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalMiniJava.g:2873:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalMiniJava.g:2873:1: ( ( rule__Method__Group_6__0 )? )
            // InternalMiniJava.g:2874:2: ( rule__Method__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_6()); 
            }
            // InternalMiniJava.g:2875:2: ( rule__Method__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=41 && LA37_0<=44)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMiniJava.g:2875:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalMiniJava.g:2883:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2887:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalMiniJava.g:2888:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

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
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalMiniJava.g:2895:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2899:1: ( ( ')' ) )
            // InternalMiniJava.g:2900:1: ( ')' )
            {
            // InternalMiniJava.g:2900:1: ( ')' )
            // InternalMiniJava.g:2901:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalMiniJava.g:2910:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2914:1: ( rule__Method__Group__8__Impl )
            // InternalMiniJava.g:2915:2: rule__Method__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__8__Impl();

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
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalMiniJava.g:2921:1: rule__Method__Group__8__Impl : ( ( rule__Method__Alternatives_8 ) ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2925:1: ( ( ( rule__Method__Alternatives_8 ) ) )
            // InternalMiniJava.g:2926:1: ( ( rule__Method__Alternatives_8 ) )
            {
            // InternalMiniJava.g:2926:1: ( ( rule__Method__Alternatives_8 ) )
            // InternalMiniJava.g:2927:2: ( rule__Method__Alternatives_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAlternatives_8()); 
            }
            // InternalMiniJava.g:2928:2: ( rule__Method__Alternatives_8 )
            // InternalMiniJava.g:2928:3: rule__Method__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAlternatives_8()); 
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
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalMiniJava.g:2937:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2941:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalMiniJava.g:2942:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

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
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalMiniJava.g:2949:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParamsAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2953:1: ( ( ( rule__Method__ParamsAssignment_6_0 ) ) )
            // InternalMiniJava.g:2954:1: ( ( rule__Method__ParamsAssignment_6_0 ) )
            {
            // InternalMiniJava.g:2954:1: ( ( rule__Method__ParamsAssignment_6_0 ) )
            // InternalMiniJava.g:2955:2: ( rule__Method__ParamsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_6_0()); 
            }
            // InternalMiniJava.g:2956:2: ( rule__Method__ParamsAssignment_6_0 )
            // InternalMiniJava.g:2956:3: rule__Method__ParamsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_6_0()); 
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
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalMiniJava.g:2964:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2968:1: ( rule__Method__Group_6__1__Impl )
            // InternalMiniJava.g:2969:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

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
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalMiniJava.g:2975:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2979:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalMiniJava.g:2980:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalMiniJava.g:2980:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalMiniJava.g:2981:2: ( rule__Method__Group_6_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            }
            // InternalMiniJava.g:2982:2: ( rule__Method__Group_6_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMiniJava.g:2982:3: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_6_1()); 
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
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6_1__0"
    // InternalMiniJava.g:2991:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2995:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalMiniJava.g:2996:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1();

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
    // $ANTLR end "rule__Method__Group_6_1__0"


    // $ANTLR start "rule__Method__Group_6_1__0__Impl"
    // InternalMiniJava.g:3003:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3007:1: ( ( ',' ) )
            // InternalMiniJava.g:3008:1: ( ',' )
            {
            // InternalMiniJava.g:3008:1: ( ',' )
            // InternalMiniJava.g:3009:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
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
    // $ANTLR end "rule__Method__Group_6_1__0__Impl"


    // $ANTLR start "rule__Method__Group_6_1__1"
    // InternalMiniJava.g:3018:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3022:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalMiniJava.g:3023:2: rule__Method__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Method__Group_6_1__1"


    // $ANTLR start "rule__Method__Group_6_1__1__Impl"
    // InternalMiniJava.g:3029:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParamsAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3033:1: ( ( ( rule__Method__ParamsAssignment_6_1_1 ) ) )
            // InternalMiniJava.g:3034:1: ( ( rule__Method__ParamsAssignment_6_1_1 ) )
            {
            // InternalMiniJava.g:3034:1: ( ( rule__Method__ParamsAssignment_6_1_1 ) )
            // InternalMiniJava.g:3035:2: ( rule__Method__ParamsAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsAssignment_6_1_1()); 
            }
            // InternalMiniJava.g:3036:2: ( rule__Method__ParamsAssignment_6_1_1 )
            // InternalMiniJava.g:3036:3: rule__Method__ParamsAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsAssignment_6_1_1()); 
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
    // $ANTLR end "rule__Method__Group_6_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMiniJava.g:3045:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3049:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMiniJava.g:3050:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMiniJava.g:3057:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeRefAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3061:1: ( ( ( rule__Parameter__TypeRefAssignment_0 ) ) )
            // InternalMiniJava.g:3062:1: ( ( rule__Parameter__TypeRefAssignment_0 ) )
            {
            // InternalMiniJava.g:3062:1: ( ( rule__Parameter__TypeRefAssignment_0 ) )
            // InternalMiniJava.g:3063:2: ( rule__Parameter__TypeRefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeRefAssignment_0()); 
            }
            // InternalMiniJava.g:3064:2: ( rule__Parameter__TypeRefAssignment_0 )
            // InternalMiniJava.g:3064:3: rule__Parameter__TypeRefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeRefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeRefAssignment_0()); 
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
    // InternalMiniJava.g:3072:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3076:1: ( rule__Parameter__Group__1__Impl )
            // InternalMiniJava.g:3077:2: rule__Parameter__Group__1__Impl
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
    // InternalMiniJava.g:3083:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3087:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMiniJava.g:3088:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:3088:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMiniJava.g:3089:2: ( rule__Parameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:3090:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMiniJava.g:3090:3: rule__Parameter__NameAssignment_1
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalMiniJava.g:3099:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3103:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMiniJava.g:3104:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMiniJava.g:3111:1: rule__Field__Group__0__Impl : ( ( rule__Field__AccessAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3115:1: ( ( ( rule__Field__AccessAssignment_0 )? ) )
            // InternalMiniJava.g:3116:1: ( ( rule__Field__AccessAssignment_0 )? )
            {
            // InternalMiniJava.g:3116:1: ( ( rule__Field__AccessAssignment_0 )? )
            // InternalMiniJava.g:3117:2: ( rule__Field__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
            }
            // InternalMiniJava.g:3118:2: ( rule__Field__AccessAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=14 && LA39_0<=16)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMiniJava.g:3118:3: rule__Field__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAssignment_0()); 
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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMiniJava.g:3126:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3130:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMiniJava.g:3131:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMiniJava.g:3138:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeRefAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3142:1: ( ( ( rule__Field__TypeRefAssignment_1 ) ) )
            // InternalMiniJava.g:3143:1: ( ( rule__Field__TypeRefAssignment_1 ) )
            {
            // InternalMiniJava.g:3143:1: ( ( rule__Field__TypeRefAssignment_1 ) )
            // InternalMiniJava.g:3144:2: ( rule__Field__TypeRefAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeRefAssignment_1()); 
            }
            // InternalMiniJava.g:3145:2: ( rule__Field__TypeRefAssignment_1 )
            // InternalMiniJava.g:3145:3: rule__Field__TypeRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeRefAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeRefAssignment_1()); 
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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMiniJava.g:3153:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3157:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalMiniJava.g:3158:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMiniJava.g:3165:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3169:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalMiniJava.g:3170:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalMiniJava.g:3170:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalMiniJava.g:3171:2: ( rule__Field__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            }
            // InternalMiniJava.g:3172:2: ( rule__Field__NameAssignment_2 )
            // InternalMiniJava.g:3172:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalMiniJava.g:3180:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3184:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalMiniJava.g:3185:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalMiniJava.g:3192:1: rule__Field__Group__3__Impl : ( ( rule__Field__Group_3__0 )? ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3196:1: ( ( ( rule__Field__Group_3__0 )? ) )
            // InternalMiniJava.g:3197:1: ( ( rule__Field__Group_3__0 )? )
            {
            // InternalMiniJava.g:3197:1: ( ( rule__Field__Group_3__0 )? )
            // InternalMiniJava.g:3198:2: ( rule__Field__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup_3()); 
            }
            // InternalMiniJava.g:3199:2: ( rule__Field__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMiniJava.g:3199:3: rule__Field__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalMiniJava.g:3207:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3211:1: ( rule__Field__Group__4__Impl )
            // InternalMiniJava.g:3212:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__4__Impl();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalMiniJava.g:3218:1: rule__Field__Group__4__Impl : ( ';' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3222:1: ( ( ';' ) )
            // InternalMiniJava.g:3223:1: ( ';' )
            {
            // InternalMiniJava.g:3223:1: ( ';' )
            // InternalMiniJava.g:3224:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group_3__0"
    // InternalMiniJava.g:3234:1: rule__Field__Group_3__0 : rule__Field__Group_3__0__Impl rule__Field__Group_3__1 ;
    public final void rule__Field__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3238:1: ( rule__Field__Group_3__0__Impl rule__Field__Group_3__1 )
            // InternalMiniJava.g:3239:2: rule__Field__Group_3__0__Impl rule__Field__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Field__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1();

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
    // $ANTLR end "rule__Field__Group_3__0"


    // $ANTLR start "rule__Field__Group_3__0__Impl"
    // InternalMiniJava.g:3246:1: rule__Field__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3250:1: ( ( '=' ) )
            // InternalMiniJava.g:3251:1: ( '=' )
            {
            // InternalMiniJava.g:3251:1: ( '=' )
            // InternalMiniJava.g:3252:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0()); 
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
    // $ANTLR end "rule__Field__Group_3__0__Impl"


    // $ANTLR start "rule__Field__Group_3__1"
    // InternalMiniJava.g:3261:1: rule__Field__Group_3__1 : rule__Field__Group_3__1__Impl ;
    public final void rule__Field__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3265:1: ( rule__Field__Group_3__1__Impl )
            // InternalMiniJava.g:3266:2: rule__Field__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_3__1__Impl();

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
    // $ANTLR end "rule__Field__Group_3__1"


    // $ANTLR start "rule__Field__Group_3__1__Impl"
    // InternalMiniJava.g:3272:1: rule__Field__Group_3__1__Impl : ( ( rule__Field__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Field__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3276:1: ( ( ( rule__Field__DefaultValueAssignment_3_1 ) ) )
            // InternalMiniJava.g:3277:1: ( ( rule__Field__DefaultValueAssignment_3_1 ) )
            {
            // InternalMiniJava.g:3277:1: ( ( rule__Field__DefaultValueAssignment_3_1 ) )
            // InternalMiniJava.g:3278:2: ( rule__Field__DefaultValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueAssignment_3_1()); 
            }
            // InternalMiniJava.g:3279:2: ( rule__Field__DefaultValueAssignment_3_1 )
            // InternalMiniJava.g:3279:3: rule__Field__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__DefaultValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultValueAssignment_3_1()); 
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
    // $ANTLR end "rule__Field__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMiniJava.g:3288:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3292:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMiniJava.g:3293:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMiniJava.g:3300:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3304:1: ( ( () ) )
            // InternalMiniJava.g:3305:1: ( () )
            {
            // InternalMiniJava.g:3305:1: ( () )
            // InternalMiniJava.g:3306:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalMiniJava.g:3307:2: ()
            // InternalMiniJava.g:3307:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMiniJava.g:3315:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3319:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMiniJava.g:3320:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMiniJava.g:3327:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3331:1: ( ( '{' ) )
            // InternalMiniJava.g:3332:1: ( '{' )
            {
            // InternalMiniJava.g:3332:1: ( '{' )
            // InternalMiniJava.g:3333:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // InternalMiniJava.g:3342:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3346:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMiniJava.g:3347:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // InternalMiniJava.g:3354:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3358:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // InternalMiniJava.g:3359:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // InternalMiniJava.g:3359:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // InternalMiniJava.g:3360:2: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // InternalMiniJava.g:3361:2: ( rule__Block__StatementsAssignment_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INT)||(LA41_0>=12 && LA41_0<=13)||LA41_0==22||LA41_0==28||LA41_0==31||(LA41_0>=34 && LA41_0<=35)||(LA41_0>=37 && LA41_0<=38)||(LA41_0>=41 && LA41_0<=44)||LA41_0==55||(LA41_0>=59 && LA41_0<=64)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMiniJava.g:3361:3: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Block__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
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


    // $ANTLR start "rule__Block__Group__3"
    // InternalMiniJava.g:3369:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3373:1: ( rule__Block__Group__3__Impl )
            // InternalMiniJava.g:3374:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMiniJava.g:3380:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3384:1: ( ( '}' ) )
            // InternalMiniJava.g:3385:1: ( '}' )
            {
            // InternalMiniJava.g:3385:1: ( '}' )
            // InternalMiniJava.g:3386:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMiniJava.g:3396:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3400:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMiniJava.g:3401:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMiniJava.g:3408:1: rule__Statement__Group_0__0__Impl : ( ruleReturn ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3412:1: ( ( ruleReturn ) )
            // InternalMiniJava.g:3413:1: ( ruleReturn )
            {
            // InternalMiniJava.g:3413:1: ( ruleReturn )
            // InternalMiniJava.g:3414:2: ruleReturn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMiniJava.g:3423:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3427:1: ( rule__Statement__Group_0__1__Impl )
            // InternalMiniJava.g:3428:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMiniJava.g:3434:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3438:1: ( ( ';' ) )
            // InternalMiniJava.g:3439:1: ( ';' )
            {
            // InternalMiniJava.g:3439:1: ( ';' )
            // InternalMiniJava.g:3440:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalMiniJava.g:3450:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3454:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalMiniJava.g:3455:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalMiniJava.g:3462:1: rule__Statement__Group_1__0__Impl : ( ( ruleAssignment ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3466:1: ( ( ( ruleAssignment ) ) )
            // InternalMiniJava.g:3467:1: ( ( ruleAssignment ) )
            {
            // InternalMiniJava.g:3467:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:3468:2: ( ruleAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0()); 
            }
            // InternalMiniJava.g:3469:2: ( ruleAssignment )
            // InternalMiniJava.g:3469:3: ruleAssignment
            {
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalMiniJava.g:3477:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3481:1: ( rule__Statement__Group_1__1__Impl )
            // InternalMiniJava.g:3482:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalMiniJava.g:3488:1: rule__Statement__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3492:1: ( ( ';' ) )
            // InternalMiniJava.g:3493:1: ( ';' )
            {
            // InternalMiniJava.g:3493:1: ( ';' )
            // InternalMiniJava.g:3494:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_5__0"
    // InternalMiniJava.g:3504:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3508:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // InternalMiniJava.g:3509:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1();

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
    // $ANTLR end "rule__Statement__Group_5__0"


    // $ANTLR start "rule__Statement__Group_5__0__Impl"
    // InternalMiniJava.g:3516:1: rule__Statement__Group_5__0__Impl : ( rulePrintStatement ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3520:1: ( ( rulePrintStatement ) )
            // InternalMiniJava.g:3521:1: ( rulePrintStatement )
            {
            // InternalMiniJava.g:3521:1: ( rulePrintStatement )
            // InternalMiniJava.g:3522:2: rulePrintStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrintStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Statement__Group_5__0__Impl"


    // $ANTLR start "rule__Statement__Group_5__1"
    // InternalMiniJava.g:3531:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3535:1: ( rule__Statement__Group_5__1__Impl )
            // InternalMiniJava.g:3536:2: rule__Statement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_5__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_5__1"


    // $ANTLR start "rule__Statement__Group_5__1__Impl"
    // InternalMiniJava.g:3542:1: rule__Statement__Group_5__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3546:1: ( ( ';' ) )
            // InternalMiniJava.g:3547:1: ( ';' )
            {
            // InternalMiniJava.g:3547:1: ( ';' )
            // InternalMiniJava.g:3548:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_5_1()); 
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
    // $ANTLR end "rule__Statement__Group_5__1__Impl"


    // $ANTLR start "rule__Statement__Group_7__0"
    // InternalMiniJava.g:3558:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3562:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // InternalMiniJava.g:3563:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1();

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
    // $ANTLR end "rule__Statement__Group_7__0"


    // $ANTLR start "rule__Statement__Group_7__0__Impl"
    // InternalMiniJava.g:3570:1: rule__Statement__Group_7__0__Impl : ( ruleSelectionExpression ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3574:1: ( ( ruleSelectionExpression ) )
            // InternalMiniJava.g:3575:1: ( ruleSelectionExpression )
            {
            // InternalMiniJava.g:3575:1: ( ruleSelectionExpression )
            // InternalMiniJava.g:3576:2: ruleSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Statement__Group_7__0__Impl"


    // $ANTLR start "rule__Statement__Group_7__1"
    // InternalMiniJava.g:3585:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3589:1: ( rule__Statement__Group_7__1__Impl )
            // InternalMiniJava.g:3590:2: rule__Statement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_7__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_7__1"


    // $ANTLR start "rule__Statement__Group_7__1__Impl"
    // InternalMiniJava.g:3596:1: rule__Statement__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3600:1: ( ( ';' ) )
            // InternalMiniJava.g:3601:1: ( ';' )
            {
            // InternalMiniJava.g:3601:1: ( ';' )
            // InternalMiniJava.g:3602:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_7_1()); 
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
    // $ANTLR end "rule__Statement__Group_7__1__Impl"


    // $ANTLR start "rule__PrintStatement__Group__0"
    // InternalMiniJava.g:3612:1: rule__PrintStatement__Group__0 : rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 ;
    public final void rule__PrintStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3616:1: ( rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 )
            // InternalMiniJava.g:3617:2: rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PrintStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__1();

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
    // $ANTLR end "rule__PrintStatement__Group__0"


    // $ANTLR start "rule__PrintStatement__Group__0__Impl"
    // InternalMiniJava.g:3624:1: rule__PrintStatement__Group__0__Impl : ( 'System' ) ;
    public final void rule__PrintStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3628:1: ( ( 'System' ) )
            // InternalMiniJava.g:3629:1: ( 'System' )
            {
            // InternalMiniJava.g:3629:1: ( 'System' )
            // InternalMiniJava.g:3630:2: 'System'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getSystemKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getSystemKeyword_0()); 
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
    // $ANTLR end "rule__PrintStatement__Group__0__Impl"


    // $ANTLR start "rule__PrintStatement__Group__1"
    // InternalMiniJava.g:3639:1: rule__PrintStatement__Group__1 : rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2 ;
    public final void rule__PrintStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3643:1: ( rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2 )
            // InternalMiniJava.g:3644:2: rule__PrintStatement__Group__1__Impl rule__PrintStatement__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__PrintStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__2();

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
    // $ANTLR end "rule__PrintStatement__Group__1"


    // $ANTLR start "rule__PrintStatement__Group__1__Impl"
    // InternalMiniJava.g:3651:1: rule__PrintStatement__Group__1__Impl : ( '.' ) ;
    public final void rule__PrintStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3655:1: ( ( '.' ) )
            // InternalMiniJava.g:3656:1: ( '.' )
            {
            // InternalMiniJava.g:3656:1: ( '.' )
            // InternalMiniJava.g:3657:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getFullStopKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__PrintStatement__Group__1__Impl"


    // $ANTLR start "rule__PrintStatement__Group__2"
    // InternalMiniJava.g:3666:1: rule__PrintStatement__Group__2 : rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3 ;
    public final void rule__PrintStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3670:1: ( rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3 )
            // InternalMiniJava.g:3671:2: rule__PrintStatement__Group__2__Impl rule__PrintStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PrintStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__3();

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
    // $ANTLR end "rule__PrintStatement__Group__2"


    // $ANTLR start "rule__PrintStatement__Group__2__Impl"
    // InternalMiniJava.g:3678:1: rule__PrintStatement__Group__2__Impl : ( 'out' ) ;
    public final void rule__PrintStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3682:1: ( ( 'out' ) )
            // InternalMiniJava.g:3683:1: ( 'out' )
            {
            // InternalMiniJava.g:3683:1: ( 'out' )
            // InternalMiniJava.g:3684:2: 'out'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getOutKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getOutKeyword_2()); 
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
    // $ANTLR end "rule__PrintStatement__Group__2__Impl"


    // $ANTLR start "rule__PrintStatement__Group__3"
    // InternalMiniJava.g:3693:1: rule__PrintStatement__Group__3 : rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4 ;
    public final void rule__PrintStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3697:1: ( rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4 )
            // InternalMiniJava.g:3698:2: rule__PrintStatement__Group__3__Impl rule__PrintStatement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__PrintStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__4();

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
    // $ANTLR end "rule__PrintStatement__Group__3"


    // $ANTLR start "rule__PrintStatement__Group__3__Impl"
    // InternalMiniJava.g:3705:1: rule__PrintStatement__Group__3__Impl : ( '.' ) ;
    public final void rule__PrintStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3709:1: ( ( '.' ) )
            // InternalMiniJava.g:3710:1: ( '.' )
            {
            // InternalMiniJava.g:3710:1: ( '.' )
            // InternalMiniJava.g:3711:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getFullStopKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getFullStopKeyword_3()); 
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
    // $ANTLR end "rule__PrintStatement__Group__3__Impl"


    // $ANTLR start "rule__PrintStatement__Group__4"
    // InternalMiniJava.g:3720:1: rule__PrintStatement__Group__4 : rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5 ;
    public final void rule__PrintStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3724:1: ( rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5 )
            // InternalMiniJava.g:3725:2: rule__PrintStatement__Group__4__Impl rule__PrintStatement__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__PrintStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__5();

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
    // $ANTLR end "rule__PrintStatement__Group__4"


    // $ANTLR start "rule__PrintStatement__Group__4__Impl"
    // InternalMiniJava.g:3732:1: rule__PrintStatement__Group__4__Impl : ( 'println' ) ;
    public final void rule__PrintStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3736:1: ( ( 'println' ) )
            // InternalMiniJava.g:3737:1: ( 'println' )
            {
            // InternalMiniJava.g:3737:1: ( 'println' )
            // InternalMiniJava.g:3738:2: 'println'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4()); 
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
    // $ANTLR end "rule__PrintStatement__Group__4__Impl"


    // $ANTLR start "rule__PrintStatement__Group__5"
    // InternalMiniJava.g:3747:1: rule__PrintStatement__Group__5 : rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6 ;
    public final void rule__PrintStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3751:1: ( rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6 )
            // InternalMiniJava.g:3752:2: rule__PrintStatement__Group__5__Impl rule__PrintStatement__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__PrintStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__6();

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
    // $ANTLR end "rule__PrintStatement__Group__5"


    // $ANTLR start "rule__PrintStatement__Group__5__Impl"
    // InternalMiniJava.g:3759:1: rule__PrintStatement__Group__5__Impl : ( '(' ) ;
    public final void rule__PrintStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3763:1: ( ( '(' ) )
            // InternalMiniJava.g:3764:1: ( '(' )
            {
            // InternalMiniJava.g:3764:1: ( '(' )
            // InternalMiniJava.g:3765:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__PrintStatement__Group__5__Impl"


    // $ANTLR start "rule__PrintStatement__Group__6"
    // InternalMiniJava.g:3774:1: rule__PrintStatement__Group__6 : rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7 ;
    public final void rule__PrintStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3778:1: ( rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7 )
            // InternalMiniJava.g:3779:2: rule__PrintStatement__Group__6__Impl rule__PrintStatement__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__PrintStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__7();

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
    // $ANTLR end "rule__PrintStatement__Group__6"


    // $ANTLR start "rule__PrintStatement__Group__6__Impl"
    // InternalMiniJava.g:3786:1: rule__PrintStatement__Group__6__Impl : ( ( rule__PrintStatement__ExpressionAssignment_6 ) ) ;
    public final void rule__PrintStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3790:1: ( ( ( rule__PrintStatement__ExpressionAssignment_6 ) ) )
            // InternalMiniJava.g:3791:1: ( ( rule__PrintStatement__ExpressionAssignment_6 ) )
            {
            // InternalMiniJava.g:3791:1: ( ( rule__PrintStatement__ExpressionAssignment_6 ) )
            // InternalMiniJava.g:3792:2: ( rule__PrintStatement__ExpressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getExpressionAssignment_6()); 
            }
            // InternalMiniJava.g:3793:2: ( rule__PrintStatement__ExpressionAssignment_6 )
            // InternalMiniJava.g:3793:3: rule__PrintStatement__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__ExpressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getExpressionAssignment_6()); 
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
    // $ANTLR end "rule__PrintStatement__Group__6__Impl"


    // $ANTLR start "rule__PrintStatement__Group__7"
    // InternalMiniJava.g:3801:1: rule__PrintStatement__Group__7 : rule__PrintStatement__Group__7__Impl ;
    public final void rule__PrintStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3805:1: ( rule__PrintStatement__Group__7__Impl )
            // InternalMiniJava.g:3806:2: rule__PrintStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__7__Impl();

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
    // $ANTLR end "rule__PrintStatement__Group__7"


    // $ANTLR start "rule__PrintStatement__Group__7__Impl"
    // InternalMiniJava.g:3812:1: rule__PrintStatement__Group__7__Impl : ( ')' ) ;
    public final void rule__PrintStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3816:1: ( ( ')' ) )
            // InternalMiniJava.g:3817:1: ( ')' )
            {
            // InternalMiniJava.g:3817:1: ( ')' )
            // InternalMiniJava.g:3818:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__PrintStatement__Group__7__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // InternalMiniJava.g:3828:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3832:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalMiniJava.g:3833:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Return__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Return__Group__1();

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
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // InternalMiniJava.g:3840:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3844:1: ( ( 'return' ) )
            // InternalMiniJava.g:3845:1: ( 'return' )
            {
            // InternalMiniJava.g:3845:1: ( 'return' )
            // InternalMiniJava.g:3846:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
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
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // InternalMiniJava.g:3855:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3859:1: ( rule__Return__Group__1__Impl )
            // InternalMiniJava.g:3860:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__1__Impl();

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
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // InternalMiniJava.g:3866:1: rule__Return__Group__1__Impl : ( ( rule__Return__ExpressionAssignment_1 ) ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3870:1: ( ( ( rule__Return__ExpressionAssignment_1 ) ) )
            // InternalMiniJava.g:3871:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            {
            // InternalMiniJava.g:3871:1: ( ( rule__Return__ExpressionAssignment_1 ) )
            // InternalMiniJava.g:3872:2: ( rule__Return__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
            }
            // InternalMiniJava.g:3873:2: ( rule__Return__ExpressionAssignment_1 )
            // InternalMiniJava.g:3873:3: rule__Return__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Return__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMiniJava.g:3882:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3886:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMiniJava.g:3887:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMiniJava.g:3894:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3898:1: ( ( 'if' ) )
            // InternalMiniJava.g:3899:1: ( 'if' )
            {
            // InternalMiniJava.g:3899:1: ( 'if' )
            // InternalMiniJava.g:3900:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMiniJava.g:3909:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3913:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMiniJava.g:3914:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMiniJava.g:3921:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3925:1: ( ( '(' ) )
            // InternalMiniJava.g:3926:1: ( '(' )
            {
            // InternalMiniJava.g:3926:1: ( '(' )
            // InternalMiniJava.g:3927:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMiniJava.g:3936:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3940:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMiniJava.g:3941:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMiniJava.g:3948:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3952:1: ( ( ( rule__IfStatement__ExpressionAssignment_2 ) ) )
            // InternalMiniJava.g:3953:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            {
            // InternalMiniJava.g:3953:1: ( ( rule__IfStatement__ExpressionAssignment_2 ) )
            // InternalMiniJava.g:3954:2: ( rule__IfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
            }
            // InternalMiniJava.g:3955:2: ( rule__IfStatement__ExpressionAssignment_2 )
            // InternalMiniJava.g:3955:3: rule__IfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMiniJava.g:3963:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3967:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMiniJava.g:3968:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMiniJava.g:3975:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3979:1: ( ( ')' ) )
            // InternalMiniJava.g:3980:1: ( ')' )
            {
            // InternalMiniJava.g:3980:1: ( ')' )
            // InternalMiniJava.g:3981:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMiniJava.g:3990:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3994:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMiniJava.g:3995:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMiniJava.g:4002:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4006:1: ( ( ( rule__IfStatement__ThenBlockAssignment_4 ) ) )
            // InternalMiniJava.g:4007:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            {
            // InternalMiniJava.g:4007:1: ( ( rule__IfStatement__ThenBlockAssignment_4 ) )
            // InternalMiniJava.g:4008:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // InternalMiniJava.g:4009:2: ( rule__IfStatement__ThenBlockAssignment_4 )
            // InternalMiniJava.g:4009:3: rule__IfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockAssignment_4()); 
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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMiniJava.g:4017:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4021:1: ( rule__IfStatement__Group__5__Impl )
            // InternalMiniJava.g:4022:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMiniJava.g:4028:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4032:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalMiniJava.g:4033:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalMiniJava.g:4033:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalMiniJava.g:4034:2: ( rule__IfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }
            // InternalMiniJava.g:4035:2: ( rule__IfStatement__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMiniJava.g:4035:3: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_5()); 
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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalMiniJava.g:4044:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4048:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalMiniJava.g:4049:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

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
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalMiniJava.g:4056:1: rule__IfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4060:1: ( ( ( 'else' ) ) )
            // InternalMiniJava.g:4061:1: ( ( 'else' ) )
            {
            // InternalMiniJava.g:4061:1: ( ( 'else' ) )
            // InternalMiniJava.g:4062:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }
            // InternalMiniJava.g:4063:2: ( 'else' )
            // InternalMiniJava.g:4063:3: 'else'
            {
            match(input,36,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalMiniJava.g:4071:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4075:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalMiniJava.g:4076:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

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
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalMiniJava.g:4082:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4086:1: ( ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) ) )
            // InternalMiniJava.g:4087:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            {
            // InternalMiniJava.g:4087:1: ( ( rule__IfStatement__ElseBlockAssignment_5_1 ) )
            // InternalMiniJava.g:4088:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // InternalMiniJava.g:4089:2: ( rule__IfStatement__ElseBlockAssignment_5_1 )
            // InternalMiniJava.g:4089:3: rule__IfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockAssignment_5_1()); 
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
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__0"
    // InternalMiniJava.g:4098:1: rule__WhileStatement__Group__0 : rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 ;
    public final void rule__WhileStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4102:1: ( rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1 )
            // InternalMiniJava.g:4103:2: rule__WhileStatement__Group__0__Impl rule__WhileStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__WhileStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__1();

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
    // $ANTLR end "rule__WhileStatement__Group__0"


    // $ANTLR start "rule__WhileStatement__Group__0__Impl"
    // InternalMiniJava.g:4110:1: rule__WhileStatement__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4114:1: ( ( 'while' ) )
            // InternalMiniJava.g:4115:1: ( 'while' )
            {
            // InternalMiniJava.g:4115:1: ( 'while' )
            // InternalMiniJava.g:4116:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__WhileStatement__Group__0__Impl"


    // $ANTLR start "rule__WhileStatement__Group__1"
    // InternalMiniJava.g:4125:1: rule__WhileStatement__Group__1 : rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 ;
    public final void rule__WhileStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4129:1: ( rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2 )
            // InternalMiniJava.g:4130:2: rule__WhileStatement__Group__1__Impl rule__WhileStatement__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__WhileStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__2();

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
    // $ANTLR end "rule__WhileStatement__Group__1"


    // $ANTLR start "rule__WhileStatement__Group__1__Impl"
    // InternalMiniJava.g:4137:1: rule__WhileStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4141:1: ( ( '(' ) )
            // InternalMiniJava.g:4142:1: ( '(' )
            {
            // InternalMiniJava.g:4142:1: ( '(' )
            // InternalMiniJava.g:4143:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__WhileStatement__Group__1__Impl"


    // $ANTLR start "rule__WhileStatement__Group__2"
    // InternalMiniJava.g:4152:1: rule__WhileStatement__Group__2 : rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 ;
    public final void rule__WhileStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4156:1: ( rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3 )
            // InternalMiniJava.g:4157:2: rule__WhileStatement__Group__2__Impl rule__WhileStatement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__WhileStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__3();

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
    // $ANTLR end "rule__WhileStatement__Group__2"


    // $ANTLR start "rule__WhileStatement__Group__2__Impl"
    // InternalMiniJava.g:4164:1: rule__WhileStatement__Group__2__Impl : ( ( rule__WhileStatement__ConditionAssignment_2 ) ) ;
    public final void rule__WhileStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4168:1: ( ( ( rule__WhileStatement__ConditionAssignment_2 ) ) )
            // InternalMiniJava.g:4169:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            {
            // InternalMiniJava.g:4169:1: ( ( rule__WhileStatement__ConditionAssignment_2 ) )
            // InternalMiniJava.g:4170:2: ( rule__WhileStatement__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
            }
            // InternalMiniJava.g:4171:2: ( rule__WhileStatement__ConditionAssignment_2 )
            // InternalMiniJava.g:4171:3: rule__WhileStatement__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__WhileStatement__Group__2__Impl"


    // $ANTLR start "rule__WhileStatement__Group__3"
    // InternalMiniJava.g:4179:1: rule__WhileStatement__Group__3 : rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 ;
    public final void rule__WhileStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4183:1: ( rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4 )
            // InternalMiniJava.g:4184:2: rule__WhileStatement__Group__3__Impl rule__WhileStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__WhileStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4();

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
    // $ANTLR end "rule__WhileStatement__Group__3"


    // $ANTLR start "rule__WhileStatement__Group__3__Impl"
    // InternalMiniJava.g:4191:1: rule__WhileStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4195:1: ( ( ')' ) )
            // InternalMiniJava.g:4196:1: ( ')' )
            {
            // InternalMiniJava.g:4196:1: ( ')' )
            // InternalMiniJava.g:4197:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__WhileStatement__Group__3__Impl"


    // $ANTLR start "rule__WhileStatement__Group__4"
    // InternalMiniJava.g:4206:1: rule__WhileStatement__Group__4 : rule__WhileStatement__Group__4__Impl ;
    public final void rule__WhileStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4210:1: ( rule__WhileStatement__Group__4__Impl )
            // InternalMiniJava.g:4211:2: rule__WhileStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__Group__4__Impl();

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
    // $ANTLR end "rule__WhileStatement__Group__4"


    // $ANTLR start "rule__WhileStatement__Group__4__Impl"
    // InternalMiniJava.g:4217:1: rule__WhileStatement__Group__4__Impl : ( ( rule__WhileStatement__BlockAssignment_4 ) ) ;
    public final void rule__WhileStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4221:1: ( ( ( rule__WhileStatement__BlockAssignment_4 ) ) )
            // InternalMiniJava.g:4222:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            {
            // InternalMiniJava.g:4222:1: ( ( rule__WhileStatement__BlockAssignment_4 ) )
            // InternalMiniJava.g:4223:2: ( rule__WhileStatement__BlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 
            }
            // InternalMiniJava.g:4224:2: ( rule__WhileStatement__BlockAssignment_4 )
            // InternalMiniJava.g:4224:3: rule__WhileStatement__BlockAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatement__BlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getBlockAssignment_4()); 
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
    // $ANTLR end "rule__WhileStatement__Group__4__Impl"


    // $ANTLR start "rule__ForStatement__Group__0"
    // InternalMiniJava.g:4233:1: rule__ForStatement__Group__0 : rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 ;
    public final void rule__ForStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4237:1: ( rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1 )
            // InternalMiniJava.g:4238:2: rule__ForStatement__Group__0__Impl rule__ForStatement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ForStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__1();

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
    // $ANTLR end "rule__ForStatement__Group__0"


    // $ANTLR start "rule__ForStatement__Group__0__Impl"
    // InternalMiniJava.g:4245:1: rule__ForStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4249:1: ( ( 'for' ) )
            // InternalMiniJava.g:4250:1: ( 'for' )
            {
            // InternalMiniJava.g:4250:1: ( 'for' )
            // InternalMiniJava.g:4251:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getForKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getForKeyword_0()); 
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
    // $ANTLR end "rule__ForStatement__Group__0__Impl"


    // $ANTLR start "rule__ForStatement__Group__1"
    // InternalMiniJava.g:4260:1: rule__ForStatement__Group__1 : rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 ;
    public final void rule__ForStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4264:1: ( rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2 )
            // InternalMiniJava.g:4265:2: rule__ForStatement__Group__1__Impl rule__ForStatement__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ForStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__2();

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
    // $ANTLR end "rule__ForStatement__Group__1"


    // $ANTLR start "rule__ForStatement__Group__1__Impl"
    // InternalMiniJava.g:4272:1: rule__ForStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ForStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4276:1: ( ( '(' ) )
            // InternalMiniJava.g:4277:1: ( '(' )
            {
            // InternalMiniJava.g:4277:1: ( '(' )
            // InternalMiniJava.g:4278:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__ForStatement__Group__1__Impl"


    // $ANTLR start "rule__ForStatement__Group__2"
    // InternalMiniJava.g:4287:1: rule__ForStatement__Group__2 : rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 ;
    public final void rule__ForStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4291:1: ( rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3 )
            // InternalMiniJava.g:4292:2: rule__ForStatement__Group__2__Impl rule__ForStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ForStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__3();

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
    // $ANTLR end "rule__ForStatement__Group__2"


    // $ANTLR start "rule__ForStatement__Group__2__Impl"
    // InternalMiniJava.g:4299:1: rule__ForStatement__Group__2__Impl : ( ( rule__ForStatement__DeclarationAssignment_2 ) ) ;
    public final void rule__ForStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4303:1: ( ( ( rule__ForStatement__DeclarationAssignment_2 ) ) )
            // InternalMiniJava.g:4304:1: ( ( rule__ForStatement__DeclarationAssignment_2 ) )
            {
            // InternalMiniJava.g:4304:1: ( ( rule__ForStatement__DeclarationAssignment_2 ) )
            // InternalMiniJava.g:4305:2: ( rule__ForStatement__DeclarationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeclarationAssignment_2()); 
            }
            // InternalMiniJava.g:4306:2: ( rule__ForStatement__DeclarationAssignment_2 )
            // InternalMiniJava.g:4306:3: rule__ForStatement__DeclarationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__DeclarationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getDeclarationAssignment_2()); 
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
    // $ANTLR end "rule__ForStatement__Group__2__Impl"


    // $ANTLR start "rule__ForStatement__Group__3"
    // InternalMiniJava.g:4314:1: rule__ForStatement__Group__3 : rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 ;
    public final void rule__ForStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4318:1: ( rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4 )
            // InternalMiniJava.g:4319:2: rule__ForStatement__Group__3__Impl rule__ForStatement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ForStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__4();

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
    // $ANTLR end "rule__ForStatement__Group__3"


    // $ANTLR start "rule__ForStatement__Group__3__Impl"
    // InternalMiniJava.g:4326:1: rule__ForStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__ForStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4330:1: ( ( ';' ) )
            // InternalMiniJava.g:4331:1: ( ';' )
            {
            // InternalMiniJava.g:4331:1: ( ';' )
            // InternalMiniJava.g:4332:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getSemicolonKeyword_3()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__ForStatement__Group__3__Impl"


    // $ANTLR start "rule__ForStatement__Group__4"
    // InternalMiniJava.g:4341:1: rule__ForStatement__Group__4 : rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 ;
    public final void rule__ForStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4345:1: ( rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5 )
            // InternalMiniJava.g:4346:2: rule__ForStatement__Group__4__Impl rule__ForStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ForStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__5();

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
    // $ANTLR end "rule__ForStatement__Group__4"


    // $ANTLR start "rule__ForStatement__Group__4__Impl"
    // InternalMiniJava.g:4353:1: rule__ForStatement__Group__4__Impl : ( ( rule__ForStatement__ConditionAssignment_4 ) ) ;
    public final void rule__ForStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4357:1: ( ( ( rule__ForStatement__ConditionAssignment_4 ) ) )
            // InternalMiniJava.g:4358:1: ( ( rule__ForStatement__ConditionAssignment_4 ) )
            {
            // InternalMiniJava.g:4358:1: ( ( rule__ForStatement__ConditionAssignment_4 ) )
            // InternalMiniJava.g:4359:2: ( rule__ForStatement__ConditionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getConditionAssignment_4()); 
            }
            // InternalMiniJava.g:4360:2: ( rule__ForStatement__ConditionAssignment_4 )
            // InternalMiniJava.g:4360:3: rule__ForStatement__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__ConditionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getConditionAssignment_4()); 
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
    // $ANTLR end "rule__ForStatement__Group__4__Impl"


    // $ANTLR start "rule__ForStatement__Group__5"
    // InternalMiniJava.g:4368:1: rule__ForStatement__Group__5 : rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 ;
    public final void rule__ForStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4372:1: ( rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6 )
            // InternalMiniJava.g:4373:2: rule__ForStatement__Group__5__Impl rule__ForStatement__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__ForStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__6();

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
    // $ANTLR end "rule__ForStatement__Group__5"


    // $ANTLR start "rule__ForStatement__Group__5__Impl"
    // InternalMiniJava.g:4380:1: rule__ForStatement__Group__5__Impl : ( ';' ) ;
    public final void rule__ForStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4384:1: ( ( ';' ) )
            // InternalMiniJava.g:4385:1: ( ';' )
            {
            // InternalMiniJava.g:4385:1: ( ';' )
            // InternalMiniJava.g:4386:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getSemicolonKeyword_5()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__ForStatement__Group__5__Impl"


    // $ANTLR start "rule__ForStatement__Group__6"
    // InternalMiniJava.g:4395:1: rule__ForStatement__Group__6 : rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 ;
    public final void rule__ForStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4399:1: ( rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7 )
            // InternalMiniJava.g:4400:2: rule__ForStatement__Group__6__Impl rule__ForStatement__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__ForStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__7();

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
    // $ANTLR end "rule__ForStatement__Group__6"


    // $ANTLR start "rule__ForStatement__Group__6__Impl"
    // InternalMiniJava.g:4407:1: rule__ForStatement__Group__6__Impl : ( ( rule__ForStatement__ProgressionAssignment_6 ) ) ;
    public final void rule__ForStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4411:1: ( ( ( rule__ForStatement__ProgressionAssignment_6 ) ) )
            // InternalMiniJava.g:4412:1: ( ( rule__ForStatement__ProgressionAssignment_6 ) )
            {
            // InternalMiniJava.g:4412:1: ( ( rule__ForStatement__ProgressionAssignment_6 ) )
            // InternalMiniJava.g:4413:2: ( rule__ForStatement__ProgressionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getProgressionAssignment_6()); 
            }
            // InternalMiniJava.g:4414:2: ( rule__ForStatement__ProgressionAssignment_6 )
            // InternalMiniJava.g:4414:3: rule__ForStatement__ProgressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__ProgressionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getProgressionAssignment_6()); 
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
    // $ANTLR end "rule__ForStatement__Group__6__Impl"


    // $ANTLR start "rule__ForStatement__Group__7"
    // InternalMiniJava.g:4422:1: rule__ForStatement__Group__7 : rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 ;
    public final void rule__ForStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4426:1: ( rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8 )
            // InternalMiniJava.g:4427:2: rule__ForStatement__Group__7__Impl rule__ForStatement__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__ForStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__8();

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
    // $ANTLR end "rule__ForStatement__Group__7"


    // $ANTLR start "rule__ForStatement__Group__7__Impl"
    // InternalMiniJava.g:4434:1: rule__ForStatement__Group__7__Impl : ( ')' ) ;
    public final void rule__ForStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4438:1: ( ( ')' ) )
            // InternalMiniJava.g:4439:1: ( ')' )
            {
            // InternalMiniJava.g:4439:1: ( ')' )
            // InternalMiniJava.g:4440:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__ForStatement__Group__7__Impl"


    // $ANTLR start "rule__ForStatement__Group__8"
    // InternalMiniJava.g:4449:1: rule__ForStatement__Group__8 : rule__ForStatement__Group__8__Impl ;
    public final void rule__ForStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4453:1: ( rule__ForStatement__Group__8__Impl )
            // InternalMiniJava.g:4454:2: rule__ForStatement__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__Group__8__Impl();

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
    // $ANTLR end "rule__ForStatement__Group__8"


    // $ANTLR start "rule__ForStatement__Group__8__Impl"
    // InternalMiniJava.g:4460:1: rule__ForStatement__Group__8__Impl : ( ( rule__ForStatement__BlockAssignment_8 ) ) ;
    public final void rule__ForStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4464:1: ( ( ( rule__ForStatement__BlockAssignment_8 ) ) )
            // InternalMiniJava.g:4465:1: ( ( rule__ForStatement__BlockAssignment_8 ) )
            {
            // InternalMiniJava.g:4465:1: ( ( rule__ForStatement__BlockAssignment_8 ) )
            // InternalMiniJava.g:4466:2: ( rule__ForStatement__BlockAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBlockAssignment_8()); 
            }
            // InternalMiniJava.g:4467:2: ( rule__ForStatement__BlockAssignment_8 )
            // InternalMiniJava.g:4467:3: rule__ForStatement__BlockAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ForStatement__BlockAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBlockAssignment_8()); 
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
    // $ANTLR end "rule__ForStatement__Group__8__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // InternalMiniJava.g:4476:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4480:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // InternalMiniJava.g:4481:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1();

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
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // InternalMiniJava.g:4488:1: rule__TypeRef__Group__0__Impl : ( ruleSingleTypeRef ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4492:1: ( ( ruleSingleTypeRef ) )
            // InternalMiniJava.g:4493:1: ( ruleSingleTypeRef )
            {
            // InternalMiniJava.g:4493:1: ( ruleSingleTypeRef )
            // InternalMiniJava.g:4494:2: ruleSingleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0()); 
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
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // InternalMiniJava.g:4503:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4507:1: ( rule__TypeRef__Group__1__Impl )
            // InternalMiniJava.g:4508:2: rule__TypeRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group__1__Impl();

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
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // InternalMiniJava.g:4514:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__Group_1__0 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4518:1: ( ( ( rule__TypeRef__Group_1__0 )? ) )
            // InternalMiniJava.g:4519:1: ( ( rule__TypeRef__Group_1__0 )? )
            {
            // InternalMiniJava.g:4519:1: ( ( rule__TypeRef__Group_1__0 )? )
            // InternalMiniJava.g:4520:2: ( rule__TypeRef__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:4521:2: ( rule__TypeRef__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==40) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalMiniJava.g:4521:3: rule__TypeRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeRef__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__0"
    // InternalMiniJava.g:4530:1: rule__TypeRef__Group_1__0 : rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 ;
    public final void rule__TypeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4534:1: ( rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1 )
            // InternalMiniJava.g:4535:2: rule__TypeRef__Group_1__0__Impl rule__TypeRef__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__TypeRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__1();

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
    // $ANTLR end "rule__TypeRef__Group_1__0"


    // $ANTLR start "rule__TypeRef__Group_1__0__Impl"
    // InternalMiniJava.g:4542:1: rule__TypeRef__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4546:1: ( ( () ) )
            // InternalMiniJava.g:4547:1: ( () )
            {
            // InternalMiniJava.g:4547:1: ( () )
            // InternalMiniJava.g:4548:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0()); 
            }
            // InternalMiniJava.g:4549:2: ()
            // InternalMiniJava.g:4549:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group_1__0__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__1"
    // InternalMiniJava.g:4557:1: rule__TypeRef__Group_1__1 : rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 ;
    public final void rule__TypeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4561:1: ( rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2 )
            // InternalMiniJava.g:4562:2: rule__TypeRef__Group_1__1__Impl rule__TypeRef__Group_1__2
            {
            pushFollow(FOLLOW_36);
            rule__TypeRef__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__2();

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
    // $ANTLR end "rule__TypeRef__Group_1__1"


    // $ANTLR start "rule__TypeRef__Group_1__1__Impl"
    // InternalMiniJava.g:4569:1: rule__TypeRef__Group_1__1__Impl : ( '[' ) ;
    public final void rule__TypeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4573:1: ( ( '[' ) )
            // InternalMiniJava.g:4574:1: ( '[' )
            {
            // InternalMiniJava.g:4574:1: ( '[' )
            // InternalMiniJava.g:4575:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1()); 
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
    // $ANTLR end "rule__TypeRef__Group_1__1__Impl"


    // $ANTLR start "rule__TypeRef__Group_1__2"
    // InternalMiniJava.g:4584:1: rule__TypeRef__Group_1__2 : rule__TypeRef__Group_1__2__Impl ;
    public final void rule__TypeRef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4588:1: ( rule__TypeRef__Group_1__2__Impl )
            // InternalMiniJava.g:4589:2: rule__TypeRef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeRef__Group_1__2__Impl();

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
    // $ANTLR end "rule__TypeRef__Group_1__2"


    // $ANTLR start "rule__TypeRef__Group_1__2__Impl"
    // InternalMiniJava.g:4595:1: rule__TypeRef__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TypeRef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4599:1: ( ( ']' ) )
            // InternalMiniJava.g:4600:1: ( ']' )
            {
            // InternalMiniJava.g:4600:1: ( ']' )
            // InternalMiniJava.g:4601:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); 
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
    // $ANTLR end "rule__TypeRef__Group_1__2__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_1__0"
    // InternalMiniJava.g:4611:1: rule__SingleTypeRef__Group_1__0 : rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1 ;
    public final void rule__SingleTypeRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4615:1: ( rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1 )
            // InternalMiniJava.g:4616:2: rule__SingleTypeRef__Group_1__0__Impl rule__SingleTypeRef__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__SingleTypeRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_1__1();

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
    // $ANTLR end "rule__SingleTypeRef__Group_1__0"


    // $ANTLR start "rule__SingleTypeRef__Group_1__0__Impl"
    // InternalMiniJava.g:4623:1: rule__SingleTypeRef__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4627:1: ( ( () ) )
            // InternalMiniJava.g:4628:1: ( () )
            {
            // InternalMiniJava.g:4628:1: ( () )
            // InternalMiniJava.g:4629:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0()); 
            }
            // InternalMiniJava.g:4630:2: ()
            // InternalMiniJava.g:4630:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_1__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_1__1"
    // InternalMiniJava.g:4638:1: rule__SingleTypeRef__Group_1__1 : rule__SingleTypeRef__Group_1__1__Impl ;
    public final void rule__SingleTypeRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4642:1: ( rule__SingleTypeRef__Group_1__1__Impl )
            // InternalMiniJava.g:4643:2: rule__SingleTypeRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_1__1__Impl();

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
    // $ANTLR end "rule__SingleTypeRef__Group_1__1"


    // $ANTLR start "rule__SingleTypeRef__Group_1__1__Impl"
    // InternalMiniJava.g:4649:1: rule__SingleTypeRef__Group_1__1__Impl : ( 'int' ) ;
    public final void rule__SingleTypeRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4653:1: ( ( 'int' ) )
            // InternalMiniJava.g:4654:1: ( 'int' )
            {
            // InternalMiniJava.g:4654:1: ( 'int' )
            // InternalMiniJava.g:4655:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1()); 
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
    // $ANTLR end "rule__SingleTypeRef__Group_1__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_2__0"
    // InternalMiniJava.g:4665:1: rule__SingleTypeRef__Group_2__0 : rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1 ;
    public final void rule__SingleTypeRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4669:1: ( rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1 )
            // InternalMiniJava.g:4670:2: rule__SingleTypeRef__Group_2__0__Impl rule__SingleTypeRef__Group_2__1
            {
            pushFollow(FOLLOW_38);
            rule__SingleTypeRef__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_2__1();

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
    // $ANTLR end "rule__SingleTypeRef__Group_2__0"


    // $ANTLR start "rule__SingleTypeRef__Group_2__0__Impl"
    // InternalMiniJava.g:4677:1: rule__SingleTypeRef__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4681:1: ( ( () ) )
            // InternalMiniJava.g:4682:1: ( () )
            {
            // InternalMiniJava.g:4682:1: ( () )
            // InternalMiniJava.g:4683:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0()); 
            }
            // InternalMiniJava.g:4684:2: ()
            // InternalMiniJava.g:4684:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_2__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_2__1"
    // InternalMiniJava.g:4692:1: rule__SingleTypeRef__Group_2__1 : rule__SingleTypeRef__Group_2__1__Impl ;
    public final void rule__SingleTypeRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4696:1: ( rule__SingleTypeRef__Group_2__1__Impl )
            // InternalMiniJava.g:4697:2: rule__SingleTypeRef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_2__1__Impl();

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
    // $ANTLR end "rule__SingleTypeRef__Group_2__1"


    // $ANTLR start "rule__SingleTypeRef__Group_2__1__Impl"
    // InternalMiniJava.g:4703:1: rule__SingleTypeRef__Group_2__1__Impl : ( 'boolean' ) ;
    public final void rule__SingleTypeRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4707:1: ( ( 'boolean' ) )
            // InternalMiniJava.g:4708:1: ( 'boolean' )
            {
            // InternalMiniJava.g:4708:1: ( 'boolean' )
            // InternalMiniJava.g:4709:2: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1()); 
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
    // $ANTLR end "rule__SingleTypeRef__Group_2__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_3__0"
    // InternalMiniJava.g:4719:1: rule__SingleTypeRef__Group_3__0 : rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1 ;
    public final void rule__SingleTypeRef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4723:1: ( rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1 )
            // InternalMiniJava.g:4724:2: rule__SingleTypeRef__Group_3__0__Impl rule__SingleTypeRef__Group_3__1
            {
            pushFollow(FOLLOW_39);
            rule__SingleTypeRef__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_3__1();

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
    // $ANTLR end "rule__SingleTypeRef__Group_3__0"


    // $ANTLR start "rule__SingleTypeRef__Group_3__0__Impl"
    // InternalMiniJava.g:4731:1: rule__SingleTypeRef__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4735:1: ( ( () ) )
            // InternalMiniJava.g:4736:1: ( () )
            {
            // InternalMiniJava.g:4736:1: ( () )
            // InternalMiniJava.g:4737:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0()); 
            }
            // InternalMiniJava.g:4738:2: ()
            // InternalMiniJava.g:4738:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_3__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_3__1"
    // InternalMiniJava.g:4746:1: rule__SingleTypeRef__Group_3__1 : rule__SingleTypeRef__Group_3__1__Impl ;
    public final void rule__SingleTypeRef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4750:1: ( rule__SingleTypeRef__Group_3__1__Impl )
            // InternalMiniJava.g:4751:2: rule__SingleTypeRef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_3__1__Impl();

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
    // $ANTLR end "rule__SingleTypeRef__Group_3__1"


    // $ANTLR start "rule__SingleTypeRef__Group_3__1__Impl"
    // InternalMiniJava.g:4757:1: rule__SingleTypeRef__Group_3__1__Impl : ( 'String' ) ;
    public final void rule__SingleTypeRef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4761:1: ( ( 'String' ) )
            // InternalMiniJava.g:4762:1: ( 'String' )
            {
            // InternalMiniJava.g:4762:1: ( 'String' )
            // InternalMiniJava.g:4763:2: 'String'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1()); 
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
    // $ANTLR end "rule__SingleTypeRef__Group_3__1__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_4__0"
    // InternalMiniJava.g:4773:1: rule__SingleTypeRef__Group_4__0 : rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1 ;
    public final void rule__SingleTypeRef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4777:1: ( rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1 )
            // InternalMiniJava.g:4778:2: rule__SingleTypeRef__Group_4__0__Impl rule__SingleTypeRef__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__SingleTypeRef__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_4__1();

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
    // $ANTLR end "rule__SingleTypeRef__Group_4__0"


    // $ANTLR start "rule__SingleTypeRef__Group_4__0__Impl"
    // InternalMiniJava.g:4785:1: rule__SingleTypeRef__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleTypeRef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4789:1: ( ( () ) )
            // InternalMiniJava.g:4790:1: ( () )
            {
            // InternalMiniJava.g:4790:1: ( () )
            // InternalMiniJava.g:4791:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0()); 
            }
            // InternalMiniJava.g:4792:2: ()
            // InternalMiniJava.g:4792:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleTypeRef__Group_4__0__Impl"


    // $ANTLR start "rule__SingleTypeRef__Group_4__1"
    // InternalMiniJava.g:4800:1: rule__SingleTypeRef__Group_4__1 : rule__SingleTypeRef__Group_4__1__Impl ;
    public final void rule__SingleTypeRef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4804:1: ( rule__SingleTypeRef__Group_4__1__Impl )
            // InternalMiniJava.g:4805:2: rule__SingleTypeRef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleTypeRef__Group_4__1__Impl();

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
    // $ANTLR end "rule__SingleTypeRef__Group_4__1"


    // $ANTLR start "rule__SingleTypeRef__Group_4__1__Impl"
    // InternalMiniJava.g:4811:1: rule__SingleTypeRef__Group_4__1__Impl : ( 'void' ) ;
    public final void rule__SingleTypeRef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4815:1: ( ( 'void' ) )
            // InternalMiniJava.g:4816:1: ( 'void' )
            {
            // InternalMiniJava.g:4816:1: ( 'void' )
            // InternalMiniJava.g:4817:2: 'void'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1()); 
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
    // $ANTLR end "rule__SingleTypeRef__Group_4__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMiniJava.g:4827:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4831:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMiniJava.g:4832:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalMiniJava.g:4839:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4843:1: ( ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) ) )
            // InternalMiniJava.g:4844:1: ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) )
            {
            // InternalMiniJava.g:4844:1: ( ( rule__VariableDeclaration__TypeRefAssignment_0 ) )
            // InternalMiniJava.g:4845:2: ( rule__VariableDeclaration__TypeRefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeRefAssignment_0()); 
            }
            // InternalMiniJava.g:4846:2: ( rule__VariableDeclaration__TypeRefAssignment_0 )
            // InternalMiniJava.g:4846:3: rule__VariableDeclaration__TypeRefAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__TypeRefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeRefAssignment_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalMiniJava.g:4854:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4858:1: ( rule__VariableDeclaration__Group__1__Impl )
            // InternalMiniJava.g:4859:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalMiniJava.g:4865:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4869:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalMiniJava.g:4870:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:4870:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalMiniJava.g:4871:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalMiniJava.g:4872:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalMiniJava.g:4872:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalMiniJava.g:4881:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4885:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalMiniJava.g:4886:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalMiniJava.g:4893:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AssigneeAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4897:1: ( ( ( rule__Assignment__AssigneeAssignment_0 ) ) )
            // InternalMiniJava.g:4898:1: ( ( rule__Assignment__AssigneeAssignment_0 ) )
            {
            // InternalMiniJava.g:4898:1: ( ( rule__Assignment__AssigneeAssignment_0 ) )
            // InternalMiniJava.g:4899:2: ( rule__Assignment__AssigneeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssigneeAssignment_0()); 
            }
            // InternalMiniJava.g:4900:2: ( rule__Assignment__AssigneeAssignment_0 )
            // InternalMiniJava.g:4900:3: rule__Assignment__AssigneeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__AssigneeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssigneeAssignment_0()); 
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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalMiniJava.g:4908:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4912:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalMiniJava.g:4913:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalMiniJava.g:4920:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4924:1: ( ( '=' ) )
            // InternalMiniJava.g:4925:1: ( '=' )
            {
            // InternalMiniJava.g:4925:1: ( '=' )
            // InternalMiniJava.g:4926:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalMiniJava.g:4935:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4939:1: ( rule__Assignment__Group__2__Impl )
            // InternalMiniJava.g:4940:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalMiniJava.g:4946:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4950:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalMiniJava.g:4951:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalMiniJava.g:4951:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalMiniJava.g:4952:2: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // InternalMiniJava.g:4953:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalMiniJava.g:4953:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMiniJava.g:4962:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4966:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMiniJava.g:4967:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMiniJava.g:4974:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4978:1: ( ( ruleAnd ) )
            // InternalMiniJava.g:4979:1: ( ruleAnd )
            {
            // InternalMiniJava.g:4979:1: ( ruleAnd )
            // InternalMiniJava.g:4980:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
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
    // InternalMiniJava.g:4989:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4993:1: ( rule__Or__Group__1__Impl )
            // InternalMiniJava.g:4994:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // InternalMiniJava.g:5000:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5004:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMiniJava.g:5005:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMiniJava.g:5005:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMiniJava.g:5006:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5007:2: ( rule__Or__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMiniJava.g:5007:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
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


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMiniJava.g:5016:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5020:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMiniJava.g:5021:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMiniJava.g:5028:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5032:1: ( ( () ) )
            // InternalMiniJava.g:5033:1: ( () )
            {
            // InternalMiniJava.g:5033:1: ( () )
            // InternalMiniJava.g:5034:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalMiniJava.g:5035:2: ()
            // InternalMiniJava.g:5035:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMiniJava.g:5043:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5047:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMiniJava.g:5048:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMiniJava.g:5055:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5059:1: ( ( '||' ) )
            // InternalMiniJava.g:5060:1: ( '||' )
            {
            // InternalMiniJava.g:5060:1: ( '||' )
            // InternalMiniJava.g:5061:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMiniJava.g:5070:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5074:1: ( rule__Or__Group_1__2__Impl )
            // InternalMiniJava.g:5075:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMiniJava.g:5081:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5085:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:5086:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:5086:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMiniJava.g:5087:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:5088:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMiniJava.g:5088:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMiniJava.g:5097:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5101:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMiniJava.g:5102:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMiniJava.g:5109:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5113:1: ( ( ruleEquality ) )
            // InternalMiniJava.g:5114:1: ( ruleEquality )
            {
            // InternalMiniJava.g:5114:1: ( ruleEquality )
            // InternalMiniJava.g:5115:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
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
    // InternalMiniJava.g:5124:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5128:1: ( rule__And__Group__1__Impl )
            // InternalMiniJava.g:5129:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // InternalMiniJava.g:5135:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5139:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMiniJava.g:5140:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMiniJava.g:5140:1: ( ( rule__And__Group_1__0 )* )
            // InternalMiniJava.g:5141:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5142:2: ( rule__And__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMiniJava.g:5142:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
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


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMiniJava.g:5151:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5155:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMiniJava.g:5156:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMiniJava.g:5163:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5167:1: ( ( () ) )
            // InternalMiniJava.g:5168:1: ( () )
            {
            // InternalMiniJava.g:5168:1: ( () )
            // InternalMiniJava.g:5169:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalMiniJava.g:5170:2: ()
            // InternalMiniJava.g:5170:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMiniJava.g:5178:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5182:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMiniJava.g:5183:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMiniJava.g:5190:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5194:1: ( ( '&&' ) )
            // InternalMiniJava.g:5195:1: ( '&&' )
            {
            // InternalMiniJava.g:5195:1: ( '&&' )
            // InternalMiniJava.g:5196:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMiniJava.g:5205:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5209:1: ( rule__And__Group_1__2__Impl )
            // InternalMiniJava.g:5210:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMiniJava.g:5216:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5220:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:5221:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:5221:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMiniJava.g:5222:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:5223:2: ( rule__And__RightAssignment_1_2 )
            // InternalMiniJava.g:5223:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMiniJava.g:5232:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5236:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMiniJava.g:5237:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMiniJava.g:5244:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5248:1: ( ( ruleComparison ) )
            // InternalMiniJava.g:5249:1: ( ruleComparison )
            {
            // InternalMiniJava.g:5249:1: ( ruleComparison )
            // InternalMiniJava.g:5250:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMiniJava.g:5259:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5263:1: ( rule__Equality__Group__1__Impl )
            // InternalMiniJava.g:5264:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMiniJava.g:5270:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5274:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMiniJava.g:5275:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMiniJava.g:5275:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMiniJava.g:5276:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5277:2: ( rule__Equality__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=47 && LA46_0<=48)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMiniJava.g:5277:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMiniJava.g:5286:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5290:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMiniJava.g:5291:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMiniJava.g:5298:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5302:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5303:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5303:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalMiniJava.g:5304:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5305:2: ( rule__Equality__Alternatives_1_0 )
            // InternalMiniJava.g:5305:3: rule__Equality__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMiniJava.g:5313:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5317:1: ( rule__Equality__Group_1__1__Impl )
            // InternalMiniJava.g:5318:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMiniJava.g:5324:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5328:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:5329:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:5329:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalMiniJava.g:5330:2: ( rule__Equality__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:5331:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalMiniJava.g:5331:3: rule__Equality__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__0"
    // InternalMiniJava.g:5340:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5344:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalMiniJava.g:5345:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Equality__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1();

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
    // $ANTLR end "rule__Equality__Group_1_0_0__0"


    // $ANTLR start "rule__Equality__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:5352:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5356:1: ( ( () ) )
            // InternalMiniJava.g:5357:1: ( () )
            {
            // InternalMiniJava.g:5357:1: ( () )
            // InternalMiniJava.g:5358:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:5359:2: ()
            // InternalMiniJava.g:5359:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__1"
    // InternalMiniJava.g:5367:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5371:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:5372:2: rule__Equality__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1_0_0__1"


    // $ANTLR start "rule__Equality__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:5378:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5382:1: ( ( '==' ) )
            // InternalMiniJava.g:5383:1: ( '==' )
            {
            // InternalMiniJava.g:5383:1: ( '==' )
            // InternalMiniJava.g:5384:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Equality__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__0"
    // InternalMiniJava.g:5394:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5398:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalMiniJava.g:5399:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Equality__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1();

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
    // $ANTLR end "rule__Equality__Group_1_0_1__0"


    // $ANTLR start "rule__Equality__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:5406:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5410:1: ( ( () ) )
            // InternalMiniJava.g:5411:1: ( () )
            {
            // InternalMiniJava.g:5411:1: ( () )
            // InternalMiniJava.g:5412:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:5413:2: ()
            // InternalMiniJava.g:5413:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__1"
    // InternalMiniJava.g:5421:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5425:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:5426:2: rule__Equality__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Equality__Group_1_0_1__1"


    // $ANTLR start "rule__Equality__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:5432:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5436:1: ( ( '!=' ) )
            // InternalMiniJava.g:5437:1: ( '!=' )
            {
            // InternalMiniJava.g:5437:1: ( '!=' )
            // InternalMiniJava.g:5438:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Equality__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMiniJava.g:5448:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5452:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMiniJava.g:5453:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMiniJava.g:5460:1: rule__Comparison__Group__0__Impl : ( ruleModulo ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5464:1: ( ( ruleModulo ) )
            // InternalMiniJava.g:5465:1: ( ruleModulo )
            {
            // InternalMiniJava.g:5465:1: ( ruleModulo )
            // InternalMiniJava.g:5466:2: ruleModulo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getModuloParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getModuloParserRuleCall_0()); 
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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMiniJava.g:5475:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5479:1: ( rule__Comparison__Group__1__Impl )
            // InternalMiniJava.g:5480:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMiniJava.g:5486:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5490:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMiniJava.g:5491:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMiniJava.g:5491:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMiniJava.g:5492:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5493:2: ( rule__Comparison__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=49 && LA47_0<=52)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMiniJava.g:5493:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMiniJava.g:5502:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5506:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMiniJava.g:5507:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMiniJava.g:5514:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5518:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5519:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5519:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalMiniJava.g:5520:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5521:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalMiniJava.g:5521:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMiniJava.g:5529:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5533:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalMiniJava.g:5534:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMiniJava.g:5540:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5544:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:5545:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:5545:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalMiniJava.g:5546:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:5547:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalMiniJava.g:5547:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalMiniJava.g:5556:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5560:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalMiniJava.g:5561:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_50);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:5568:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5572:1: ( ( () ) )
            // InternalMiniJava.g:5573:1: ( () )
            {
            // InternalMiniJava.g:5573:1: ( () )
            // InternalMiniJava.g:5574:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:5575:2: ()
            // InternalMiniJava.g:5575:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalMiniJava.g:5583:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5587:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:5588:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:5594:1: rule__Comparison__Group_1_0_0__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5598:1: ( ( '>=' ) )
            // InternalMiniJava.g:5599:1: ( '>=' )
            {
            // InternalMiniJava.g:5599:1: ( '>=' )
            // InternalMiniJava.g:5600:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalMiniJava.g:5610:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5614:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalMiniJava.g:5615:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_51);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:5622:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5626:1: ( ( () ) )
            // InternalMiniJava.g:5627:1: ( () )
            {
            // InternalMiniJava.g:5627:1: ( () )
            // InternalMiniJava.g:5628:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:5629:2: ()
            // InternalMiniJava.g:5629:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalMiniJava.g:5637:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5641:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:5642:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:5648:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5652:1: ( ( '<=' ) )
            // InternalMiniJava.g:5653:1: ( '<=' )
            {
            // InternalMiniJava.g:5653:1: ( '<=' )
            // InternalMiniJava.g:5654:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // InternalMiniJava.g:5664:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5668:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalMiniJava.g:5669:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_52);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // InternalMiniJava.g:5676:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5680:1: ( ( () ) )
            // InternalMiniJava.g:5681:1: ( () )
            {
            // InternalMiniJava.g:5681:1: ( () )
            // InternalMiniJava.g:5682:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0()); 
            }
            // InternalMiniJava.g:5683:2: ()
            // InternalMiniJava.g:5683:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // InternalMiniJava.g:5691:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5695:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalMiniJava.g:5696:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // InternalMiniJava.g:5702:1: rule__Comparison__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5706:1: ( ( '>' ) )
            // InternalMiniJava.g:5707:1: ( '>' )
            {
            // InternalMiniJava.g:5707:1: ( '>' )
            // InternalMiniJava.g:5708:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // InternalMiniJava.g:5718:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5722:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalMiniJava.g:5723:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_48);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // InternalMiniJava.g:5730:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5734:1: ( ( () ) )
            // InternalMiniJava.g:5735:1: ( () )
            {
            // InternalMiniJava.g:5735:1: ( () )
            // InternalMiniJava.g:5736:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0()); 
            }
            // InternalMiniJava.g:5737:2: ()
            // InternalMiniJava.g:5737:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // InternalMiniJava.g:5745:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5749:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalMiniJava.g:5750:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // InternalMiniJava.g:5756:1: rule__Comparison__Group_1_0_3__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5760:1: ( ( '<' ) )
            // InternalMiniJava.g:5761:1: ( '<' )
            {
            // InternalMiniJava.g:5761:1: ( '<' )
            // InternalMiniJava.g:5762:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalMiniJava.g:5772:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5776:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalMiniJava.g:5777:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Modulo__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1();

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
    // $ANTLR end "rule__Modulo__Group__0"


    // $ANTLR start "rule__Modulo__Group__0__Impl"
    // InternalMiniJava.g:5784:1: rule__Modulo__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5788:1: ( ( rulePlusOrMinus ) )
            // InternalMiniJava.g:5789:1: ( rulePlusOrMinus )
            {
            // InternalMiniJava.g:5789:1: ( rulePlusOrMinus )
            // InternalMiniJava.g:5790:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getPlusOrMinusParserRuleCall_0()); 
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
    // $ANTLR end "rule__Modulo__Group__0__Impl"


    // $ANTLR start "rule__Modulo__Group__1"
    // InternalMiniJava.g:5799:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5803:1: ( rule__Modulo__Group__1__Impl )
            // InternalMiniJava.g:5804:2: rule__Modulo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1__Impl();

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
    // $ANTLR end "rule__Modulo__Group__1"


    // $ANTLR start "rule__Modulo__Group__1__Impl"
    // InternalMiniJava.g:5810:1: rule__Modulo__Group__1__Impl : ( ( rule__Modulo__Group_1__0 )* ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5814:1: ( ( ( rule__Modulo__Group_1__0 )* ) )
            // InternalMiniJava.g:5815:1: ( ( rule__Modulo__Group_1__0 )* )
            {
            // InternalMiniJava.g:5815:1: ( ( rule__Modulo__Group_1__0 )* )
            // InternalMiniJava.g:5816:2: ( rule__Modulo__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5817:2: ( rule__Modulo__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==53) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMiniJava.g:5817:3: rule__Modulo__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Modulo__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Modulo__Group__1__Impl"


    // $ANTLR start "rule__Modulo__Group_1__0"
    // InternalMiniJava.g:5826:1: rule__Modulo__Group_1__0 : rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 ;
    public final void rule__Modulo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5830:1: ( rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 )
            // InternalMiniJava.g:5831:2: rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__Modulo__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__1();

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
    // $ANTLR end "rule__Modulo__Group_1__0"


    // $ANTLR start "rule__Modulo__Group_1__0__Impl"
    // InternalMiniJava.g:5838:1: rule__Modulo__Group_1__0__Impl : ( () ) ;
    public final void rule__Modulo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5842:1: ( ( () ) )
            // InternalMiniJava.g:5843:1: ( () )
            {
            // InternalMiniJava.g:5843:1: ( () )
            // InternalMiniJava.g:5844:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getModuloLeftAction_1_0()); 
            }
            // InternalMiniJava.g:5845:2: ()
            // InternalMiniJava.g:5845:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getModuloLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__0__Impl"


    // $ANTLR start "rule__Modulo__Group_1__1"
    // InternalMiniJava.g:5853:1: rule__Modulo__Group_1__1 : rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 ;
    public final void rule__Modulo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5857:1: ( rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 )
            // InternalMiniJava.g:5858:2: rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Modulo__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__2();

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
    // $ANTLR end "rule__Modulo__Group_1__1"


    // $ANTLR start "rule__Modulo__Group_1__1__Impl"
    // InternalMiniJava.g:5865:1: rule__Modulo__Group_1__1__Impl : ( '%' ) ;
    public final void rule__Modulo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5869:1: ( ( '%' ) )
            // InternalMiniJava.g:5870:1: ( '%' )
            {
            // InternalMiniJava.g:5870:1: ( '%' )
            // InternalMiniJava.g:5871:2: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getPercentSignKeyword_1_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getPercentSignKeyword_1_1()); 
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
    // $ANTLR end "rule__Modulo__Group_1__1__Impl"


    // $ANTLR start "rule__Modulo__Group_1__2"
    // InternalMiniJava.g:5880:1: rule__Modulo__Group_1__2 : rule__Modulo__Group_1__2__Impl ;
    public final void rule__Modulo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5884:1: ( rule__Modulo__Group_1__2__Impl )
            // InternalMiniJava.g:5885:2: rule__Modulo__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__2__Impl();

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
    // $ANTLR end "rule__Modulo__Group_1__2"


    // $ANTLR start "rule__Modulo__Group_1__2__Impl"
    // InternalMiniJava.g:5891:1: rule__Modulo__Group_1__2__Impl : ( ( rule__Modulo__RightAssignment_1_2 ) ) ;
    public final void rule__Modulo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5895:1: ( ( ( rule__Modulo__RightAssignment_1_2 ) ) )
            // InternalMiniJava.g:5896:1: ( ( rule__Modulo__RightAssignment_1_2 ) )
            {
            // InternalMiniJava.g:5896:1: ( ( rule__Modulo__RightAssignment_1_2 ) )
            // InternalMiniJava.g:5897:2: ( rule__Modulo__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniJava.g:5898:2: ( rule__Modulo__RightAssignment_1_2 )
            // InternalMiniJava.g:5898:3: rule__Modulo__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Modulo__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMiniJava.g:5907:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5911:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMiniJava.g:5912:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMiniJava.g:5919:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5923:1: ( ( ruleMulOrDiv ) )
            // InternalMiniJava.g:5924:1: ( ruleMulOrDiv )
            {
            // InternalMiniJava.g:5924:1: ( ruleMulOrDiv )
            // InternalMiniJava.g:5925:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMiniJava.g:5934:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5938:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMiniJava.g:5939:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMiniJava.g:5945:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5949:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMiniJava.g:5950:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMiniJava.g:5950:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMiniJava.g:5951:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:5952:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=54 && LA49_0<=55)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMiniJava.g:5952:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMiniJava.g:5961:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5965:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMiniJava.g:5966:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMiniJava.g:5973:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5977:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:5978:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:5978:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMiniJava.g:5979:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:5980:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMiniJava.g:5980:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMiniJava.g:5988:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5992:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMiniJava.g:5993:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMiniJava.g:5999:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6003:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:6004:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:6004:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMiniJava.g:6005:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:6006:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMiniJava.g:6006:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMiniJava.g:6015:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6019:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMiniJava.g:6020:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_57);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:6027:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6031:1: ( ( () ) )
            // InternalMiniJava.g:6032:1: ( () )
            {
            // InternalMiniJava.g:6032:1: ( () )
            // InternalMiniJava.g:6033:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:6034:2: ()
            // InternalMiniJava.g:6034:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMiniJava.g:6042:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6046:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:6047:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:6053:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6057:1: ( ( '+' ) )
            // InternalMiniJava.g:6058:1: ( '+' )
            {
            // InternalMiniJava.g:6058:1: ( '+' )
            // InternalMiniJava.g:6059:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMiniJava.g:6069:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6073:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMiniJava.g:6074:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_55);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:6081:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6085:1: ( ( () ) )
            // InternalMiniJava.g:6086:1: ( () )
            {
            // InternalMiniJava.g:6086:1: ( () )
            // InternalMiniJava.g:6087:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:6088:2: ()
            // InternalMiniJava.g:6088:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMiniJava.g:6096:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6100:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:6101:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:6107:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6111:1: ( ( '-' ) )
            // InternalMiniJava.g:6112:1: ( '-' )
            {
            // InternalMiniJava.g:6112:1: ( '-' )
            // InternalMiniJava.g:6113:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMiniJava.g:6123:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6127:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMiniJava.g:6128:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMiniJava.g:6135:1: rule__MulOrDiv__Group__0__Impl : ( ruleArrayAccess ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6139:1: ( ( ruleArrayAccess ) )
            // InternalMiniJava.g:6140:1: ( ruleArrayAccess )
            {
            // InternalMiniJava.g:6140:1: ( ruleArrayAccess )
            // InternalMiniJava.g:6141:2: ruleArrayAccess
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0()); 
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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMiniJava.g:6150:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6154:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMiniJava.g:6155:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMiniJava.g:6161:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6165:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMiniJava.g:6166:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMiniJava.g:6166:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMiniJava.g:6167:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:6168:2: ( rule__MulOrDiv__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=56 && LA50_0<=57)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMiniJava.g:6168:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMiniJava.g:6177:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6181:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMiniJava.g:6182:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMiniJava.g:6189:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6193:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalMiniJava.g:6194:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalMiniJava.g:6194:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalMiniJava.g:6195:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalMiniJava.g:6196:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalMiniJava.g:6196:3: rule__MulOrDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMiniJava.g:6204:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6208:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalMiniJava.g:6209:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMiniJava.g:6215:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6219:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalMiniJava.g:6220:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalMiniJava.g:6220:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalMiniJava.g:6221:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniJava.g:6222:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalMiniJava.g:6222:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0"
    // InternalMiniJava.g:6231:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6235:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalMiniJava.g:6236:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_60);
            rule__MulOrDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0__Impl"
    // InternalMiniJava.g:6243:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6247:1: ( ( () ) )
            // InternalMiniJava.g:6248:1: ( () )
            {
            // InternalMiniJava.g:6248:1: ( () )
            // InternalMiniJava.g:6249:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0()); 
            }
            // InternalMiniJava.g:6250:2: ()
            // InternalMiniJava.g:6250:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1"
    // InternalMiniJava.g:6258:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6262:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalMiniJava.g:6263:2: rule__MulOrDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1__Impl"
    // InternalMiniJava.g:6269:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6273:1: ( ( '*' ) )
            // InternalMiniJava.g:6274:1: ( '*' )
            {
            // InternalMiniJava.g:6274:1: ( '*' )
            // InternalMiniJava.g:6275:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0"
    // InternalMiniJava.g:6285:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6289:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalMiniJava.g:6290:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_58);
            rule__MulOrDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0__Impl"
    // InternalMiniJava.g:6297:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6301:1: ( ( () ) )
            // InternalMiniJava.g:6302:1: ( () )
            {
            // InternalMiniJava.g:6302:1: ( () )
            // InternalMiniJava.g:6303:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0()); 
            }
            // InternalMiniJava.g:6304:2: ()
            // InternalMiniJava.g:6304:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1"
    // InternalMiniJava.g:6312:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6316:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalMiniJava.g:6317:2: rule__MulOrDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1__Impl"
    // InternalMiniJava.g:6323:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6327:1: ( ( '/' ) )
            // InternalMiniJava.g:6328:1: ( '/' )
            {
            // InternalMiniJava.g:6328:1: ( '/' )
            // InternalMiniJava.g:6329:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group__0"
    // InternalMiniJava.g:6339:1: rule__ArrayAccess__Group__0 : rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1 ;
    public final void rule__ArrayAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6343:1: ( rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1 )
            // InternalMiniJava.g:6344:2: rule__ArrayAccess__Group__0__Impl rule__ArrayAccess__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ArrayAccess__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__1();

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
    // $ANTLR end "rule__ArrayAccess__Group__0"


    // $ANTLR start "rule__ArrayAccess__Group__0__Impl"
    // InternalMiniJava.g:6351:1: rule__ArrayAccess__Group__0__Impl : ( ruleArrayLength ) ;
    public final void rule__ArrayAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6355:1: ( ( ruleArrayLength ) )
            // InternalMiniJava.g:6356:1: ( ruleArrayLength )
            {
            // InternalMiniJava.g:6356:1: ( ruleArrayLength )
            // InternalMiniJava.g:6357:2: ruleArrayLength
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0()); 
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
    // $ANTLR end "rule__ArrayAccess__Group__0__Impl"


    // $ANTLR start "rule__ArrayAccess__Group__1"
    // InternalMiniJava.g:6366:1: rule__ArrayAccess__Group__1 : rule__ArrayAccess__Group__1__Impl ;
    public final void rule__ArrayAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6370:1: ( rule__ArrayAccess__Group__1__Impl )
            // InternalMiniJava.g:6371:2: rule__ArrayAccess__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group__1__Impl();

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
    // $ANTLR end "rule__ArrayAccess__Group__1"


    // $ANTLR start "rule__ArrayAccess__Group__1__Impl"
    // InternalMiniJava.g:6377:1: rule__ArrayAccess__Group__1__Impl : ( ( rule__ArrayAccess__Group_1__0 )? ) ;
    public final void rule__ArrayAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6381:1: ( ( ( rule__ArrayAccess__Group_1__0 )? ) )
            // InternalMiniJava.g:6382:1: ( ( rule__ArrayAccess__Group_1__0 )? )
            {
            // InternalMiniJava.g:6382:1: ( ( rule__ArrayAccess__Group_1__0 )? )
            // InternalMiniJava.g:6383:2: ( rule__ArrayAccess__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:6384:2: ( rule__ArrayAccess__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMiniJava.g:6384:3: rule__ArrayAccess__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayAccess__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ArrayAccess__Group__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__0"
    // InternalMiniJava.g:6393:1: rule__ArrayAccess__Group_1__0 : rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1 ;
    public final void rule__ArrayAccess__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6397:1: ( rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1 )
            // InternalMiniJava.g:6398:2: rule__ArrayAccess__Group_1__0__Impl rule__ArrayAccess__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__ArrayAccess__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__1();

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
    // $ANTLR end "rule__ArrayAccess__Group_1__0"


    // $ANTLR start "rule__ArrayAccess__Group_1__0__Impl"
    // InternalMiniJava.g:6405:1: rule__ArrayAccess__Group_1__0__Impl : ( () ) ;
    public final void rule__ArrayAccess__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6409:1: ( ( () ) )
            // InternalMiniJava.g:6410:1: ( () )
            {
            // InternalMiniJava.g:6410:1: ( () )
            // InternalMiniJava.g:6411:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0()); 
            }
            // InternalMiniJava.g:6412:2: ()
            // InternalMiniJava.g:6412:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAccess__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__1"
    // InternalMiniJava.g:6420:1: rule__ArrayAccess__Group_1__1 : rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2 ;
    public final void rule__ArrayAccess__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6424:1: ( rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2 )
            // InternalMiniJava.g:6425:2: rule__ArrayAccess__Group_1__1__Impl rule__ArrayAccess__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__ArrayAccess__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__2();

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
    // $ANTLR end "rule__ArrayAccess__Group_1__1"


    // $ANTLR start "rule__ArrayAccess__Group_1__1__Impl"
    // InternalMiniJava.g:6432:1: rule__ArrayAccess__Group_1__1__Impl : ( '[' ) ;
    public final void rule__ArrayAccess__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6436:1: ( ( '[' ) )
            // InternalMiniJava.g:6437:1: ( '[' )
            {
            // InternalMiniJava.g:6437:1: ( '[' )
            // InternalMiniJava.g:6438:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1()); 
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
    // $ANTLR end "rule__ArrayAccess__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__2"
    // InternalMiniJava.g:6447:1: rule__ArrayAccess__Group_1__2 : rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3 ;
    public final void rule__ArrayAccess__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6451:1: ( rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3 )
            // InternalMiniJava.g:6452:2: rule__ArrayAccess__Group_1__2__Impl rule__ArrayAccess__Group_1__3
            {
            pushFollow(FOLLOW_36);
            rule__ArrayAccess__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__3();

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
    // $ANTLR end "rule__ArrayAccess__Group_1__2"


    // $ANTLR start "rule__ArrayAccess__Group_1__2__Impl"
    // InternalMiniJava.g:6459:1: rule__ArrayAccess__Group_1__2__Impl : ( ( rule__ArrayAccess__IndexAssignment_1_2 ) ) ;
    public final void rule__ArrayAccess__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6463:1: ( ( ( rule__ArrayAccess__IndexAssignment_1_2 ) ) )
            // InternalMiniJava.g:6464:1: ( ( rule__ArrayAccess__IndexAssignment_1_2 ) )
            {
            // InternalMiniJava.g:6464:1: ( ( rule__ArrayAccess__IndexAssignment_1_2 ) )
            // InternalMiniJava.g:6465:2: ( rule__ArrayAccess__IndexAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getIndexAssignment_1_2()); 
            }
            // InternalMiniJava.g:6466:2: ( rule__ArrayAccess__IndexAssignment_1_2 )
            // InternalMiniJava.g:6466:3: rule__ArrayAccess__IndexAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__IndexAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getIndexAssignment_1_2()); 
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
    // $ANTLR end "rule__ArrayAccess__Group_1__2__Impl"


    // $ANTLR start "rule__ArrayAccess__Group_1__3"
    // InternalMiniJava.g:6474:1: rule__ArrayAccess__Group_1__3 : rule__ArrayAccess__Group_1__3__Impl ;
    public final void rule__ArrayAccess__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6478:1: ( rule__ArrayAccess__Group_1__3__Impl )
            // InternalMiniJava.g:6479:2: rule__ArrayAccess__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayAccess__Group_1__3__Impl();

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
    // $ANTLR end "rule__ArrayAccess__Group_1__3"


    // $ANTLR start "rule__ArrayAccess__Group_1__3__Impl"
    // InternalMiniJava.g:6485:1: rule__ArrayAccess__Group_1__3__Impl : ( ']' ) ;
    public final void rule__ArrayAccess__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6489:1: ( ( ']' ) )
            // InternalMiniJava.g:6490:1: ( ']' )
            {
            // InternalMiniJava.g:6490:1: ( ']' )
            // InternalMiniJava.g:6491:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3()); 
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
    // $ANTLR end "rule__ArrayAccess__Group_1__3__Impl"


    // $ANTLR start "rule__ArrayLength__Group__0"
    // InternalMiniJava.g:6501:1: rule__ArrayLength__Group__0 : rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1 ;
    public final void rule__ArrayLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6505:1: ( rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1 )
            // InternalMiniJava.g:6506:2: rule__ArrayLength__Group__0__Impl rule__ArrayLength__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayLength__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__1();

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
    // $ANTLR end "rule__ArrayLength__Group__0"


    // $ANTLR start "rule__ArrayLength__Group__0__Impl"
    // InternalMiniJava.g:6513:1: rule__ArrayLength__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ArrayLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6517:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:6518:1: ( rulePrimary )
            {
            // InternalMiniJava.g:6518:1: ( rulePrimary )
            // InternalMiniJava.g:6519:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0()); 
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
    // $ANTLR end "rule__ArrayLength__Group__0__Impl"


    // $ANTLR start "rule__ArrayLength__Group__1"
    // InternalMiniJava.g:6528:1: rule__ArrayLength__Group__1 : rule__ArrayLength__Group__1__Impl ;
    public final void rule__ArrayLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6532:1: ( rule__ArrayLength__Group__1__Impl )
            // InternalMiniJava.g:6533:2: rule__ArrayLength__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group__1__Impl();

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
    // $ANTLR end "rule__ArrayLength__Group__1"


    // $ANTLR start "rule__ArrayLength__Group__1__Impl"
    // InternalMiniJava.g:6539:1: rule__ArrayLength__Group__1__Impl : ( ( rule__ArrayLength__Group_1__0 )? ) ;
    public final void rule__ArrayLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6543:1: ( ( ( rule__ArrayLength__Group_1__0 )? ) )
            // InternalMiniJava.g:6544:1: ( ( rule__ArrayLength__Group_1__0 )? )
            {
            // InternalMiniJava.g:6544:1: ( ( rule__ArrayLength__Group_1__0 )? )
            // InternalMiniJava.g:6545:2: ( rule__ArrayLength__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getGroup_1()); 
            }
            // InternalMiniJava.g:6546:2: ( rule__ArrayLength__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMiniJava.g:6546:3: rule__ArrayLength__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayLength__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ArrayLength__Group__1__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__0"
    // InternalMiniJava.g:6555:1: rule__ArrayLength__Group_1__0 : rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1 ;
    public final void rule__ArrayLength__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6559:1: ( rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1 )
            // InternalMiniJava.g:6560:2: rule__ArrayLength__Group_1__0__Impl rule__ArrayLength__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayLength__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__1();

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
    // $ANTLR end "rule__ArrayLength__Group_1__0"


    // $ANTLR start "rule__ArrayLength__Group_1__0__Impl"
    // InternalMiniJava.g:6567:1: rule__ArrayLength__Group_1__0__Impl : ( () ) ;
    public final void rule__ArrayLength__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6571:1: ( ( () ) )
            // InternalMiniJava.g:6572:1: ( () )
            {
            // InternalMiniJava.g:6572:1: ( () )
            // InternalMiniJava.g:6573:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0()); 
            }
            // InternalMiniJava.g:6574:2: ()
            // InternalMiniJava.g:6574:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLength__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__1"
    // InternalMiniJava.g:6582:1: rule__ArrayLength__Group_1__1 : rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2 ;
    public final void rule__ArrayLength__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6586:1: ( rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2 )
            // InternalMiniJava.g:6587:2: rule__ArrayLength__Group_1__1__Impl rule__ArrayLength__Group_1__2
            {
            pushFollow(FOLLOW_61);
            rule__ArrayLength__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__2();

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
    // $ANTLR end "rule__ArrayLength__Group_1__1"


    // $ANTLR start "rule__ArrayLength__Group_1__1__Impl"
    // InternalMiniJava.g:6594:1: rule__ArrayLength__Group_1__1__Impl : ( '.' ) ;
    public final void rule__ArrayLength__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6598:1: ( ( '.' ) )
            // InternalMiniJava.g:6599:1: ( '.' )
            {
            // InternalMiniJava.g:6599:1: ( '.' )
            // InternalMiniJava.g:6600:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__ArrayLength__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayLength__Group_1__2"
    // InternalMiniJava.g:6609:1: rule__ArrayLength__Group_1__2 : rule__ArrayLength__Group_1__2__Impl ;
    public final void rule__ArrayLength__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6613:1: ( rule__ArrayLength__Group_1__2__Impl )
            // InternalMiniJava.g:6614:2: rule__ArrayLength__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayLength__Group_1__2__Impl();

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
    // $ANTLR end "rule__ArrayLength__Group_1__2"


    // $ANTLR start "rule__ArrayLength__Group_1__2__Impl"
    // InternalMiniJava.g:6620:1: rule__ArrayLength__Group_1__2__Impl : ( 'length' ) ;
    public final void rule__ArrayLength__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6624:1: ( ( 'length' ) )
            // InternalMiniJava.g:6625:1: ( 'length' )
            {
            // InternalMiniJava.g:6625:1: ( 'length' )
            // InternalMiniJava.g:6626:2: 'length'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2()); 
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
    // $ANTLR end "rule__ArrayLength__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMiniJava.g:6636:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6640:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMiniJava.g:6641:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMiniJava.g:6648:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6652:1: ( ( '(' ) )
            // InternalMiniJava.g:6653:1: ( '(' )
            {
            // InternalMiniJava.g:6653:1: ( '(' )
            // InternalMiniJava.g:6654:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMiniJava.g:6663:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6667:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMiniJava.g:6668:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_32);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMiniJava.g:6675:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6679:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:6680:1: ( ruleExpression )
            {
            // InternalMiniJava.g:6680:1: ( ruleExpression )
            // InternalMiniJava.g:6681:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMiniJava.g:6690:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6694:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMiniJava.g:6695:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMiniJava.g:6701:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6705:1: ( ( ')' ) )
            // InternalMiniJava.g:6706:1: ( ')' )
            {
            // InternalMiniJava.g:6706:1: ( ')' )
            // InternalMiniJava.g:6707:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMiniJava.g:6717:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6721:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMiniJava.g:6722:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_62);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMiniJava.g:6729:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6733:1: ( ( () ) )
            // InternalMiniJava.g:6734:1: ( () )
            {
            // InternalMiniJava.g:6734:1: ( () )
            // InternalMiniJava.g:6735:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalMiniJava.g:6736:2: ()
            // InternalMiniJava.g:6736:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMiniJava.g:6744:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6748:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMiniJava.g:6749:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMiniJava.g:6756:1: rule__Primary__Group_1__1__Impl : ( ( '!' ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6760:1: ( ( ( '!' ) ) )
            // InternalMiniJava.g:6761:1: ( ( '!' ) )
            {
            // InternalMiniJava.g:6761:1: ( ( '!' ) )
            // InternalMiniJava.g:6762:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            // InternalMiniJava.g:6763:2: ( '!' )
            // InternalMiniJava.g:6763:3: '!'
            {
            match(input,59,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMiniJava.g:6771:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6775:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMiniJava.g:6776:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMiniJava.g:6782:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6786:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalMiniJava.g:6787:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalMiniJava.g:6787:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalMiniJava.g:6788:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalMiniJava.g:6789:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalMiniJava.g:6789:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMiniJava.g:6798:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6802:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMiniJava.g:6803:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_63);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMiniJava.g:6810:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6814:1: ( ( () ) )
            // InternalMiniJava.g:6815:1: ( () )
            {
            // InternalMiniJava.g:6815:1: ( () )
            // InternalMiniJava.g:6816:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNegAction_2_0()); 
            }
            // InternalMiniJava.g:6817:2: ()
            // InternalMiniJava.g:6817:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNegAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMiniJava.g:6825:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6829:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMiniJava.g:6830:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMiniJava.g:6837:1: rule__Primary__Group_2__1__Impl : ( ( '-' ) ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6841:1: ( ( ( '-' ) ) )
            // InternalMiniJava.g:6842:1: ( ( '-' ) )
            {
            // InternalMiniJava.g:6842:1: ( ( '-' ) )
            // InternalMiniJava.g:6843:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            // InternalMiniJava.g:6844:2: ( '-' )
            // InternalMiniJava.g:6844:3: '-'
            {
            match(input,55,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMiniJava.g:6852:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6856:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMiniJava.g:6857:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMiniJava.g:6863:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6867:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalMiniJava.g:6868:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalMiniJava.g:6868:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalMiniJava.g:6869:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalMiniJava.g:6870:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalMiniJava.g:6870:3: rule__Primary__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__0"
    // InternalMiniJava.g:6879:1: rule__SelectionExpression__Group__0 : rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 ;
    public final void rule__SelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6883:1: ( rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1 )
            // InternalMiniJava.g:6884:2: rule__SelectionExpression__Group__0__Impl rule__SelectionExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1();

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
    // $ANTLR end "rule__SelectionExpression__Group__0"


    // $ANTLR start "rule__SelectionExpression__Group__0__Impl"
    // InternalMiniJava.g:6891:1: rule__SelectionExpression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__SelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6895:1: ( ( ruleTerminalExpression ) )
            // InternalMiniJava.g:6896:1: ( ruleTerminalExpression )
            {
            // InternalMiniJava.g:6896:1: ( ruleTerminalExpression )
            // InternalMiniJava.g:6897:2: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__SelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group__1"
    // InternalMiniJava.g:6906:1: rule__SelectionExpression__Group__1 : rule__SelectionExpression__Group__1__Impl ;
    public final void rule__SelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6910:1: ( rule__SelectionExpression__Group__1__Impl )
            // InternalMiniJava.g:6911:2: rule__SelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SelectionExpression__Group__1"


    // $ANTLR start "rule__SelectionExpression__Group__1__Impl"
    // InternalMiniJava.g:6917:1: rule__SelectionExpression__Group__1__Impl : ( ( rule__SelectionExpression__Alternatives_1 )* ) ;
    public final void rule__SelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6921:1: ( ( ( rule__SelectionExpression__Alternatives_1 )* ) )
            // InternalMiniJava.g:6922:1: ( ( rule__SelectionExpression__Alternatives_1 )* )
            {
            // InternalMiniJava.g:6922:1: ( ( rule__SelectionExpression__Alternatives_1 )* )
            // InternalMiniJava.g:6923:2: ( rule__SelectionExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getAlternatives_1()); 
            }
            // InternalMiniJava.g:6924:2: ( rule__SelectionExpression__Alternatives_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==19) ) {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==RULE_ID) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalMiniJava.g:6924:3: rule__SelectionExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SelectionExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__0"
    // InternalMiniJava.g:6933:1: rule__SelectionExpression__Group_1_0__0 : rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1 ;
    public final void rule__SelectionExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6937:1: ( rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1 )
            // InternalMiniJava.g:6938:2: rule__SelectionExpression__Group_1_0__0__Impl rule__SelectionExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__1();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_0__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__0__Impl"
    // InternalMiniJava.g:6945:1: rule__SelectionExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SelectionExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6949:1: ( ( () ) )
            // InternalMiniJava.g:6950:1: ( () )
            {
            // InternalMiniJava.g:6950:1: ( () )
            // InternalMiniJava.g:6951:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0()); 
            }
            // InternalMiniJava.g:6952:2: ()
            // InternalMiniJava.g:6952:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__1"
    // InternalMiniJava.g:6960:1: rule__SelectionExpression__Group_1_0__1 : rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2 ;
    public final void rule__SelectionExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6964:1: ( rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2 )
            // InternalMiniJava.g:6965:2: rule__SelectionExpression__Group_1_0__1__Impl rule__SelectionExpression__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectionExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__2();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_0__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__1__Impl"
    // InternalMiniJava.g:6972:1: rule__SelectionExpression__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__SelectionExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6976:1: ( ( '.' ) )
            // InternalMiniJava.g:6977:1: ( '.' )
            {
            // InternalMiniJava.g:6977:1: ( '.' )
            // InternalMiniJava.g:6978:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__2"
    // InternalMiniJava.g:6987:1: rule__SelectionExpression__Group_1_0__2 : rule__SelectionExpression__Group_1_0__2__Impl ;
    public final void rule__SelectionExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:6991:1: ( rule__SelectionExpression__Group_1_0__2__Impl )
            // InternalMiniJava.g:6992:2: rule__SelectionExpression__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_0__2"


    // $ANTLR start "rule__SelectionExpression__Group_1_0__2__Impl"
    // InternalMiniJava.g:6998:1: rule__SelectionExpression__Group_1_0__2__Impl : ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) ) ;
    public final void rule__SelectionExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7002:1: ( ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) ) )
            // InternalMiniJava.g:7003:1: ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) )
            {
            // InternalMiniJava.g:7003:1: ( ( rule__SelectionExpression__FieldAssignment_1_0_2 ) )
            // InternalMiniJava.g:7004:2: ( rule__SelectionExpression__FieldAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldAssignment_1_0_2()); 
            }
            // InternalMiniJava.g:7005:2: ( rule__SelectionExpression__FieldAssignment_1_0_2 )
            // InternalMiniJava.g:7005:3: rule__SelectionExpression__FieldAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__FieldAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldAssignment_1_0_2()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__0"
    // InternalMiniJava.g:7014:1: rule__SelectionExpression__Group_1_1__0 : rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1 ;
    public final void rule__SelectionExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7018:1: ( rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1 )
            // InternalMiniJava.g:7019:2: rule__SelectionExpression__Group_1_1__0__Impl rule__SelectionExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectionExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__1();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__0__Impl"
    // InternalMiniJava.g:7026:1: rule__SelectionExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__SelectionExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7030:1: ( ( () ) )
            // InternalMiniJava.g:7031:1: ( () )
            {
            // InternalMiniJava.g:7031:1: ( () )
            // InternalMiniJava.g:7032:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0()); 
            }
            // InternalMiniJava.g:7033:2: ()
            // InternalMiniJava.g:7033:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__1"
    // InternalMiniJava.g:7041:1: rule__SelectionExpression__Group_1_1__1 : rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2 ;
    public final void rule__SelectionExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7045:1: ( rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2 )
            // InternalMiniJava.g:7046:2: rule__SelectionExpression__Group_1_1__1__Impl rule__SelectionExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectionExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__2();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__1__Impl"
    // InternalMiniJava.g:7053:1: rule__SelectionExpression__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__SelectionExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7057:1: ( ( '.' ) )
            // InternalMiniJava.g:7058:1: ( '.' )
            {
            // InternalMiniJava.g:7058:1: ( '.' )
            // InternalMiniJava.g:7059:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__2"
    // InternalMiniJava.g:7068:1: rule__SelectionExpression__Group_1_1__2 : rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3 ;
    public final void rule__SelectionExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7072:1: ( rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3 )
            // InternalMiniJava.g:7073:2: rule__SelectionExpression__Group_1_1__2__Impl rule__SelectionExpression__Group_1_1__3
            {
            pushFollow(FOLLOW_31);
            rule__SelectionExpression__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__3();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__2"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__2__Impl"
    // InternalMiniJava.g:7080:1: rule__SelectionExpression__Group_1_1__2__Impl : ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) ) ;
    public final void rule__SelectionExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7084:1: ( ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) ) )
            // InternalMiniJava.g:7085:1: ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) )
            {
            // InternalMiniJava.g:7085:1: ( ( rule__SelectionExpression__MethodAssignment_1_1_2 ) )
            // InternalMiniJava.g:7086:2: ( rule__SelectionExpression__MethodAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodAssignment_1_1_2()); 
            }
            // InternalMiniJava.g:7087:2: ( rule__SelectionExpression__MethodAssignment_1_1_2 )
            // InternalMiniJava.g:7087:3: rule__SelectionExpression__MethodAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__MethodAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodAssignment_1_1_2()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__3"
    // InternalMiniJava.g:7095:1: rule__SelectionExpression__Group_1_1__3 : rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4 ;
    public final void rule__SelectionExpression__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7099:1: ( rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4 )
            // InternalMiniJava.g:7100:2: rule__SelectionExpression__Group_1_1__3__Impl rule__SelectionExpression__Group_1_1__4
            {
            pushFollow(FOLLOW_64);
            rule__SelectionExpression__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__4();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__3"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__3__Impl"
    // InternalMiniJava.g:7107:1: rule__SelectionExpression__Group_1_1__3__Impl : ( '(' ) ;
    public final void rule__SelectionExpression__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7111:1: ( ( '(' ) )
            // InternalMiniJava.g:7112:1: ( '(' )
            {
            // InternalMiniJava.g:7112:1: ( '(' )
            // InternalMiniJava.g:7113:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__3__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__4"
    // InternalMiniJava.g:7122:1: rule__SelectionExpression__Group_1_1__4 : rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5 ;
    public final void rule__SelectionExpression__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7126:1: ( rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5 )
            // InternalMiniJava.g:7127:2: rule__SelectionExpression__Group_1_1__4__Impl rule__SelectionExpression__Group_1_1__5
            {
            pushFollow(FOLLOW_64);
            rule__SelectionExpression__Group_1_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__5();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__4"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__4__Impl"
    // InternalMiniJava.g:7134:1: rule__SelectionExpression__Group_1_1__4__Impl : ( ( rule__SelectionExpression__Group_1_1_4__0 )? ) ;
    public final void rule__SelectionExpression__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7138:1: ( ( ( rule__SelectionExpression__Group_1_1_4__0 )? ) )
            // InternalMiniJava.g:7139:1: ( ( rule__SelectionExpression__Group_1_1_4__0 )? )
            {
            // InternalMiniJava.g:7139:1: ( ( rule__SelectionExpression__Group_1_1_4__0 )? )
            // InternalMiniJava.g:7140:2: ( rule__SelectionExpression__Group_1_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4()); 
            }
            // InternalMiniJava.g:7141:2: ( rule__SelectionExpression__Group_1_1_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||(LA54_0>=12 && LA54_0<=13)||LA54_0==28||LA54_0==55||(LA54_0>=59 && LA54_0<=64)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMiniJava.g:7141:3: rule__SelectionExpression__Group_1_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectionExpression__Group_1_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__4__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__5"
    // InternalMiniJava.g:7149:1: rule__SelectionExpression__Group_1_1__5 : rule__SelectionExpression__Group_1_1__5__Impl ;
    public final void rule__SelectionExpression__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7153:1: ( rule__SelectionExpression__Group_1_1__5__Impl )
            // InternalMiniJava.g:7154:2: rule__SelectionExpression__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1__5__Impl();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__5"


    // $ANTLR start "rule__SelectionExpression__Group_1_1__5__Impl"
    // InternalMiniJava.g:7160:1: rule__SelectionExpression__Group_1_1__5__Impl : ( ')' ) ;
    public final void rule__SelectionExpression__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7164:1: ( ( ')' ) )
            // InternalMiniJava.g:7165:1: ( ')' )
            {
            // InternalMiniJava.g:7165:1: ( ')' )
            // InternalMiniJava.g:7166:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1__5__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__0"
    // InternalMiniJava.g:7176:1: rule__SelectionExpression__Group_1_1_4__0 : rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1 ;
    public final void rule__SelectionExpression__Group_1_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7180:1: ( rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1 )
            // InternalMiniJava.g:7181:2: rule__SelectionExpression__Group_1_1_4__0__Impl rule__SelectionExpression__Group_1_1_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SelectionExpression__Group_1_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4__1();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__0__Impl"
    // InternalMiniJava.g:7188:1: rule__SelectionExpression__Group_1_1_4__0__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) ) ;
    public final void rule__SelectionExpression__Group_1_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7192:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) ) )
            // InternalMiniJava.g:7193:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) )
            {
            // InternalMiniJava.g:7193:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 ) )
            // InternalMiniJava.g:7194:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_0()); 
            }
            // InternalMiniJava.g:7195:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_0 )
            // InternalMiniJava.g:7195:3: rule__SelectionExpression__ArgsAssignment_1_1_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_1_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_0()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__1"
    // InternalMiniJava.g:7203:1: rule__SelectionExpression__Group_1_1_4__1 : rule__SelectionExpression__Group_1_1_4__1__Impl ;
    public final void rule__SelectionExpression__Group_1_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7207:1: ( rule__SelectionExpression__Group_1_1_4__1__Impl )
            // InternalMiniJava.g:7208:2: rule__SelectionExpression__Group_1_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4__1__Impl();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4__1__Impl"
    // InternalMiniJava.g:7214:1: rule__SelectionExpression__Group_1_1_4__1__Impl : ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* ) ;
    public final void rule__SelectionExpression__Group_1_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7218:1: ( ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* ) )
            // InternalMiniJava.g:7219:1: ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* )
            {
            // InternalMiniJava.g:7219:1: ( ( rule__SelectionExpression__Group_1_1_4_1__0 )* )
            // InternalMiniJava.g:7220:2: ( rule__SelectionExpression__Group_1_1_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4_1()); 
            }
            // InternalMiniJava.g:7221:2: ( rule__SelectionExpression__Group_1_1_4_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==26) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMiniJava.g:7221:3: rule__SelectionExpression__Group_1_1_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SelectionExpression__Group_1_1_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getGroup_1_1_4_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4__1__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__0"
    // InternalMiniJava.g:7230:1: rule__SelectionExpression__Group_1_1_4_1__0 : rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1 ;
    public final void rule__SelectionExpression__Group_1_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7234:1: ( rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1 )
            // InternalMiniJava.g:7235:2: rule__SelectionExpression__Group_1_1_4_1__0__Impl rule__SelectionExpression__Group_1_1_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SelectionExpression__Group_1_1_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4_1__1();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__0"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__0__Impl"
    // InternalMiniJava.g:7242:1: rule__SelectionExpression__Group_1_1_4_1__0__Impl : ( ',' ) ;
    public final void rule__SelectionExpression__Group_1_1_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7246:1: ( ( ',' ) )
            // InternalMiniJava.g:7247:1: ( ',' )
            {
            // InternalMiniJava.g:7247:1: ( ',' )
            // InternalMiniJava.g:7248:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__0__Impl"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__1"
    // InternalMiniJava.g:7257:1: rule__SelectionExpression__Group_1_1_4_1__1 : rule__SelectionExpression__Group_1_1_4_1__1__Impl ;
    public final void rule__SelectionExpression__Group_1_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7261:1: ( rule__SelectionExpression__Group_1_1_4_1__1__Impl )
            // InternalMiniJava.g:7262:2: rule__SelectionExpression__Group_1_1_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__Group_1_1_4_1__1__Impl();

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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__1"


    // $ANTLR start "rule__SelectionExpression__Group_1_1_4_1__1__Impl"
    // InternalMiniJava.g:7268:1: rule__SelectionExpression__Group_1_1_4_1__1__Impl : ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) ) ;
    public final void rule__SelectionExpression__Group_1_1_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7272:1: ( ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) ) )
            // InternalMiniJava.g:7273:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) )
            {
            // InternalMiniJava.g:7273:1: ( ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 ) )
            // InternalMiniJava.g:7274:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_1_1()); 
            }
            // InternalMiniJava.g:7275:2: ( rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 )
            // InternalMiniJava.g:7275:3: rule__SelectionExpression__ArgsAssignment_1_1_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectionExpression__ArgsAssignment_1_1_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsAssignment_1_1_4_1_1()); 
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
    // $ANTLR end "rule__SelectionExpression__Group_1_1_4_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalMiniJava.g:7284:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7288:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalMiniJava.g:7289:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_65);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalMiniJava.g:7296:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7300:1: ( ( () ) )
            // InternalMiniJava.g:7301:1: ( () )
            {
            // InternalMiniJava.g:7301:1: ( () )
            // InternalMiniJava.g:7302:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNativeExpressionAction_0_0()); 
            }
            // InternalMiniJava.g:7303:2: ()
            // InternalMiniJava.g:7303:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNativeExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalMiniJava.g:7311:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7315:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // InternalMiniJava.g:7316:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_66);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalMiniJava.g:7323:1: rule__TerminalExpression__Group_0__1__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7327:1: ( ( '\\'\\'\\'' ) )
            // InternalMiniJava.g:7328:1: ( '\\'\\'\\'' )
            {
            // InternalMiniJava.g:7328:1: ( '\\'\\'\\'' )
            // InternalMiniJava.g:7329:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // InternalMiniJava.g:7338:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl rule__TerminalExpression__Group_0__3 ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7342:1: ( rule__TerminalExpression__Group_0__2__Impl rule__TerminalExpression__Group_0__3 )
            // InternalMiniJava.g:7343:2: rule__TerminalExpression__Group_0__2__Impl rule__TerminalExpression__Group_0__3
            {
            pushFollow(FOLLOW_65);
            rule__TerminalExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__3();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // InternalMiniJava.g:7350:1: rule__TerminalExpression__Group_0__2__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_2 ) ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7354:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_2 ) ) )
            // InternalMiniJava.g:7355:1: ( ( rule__TerminalExpression__ValueAssignment_0_2 ) )
            {
            // InternalMiniJava.g:7355:1: ( ( rule__TerminalExpression__ValueAssignment_0_2 ) )
            // InternalMiniJava.g:7356:2: ( rule__TerminalExpression__ValueAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_2()); 
            }
            // InternalMiniJava.g:7357:2: ( rule__TerminalExpression__ValueAssignment_0_2 )
            // InternalMiniJava.g:7357:3: rule__TerminalExpression__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_2()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__3"
    // InternalMiniJava.g:7365:1: rule__TerminalExpression__Group_0__3 : rule__TerminalExpression__Group_0__3__Impl ;
    public final void rule__TerminalExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7369:1: ( rule__TerminalExpression__Group_0__3__Impl )
            // InternalMiniJava.g:7370:2: rule__TerminalExpression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__3__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__3"


    // $ANTLR start "rule__TerminalExpression__Group_0__3__Impl"
    // InternalMiniJava.g:7376:1: rule__TerminalExpression__Group_0__3__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__TerminalExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7380:1: ( ( '\\'\\'\\'' ) )
            // InternalMiniJava.g:7381:1: ( '\\'\\'\\'' )
            {
            // InternalMiniJava.g:7381:1: ( '\\'\\'\\'' )
            // InternalMiniJava.g:7382:2: '\\'\\'\\''
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_3()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_0__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalMiniJava.g:7392:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7396:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalMiniJava.g:7397:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_66);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalMiniJava.g:7404:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7408:1: ( ( () ) )
            // InternalMiniJava.g:7409:1: ( () )
            {
            // InternalMiniJava.g:7409:1: ( () )
            // InternalMiniJava.g:7410:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0()); 
            }
            // InternalMiniJava.g:7411:2: ()
            // InternalMiniJava.g:7411:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalMiniJava.g:7419:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7423:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalMiniJava.g:7424:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalMiniJava.g:7430:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7434:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalMiniJava.g:7435:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalMiniJava.g:7435:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalMiniJava.g:7436:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalMiniJava.g:7437:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalMiniJava.g:7437:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalMiniJava.g:7446:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7450:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalMiniJava.g:7451:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_67);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalMiniJava.g:7458:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7462:1: ( ( () ) )
            // InternalMiniJava.g:7463:1: ( () )
            {
            // InternalMiniJava.g:7463:1: ( () )
            // InternalMiniJava.g:7464:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_2_0()); 
            }
            // InternalMiniJava.g:7465:2: ()
            // InternalMiniJava.g:7465:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalMiniJava.g:7473:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7477:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalMiniJava.g:7478:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalMiniJava.g:7484:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7488:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalMiniJava.g:7489:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalMiniJava.g:7489:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalMiniJava.g:7490:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalMiniJava.g:7491:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalMiniJava.g:7491:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalMiniJava.g:7500:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7504:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalMiniJava.g:7505:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_68);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalMiniJava.g:7512:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7516:1: ( ( () ) )
            // InternalMiniJava.g:7517:1: ( () )
            {
            // InternalMiniJava.g:7517:1: ( () )
            // InternalMiniJava.g:7518:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_3_0()); 
            }
            // InternalMiniJava.g:7519:2: ()
            // InternalMiniJava.g:7519:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalMiniJava.g:7527:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7531:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalMiniJava.g:7532:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalMiniJava.g:7538:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7542:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalMiniJava.g:7543:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalMiniJava.g:7543:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalMiniJava.g:7544:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalMiniJava.g:7545:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalMiniJava.g:7545:3: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalMiniJava.g:7554:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7558:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalMiniJava.g:7559:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_69);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalMiniJava.g:7566:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7570:1: ( ( () ) )
            // InternalMiniJava.g:7571:1: ( () )
            {
            // InternalMiniJava.g:7571:1: ( () )
            // InternalMiniJava.g:7572:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisAction_4_0()); 
            }
            // InternalMiniJava.g:7573:2: ()
            // InternalMiniJava.g:7573:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalMiniJava.g:7581:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7585:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalMiniJava.g:7586:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalMiniJava.g:7592:1: rule__TerminalExpression__Group_4__1__Impl : ( 'this' ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7596:1: ( ( 'this' ) )
            // InternalMiniJava.g:7597:1: ( 'this' )
            {
            // InternalMiniJava.g:7597:1: ( 'this' )
            // InternalMiniJava.g:7598:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisKeyword_4_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisKeyword_4_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalMiniJava.g:7608:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7612:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalMiniJava.g:7613:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_70);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalMiniJava.g:7620:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7624:1: ( ( () ) )
            // InternalMiniJava.g:7625:1: ( () )
            {
            // InternalMiniJava.g:7625:1: ( () )
            // InternalMiniJava.g:7626:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperAction_5_0()); 
            }
            // InternalMiniJava.g:7627:2: ()
            // InternalMiniJava.g:7627:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalMiniJava.g:7635:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7639:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalMiniJava.g:7640:2: rule__TerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalMiniJava.g:7646:1: rule__TerminalExpression__Group_5__1__Impl : ( 'super' ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7650:1: ( ( 'super' ) )
            // InternalMiniJava.g:7651:1: ( 'super' )
            {
            // InternalMiniJava.g:7651:1: ( 'super' )
            // InternalMiniJava.g:7652:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_5_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSuperKeyword_5_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__0"
    // InternalMiniJava.g:7662:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7666:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalMiniJava.g:7667:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_71);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_6__0"


    // $ANTLR start "rule__TerminalExpression__Group_6__0__Impl"
    // InternalMiniJava.g:7674:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7678:1: ( ( () ) )
            // InternalMiniJava.g:7679:1: ( () )
            {
            // InternalMiniJava.g:7679:1: ( () )
            // InternalMiniJava.g:7680:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullAction_6_0()); 
            }
            // InternalMiniJava.g:7681:2: ()
            // InternalMiniJava.g:7681:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalMiniJava.g:7689:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7693:1: ( rule__TerminalExpression__Group_6__1__Impl )
            // InternalMiniJava.g:7694:2: rule__TerminalExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_6__1"


    // $ANTLR start "rule__TerminalExpression__Group_6__1__Impl"
    // InternalMiniJava.g:7700:1: rule__TerminalExpression__Group_6__1__Impl : ( 'null' ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7704:1: ( ( 'null' ) )
            // InternalMiniJava.g:7705:1: ( 'null' )
            {
            // InternalMiniJava.g:7705:1: ( 'null' )
            // InternalMiniJava.g:7706:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullKeyword_6_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullKeyword_6_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__0"
    // InternalMiniJava.g:7716:1: rule__TerminalExpression__Group_7__0 : rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 ;
    public final void rule__TerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7720:1: ( rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1 )
            // InternalMiniJava.g:7721:2: rule__TerminalExpression__Group_7__0__Impl rule__TerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_72);
            rule__TerminalExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__0"


    // $ANTLR start "rule__TerminalExpression__Group_7__0__Impl"
    // InternalMiniJava.g:7728:1: rule__TerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7732:1: ( ( () ) )
            // InternalMiniJava.g:7733:1: ( () )
            {
            // InternalMiniJava.g:7733:1: ( () )
            // InternalMiniJava.g:7734:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewObjectAction_7_0()); 
            }
            // InternalMiniJava.g:7735:2: ()
            // InternalMiniJava.g:7735:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewObjectAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__1"
    // InternalMiniJava.g:7743:1: rule__TerminalExpression__Group_7__1 : rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 ;
    public final void rule__TerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7747:1: ( rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2 )
            // InternalMiniJava.g:7748:2: rule__TerminalExpression__Group_7__1__Impl rule__TerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__1"


    // $ANTLR start "rule__TerminalExpression__Group_7__1__Impl"
    // InternalMiniJava.g:7755:1: rule__TerminalExpression__Group_7__1__Impl : ( 'new' ) ;
    public final void rule__TerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7759:1: ( ( 'new' ) )
            // InternalMiniJava.g:7760:1: ( 'new' )
            {
            // InternalMiniJava.g:7760:1: ( 'new' )
            // InternalMiniJava.g:7761:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__2"
    // InternalMiniJava.g:7770:1: rule__TerminalExpression__Group_7__2 : rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 ;
    public final void rule__TerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7774:1: ( rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3 )
            // InternalMiniJava.g:7775:2: rule__TerminalExpression__Group_7__2__Impl rule__TerminalExpression__Group_7__3
            {
            pushFollow(FOLLOW_31);
            rule__TerminalExpression__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__3();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__2"


    // $ANTLR start "rule__TerminalExpression__Group_7__2__Impl"
    // InternalMiniJava.g:7782:1: rule__TerminalExpression__Group_7__2__Impl : ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) ;
    public final void rule__TerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7786:1: ( ( ( rule__TerminalExpression__TypeAssignment_7_2 ) ) )
            // InternalMiniJava.g:7787:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            {
            // InternalMiniJava.g:7787:1: ( ( rule__TerminalExpression__TypeAssignment_7_2 ) )
            // InternalMiniJava.g:7788:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }
            // InternalMiniJava.g:7789:2: ( rule__TerminalExpression__TypeAssignment_7_2 )
            // InternalMiniJava.g:7789:3: rule__TerminalExpression__TypeAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__TypeAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_7_2()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__3"
    // InternalMiniJava.g:7797:1: rule__TerminalExpression__Group_7__3 : rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 ;
    public final void rule__TerminalExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7801:1: ( rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4 )
            // InternalMiniJava.g:7802:2: rule__TerminalExpression__Group_7__3__Impl rule__TerminalExpression__Group_7__4
            {
            pushFollow(FOLLOW_64);
            rule__TerminalExpression__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__4();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__3"


    // $ANTLR start "rule__TerminalExpression__Group_7__3__Impl"
    // InternalMiniJava.g:7809:1: rule__TerminalExpression__Group_7__3__Impl : ( ( '(' ) ) ;
    public final void rule__TerminalExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7813:1: ( ( ( '(' ) ) )
            // InternalMiniJava.g:7814:1: ( ( '(' ) )
            {
            // InternalMiniJava.g:7814:1: ( ( '(' ) )
            // InternalMiniJava.g:7815:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }
            // InternalMiniJava.g:7816:2: ( '(' )
            // InternalMiniJava.g:7816:3: '('
            {
            match(input,28,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__4"
    // InternalMiniJava.g:7824:1: rule__TerminalExpression__Group_7__4 : rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5 ;
    public final void rule__TerminalExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7828:1: ( rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5 )
            // InternalMiniJava.g:7829:2: rule__TerminalExpression__Group_7__4__Impl rule__TerminalExpression__Group_7__5
            {
            pushFollow(FOLLOW_64);
            rule__TerminalExpression__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__5();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__4"


    // $ANTLR start "rule__TerminalExpression__Group_7__4__Impl"
    // InternalMiniJava.g:7836:1: rule__TerminalExpression__Group_7__4__Impl : ( ( rule__TerminalExpression__Group_7_4__0 )? ) ;
    public final void rule__TerminalExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7840:1: ( ( ( rule__TerminalExpression__Group_7_4__0 )? ) )
            // InternalMiniJava.g:7841:1: ( ( rule__TerminalExpression__Group_7_4__0 )? )
            {
            // InternalMiniJava.g:7841:1: ( ( rule__TerminalExpression__Group_7_4__0 )? )
            // InternalMiniJava.g:7842:2: ( rule__TerminalExpression__Group_7_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getGroup_7_4()); 
            }
            // InternalMiniJava.g:7843:2: ( rule__TerminalExpression__Group_7_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||(LA56_0>=12 && LA56_0<=13)||LA56_0==28||LA56_0==55||(LA56_0>=59 && LA56_0<=64)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMiniJava.g:7843:3: rule__TerminalExpression__Group_7_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_7_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getGroup_7_4()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7__4__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7__5"
    // InternalMiniJava.g:7851:1: rule__TerminalExpression__Group_7__5 : rule__TerminalExpression__Group_7__5__Impl ;
    public final void rule__TerminalExpression__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7855:1: ( rule__TerminalExpression__Group_7__5__Impl )
            // InternalMiniJava.g:7856:2: rule__TerminalExpression__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7__5__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_7__5"


    // $ANTLR start "rule__TerminalExpression__Group_7__5__Impl"
    // InternalMiniJava.g:7862:1: rule__TerminalExpression__Group_7__5__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7866:1: ( ( ')' ) )
            // InternalMiniJava.g:7867:1: ( ')' )
            {
            // InternalMiniJava.g:7867:1: ( ')' )
            // InternalMiniJava.g:7868:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_5()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7__5__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7_4__0"
    // InternalMiniJava.g:7878:1: rule__TerminalExpression__Group_7_4__0 : rule__TerminalExpression__Group_7_4__0__Impl rule__TerminalExpression__Group_7_4__1 ;
    public final void rule__TerminalExpression__Group_7_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7882:1: ( rule__TerminalExpression__Group_7_4__0__Impl rule__TerminalExpression__Group_7_4__1 )
            // InternalMiniJava.g:7883:2: rule__TerminalExpression__Group_7_4__0__Impl rule__TerminalExpression__Group_7_4__1
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_7_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7_4__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_7_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_7_4__0__Impl"
    // InternalMiniJava.g:7890:1: rule__TerminalExpression__Group_7_4__0__Impl : ( ( rule__TerminalExpression__ArgsAssignment_7_4_0 ) ) ;
    public final void rule__TerminalExpression__Group_7_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7894:1: ( ( ( rule__TerminalExpression__ArgsAssignment_7_4_0 ) ) )
            // InternalMiniJava.g:7895:1: ( ( rule__TerminalExpression__ArgsAssignment_7_4_0 ) )
            {
            // InternalMiniJava.g:7895:1: ( ( rule__TerminalExpression__ArgsAssignment_7_4_0 ) )
            // InternalMiniJava.g:7896:2: ( rule__TerminalExpression__ArgsAssignment_7_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_7_4_0()); 
            }
            // InternalMiniJava.g:7897:2: ( rule__TerminalExpression__ArgsAssignment_7_4_0 )
            // InternalMiniJava.g:7897:3: rule__TerminalExpression__ArgsAssignment_7_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ArgsAssignment_7_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_7_4_0()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7_4__1"
    // InternalMiniJava.g:7905:1: rule__TerminalExpression__Group_7_4__1 : rule__TerminalExpression__Group_7_4__1__Impl ;
    public final void rule__TerminalExpression__Group_7_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7909:1: ( rule__TerminalExpression__Group_7_4__1__Impl )
            // InternalMiniJava.g:7910:2: rule__TerminalExpression__Group_7_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7_4__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_7_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_7_4__1__Impl"
    // InternalMiniJava.g:7916:1: rule__TerminalExpression__Group_7_4__1__Impl : ( ( rule__TerminalExpression__Group_7_4_1__0 )* ) ;
    public final void rule__TerminalExpression__Group_7_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7920:1: ( ( ( rule__TerminalExpression__Group_7_4_1__0 )* ) )
            // InternalMiniJava.g:7921:1: ( ( rule__TerminalExpression__Group_7_4_1__0 )* )
            {
            // InternalMiniJava.g:7921:1: ( ( rule__TerminalExpression__Group_7_4_1__0 )* )
            // InternalMiniJava.g:7922:2: ( rule__TerminalExpression__Group_7_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getGroup_7_4_1()); 
            }
            // InternalMiniJava.g:7923:2: ( rule__TerminalExpression__Group_7_4_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==26) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMiniJava.g:7923:3: rule__TerminalExpression__Group_7_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TerminalExpression__Group_7_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getGroup_7_4_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7_4_1__0"
    // InternalMiniJava.g:7932:1: rule__TerminalExpression__Group_7_4_1__0 : rule__TerminalExpression__Group_7_4_1__0__Impl rule__TerminalExpression__Group_7_4_1__1 ;
    public final void rule__TerminalExpression__Group_7_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7936:1: ( rule__TerminalExpression__Group_7_4_1__0__Impl rule__TerminalExpression__Group_7_4_1__1 )
            // InternalMiniJava.g:7937:2: rule__TerminalExpression__Group_7_4_1__0__Impl rule__TerminalExpression__Group_7_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_7_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7_4_1__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_7_4_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_7_4_1__0__Impl"
    // InternalMiniJava.g:7944:1: rule__TerminalExpression__Group_7_4_1__0__Impl : ( ',' ) ;
    public final void rule__TerminalExpression__Group_7_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7948:1: ( ( ',' ) )
            // InternalMiniJava.g:7949:1: ( ',' )
            {
            // InternalMiniJava.g:7949:1: ( ',' )
            // InternalMiniJava.g:7950:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_7_4_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getCommaKeyword_7_4_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7_4_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_7_4_1__1"
    // InternalMiniJava.g:7959:1: rule__TerminalExpression__Group_7_4_1__1 : rule__TerminalExpression__Group_7_4_1__1__Impl ;
    public final void rule__TerminalExpression__Group_7_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7963:1: ( rule__TerminalExpression__Group_7_4_1__1__Impl )
            // InternalMiniJava.g:7964:2: rule__TerminalExpression__Group_7_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_7_4_1__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_7_4_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_7_4_1__1__Impl"
    // InternalMiniJava.g:7970:1: rule__TerminalExpression__Group_7_4_1__1__Impl : ( ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_7_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7974:1: ( ( ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 ) ) )
            // InternalMiniJava.g:7975:1: ( ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 ) )
            {
            // InternalMiniJava.g:7975:1: ( ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 ) )
            // InternalMiniJava.g:7976:2: ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_7_4_1_1()); 
            }
            // InternalMiniJava.g:7977:2: ( rule__TerminalExpression__ArgsAssignment_7_4_1_1 )
            // InternalMiniJava.g:7977:3: rule__TerminalExpression__ArgsAssignment_7_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ArgsAssignment_7_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsAssignment_7_4_1_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_7_4_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__0"
    // InternalMiniJava.g:7986:1: rule__TerminalExpression__Group_8__0 : rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 ;
    public final void rule__TerminalExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:7990:1: ( rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1 )
            // InternalMiniJava.g:7991:2: rule__TerminalExpression__Group_8__0__Impl rule__TerminalExpression__Group_8__1
            {
            pushFollow(FOLLOW_72);
            rule__TerminalExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__0"


    // $ANTLR start "rule__TerminalExpression__Group_8__0__Impl"
    // InternalMiniJava.g:7998:1: rule__TerminalExpression__Group_8__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8002:1: ( ( () ) )
            // InternalMiniJava.g:8003:1: ( () )
            {
            // InternalMiniJava.g:8003:1: ( () )
            // InternalMiniJava.g:8004:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewArrayAction_8_0()); 
            }
            // InternalMiniJava.g:8005:2: ()
            // InternalMiniJava.g:8005:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewArrayAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_8__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__1"
    // InternalMiniJava.g:8013:1: rule__TerminalExpression__Group_8__1 : rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2 ;
    public final void rule__TerminalExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8017:1: ( rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2 )
            // InternalMiniJava.g:8018:2: rule__TerminalExpression__Group_8__1__Impl rule__TerminalExpression__Group_8__2
            {
            pushFollow(FOLLOW_23);
            rule__TerminalExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__1"


    // $ANTLR start "rule__TerminalExpression__Group_8__1__Impl"
    // InternalMiniJava.g:8025:1: rule__TerminalExpression__Group_8__1__Impl : ( 'new' ) ;
    public final void rule__TerminalExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8029:1: ( ( 'new' ) )
            // InternalMiniJava.g:8030:1: ( 'new' )
            {
            // InternalMiniJava.g:8030:1: ( 'new' )
            // InternalMiniJava.g:8031:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNewKeyword_8_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNewKeyword_8_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_8__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__2"
    // InternalMiniJava.g:8040:1: rule__TerminalExpression__Group_8__2 : rule__TerminalExpression__Group_8__2__Impl rule__TerminalExpression__Group_8__3 ;
    public final void rule__TerminalExpression__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8044:1: ( rule__TerminalExpression__Group_8__2__Impl rule__TerminalExpression__Group_8__3 )
            // InternalMiniJava.g:8045:2: rule__TerminalExpression__Group_8__2__Impl rule__TerminalExpression__Group_8__3
            {
            pushFollow(FOLLOW_35);
            rule__TerminalExpression__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__3();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__2"


    // $ANTLR start "rule__TerminalExpression__Group_8__2__Impl"
    // InternalMiniJava.g:8052:1: rule__TerminalExpression__Group_8__2__Impl : ( ( rule__TerminalExpression__TypeAssignment_8_2 ) ) ;
    public final void rule__TerminalExpression__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8056:1: ( ( ( rule__TerminalExpression__TypeAssignment_8_2 ) ) )
            // InternalMiniJava.g:8057:1: ( ( rule__TerminalExpression__TypeAssignment_8_2 ) )
            {
            // InternalMiniJava.g:8057:1: ( ( rule__TerminalExpression__TypeAssignment_8_2 ) )
            // InternalMiniJava.g:8058:2: ( rule__TerminalExpression__TypeAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_8_2()); 
            }
            // InternalMiniJava.g:8059:2: ( rule__TerminalExpression__TypeAssignment_8_2 )
            // InternalMiniJava.g:8059:3: rule__TerminalExpression__TypeAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__TypeAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeAssignment_8_2()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_8__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__3"
    // InternalMiniJava.g:8067:1: rule__TerminalExpression__Group_8__3 : rule__TerminalExpression__Group_8__3__Impl rule__TerminalExpression__Group_8__4 ;
    public final void rule__TerminalExpression__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8071:1: ( rule__TerminalExpression__Group_8__3__Impl rule__TerminalExpression__Group_8__4 )
            // InternalMiniJava.g:8072:2: rule__TerminalExpression__Group_8__3__Impl rule__TerminalExpression__Group_8__4
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__4();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__3"


    // $ANTLR start "rule__TerminalExpression__Group_8__3__Impl"
    // InternalMiniJava.g:8079:1: rule__TerminalExpression__Group_8__3__Impl : ( ( '[' ) ) ;
    public final void rule__TerminalExpression__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8083:1: ( ( ( '[' ) ) )
            // InternalMiniJava.g:8084:1: ( ( '[' ) )
            {
            // InternalMiniJava.g:8084:1: ( ( '[' ) )
            // InternalMiniJava.g:8085:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_8_3()); 
            }
            // InternalMiniJava.g:8086:2: ( '[' )
            // InternalMiniJava.g:8086:3: '['
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_8_3()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_8__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__4"
    // InternalMiniJava.g:8094:1: rule__TerminalExpression__Group_8__4 : rule__TerminalExpression__Group_8__4__Impl rule__TerminalExpression__Group_8__5 ;
    public final void rule__TerminalExpression__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8098:1: ( rule__TerminalExpression__Group_8__4__Impl rule__TerminalExpression__Group_8__5 )
            // InternalMiniJava.g:8099:2: rule__TerminalExpression__Group_8__4__Impl rule__TerminalExpression__Group_8__5
            {
            pushFollow(FOLLOW_36);
            rule__TerminalExpression__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__5();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__4"


    // $ANTLR start "rule__TerminalExpression__Group_8__4__Impl"
    // InternalMiniJava.g:8106:1: rule__TerminalExpression__Group_8__4__Impl : ( ( rule__TerminalExpression__SizeAssignment_8_4 ) ) ;
    public final void rule__TerminalExpression__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8110:1: ( ( ( rule__TerminalExpression__SizeAssignment_8_4 ) ) )
            // InternalMiniJava.g:8111:1: ( ( rule__TerminalExpression__SizeAssignment_8_4 ) )
            {
            // InternalMiniJava.g:8111:1: ( ( rule__TerminalExpression__SizeAssignment_8_4 ) )
            // InternalMiniJava.g:8112:2: ( rule__TerminalExpression__SizeAssignment_8_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSizeAssignment_8_4()); 
            }
            // InternalMiniJava.g:8113:2: ( rule__TerminalExpression__SizeAssignment_8_4 )
            // InternalMiniJava.g:8113:3: rule__TerminalExpression__SizeAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__SizeAssignment_8_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSizeAssignment_8_4()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_8__4__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_8__5"
    // InternalMiniJava.g:8121:1: rule__TerminalExpression__Group_8__5 : rule__TerminalExpression__Group_8__5__Impl ;
    public final void rule__TerminalExpression__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8125:1: ( rule__TerminalExpression__Group_8__5__Impl )
            // InternalMiniJava.g:8126:2: rule__TerminalExpression__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_8__5__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_8__5"


    // $ANTLR start "rule__TerminalExpression__Group_8__5__Impl"
    // InternalMiniJava.g:8132:1: rule__TerminalExpression__Group_8__5__Impl : ( ']' ) ;
    public final void rule__TerminalExpression__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8136:1: ( ( ']' ) )
            // InternalMiniJava.g:8137:1: ( ']' )
            {
            // InternalMiniJava.g:8137:1: ( ']' )
            // InternalMiniJava.g:8138:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_8_5()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_8_5()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_8__5__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_9__0"
    // InternalMiniJava.g:8148:1: rule__TerminalExpression__Group_9__0 : rule__TerminalExpression__Group_9__0__Impl rule__TerminalExpression__Group_9__1 ;
    public final void rule__TerminalExpression__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8152:1: ( rule__TerminalExpression__Group_9__0__Impl rule__TerminalExpression__Group_9__1 )
            // InternalMiniJava.g:8153:2: rule__TerminalExpression__Group_9__0__Impl rule__TerminalExpression__Group_9__1
            {
            pushFollow(FOLLOW_25);
            rule__TerminalExpression__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_9__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_9__0"


    // $ANTLR start "rule__TerminalExpression__Group_9__0__Impl"
    // InternalMiniJava.g:8160:1: rule__TerminalExpression__Group_9__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8164:1: ( ( () ) )
            // InternalMiniJava.g:8165:1: ( () )
            {
            // InternalMiniJava.g:8165:1: ( () )
            // InternalMiniJava.g:8166:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_9_0()); 
            }
            // InternalMiniJava.g:8167:2: ()
            // InternalMiniJava.g:8167:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_9__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_9__1"
    // InternalMiniJava.g:8175:1: rule__TerminalExpression__Group_9__1 : rule__TerminalExpression__Group_9__1__Impl ;
    public final void rule__TerminalExpression__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8179:1: ( rule__TerminalExpression__Group_9__1__Impl )
            // InternalMiniJava.g:8180:2: rule__TerminalExpression__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_9__1__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_9__1"


    // $ANTLR start "rule__TerminalExpression__Group_9__1__Impl"
    // InternalMiniJava.g:8186:1: rule__TerminalExpression__Group_9__1__Impl : ( ( rule__TerminalExpression__SymbolAssignment_9_1 ) ) ;
    public final void rule__TerminalExpression__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8190:1: ( ( ( rule__TerminalExpression__SymbolAssignment_9_1 ) ) )
            // InternalMiniJava.g:8191:1: ( ( rule__TerminalExpression__SymbolAssignment_9_1 ) )
            {
            // InternalMiniJava.g:8191:1: ( ( rule__TerminalExpression__SymbolAssignment_9_1 ) )
            // InternalMiniJava.g:8192:2: ( rule__TerminalExpression__SymbolAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_9_1()); 
            }
            // InternalMiniJava.g:8193:2: ( rule__TerminalExpression__SymbolAssignment_9_1 )
            // InternalMiniJava.g:8193:3: rule__TerminalExpression__SymbolAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__SymbolAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolAssignment_9_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_9__1__Impl"


    // $ANTLR start "rule__Program__NameAssignment_0_1"
    // InternalMiniJava.g:8202:1: rule__Program__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Program__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8206:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8207:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:8207:2: ( ruleQualifiedName )
            // InternalMiniJava.g:8208:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Program__NameAssignment_0_1"


    // $ANTLR start "rule__Program__ImportsAssignment_1"
    // InternalMiniJava.g:8217:1: rule__Program__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Program__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8221:1: ( ( ruleImport ) )
            // InternalMiniJava.g:8222:2: ( ruleImport )
            {
            // InternalMiniJava.g:8222:2: ( ruleImport )
            // InternalMiniJava.g:8223:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Program__ImportsAssignment_1"


    // $ANTLR start "rule__Program__ClassesAssignment_2"
    // InternalMiniJava.g:8232:1: rule__Program__ClassesAssignment_2 : ( ruleTypeDeclaration ) ;
    public final void rule__Program__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8236:1: ( ( ruleTypeDeclaration ) )
            // InternalMiniJava.g:8237:2: ( ruleTypeDeclaration )
            {
            // InternalMiniJava.g:8237:2: ( ruleTypeDeclaration )
            // InternalMiniJava.g:8238:3: ruleTypeDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getClassesTypeDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getClassesTypeDeclarationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Program__ClassesAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMiniJava.g:8247:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8251:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava.g:8252:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava.g:8252:2: ( ruleQualifiedNameWithWildcard )
            // InternalMiniJava.g:8253:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Clazz__AccessLevelAssignment_0"
    // InternalMiniJava.g:8262:1: rule__Clazz__AccessLevelAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Clazz__AccessLevelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8266:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8267:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8267:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8268:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__Clazz__AccessLevelAssignment_0"


    // $ANTLR start "rule__Clazz__IsabstractAssignment_1"
    // InternalMiniJava.g:8277:1: rule__Clazz__IsabstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Clazz__IsabstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8281:1: ( ( ( 'abstract' ) ) )
            // InternalMiniJava.g:8282:2: ( ( 'abstract' ) )
            {
            // InternalMiniJava.g:8282:2: ( ( 'abstract' ) )
            // InternalMiniJava.g:8283:3: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0()); 
            }
            // InternalMiniJava.g:8284:3: ( 'abstract' )
            // InternalMiniJava.g:8285:4: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0()); 
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
    // $ANTLR end "rule__Clazz__IsabstractAssignment_1"


    // $ANTLR start "rule__Clazz__NameAssignment_3"
    // InternalMiniJava.g:8296:1: rule__Clazz__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Clazz__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8300:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8301:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8301:2: ( RULE_ID )
            // InternalMiniJava.g:8302:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Clazz__NameAssignment_3"


    // $ANTLR start "rule__Clazz__SuperClassAssignment_4_1"
    // InternalMiniJava.g:8311:1: rule__Clazz__SuperClassAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Clazz__SuperClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8315:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8316:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8316:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8317:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getSuperClassClazzCrossReference_4_1_0()); 
            }
            // InternalMiniJava.g:8318:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8319:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getSuperClassClazzQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getSuperClassClazzQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getSuperClassClazzCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__Clazz__SuperClassAssignment_4_1"


    // $ANTLR start "rule__Clazz__ImplementzAssignment_5_1"
    // InternalMiniJava.g:8330:1: rule__Clazz__ImplementzAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Clazz__ImplementzAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8334:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8335:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8335:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8336:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_1_0()); 
            }
            // InternalMiniJava.g:8337:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8338:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__Clazz__ImplementzAssignment_5_1"


    // $ANTLR start "rule__Clazz__ImplementzAssignment_5_2_1"
    // InternalMiniJava.g:8349:1: rule__Clazz__ImplementzAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Clazz__ImplementzAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8353:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8354:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8354:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8355:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_2_1_0()); 
            }
            // InternalMiniJava.g:8356:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8357:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getImplementzInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_2_1_0()); 
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
    // $ANTLR end "rule__Clazz__ImplementzAssignment_5_2_1"


    // $ANTLR start "rule__Clazz__MembersAssignment_7"
    // InternalMiniJava.g:8368:1: rule__Clazz__MembersAssignment_7 : ( ruleMember ) ;
    public final void rule__Clazz__MembersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8372:1: ( ( ruleMember ) )
            // InternalMiniJava.g:8373:2: ( ruleMember )
            {
            // InternalMiniJava.g:8373:2: ( ruleMember )
            // InternalMiniJava.g:8374:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClazzAccess().getMembersMemberParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClazzAccess().getMembersMemberParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Clazz__MembersAssignment_7"


    // $ANTLR start "rule__Interface__AccessLevelAssignment_0"
    // InternalMiniJava.g:8383:1: rule__Interface__AccessLevelAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Interface__AccessLevelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8387:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8388:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8388:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8389:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__Interface__AccessLevelAssignment_0"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // InternalMiniJava.g:8398:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8402:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8403:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8403:2: ( RULE_ID )
            // InternalMiniJava.g:8404:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Interface__ImplementzAssignment_3_1"
    // InternalMiniJava.g:8413:1: rule__Interface__ImplementzAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__ImplementzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8417:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8418:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8418:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8419:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_1_0()); 
            }
            // InternalMiniJava.g:8420:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8421:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__Interface__ImplementzAssignment_3_1"


    // $ANTLR start "rule__Interface__ImplementzAssignment_3_2_1"
    // InternalMiniJava.g:8432:1: rule__Interface__ImplementzAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__ImplementzAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8436:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8437:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8437:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8438:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_2_1_0()); 
            }
            // InternalMiniJava.g:8439:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8440:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getImplementzInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzInterfaceQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_2_1_0()); 
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
    // $ANTLR end "rule__Interface__ImplementzAssignment_3_2_1"


    // $ANTLR start "rule__Interface__MembersAssignment_5"
    // InternalMiniJava.g:8451:1: rule__Interface__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__Interface__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8455:1: ( ( ruleMember ) )
            // InternalMiniJava.g:8456:2: ( ruleMember )
            {
            // InternalMiniJava.g:8456:2: ( ruleMember )
            // InternalMiniJava.g:8457:3: ruleMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Interface__MembersAssignment_5"


    // $ANTLR start "rule__Method__AccessAssignment_0"
    // InternalMiniJava.g:8466:1: rule__Method__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Method__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8470:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8471:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8471:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8472:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__Method__AccessAssignment_0"


    // $ANTLR start "rule__Method__IsabstractAssignment_1"
    // InternalMiniJava.g:8481:1: rule__Method__IsabstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__Method__IsabstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8485:1: ( ( ( 'abstract' ) ) )
            // InternalMiniJava.g:8486:2: ( ( 'abstract' ) )
            {
            // InternalMiniJava.g:8486:2: ( ( 'abstract' ) )
            // InternalMiniJava.g:8487:3: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0()); 
            }
            // InternalMiniJava.g:8488:3: ( 'abstract' )
            // InternalMiniJava.g:8489:4: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0()); 
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
    // $ANTLR end "rule__Method__IsabstractAssignment_1"


    // $ANTLR start "rule__Method__IsstaticAssignment_2"
    // InternalMiniJava.g:8500:1: rule__Method__IsstaticAssignment_2 : ( ( 'static' ) ) ;
    public final void rule__Method__IsstaticAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8504:1: ( ( ( 'static' ) ) )
            // InternalMiniJava.g:8505:2: ( ( 'static' ) )
            {
            // InternalMiniJava.g:8505:2: ( ( 'static' ) )
            // InternalMiniJava.g:8506:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0()); 
            }
            // InternalMiniJava.g:8507:3: ( 'static' )
            // InternalMiniJava.g:8508:4: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0()); 
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
    // $ANTLR end "rule__Method__IsstaticAssignment_2"


    // $ANTLR start "rule__Method__TypeRefAssignment_3"
    // InternalMiniJava.g:8519:1: rule__Method__TypeRefAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Method__TypeRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8523:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8524:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8524:2: ( ruleTypeRef )
            // InternalMiniJava.g:8525:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Method__TypeRefAssignment_3"


    // $ANTLR start "rule__Method__NameAssignment_4"
    // InternalMiniJava.g:8534:1: rule__Method__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8538:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8539:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8539:2: ( RULE_ID )
            // InternalMiniJava.g:8540:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Method__NameAssignment_4"


    // $ANTLR start "rule__Method__ParamsAssignment_6_0"
    // InternalMiniJava.g:8549:1: rule__Method__ParamsAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8553:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:8554:2: ( ruleParameter )
            {
            // InternalMiniJava.g:8554:2: ( ruleParameter )
            // InternalMiniJava.g:8555:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__Method__ParamsAssignment_6_0"


    // $ANTLR start "rule__Method__ParamsAssignment_6_1_1"
    // InternalMiniJava.g:8564:1: rule__Method__ParamsAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParamsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8568:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:8569:2: ( ruleParameter )
            {
            // InternalMiniJava.g:8569:2: ( ruleParameter )
            // InternalMiniJava.g:8570:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0()); 
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
    // $ANTLR end "rule__Method__ParamsAssignment_6_1_1"


    // $ANTLR start "rule__Method__BodyAssignment_8_0"
    // InternalMiniJava.g:8579:1: rule__Method__BodyAssignment_8_0 : ( ruleBlock ) ;
    public final void rule__Method__BodyAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8583:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8584:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8584:2: ( ruleBlock )
            // InternalMiniJava.g:8585:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0()); 
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
    // $ANTLR end "rule__Method__BodyAssignment_8_0"


    // $ANTLR start "rule__Parameter__TypeRefAssignment_0"
    // InternalMiniJava.g:8594:1: rule__Parameter__TypeRefAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8598:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8599:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8599:2: ( ruleTypeRef )
            // InternalMiniJava.g:8600:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter__TypeRefAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMiniJava.g:8609:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8613:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8614:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8614:2: ( RULE_ID )
            // InternalMiniJava.g:8615:3: RULE_ID
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


    // $ANTLR start "rule__Field__AccessAssignment_0"
    // InternalMiniJava.g:8624:1: rule__Field__AccessAssignment_0 : ( ruleAccessLevel ) ;
    public final void rule__Field__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8628:1: ( ( ruleAccessLevel ) )
            // InternalMiniJava.g:8629:2: ( ruleAccessLevel )
            {
            // InternalMiniJava.g:8629:2: ( ruleAccessLevel )
            // InternalMiniJava.g:8630:3: ruleAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__Field__AccessAssignment_0"


    // $ANTLR start "rule__Field__TypeRefAssignment_1"
    // InternalMiniJava.g:8639:1: rule__Field__TypeRefAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Field__TypeRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8643:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8644:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8644:2: ( ruleTypeRef )
            // InternalMiniJava.g:8645:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field__TypeRefAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalMiniJava.g:8654:1: rule__Field__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8658:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8659:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8659:2: ( RULE_ID )
            // InternalMiniJava.g:8660:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__DefaultValueAssignment_3_1"
    // InternalMiniJava.g:8669:1: rule__Field__DefaultValueAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Field__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8673:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8674:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8674:2: ( ruleExpression )
            // InternalMiniJava.g:8675:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Field__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__Block__StatementsAssignment_2"
    // InternalMiniJava.g:8684:1: rule__Block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8688:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:8689:2: ( ruleStatement )
            {
            // InternalMiniJava.g:8689:2: ( ruleStatement )
            // InternalMiniJava.g:8690:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Block__StatementsAssignment_2"


    // $ANTLR start "rule__PrintStatement__ExpressionAssignment_6"
    // InternalMiniJava.g:8699:1: rule__PrintStatement__ExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__PrintStatement__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8703:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8704:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8704:2: ( ruleExpression )
            // InternalMiniJava.g:8705:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__PrintStatement__ExpressionAssignment_6"


    // $ANTLR start "rule__Return__ExpressionAssignment_1"
    // InternalMiniJava.g:8714:1: rule__Return__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Return__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8718:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8719:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8719:2: ( ruleExpression )
            // InternalMiniJava.g:8720:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Return__ExpressionAssignment_1"


    // $ANTLR start "rule__IfStatement__ExpressionAssignment_2"
    // InternalMiniJava.g:8729:1: rule__IfStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8733:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8734:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8734:2: ( ruleExpression )
            // InternalMiniJava.g:8735:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__IfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__IfStatement__ThenBlockAssignment_4"
    // InternalMiniJava.g:8744:1: rule__IfStatement__ThenBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8748:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8749:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8749:2: ( ruleBlock )
            // InternalMiniJava.g:8750:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__IfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseBlockAssignment_5_1"
    // InternalMiniJava.g:8759:1: rule__IfStatement__ElseBlockAssignment_5_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8763:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8764:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8764:2: ( ruleBlock )
            // InternalMiniJava.g:8765:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__IfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__WhileStatement__ConditionAssignment_2"
    // InternalMiniJava.g:8774:1: rule__WhileStatement__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8778:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8779:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8779:2: ( ruleExpression )
            // InternalMiniJava.g:8780:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__WhileStatement__ConditionAssignment_2"


    // $ANTLR start "rule__WhileStatement__BlockAssignment_4"
    // InternalMiniJava.g:8789:1: rule__WhileStatement__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileStatement__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8793:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8794:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8794:2: ( ruleBlock )
            // InternalMiniJava.g:8795:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__WhileStatement__BlockAssignment_4"


    // $ANTLR start "rule__ForStatement__DeclarationAssignment_2"
    // InternalMiniJava.g:8804:1: rule__ForStatement__DeclarationAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForStatement__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8808:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:8809:2: ( ruleAssignment )
            {
            // InternalMiniJava.g:8809:2: ( ruleAssignment )
            // InternalMiniJava.g:8810:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ForStatement__DeclarationAssignment_2"


    // $ANTLR start "rule__ForStatement__ConditionAssignment_4"
    // InternalMiniJava.g:8819:1: rule__ForStatement__ConditionAssignment_4 : ( ruleExpression ) ;
    public final void rule__ForStatement__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8823:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8824:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8824:2: ( ruleExpression )
            // InternalMiniJava.g:8825:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ForStatement__ConditionAssignment_4"


    // $ANTLR start "rule__ForStatement__ProgressionAssignment_6"
    // InternalMiniJava.g:8834:1: rule__ForStatement__ProgressionAssignment_6 : ( ruleAssignment ) ;
    public final void rule__ForStatement__ProgressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8838:1: ( ( ruleAssignment ) )
            // InternalMiniJava.g:8839:2: ( ruleAssignment )
            {
            // InternalMiniJava.g:8839:2: ( ruleAssignment )
            // InternalMiniJava.g:8840:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__ForStatement__ProgressionAssignment_6"


    // $ANTLR start "rule__ForStatement__BlockAssignment_8"
    // InternalMiniJava.g:8849:1: rule__ForStatement__BlockAssignment_8 : ( ruleBlock ) ;
    public final void rule__ForStatement__BlockAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8853:1: ( ( ruleBlock ) )
            // InternalMiniJava.g:8854:2: ( ruleBlock )
            {
            // InternalMiniJava.g:8854:2: ( ruleBlock )
            // InternalMiniJava.g:8855:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__ForStatement__BlockAssignment_8"


    // $ANTLR start "rule__ClassRef__ReferencedClassAssignment"
    // InternalMiniJava.g:8864:1: rule__ClassRef__ReferencedClassAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassRef__ReferencedClassAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8868:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:8869:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:8869:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:8870:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0()); 
            }
            // InternalMiniJava.g:8871:3: ( ruleQualifiedName )
            // InternalMiniJava.g:8872:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0()); 
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
    // $ANTLR end "rule__ClassRef__ReferencedClassAssignment"


    // $ANTLR start "rule__VariableDeclaration__TypeRefAssignment_0"
    // InternalMiniJava.g:8883:1: rule__VariableDeclaration__TypeRefAssignment_0 : ( ruleTypeRef ) ;
    public final void rule__VariableDeclaration__TypeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8887:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:8888:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:8888:2: ( ruleTypeRef )
            // InternalMiniJava.g:8889:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__TypeRefAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalMiniJava.g:8898:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8902:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:8903:2: ( RULE_ID )
            {
            // InternalMiniJava.g:8903:2: ( RULE_ID )
            // InternalMiniJava.g:8904:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Assignment__AssigneeAssignment_0"
    // InternalMiniJava.g:8913:1: rule__Assignment__AssigneeAssignment_0 : ( ruleAssignee ) ;
    public final void rule__Assignment__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8917:1: ( ( ruleAssignee ) )
            // InternalMiniJava.g:8918:2: ( ruleAssignee )
            {
            // InternalMiniJava.g:8918:2: ( ruleAssignee )
            // InternalMiniJava.g:8919:3: ruleAssignee
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignee();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Assignment__AssigneeAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalMiniJava.g:8928:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8932:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:8933:2: ( ruleExpression )
            {
            // InternalMiniJava.g:8933:2: ( ruleExpression )
            // InternalMiniJava.g:8934:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMiniJava.g:8943:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8947:1: ( ( ruleAnd ) )
            // InternalMiniJava.g:8948:2: ( ruleAnd )
            {
            // InternalMiniJava.g:8948:2: ( ruleAnd )
            // InternalMiniJava.g:8949:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMiniJava.g:8958:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8962:1: ( ( ruleEquality ) )
            // InternalMiniJava.g:8963:2: ( ruleEquality )
            {
            // InternalMiniJava.g:8963:2: ( ruleEquality )
            // InternalMiniJava.g:8964:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__RightAssignment_1_1"
    // InternalMiniJava.g:8973:1: rule__Equality__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8977:1: ( ( ruleComparison ) )
            // InternalMiniJava.g:8978:2: ( ruleComparison )
            {
            // InternalMiniJava.g:8978:2: ( ruleComparison )
            // InternalMiniJava.g:8979:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Equality__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalMiniJava.g:8988:1: rule__Comparison__RightAssignment_1_1 : ( ruleModulo ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:8992:1: ( ( ruleModulo ) )
            // InternalMiniJava.g:8993:2: ( ruleModulo )
            {
            // InternalMiniJava.g:8993:2: ( ruleModulo )
            // InternalMiniJava.g:8994:3: ruleModulo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightModuloParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightModuloParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__Modulo__RightAssignment_1_2"
    // InternalMiniJava.g:9003:1: rule__Modulo__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Modulo__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9007:1: ( ( rulePlusOrMinus ) )
            // InternalMiniJava.g:9008:2: ( rulePlusOrMinus )
            {
            // InternalMiniJava.g:9008:2: ( rulePlusOrMinus )
            // InternalMiniJava.g:9009:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Modulo__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMiniJava.g:9018:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9022:1: ( ( ruleMulOrDiv ) )
            // InternalMiniJava.g:9023:2: ( ruleMulOrDiv )
            {
            // InternalMiniJava.g:9023:2: ( ruleMulOrDiv )
            // InternalMiniJava.g:9024:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalMiniJava.g:9033:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleArrayAccess ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9037:1: ( ( ruleArrayAccess ) )
            // InternalMiniJava.g:9038:2: ( ruleArrayAccess )
            {
            // InternalMiniJava.g:9038:2: ( ruleArrayAccess )
            // InternalMiniJava.g:9039:3: ruleArrayAccess
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__ArrayAccess__IndexAssignment_1_2"
    // InternalMiniJava.g:9048:1: rule__ArrayAccess__IndexAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__ArrayAccess__IndexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9052:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9053:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9053:2: ( ruleExpression )
            // InternalMiniJava.g:9054:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ArrayAccess__IndexAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalMiniJava.g:9063:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9067:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:9068:2: ( rulePrimary )
            {
            // InternalMiniJava.g:9068:2: ( rulePrimary )
            // InternalMiniJava.g:9069:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_2_2"
    // InternalMiniJava.g:9078:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9082:1: ( ( rulePrimary ) )
            // InternalMiniJava.g:9083:2: ( rulePrimary )
            {
            // InternalMiniJava.g:9083:2: ( rulePrimary )
            // InternalMiniJava.g:9084:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Primary__ExpressionAssignment_2_2"


    // $ANTLR start "rule__SelectionExpression__FieldAssignment_1_0_2"
    // InternalMiniJava.g:9093:1: rule__SelectionExpression__FieldAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__SelectionExpression__FieldAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9097:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:9098:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:9098:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:9099:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0()); 
            }
            // InternalMiniJava.g:9100:3: ( RULE_ID )
            // InternalMiniJava.g:9101:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getFieldFieldIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldFieldIDTerminalRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0()); 
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
    // $ANTLR end "rule__SelectionExpression__FieldAssignment_1_0_2"


    // $ANTLR start "rule__SelectionExpression__MethodAssignment_1_1_2"
    // InternalMiniJava.g:9112:1: rule__SelectionExpression__MethodAssignment_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__SelectionExpression__MethodAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9116:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:9117:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:9117:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:9118:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0()); 
            }
            // InternalMiniJava.g:9119:3: ( RULE_ID )
            // InternalMiniJava.g:9120:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getMethodMethodIDTerminalRuleCall_1_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodMethodIDTerminalRuleCall_1_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0()); 
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
    // $ANTLR end "rule__SelectionExpression__MethodAssignment_1_1_2"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_1_4_0"
    // InternalMiniJava.g:9131:1: rule__SelectionExpression__ArgsAssignment_1_1_4_0 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9135:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9136:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9136:2: ( ruleExpression )
            // InternalMiniJava.g:9137:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0()); 
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
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_1_4_0"


    // $ANTLR start "rule__SelectionExpression__ArgsAssignment_1_1_4_1_1"
    // InternalMiniJava.g:9146:1: rule__SelectionExpression__ArgsAssignment_1_1_4_1_1 : ( ruleExpression ) ;
    public final void rule__SelectionExpression__ArgsAssignment_1_1_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9150:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9151:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9151:2: ( ruleExpression )
            // InternalMiniJava.g:9152:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0()); 
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
    // $ANTLR end "rule__SelectionExpression__ArgsAssignment_1_1_4_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_2"
    // InternalMiniJava.g:9161:1: rule__TerminalExpression__ValueAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9165:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:9166:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:9166:2: ( RULE_STRING )
            // InternalMiniJava.g:9167:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_2"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalMiniJava.g:9176:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9180:1: ( ( RULE_STRING ) )
            // InternalMiniJava.g:9181:2: ( RULE_STRING )
            {
            // InternalMiniJava.g:9181:2: ( RULE_STRING )
            // InternalMiniJava.g:9182:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalMiniJava.g:9191:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9195:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:9196:2: ( RULE_INT )
            {
            // InternalMiniJava.g:9196:2: ( RULE_INT )
            // InternalMiniJava.g:9197:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_3_1"
    // InternalMiniJava.g:9206:1: rule__TerminalExpression__ValueAssignment_3_1 : ( ( rule__TerminalExpression__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9210:1: ( ( ( rule__TerminalExpression__ValueAlternatives_3_1_0 ) ) )
            // InternalMiniJava.g:9211:2: ( ( rule__TerminalExpression__ValueAlternatives_3_1_0 ) )
            {
            // InternalMiniJava.g:9211:2: ( ( rule__TerminalExpression__ValueAlternatives_3_1_0 ) )
            // InternalMiniJava.g:9212:3: ( rule__TerminalExpression__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_3_1_0()); 
            }
            // InternalMiniJava.g:9213:3: ( rule__TerminalExpression__ValueAlternatives_3_1_0 )
            // InternalMiniJava.g:9213:4: rule__TerminalExpression__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__TerminalExpression__TypeAssignment_7_2"
    // InternalMiniJava.g:9221:1: rule__TerminalExpression__TypeAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__TypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9225:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:9226:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:9226:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:9227:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClazzCrossReference_7_2_0()); 
            }
            // InternalMiniJava.g:9228:3: ( RULE_ID )
            // InternalMiniJava.g:9229:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeClazzIDTerminalRuleCall_7_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClazzIDTerminalRuleCall_7_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeClazzCrossReference_7_2_0()); 
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
    // $ANTLR end "rule__TerminalExpression__TypeAssignment_7_2"


    // $ANTLR start "rule__TerminalExpression__ArgsAssignment_7_4_0"
    // InternalMiniJava.g:9240:1: rule__TerminalExpression__ArgsAssignment_7_4_0 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgsAssignment_7_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9244:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9245:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9245:2: ( ruleExpression )
            // InternalMiniJava.g:9246:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_0_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ArgsAssignment_7_4_0"


    // $ANTLR start "rule__TerminalExpression__ArgsAssignment_7_4_1_1"
    // InternalMiniJava.g:9255:1: rule__TerminalExpression__ArgsAssignment_7_4_1_1 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__ArgsAssignment_7_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9259:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9260:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9260:2: ( ruleExpression )
            // InternalMiniJava.g:9261:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_1_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ArgsAssignment_7_4_1_1"


    // $ANTLR start "rule__TerminalExpression__TypeAssignment_8_2"
    // InternalMiniJava.g:9270:1: rule__TerminalExpression__TypeAssignment_8_2 : ( ruleTypeRef ) ;
    public final void rule__TerminalExpression__TypeAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9274:1: ( ( ruleTypeRef ) )
            // InternalMiniJava.g:9275:2: ( ruleTypeRef )
            {
            // InternalMiniJava.g:9275:2: ( ruleTypeRef )
            // InternalMiniJava.g:9276:3: ruleTypeRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__TerminalExpression__TypeAssignment_8_2"


    // $ANTLR start "rule__TerminalExpression__SizeAssignment_8_4"
    // InternalMiniJava.g:9285:1: rule__TerminalExpression__SizeAssignment_8_4 : ( ruleExpression ) ;
    public final void rule__TerminalExpression__SizeAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9289:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:9290:2: ( ruleExpression )
            {
            // InternalMiniJava.g:9290:2: ( ruleExpression )
            // InternalMiniJava.g:9291:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_8_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_8_4_0()); 
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
    // $ANTLR end "rule__TerminalExpression__SizeAssignment_8_4"


    // $ANTLR start "rule__TerminalExpression__SymbolAssignment_9_1"
    // InternalMiniJava.g:9300:1: rule__TerminalExpression__SymbolAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__SymbolAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:9304:1: ( ( ( RULE_ID ) ) )
            // InternalMiniJava.g:9305:2: ( ( RULE_ID ) )
            {
            // InternalMiniJava.g:9305:2: ( ( RULE_ID ) )
            // InternalMiniJava.g:9306:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_9_1_0()); 
            }
            // InternalMiniJava.g:9307:3: ( RULE_ID )
            // InternalMiniJava.g:9308:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_9_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolIDTerminalRuleCall_9_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_9_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__SymbolAssignment_9_1"

    // $ANTLR start synpred5_InternalMiniJava
    public final void synpred5_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1118:2: ( ( ( rule__Statement__Group_1__0 ) ) )
        // InternalMiniJava.g:1118:2: ( ( rule__Statement__Group_1__0 ) )
        {
        // InternalMiniJava.g:1118:2: ( ( rule__Statement__Group_1__0 ) )
        // InternalMiniJava.g:1119:3: ( rule__Statement__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_1()); 
        }
        // InternalMiniJava.g:1120:3: ( rule__Statement__Group_1__0 )
        // InternalMiniJava.g:1120:4: rule__Statement__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Statement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMiniJava

    // $ANTLR start synpred16_InternalMiniJava
    public final void synpred16_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1229:2: ( ( ( ruleParameter ) ) )
        // InternalMiniJava.g:1229:2: ( ( ruleParameter ) )
        {
        // InternalMiniJava.g:1229:2: ( ( ruleParameter ) )
        // InternalMiniJava.g:1230:3: ( ruleParameter )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0()); 
        }
        // InternalMiniJava.g:1231:3: ( ruleParameter )
        // InternalMiniJava.g:1231:4: ruleParameter
        {
        pushFollow(FOLLOW_2);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalMiniJava

    // Delegated rules

    public final boolean synpred5_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\11\4\1\uffff\1\4\1\50\1\13\2\4\1\uffff";
    static final String dfa_3s = "\4\102\5\47\1\uffff\1\4\1\50\1\36\1\47\1\34\1\uffff";
    static final String dfa_4s = "\11\uffff\1\2\5\uffff\1\1";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\11\uffff\1\1\1\2\1\3\30\uffff\1\5\1\6\1\7\1\10\24\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\24\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\24\uffff\2\11",
            "\1\4\44\uffff\1\5\1\6\1\7\1\10\24\uffff\2\11",
            "\1\14\16\uffff\1\12\10\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11\12\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\20\uffff\1\11\1\uffff\1\17",
            "\1\14\16\uffff\1\12\10\uffff\1\11\12\uffff\1\13",
            "\1\14\27\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1065:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );";
        }
    }
    static final String dfa_7s = "\31\uffff";
    static final String dfa_8s = "\1\4\4\uffff\12\0\12\uffff";
    static final String dfa_9s = "\1\100\4\uffff\12\0\12\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\16\1\6\1\7\5\uffff\1\10\1\11\10\uffff\1\27\5\uffff\1\2\2\uffff\1\26\2\uffff\1\1\1\23\1\uffff\1\24\1\25\2\uffff\4\2\12\uffff\1\2\3\uffff\1\2\1\5\1\12\1\13\1\14\1\15",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1107:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIfStatement ) | ( ruleWhileStatement ) | ( ruleForStatement ) | ( ( rule__Statement__Group_5__0 ) ) | ( ruleBlock ) | ( ( rule__Statement__Group_7__0 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\11\uffff\1\14\3\uffff";
    static final String dfa_15s = "\6\4\1\uffff\1\4\1\50\1\13\2\4\1\uffff";
    static final String dfa_16s = "\1\102\5\47\1\uffff\1\4\1\50\1\36\1\47\1\34\1\uffff";
    static final String dfa_17s = "\6\uffff\1\2\5\uffff\1\1";
    static final String dfa_18s = "\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\11\uffff\3\6\30\uffff\1\2\1\3\1\4\1\5\24\uffff\2\6",
            "\1\11\16\uffff\1\7\10\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6\12\uffff\1\10",
            "",
            "\1\12",
            "\1\13",
            "\1\6\20\uffff\1\6\1\uffff\1\6",
            "\1\11\16\uffff\1\7\10\uffff\1\6\12\uffff\1\10",
            "\1\11\27\uffff\1\6",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1203:1: rule__TypedDeclaration__Alternatives : ( ( ruleSymbol ) | ( ruleMember ) );";
        }
    }
    static final String dfa_20s = "\7\4\1\50\1\0\2\4\2\uffff";
    static final String dfa_21s = "\1\54\5\47\1\4\1\50\1\0\1\47\1\4\2\uffff";
    static final String dfa_22s = "\13\uffff\1\1\1\2";
    static final String dfa_23s = "\10\uffff\1\0\4\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\44\uffff\1\2\1\3\1\4\1\5",
            "\1\10\16\uffff\1\6\23\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\10\42\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\16\uffff\1\6\23\uffff\1\7",
            "\1\10",
            "",
            ""
    };
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1224:1: rule__Symbol__Alternatives : ( ( ( ruleParameter ) ) | ( ruleVariableDeclaration ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalMiniJava()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\7\uffff";
    static final String dfa_26s = "\2\uffff\1\1\3\uffff\1\1";
    static final String dfa_27s = "\1\4\1\uffff\1\4\1\uffff\3\4";
    static final String dfa_28s = "\1\100\1\uffff\1\47\1\uffff\1\72\1\100\1\47";
    static final String dfa_29s = "\1\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String dfa_30s = "\7\uffff}>";
    static final String[] dfa_31s = {
            "\1\2\2\1\5\uffff\2\1\16\uffff\1\1\14\uffff\4\3\12\uffff\1\1\3\uffff\6\1",
            "",
            "\1\3\16\uffff\1\4\12\uffff\1\1\10\uffff\1\5",
            "",
            "\1\6\65\uffff\1\1",
            "\3\1\5\uffff\2\1\16\uffff\1\1\13\uffff\1\3\16\uffff\1\1\3\uffff\6\1",
            "\1\3\16\uffff\1\4\10\uffff\1\1\1\uffff\1\1\10\uffff\1\5"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1245:1: rule__Assignee__Alternatives : ( ( ( ruleArrayAccess ) ) | ( ruleVariableDeclaration ) );";
        }
    }
    static final String dfa_32s = "\1\4\7\uffff\1\4\1\uffff\1\23\2\uffff";
    static final String dfa_33s = "\1\100\7\uffff\1\54\1\uffff\1\47\2\uffff";
    static final String dfa_34s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\11\1\10";
    static final String[] dfa_35s = {
            "\1\11\1\2\1\3\5\uffff\2\4\56\uffff\1\1\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\44\uffff\4\13",
            "",
            "\1\13\10\uffff\1\14\12\uffff\1\13",
            "",
            ""
    };
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_18;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "1416:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) | ( ( rule__TerminalExpression__Group_7__0 ) ) | ( ( rule__TerminalExpression__Group_8__0 ) ) | ( ( rule__TerminalExpression__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000825C000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000821C002L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000021C000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001E000081C010L,0x0000000000000006L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001E000001C012L,0x0000000000000006L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000821C000L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001E000001C010L,0x0000000000000006L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E002001C010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001E000001C010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF880000010003070L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF8801E6C90C1F070L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF8801E6C9041F072L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF8801E001001F070L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF880000030003070L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}