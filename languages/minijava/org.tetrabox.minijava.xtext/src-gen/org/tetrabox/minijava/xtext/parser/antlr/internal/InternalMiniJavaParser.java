package org.tetrabox.minijava.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.'", "'.*'", "'abstract'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'static'", "'('", "')'", "'='", "'System'", "'out'", "'println'", "'return'", "'if'", "'else'", "'while'", "'for'", "'['", "']'", "'int'", "'boolean'", "'String'", "'void'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'%'", "'+'", "'-'", "'*'", "'/'", "'length'", "'!'", "'\\'\\'\\''", "'true'", "'false'", "'this'", "'super'", "'null'", "'new'", "'private'", "'protected'", "'public'"
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

        public InternalMiniJavaParser(TokenStream input, MiniJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MiniJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMiniJava.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMiniJava.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMiniJava.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniJava.g:72:1: ruleProgram returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleTypeDeclaration ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:78:2: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleTypeDeclaration ) )* ) )
            // InternalMiniJava.g:79:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleTypeDeclaration ) )* )
            {
            // InternalMiniJava.g:79:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleTypeDeclaration ) )* )
            // InternalMiniJava.g:80:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleTypeDeclaration ) )*
            {
            // InternalMiniJava.g:80:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:81:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPackageKeyword_0_0());
                      			
                    }
                    // InternalMiniJava.g:85:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalMiniJava.g:86:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalMiniJava.g:86:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalMiniJava.g:87:6: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMiniJava.g:109:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniJava.g:110:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalMiniJava.g:110:4: (lv_imports_3_0= ruleImport )
            	    // InternalMiniJava.g:111:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMiniJava.g:128:3: ( (lv_classes_4_0= ruleTypeDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=17)||LA3_0==23||(LA3_0>=64 && LA3_0<=66)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava.g:129:4: (lv_classes_4_0= ruleTypeDeclaration )
            	    {
            	    // InternalMiniJava.g:129:4: (lv_classes_4_0= ruleTypeDeclaration )
            	    // InternalMiniJava.g:130:5: lv_classes_4_0= ruleTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getClassesTypeDeclarationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_4_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.TypeDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava.g:151:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMiniJava.g:151:47: (iv_ruleImport= ruleImport EOF )
            // InternalMiniJava.g:152:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava.g:158:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:164:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:165:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:165:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalMiniJava.g:166:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalMiniJava.g:170:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava.g:171:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava.g:171:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMiniJava.g:172:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:197:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMiniJava.g:197:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMiniJava.g:198:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:210:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMiniJava.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMiniJava.g:211:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMiniJava.g:212:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalMiniJava.g:219:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniJava.g:220:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava.g:237:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMiniJava.g:237:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava.g:238:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava.g:244:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:250:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMiniJava.g:251:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMiniJava.g:251:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMiniJava.g:252:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:262:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:263:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMiniJava.g:273:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMiniJava.g:273:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMiniJava.g:274:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMiniJava.g:280:1: ruleTypeDeclaration returns [EObject current=null] : (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Clazz_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:286:2: ( (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface ) )
            // InternalMiniJava.g:287:2: (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface )
            {
            // InternalMiniJava.g:287:2: (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=16 && LA6_1<=17)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=16 && LA6_2<=17)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==23) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==23) ) {
                    alt6=2;
                }
                else if ( ((LA6_3>=16 && LA6_3<=17)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
            case 17:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:288:3: this_Clazz_0= ruleClazz
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeDeclarationAccess().getClazzParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Clazz_0=ruleClazz();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Clazz_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:297:3: this_Interface_1= ruleInterface
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interface_1=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interface_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleClazz"
    // InternalMiniJava.g:309:1: entryRuleClazz returns [EObject current=null] : iv_ruleClazz= ruleClazz EOF ;
    public final EObject entryRuleClazz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClazz = null;


        try {
            // InternalMiniJava.g:309:46: (iv_ruleClazz= ruleClazz EOF )
            // InternalMiniJava.g:310:2: iv_ruleClazz= ruleClazz EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClazzRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClazz=ruleClazz();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClazz; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // InternalMiniJava.g:316:1: ruleClazz returns [EObject current=null] : ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleClazz() throws RecognitionException {
        EObject current = null;

        Token lv_isabstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_accessLevel_0_0 = null;

        EObject lv_members_11_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:322:2: ( ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            // InternalMiniJava.g:323:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            {
            // InternalMiniJava.g:323:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            // InternalMiniJava.g:324:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}'
            {
            // InternalMiniJava.g:324:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=64 && LA7_0<=66)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:325:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:325:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:326:5: lv_accessLevel_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClazzAccess().getAccessLevelAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    lv_accessLevel_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClazzRule());
                      					}
                      					set(
                      						current,
                      						"accessLevel",
                      						lv_accessLevel_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:343:3: ( (lv_isabstract_1_0= 'abstract' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:344:4: (lv_isabstract_1_0= 'abstract' )
                    {
                    // InternalMiniJava.g:344:4: (lv_isabstract_1_0= 'abstract' )
                    // InternalMiniJava.g:345:5: lv_isabstract_1_0= 'abstract'
                    {
                    lv_isabstract_1_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isabstract_1_0, grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClazzRule());
                      					}
                      					setWithLastConsumed(current, "isabstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getClazzAccess().getClassKeyword_2());
              		
            }
            // InternalMiniJava.g:361:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMiniJava.g:362:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMiniJava.g:362:4: (lv_name_3_0= RULE_ID )
            // InternalMiniJava.g:363:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClazzRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava.g:379:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:380:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getClazzAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalMiniJava.g:384:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:385:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:385:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:386:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClazzRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClazzAccess().getSuperClassClazzCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMiniJava.g:401:3: (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:402:4: otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getClazzAccess().getImplementsKeyword_5_0());
                      			
                    }
                    // InternalMiniJava.g:406:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:407:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:407:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:408:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClazzRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:422:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMiniJava.g:423:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getClazzAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:427:5: ( ( ruleQualifiedName ) )
                    	    // InternalMiniJava.g:428:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalMiniJava.g:428:6: ( ruleQualifiedName )
                    	    // InternalMiniJava.g:429:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getClazzRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMiniJava.g:449:3: ( (lv_members_11_0= ruleMember ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==16||LA12_0==24||(LA12_0>=38 && LA12_0<=41)||(LA12_0>=64 && LA12_0<=66)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniJava.g:450:4: (lv_members_11_0= ruleMember )
            	    {
            	    // InternalMiniJava.g:450:4: (lv_members_11_0= ruleMember )
            	    // InternalMiniJava.g:451:5: lv_members_11_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClazzAccess().getMembersMemberParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_members_11_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClazzRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_11_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClazz"


    // $ANTLR start "entryRuleInterface"
    // InternalMiniJava.g:476:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalMiniJava.g:476:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalMiniJava.g:477:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMiniJava.g:483:1: ruleInterface returns [EObject current=null] : ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_accessLevel_0_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:489:2: ( ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            // InternalMiniJava.g:490:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            {
            // InternalMiniJava.g:490:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            // InternalMiniJava.g:491:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
            {
            // InternalMiniJava.g:491:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=64 && LA13_0<=66)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:492:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:492:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:493:5: lv_accessLevel_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_accessLevel_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      					}
                      					set(
                      						current,
                      						"accessLevel",
                      						lv_accessLevel_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
              		
            }
            // InternalMiniJava.g:514:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava.g:515:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava.g:515:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava.g:516:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava.g:532:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:533:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalMiniJava.g:537:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:538:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:538:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:539:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:553:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==20) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMiniJava.g:554:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:558:5: ( ( ruleQualifiedName ) )
                    	    // InternalMiniJava.g:559:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalMiniJava.g:559:6: ( ruleQualifiedName )
                    	    // InternalMiniJava.g:560:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInterfaceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMiniJava.g:580:3: ( (lv_members_8_0= ruleMember ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==16||LA16_0==24||(LA16_0>=38 && LA16_0<=41)||(LA16_0>=64 && LA16_0<=66)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:581:4: (lv_members_8_0= ruleMember )
            	    {
            	    // InternalMiniJava.g:581:4: (lv_members_8_0= ruleMember )
            	    // InternalMiniJava.g:582:5: lv_members_8_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_members_8_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_8_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:607:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMiniJava.g:607:47: (iv_ruleMember= ruleMember EOF )
            // InternalMiniJava.g:608:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:614:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:620:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalMiniJava.g:621:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalMiniJava.g:621:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMiniJava.g:622:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:631:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava.g:643:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMiniJava.g:643:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMiniJava.g:644:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava.g:650:1: ruleMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_isabstract_1_0=null;
        Token lv_isstatic_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_typeRef_3_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:656:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) ) )
            // InternalMiniJava.g:657:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) )
            {
            // InternalMiniJava.g:657:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) )
            // InternalMiniJava.g:658:3: ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' )
            {
            // InternalMiniJava.g:658:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=64 && LA18_0<=66)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:659:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:659:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:660:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:677:3: ( (lv_isabstract_1_0= 'abstract' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniJava.g:678:4: (lv_isabstract_1_0= 'abstract' )
                    {
                    // InternalMiniJava.g:678:4: (lv_isabstract_1_0= 'abstract' )
                    // InternalMiniJava.g:679:5: lv_isabstract_1_0= 'abstract'
                    {
                    lv_isabstract_1_0=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isabstract_1_0, grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(current, "isabstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:691:3: ( (lv_isstatic_2_0= 'static' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:692:4: (lv_isstatic_2_0= 'static' )
                    {
                    // InternalMiniJava.g:692:4: (lv_isstatic_2_0= 'static' )
                    // InternalMiniJava.g:693:5: lv_isstatic_2_0= 'static'
                    {
                    lv_isstatic_2_0=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isstatic_2_0, grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(current, "isstatic", true, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:705:3: ( (lv_typeRef_3_0= ruleTypeRef ) )
            // InternalMiniJava.g:706:4: (lv_typeRef_3_0= ruleTypeRef )
            {
            // InternalMiniJava.g:706:4: (lv_typeRef_3_0= ruleTypeRef )
            // InternalMiniJava.g:707:5: lv_typeRef_3_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_typeRef_3_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_3_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:724:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMiniJava.g:725:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMiniJava.g:725:4: (lv_name_4_0= RULE_ID )
                    // InternalMiniJava.g:726:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_4_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalMiniJava.g:746:3: ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=38 && LA23_0<=41)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:747:4: ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    {
                    // InternalMiniJava.g:747:4: ( (lv_params_6_0= ruleParameter ) )
                    // InternalMiniJava.g:748:5: (lv_params_6_0= ruleParameter )
                    {
                    // InternalMiniJava.g:748:5: (lv_params_6_0= ruleParameter )
                    // InternalMiniJava.g:749:6: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_params_6_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_6_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:766:4: (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==20) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMiniJava.g:767:5: otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava.g:771:5: ( (lv_params_8_0= ruleParameter ) )
                    	    // InternalMiniJava.g:772:6: (lv_params_8_0= ruleParameter )
                    	    {
                    	    // InternalMiniJava.g:772:6: (lv_params_8_0= ruleParameter )
                    	    // InternalMiniJava.g:773:7: lv_params_8_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_params_8_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_8_0,
                    	      								"org.tetrabox.minijava.xtext.MiniJava.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMiniJava.g:796:3: ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( (LA24_0==12) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:797:4: ( (lv_body_10_0= ruleBlock ) )
                    {
                    // InternalMiniJava.g:797:4: ( (lv_body_10_0= ruleBlock ) )
                    // InternalMiniJava.g:798:5: (lv_body_10_0= ruleBlock )
                    {
                    // InternalMiniJava.g:798:5: (lv_body_10_0= ruleBlock )
                    // InternalMiniJava.g:799:6: lv_body_10_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_10_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_10_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:817:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getSemicolonKeyword_8_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:826:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava.g:826:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava.g:827:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:833:1: ruleParameter returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:839:2: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:840:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:840:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:841:3: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:841:3: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // InternalMiniJava.g:842:4: (lv_typeRef_0_0= ruleTypeRef )
            {
            // InternalMiniJava.g:842:4: (lv_typeRef_0_0= ruleTypeRef )
            // InternalMiniJava.g:843:5: lv_typeRef_0_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_0_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:860:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:861:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:861:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:862:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleField"
    // InternalMiniJava.g:882:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMiniJava.g:882:46: (iv_ruleField= ruleField EOF )
            // InternalMiniJava.g:883:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava.g:889:1: ruleField returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_typeRef_1_0 = null;

        EObject lv_defaultValue_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:895:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalMiniJava.g:896:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalMiniJava.g:896:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalMiniJava.g:897:3: ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            // InternalMiniJava.g:897:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=64 && LA25_0<=66)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniJava.g:898:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava.g:898:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava.g:899:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFieldRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:916:3: ( (lv_typeRef_1_0= ruleTypeRef ) )
            // InternalMiniJava.g:917:4: (lv_typeRef_1_0= ruleTypeRef )
            {
            // InternalMiniJava.g:917:4: (lv_typeRef_1_0= ruleTypeRef )
            // InternalMiniJava.g:918:5: lv_typeRef_1_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_1_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:935:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava.g:936:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava.g:936:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava.g:937:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava.g:953:3: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMiniJava.g:954:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMiniJava.g:958:4: ( (lv_defaultValue_4_0= ruleExpression ) )
                    // InternalMiniJava.g:959:5: (lv_defaultValue_4_0= ruleExpression )
                    {
                    // InternalMiniJava.g:959:5: (lv_defaultValue_4_0= ruleExpression )
                    // InternalMiniJava.g:960:6: lv_defaultValue_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_defaultValue_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"defaultValue",
                      							lv_defaultValue_4_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava.g:986:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMiniJava.g:986:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMiniJava.g:987:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMiniJava.g:993:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:999:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalMiniJava.g:1000:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalMiniJava.g:1000:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalMiniJava.g:1001:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalMiniJava.g:1001:3: ()
            // InternalMiniJava.g:1002:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMiniJava.g:1012:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||LA27_0==21||LA27_0==25||LA27_0==28||(LA27_0>=31 && LA27_0<=32)||(LA27_0>=34 && LA27_0<=35)||(LA27_0>=38 && LA27_0<=41)||LA27_0==52||(LA27_0>=56 && LA27_0<=63)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMiniJava.g:1013:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1013:4: (lv_statements_2_0= ruleStatement )
            	    // InternalMiniJava.g:1014:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:1039:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava.g:1039:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava.g:1040:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:1046:1: ruleStatement returns [EObject current=null] : ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Return_0 = null;

        EObject this_Assignment_2 = null;

        EObject this_IfStatement_4 = null;

        EObject this_WhileStatement_5 = null;

        EObject this_ForStatement_6 = null;

        EObject this_PrintStatement_7 = null;

        EObject this_Block_9 = null;

        EObject this_SelectionExpression_10 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1052:2: ( ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) ) )
            // InternalMiniJava.g:1053:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )
            {
            // InternalMiniJava.g:1053:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )
            int alt28=8;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalMiniJava.g:1054:3: (this_Return_0= ruleReturn otherlv_1= ';' )
                    {
                    // InternalMiniJava.g:1054:3: (this_Return_0= ruleReturn otherlv_1= ';' )
                    // InternalMiniJava.g:1055:4: this_Return_0= ruleReturn otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Return_0=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Return_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1069:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
                    {
                    // InternalMiniJava.g:1069:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
                    // InternalMiniJava.g:1070:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';'
                    {
                    // InternalMiniJava.g:1070:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment )
                    // InternalMiniJava.g:1071:5: ( ruleAssignment )=>this_Assignment_2= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_Assignment_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1087:3: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1096:3: this_WhileStatement_5= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_5=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1105:3: this_ForStatement_6= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_6=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1114:3: (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' )
                    {
                    // InternalMiniJava.g:1114:3: (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' )
                    // InternalMiniJava.g:1115:4: this_PrintStatement_7= rulePrintStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_PrintStatement_7=rulePrintStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrintStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1129:3: this_Block_9= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_9=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1138:3: (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' )
                    {
                    // InternalMiniJava.g:1138:3: (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' )
                    // InternalMiniJava.g:1139:4: this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_SelectionExpression_10=ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SelectionExpression_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalMiniJava.g:1156:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalMiniJava.g:1156:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalMiniJava.g:1157:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalMiniJava.g:1163:1: rulePrintStatement returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1169:2: ( (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMiniJava.g:1170:2: (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMiniJava.g:1170:2: (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMiniJava.g:1171:3: otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintStatementAccess().getSystemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getFullStopKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintStatementAccess().getOutKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,14,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPrintStatementAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalMiniJava.g:1195:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalMiniJava.g:1196:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalMiniJava.g:1196:4: (lv_expression_6_0= ruleExpression )
            // InternalMiniJava.g:1197:5: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_expression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_6_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava.g:1222:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalMiniJava.g:1222:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalMiniJava.g:1223:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava.g:1229:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1235:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMiniJava.g:1236:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMiniJava.g:1236:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMiniJava.g:1237:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalMiniJava.g:1241:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMiniJava.g:1242:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMiniJava.g:1242:4: (lv_expression_1_0= ruleExpression )
            // InternalMiniJava.g:1243:5: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava.g:1264:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMiniJava.g:1264:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMiniJava.g:1265:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava.g:1271:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1277:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) )
            // InternalMiniJava.g:1278:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            {
            // InternalMiniJava.g:1278:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            // InternalMiniJava.g:1279:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:1287:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniJava.g:1288:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniJava.g:1288:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniJava.g:1289:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMiniJava.g:1310:3: ( (lv_thenBlock_4_0= ruleBlock ) )
            // InternalMiniJava.g:1311:4: (lv_thenBlock_4_0= ruleBlock )
            {
            // InternalMiniJava.g:1311:4: (lv_thenBlock_4_0= ruleBlock )
            // InternalMiniJava.g:1312:5: lv_thenBlock_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_thenBlock_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:1329:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) && (synpred2_InternalMiniJava())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMiniJava.g:1330:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    // InternalMiniJava.g:1330:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMiniJava.g:1331:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalMiniJava.g:1337:4: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // InternalMiniJava.g:1338:5: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // InternalMiniJava.g:1338:5: (lv_elseBlock_6_0= ruleBlock )
                    // InternalMiniJava.g:1339:6: lv_elseBlock_6_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMiniJava.g:1361:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalMiniJava.g:1361:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMiniJava.g:1362:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMiniJava.g:1368:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1374:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // InternalMiniJava.g:1375:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // InternalMiniJava.g:1375:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // InternalMiniJava.g:1376:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:1384:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMiniJava.g:1385:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMiniJava.g:1385:4: (lv_condition_2_0= ruleExpression )
            // InternalMiniJava.g:1386:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMiniJava.g:1407:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalMiniJava.g:1408:4: (lv_block_4_0= ruleBlock )
            {
            // InternalMiniJava.g:1408:4: (lv_block_4_0= ruleBlock )
            // InternalMiniJava.g:1409:5: lv_block_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMiniJava.g:1430:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMiniJava.g:1430:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMiniJava.g:1431:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMiniJava.g:1437:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declaration_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_progression_6_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1443:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalMiniJava.g:1444:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalMiniJava.g:1444:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalMiniJava.g:1445:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava.g:1453:3: ( (lv_declaration_2_0= ruleAssignment ) )
            // InternalMiniJava.g:1454:4: (lv_declaration_2_0= ruleAssignment )
            {
            // InternalMiniJava.g:1454:4: (lv_declaration_2_0= ruleAssignment )
            // InternalMiniJava.g:1455:5: lv_declaration_2_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_declaration_2_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"declaration",
              						lv_declaration_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              		
            }
            // InternalMiniJava.g:1476:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalMiniJava.g:1477:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalMiniJava.g:1477:4: (lv_condition_4_0= ruleExpression )
            // InternalMiniJava.g:1478:5: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalMiniJava.g:1499:3: ( (lv_progression_6_0= ruleAssignment ) )
            // InternalMiniJava.g:1500:4: (lv_progression_6_0= ruleAssignment )
            {
            // InternalMiniJava.g:1500:4: (lv_progression_6_0= ruleAssignment )
            // InternalMiniJava.g:1501:5: lv_progression_6_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_progression_6_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"progression",
              						lv_progression_6_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMiniJava.g:1522:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalMiniJava.g:1523:4: (lv_block_8_0= ruleBlock )
            {
            // InternalMiniJava.g:1523:4: (lv_block_8_0= ruleBlock )
            // InternalMiniJava.g:1524:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleTypeRef"
    // InternalMiniJava.g:1545:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalMiniJava.g:1545:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalMiniJava.g:1546:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalMiniJava.g:1552:1: ruleTypeRef returns [EObject current=null] : (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleTypeRef_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1558:2: ( (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? ) )
            // InternalMiniJava.g:1559:2: (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? )
            {
            // InternalMiniJava.g:1559:2: (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? )
            // InternalMiniJava.g:1560:3: this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_SingleTypeRef_0=ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SingleTypeRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:1568:3: ( () otherlv_2= '[' otherlv_3= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==37) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMiniJava.g:1569:4: () otherlv_2= '[' otherlv_3= ']'
                    {
                    // InternalMiniJava.g:1569:4: ()
                    // InternalMiniJava.g:1570:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleSingleTypeRef"
    // InternalMiniJava.g:1589:1: entryRuleSingleTypeRef returns [EObject current=null] : iv_ruleSingleTypeRef= ruleSingleTypeRef EOF ;
    public final EObject entryRuleSingleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTypeRef = null;


        try {
            // InternalMiniJava.g:1589:54: (iv_ruleSingleTypeRef= ruleSingleTypeRef EOF )
            // InternalMiniJava.g:1590:2: iv_ruleSingleTypeRef= ruleSingleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleTypeRef=ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleTypeRef"


    // $ANTLR start "ruleSingleTypeRef"
    // InternalMiniJava.g:1596:1: ruleSingleTypeRef returns [EObject current=null] : (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) ) ;
    public final EObject ruleSingleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_ClassRef_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1602:2: ( (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) ) )
            // InternalMiniJava.g:1603:2: (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) )
            {
            // InternalMiniJava.g:1603:2: (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt31=1;
                }
                break;
            case 38:
                {
                alt31=2;
                }
                break;
            case 39:
                {
                alt31=3;
                }
                break;
            case 40:
                {
                alt31=4;
                }
                break;
            case 41:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMiniJava.g:1604:3: this_ClassRef_0= ruleClassRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassRef_0=ruleClassRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1613:3: ( () otherlv_2= 'int' )
                    {
                    // InternalMiniJava.g:1613:3: ( () otherlv_2= 'int' )
                    // InternalMiniJava.g:1614:4: () otherlv_2= 'int'
                    {
                    // InternalMiniJava.g:1614:4: ()
                    // InternalMiniJava.g:1615:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1627:3: ( () otherlv_4= 'boolean' )
                    {
                    // InternalMiniJava.g:1627:3: ( () otherlv_4= 'boolean' )
                    // InternalMiniJava.g:1628:4: () otherlv_4= 'boolean'
                    {
                    // InternalMiniJava.g:1628:4: ()
                    // InternalMiniJava.g:1629:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1641:3: ( () otherlv_6= 'String' )
                    {
                    // InternalMiniJava.g:1641:3: ( () otherlv_6= 'String' )
                    // InternalMiniJava.g:1642:4: () otherlv_6= 'String'
                    {
                    // InternalMiniJava.g:1642:4: ()
                    // InternalMiniJava.g:1643:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1655:3: ( () otherlv_8= 'void' )
                    {
                    // InternalMiniJava.g:1655:3: ( () otherlv_8= 'void' )
                    // InternalMiniJava.g:1656:4: () otherlv_8= 'void'
                    {
                    // InternalMiniJava.g:1656:4: ()
                    // InternalMiniJava.g:1657:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleTypeRef"


    // $ANTLR start "entryRuleClassRef"
    // InternalMiniJava.g:1672:1: entryRuleClassRef returns [EObject current=null] : iv_ruleClassRef= ruleClassRef EOF ;
    public final EObject entryRuleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRef = null;


        try {
            // InternalMiniJava.g:1672:49: (iv_ruleClassRef= ruleClassRef EOF )
            // InternalMiniJava.g:1673:2: iv_ruleClassRef= ruleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassRef=ruleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalMiniJava.g:1679:1: ruleClassRef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleClassRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMiniJava.g:1685:2: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:1686:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:1686:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:1687:3: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:1687:3: ( ruleQualifiedName )
            // InternalMiniJava.g:1688:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getClassRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleTypedDeclaration"
    // InternalMiniJava.g:1705:1: entryRuleTypedDeclaration returns [EObject current=null] : iv_ruleTypedDeclaration= ruleTypedDeclaration EOF ;
    public final EObject entryRuleTypedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedDeclaration = null;


        try {
            // InternalMiniJava.g:1705:57: (iv_ruleTypedDeclaration= ruleTypedDeclaration EOF )
            // InternalMiniJava.g:1706:2: iv_ruleTypedDeclaration= ruleTypedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedDeclaration=ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedDeclaration"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava.g:1712:1: ruleTypedDeclaration returns [EObject current=null] : (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember ) ;
    public final EObject ruleTypedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Symbol_0 = null;

        EObject this_Member_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1718:2: ( (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember ) )
            // InternalMiniJava.g:1719:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )
            {
            // InternalMiniJava.g:1719:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalMiniJava.g:1720:3: this_Symbol_0= ruleSymbol
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Symbol_0=ruleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Symbol_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1729:3: this_Member_1= ruleMember
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Member_1=ruleMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Member_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava.g:1741:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalMiniJava.g:1741:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalMiniJava.g:1742:2: iv_ruleSymbol= ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava.g:1748:1: ruleSymbol returns [EObject current=null] : ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_VariableDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1754:2: ( ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // InternalMiniJava.g:1755:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // InternalMiniJava.g:1755:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalMiniJava.g:1756:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
                    {
                    // InternalMiniJava.g:1756:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
                    // InternalMiniJava.g:1757:4: ( ruleParameter )=>this_Parameter_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Parameter_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1768:3: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava.g:1780:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMiniJava.g:1780:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMiniJava.g:1781:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava.g:1787:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1793:2: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava.g:1794:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava.g:1794:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava.g:1795:3: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava.g:1795:3: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // InternalMiniJava.g:1796:4: (lv_typeRef_0_0= ruleTypeRef )
            {
            // InternalMiniJava.g:1796:4: (lv_typeRef_0_0= ruleTypeRef )
            // InternalMiniJava.g:1797:5: lv_typeRef_0_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_0_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava.g:1814:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:1815:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:1815:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:1816:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava.g:1836:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMiniJava.g:1836:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMiniJava.g:1837:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava.g:1843:1: ruleAssignment returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1849:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalMiniJava.g:1850:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalMiniJava.g:1850:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalMiniJava.g:1851:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalMiniJava.g:1851:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalMiniJava.g:1852:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalMiniJava.g:1852:4: (lv_assignee_0_0= ruleAssignee )
            // InternalMiniJava.g:1853:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_assignee_0_0=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"assignee",
              						lv_assignee_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignee");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMiniJava.g:1874:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalMiniJava.g:1875:4: (lv_value_2_0= ruleExpression )
            {
            // InternalMiniJava.g:1875:4: (lv_value_2_0= ruleExpression )
            // InternalMiniJava.g:1876:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignee"
    // InternalMiniJava.g:1897:1: entryRuleAssignee returns [EObject current=null] : iv_ruleAssignee= ruleAssignee EOF ;
    public final EObject entryRuleAssignee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignee = null;


        try {
            // InternalMiniJava.g:1897:49: (iv_ruleAssignee= ruleAssignee EOF )
            // InternalMiniJava.g:1898:2: iv_ruleAssignee= ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignee=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignee; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalMiniJava.g:1904:1: ruleAssignee returns [EObject current=null] : ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleAssignee() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayAccess_0 = null;

        EObject this_VariableDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1910:2: ( ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // InternalMiniJava.g:1911:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // InternalMiniJava.g:1911:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalMiniJava.g:1912:3: ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess )
                    {
                    // InternalMiniJava.g:1912:3: ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess )
                    // InternalMiniJava.g:1913:4: ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayAccess_0=ruleArrayAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArrayAccess_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1924:3: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:1936:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:1936:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:1937:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:1943:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1949:2: (this_Or_0= ruleOr )
            // InternalMiniJava.g:1950:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMiniJava.g:1961:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMiniJava.g:1961:43: (iv_ruleOr= ruleOr EOF )
            // InternalMiniJava.g:1962:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMiniJava.g:1968:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1974:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMiniJava.g:1975:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMiniJava.g:1975:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMiniJava.g:1976:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:1984:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMiniJava.g:1985:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMiniJava.g:1985:4: ()
            	    // InternalMiniJava.g:1986:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:1996:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMiniJava.g:1997:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMiniJava.g:1997:5: (lv_right_3_0= ruleAnd )
            	    // InternalMiniJava.g:1998:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMiniJava.g:2020:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMiniJava.g:2020:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMiniJava.g:2021:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMiniJava.g:2027:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2033:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMiniJava.g:2034:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMiniJava.g:2034:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMiniJava.g:2035:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2043:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==43) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMiniJava.g:2044:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMiniJava.g:2044:4: ()
            	    // InternalMiniJava.g:2045:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:2055:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMiniJava.g:2056:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMiniJava.g:2056:5: (lv_right_3_0= ruleEquality )
            	    // InternalMiniJava.g:2057:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMiniJava.g:2079:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMiniJava.g:2079:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMiniJava.g:2080:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniJava.g:2086:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2092:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalMiniJava.g:2093:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalMiniJava.g:2093:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalMiniJava.g:2094:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2102:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=44 && LA38_0<=45)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMiniJava.g:2103:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalMiniJava.g:2103:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==44) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==45) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalMiniJava.g:2104:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalMiniJava.g:2104:5: ( () otherlv_2= '==' )
            	            // InternalMiniJava.g:2105:6: () otherlv_2= '=='
            	            {
            	            // InternalMiniJava.g:2105:6: ()
            	            // InternalMiniJava.g:2106:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,44,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:2118:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalMiniJava.g:2118:5: ( () otherlv_4= '!=' )
            	            // InternalMiniJava.g:2119:6: () otherlv_4= '!='
            	            {
            	            // InternalMiniJava.g:2119:6: ()
            	            // InternalMiniJava.g:2120:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,45,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava.g:2132:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalMiniJava.g:2133:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalMiniJava.g:2133:5: (lv_right_5_0= ruleComparison )
            	    // InternalMiniJava.g:2134:6: lv_right_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_5_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniJava.g:2156:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMiniJava.g:2156:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMiniJava.g:2157:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniJava.g:2163:1: ruleComparison returns [EObject current=null] : (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Modulo_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2169:2: ( (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* ) )
            // InternalMiniJava.g:2170:2: (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* )
            {
            // InternalMiniJava.g:2170:2: (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* )
            // InternalMiniJava.g:2171:3: this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getModuloParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Modulo_0=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Modulo_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2179:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=46 && LA40_0<=49)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMiniJava.g:2180:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) )
            	    {
            	    // InternalMiniJava.g:2180:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // InternalMiniJava.g:2181:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalMiniJava.g:2181:5: ( () otherlv_2= '>=' )
            	            // InternalMiniJava.g:2182:6: () otherlv_2= '>='
            	            {
            	            // InternalMiniJava.g:2182:6: ()
            	            // InternalMiniJava.g:2183:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,46,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:2195:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalMiniJava.g:2195:5: ( () otherlv_4= '<=' )
            	            // InternalMiniJava.g:2196:6: () otherlv_4= '<='
            	            {
            	            // InternalMiniJava.g:2196:6: ()
            	            // InternalMiniJava.g:2197:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,47,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMiniJava.g:2209:5: ( () otherlv_6= '>' )
            	            {
            	            // InternalMiniJava.g:2209:5: ( () otherlv_6= '>' )
            	            // InternalMiniJava.g:2210:6: () otherlv_6= '>'
            	            {
            	            // InternalMiniJava.g:2210:6: ()
            	            // InternalMiniJava.g:2211:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,48,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalMiniJava.g:2223:5: ( () otherlv_8= '<' )
            	            {
            	            // InternalMiniJava.g:2223:5: ( () otherlv_8= '<' )
            	            // InternalMiniJava.g:2224:6: () otherlv_8= '<'
            	            {
            	            // InternalMiniJava.g:2224:6: ()
            	            // InternalMiniJava.g:2225:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_8=(Token)match(input,49,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava.g:2237:4: ( (lv_right_9_0= ruleModulo ) )
            	    // InternalMiniJava.g:2238:5: (lv_right_9_0= ruleModulo )
            	    {
            	    // InternalMiniJava.g:2238:5: (lv_right_9_0= ruleModulo )
            	    // InternalMiniJava.g:2239:6: lv_right_9_0= ruleModulo
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightModuloParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_9_0=ruleModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_9_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Modulo");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleModulo"
    // InternalMiniJava.g:2261:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalMiniJava.g:2261:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalMiniJava.g:2262:2: iv_ruleModulo= ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMiniJava.g:2268:1: ruleModulo returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2274:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMiniJava.g:2275:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMiniJava.g:2275:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMiniJava.g:2276:3: this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuloAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2284:3: ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMiniJava.g:2285:4: () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMiniJava.g:2285:4: ()
            	    // InternalMiniJava.g:2286:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuloAccess().getModuloLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getPercentSignKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava.g:2296:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMiniJava.g:2297:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMiniJava.g:2297:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMiniJava.g:2298:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuloAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModuloRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniJava.g:2320:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMiniJava.g:2320:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMiniJava.g:2321:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniJava.g:2327:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2333:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMiniJava.g:2334:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMiniJava.g:2334:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMiniJava.g:2335:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2343:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=51 && LA43_0<=52)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMiniJava.g:2344:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMiniJava.g:2344:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==51) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==52) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalMiniJava.g:2345:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMiniJava.g:2345:5: ( () otherlv_2= '+' )
            	            // InternalMiniJava.g:2346:6: () otherlv_2= '+'
            	            {
            	            // InternalMiniJava.g:2346:6: ()
            	            // InternalMiniJava.g:2347:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:2359:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMiniJava.g:2359:5: ( () otherlv_4= '-' )
            	            // InternalMiniJava.g:2360:6: () otherlv_4= '-'
            	            {
            	            // InternalMiniJava.g:2360:6: ()
            	            // InternalMiniJava.g:2361:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava.g:2373:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMiniJava.g:2374:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMiniJava.g:2374:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMiniJava.g:2375:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniJava.g:2397:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMiniJava.g:2397:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMiniJava.g:2398:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniJava.g:2404:1: ruleMulOrDiv returns [EObject current=null] : (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ArrayAccess_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2410:2: ( (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* ) )
            // InternalMiniJava.g:2411:2: (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* )
            {
            // InternalMiniJava.g:2411:2: (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* )
            // InternalMiniJava.g:2412:3: this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_ArrayAccess_0=ruleArrayAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArrayAccess_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2420:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=53 && LA45_0<=54)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMiniJava.g:2421:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) )
            	    {
            	    // InternalMiniJava.g:2421:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==53) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==54) ) {
            	        alt44=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalMiniJava.g:2422:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMiniJava.g:2422:5: ( () otherlv_2= '*' )
            	            // InternalMiniJava.g:2423:6: () otherlv_2= '*'
            	            {
            	            // InternalMiniJava.g:2423:6: ()
            	            // InternalMiniJava.g:2424:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava.g:2436:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMiniJava.g:2436:5: ( () otherlv_4= '/' )
            	            // InternalMiniJava.g:2437:6: () otherlv_4= '/'
            	            {
            	            // InternalMiniJava.g:2437:6: ()
            	            // InternalMiniJava.g:2438:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava.g:2450:4: ( (lv_right_5_0= ruleArrayAccess ) )
            	    // InternalMiniJava.g:2451:5: (lv_right_5_0= ruleArrayAccess )
            	    {
            	    // InternalMiniJava.g:2451:5: (lv_right_5_0= ruleArrayAccess )
            	    // InternalMiniJava.g:2452:6: lv_right_5_0= ruleArrayAccess
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_5_0=ruleArrayAccess();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.ArrayAccess");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleArrayAccess"
    // InternalMiniJava.g:2474:1: entryRuleArrayAccess returns [EObject current=null] : iv_ruleArrayAccess= ruleArrayAccess EOF ;
    public final EObject entryRuleArrayAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAccess = null;


        try {
            // InternalMiniJava.g:2474:52: (iv_ruleArrayAccess= ruleArrayAccess EOF )
            // InternalMiniJava.g:2475:2: iv_ruleArrayAccess= ruleArrayAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayAccess=ruleArrayAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayAccess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayAccess"


    // $ANTLR start "ruleArrayAccess"
    // InternalMiniJava.g:2481:1: ruleArrayAccess returns [EObject current=null] : (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleArrayAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ArrayLength_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2487:2: ( (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) )
            // InternalMiniJava.g:2488:2: (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            {
            // InternalMiniJava.g:2488:2: (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            // InternalMiniJava.g:2489:3: this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_ArrayLength_0=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArrayLength_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2497:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMiniJava.g:2498:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalMiniJava.g:2498:4: ()
                    // InternalMiniJava.g:2499:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalMiniJava.g:2509:4: ( (lv_index_3_0= ruleExpression ) )
                    // InternalMiniJava.g:2510:5: (lv_index_3_0= ruleExpression )
                    {
                    // InternalMiniJava.g:2510:5: (lv_index_3_0= ruleExpression )
                    // InternalMiniJava.g:2511:6: lv_index_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_index_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayAccessRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayAccess"


    // $ANTLR start "entryRuleArrayLength"
    // InternalMiniJava.g:2537:1: entryRuleArrayLength returns [EObject current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final EObject entryRuleArrayLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLength = null;


        try {
            // InternalMiniJava.g:2537:52: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalMiniJava.g:2538:2: iv_ruleArrayLength= ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLength=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLength; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalMiniJava.g:2544:1: ruleArrayLength returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? ) ;
    public final EObject ruleArrayLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2550:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? ) )
            // InternalMiniJava.g:2551:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? )
            {
            // InternalMiniJava.g:2551:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? )
            // InternalMiniJava.g:2552:3: this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2560:3: ( () otherlv_2= '.' otherlv_3= 'length' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMiniJava.g:2561:4: () otherlv_2= '.' otherlv_3= 'length'
                    {
                    // InternalMiniJava.g:2561:4: ()
                    // InternalMiniJava.g:2562:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava.g:2581:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMiniJava.g:2581:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMiniJava.g:2582:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava.g:2588:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject this_SelectionExpression_9 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2594:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression ) )
            // InternalMiniJava.g:2595:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression )
            {
            // InternalMiniJava.g:2595:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt48=1;
                }
                break;
            case 56:
                {
                alt48=2;
                }
                break;
            case 52:
                {
                alt48=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt48=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalMiniJava.g:2596:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMiniJava.g:2596:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMiniJava.g:2597:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2615:3: ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalMiniJava.g:2615:3: ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalMiniJava.g:2616:4: () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalMiniJava.g:2616:4: ()
                    // InternalMiniJava.g:2617:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:2623:4: ( ( '!' )=>otherlv_4= '!' )
                    // InternalMiniJava.g:2624:5: ( '!' )=>otherlv_4= '!'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      				
                    }

                    }

                    // InternalMiniJava.g:2630:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalMiniJava.g:2631:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalMiniJava.g:2631:5: (lv_expression_5_0= rulePrimary )
                    // InternalMiniJava.g:2632:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:2651:3: ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalMiniJava.g:2651:3: ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalMiniJava.g:2652:4: () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalMiniJava.g:2652:4: ()
                    // InternalMiniJava.g:2653:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNegAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:2659:4: ( ( '-' )=>otherlv_7= '-' )
                    // InternalMiniJava.g:2660:5: ( '-' )=>otherlv_7= '-'
                    {
                    otherlv_7=(Token)match(input,52,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      				
                    }

                    }

                    // InternalMiniJava.g:2666:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalMiniJava.g:2667:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalMiniJava.g:2667:5: (lv_expression_8_0= rulePrimary )
                    // InternalMiniJava.g:2668:6: lv_expression_8_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_8_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:2687:3: this_SelectionExpression_9= ruleSelectionExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectionExpression_9=ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelectionExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava.g:2699:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // InternalMiniJava.g:2699:60: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // InternalMiniJava.g:2700:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava.g:2706:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* ) ;
    public final EObject ruleSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2712:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* ) )
            // InternalMiniJava.g:2713:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* )
            {
            // InternalMiniJava.g:2713:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* )
            // InternalMiniJava.g:2714:3: this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava.g:2722:3: ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==14) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==RULE_ID) ) {
                        int LA51_3 = input.LA(3);

                        if ( (LA51_3==EOF||LA51_3==12||LA51_3==14||LA51_3==20||(LA51_3>=26 && LA51_3<=27)||(LA51_3>=36 && LA51_3<=37)||(LA51_3>=42 && LA51_3<=54)) ) {
                            alt51=1;
                        }
                        else if ( (LA51_3==25) ) {
                            alt51=2;
                        }


                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalMiniJava.g:2723:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalMiniJava.g:2723:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalMiniJava.g:2724:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMiniJava.g:2724:5: ()
            	    // InternalMiniJava.g:2725:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMiniJava.g:2735:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalMiniJava.g:2736:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMiniJava.g:2736:6: (otherlv_3= RULE_ID )
            	    // InternalMiniJava.g:2737:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniJava.g:2750:4: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    {
            	    // InternalMiniJava.g:2750:4: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    // InternalMiniJava.g:2751:5: () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')'
            	    {
            	    // InternalMiniJava.g:2751:5: ()
            	    // InternalMiniJava.g:2752:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1());
            	      				
            	    }
            	    // InternalMiniJava.g:2762:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalMiniJava.g:2763:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMiniJava.g:2763:6: (otherlv_6= RULE_ID )
            	    // InternalMiniJava.g:2764:7: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0());
            	      						
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,25,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3());
            	      				
            	    }
            	    // InternalMiniJava.g:2779:5: ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==25||LA50_0==52||(LA50_0>=56 && LA50_0<=63)) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalMiniJava.g:2780:6: ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )*
            	            {
            	            // InternalMiniJava.g:2780:6: ( (lv_args_8_0= ruleExpression ) )
            	            // InternalMiniJava.g:2781:7: (lv_args_8_0= ruleExpression )
            	            {
            	            // InternalMiniJava.g:2781:7: (lv_args_8_0= ruleExpression )
            	            // InternalMiniJava.g:2782:8: lv_args_8_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_23);
            	            lv_args_8_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"args",
            	              									lv_args_8_0,
            	              									"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            // InternalMiniJava.g:2799:6: (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==20) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // InternalMiniJava.g:2800:7: otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_9=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(otherlv_9, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0());
            	            	      						
            	            	    }
            	            	    // InternalMiniJava.g:2804:7: ( (lv_args_10_0= ruleExpression ) )
            	            	    // InternalMiniJava.g:2805:8: (lv_args_10_0= ruleExpression )
            	            	    {
            	            	    // InternalMiniJava.g:2805:8: (lv_args_10_0= ruleExpression )
            	            	    // InternalMiniJava.g:2806:9: lv_args_10_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_23);
            	            	    lv_args_10_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"args",
            	            	      										lv_args_10_0,
            	            	      										"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava.g:2835:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalMiniJava.g:2835:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalMiniJava.g:2836:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava.g:2842:1: ruleTerminalExpression returns [EObject current=null] : ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_1=null;
        Token lv_value_9_2=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_args_20_0 = null;

        EObject lv_args_22_0 = null;

        EObject lv_type_26_0 = null;

        EObject lv_size_28_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2848:2: ( ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) ) )
            // InternalMiniJava.g:2849:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )
            {
            // InternalMiniJava.g:2849:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )
            int alt55=10;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalMiniJava.g:2850:3: ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' )
                    {
                    // InternalMiniJava.g:2850:3: ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' )
                    // InternalMiniJava.g:2851:4: () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\''
                    {
                    // InternalMiniJava.g:2851:4: ()
                    // InternalMiniJava.g:2852:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNativeExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,57,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_1());
                      			
                    }
                    // InternalMiniJava.g:2862:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalMiniJava.g:2863:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMiniJava.g:2863:5: (lv_value_2_0= RULE_STRING )
                    // InternalMiniJava.g:2864:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2886:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalMiniJava.g:2886:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalMiniJava.g:2887:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalMiniJava.g:2887:4: ()
                    // InternalMiniJava.g:2888:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:2894:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalMiniJava.g:2895:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalMiniJava.g:2895:5: (lv_value_5_0= RULE_STRING )
                    // InternalMiniJava.g:2896:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:2914:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalMiniJava.g:2914:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalMiniJava.g:2915:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalMiniJava.g:2915:4: ()
                    // InternalMiniJava.g:2916:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:2922:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalMiniJava.g:2923:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalMiniJava.g:2923:5: (lv_value_7_0= RULE_INT )
                    // InternalMiniJava.g:2924:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:2942:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    {
                    // InternalMiniJava.g:2942:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    // InternalMiniJava.g:2943:4: () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    {
                    // InternalMiniJava.g:2943:4: ()
                    // InternalMiniJava.g:2944:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:2950:4: ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    // InternalMiniJava.g:2951:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    {
                    // InternalMiniJava.g:2951:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    // InternalMiniJava.g:2952:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    {
                    // InternalMiniJava.g:2952:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==58) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==59) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalMiniJava.g:2953:7: lv_value_9_1= 'true'
                            {
                            lv_value_9_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalMiniJava.g:2964:7: lv_value_9_2= 'false'
                            {
                            lv_value_9_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:2979:3: ( () otherlv_11= 'this' )
                    {
                    // InternalMiniJava.g:2979:3: ( () otherlv_11= 'this' )
                    // InternalMiniJava.g:2980:4: () otherlv_11= 'this'
                    {
                    // InternalMiniJava.g:2980:4: ()
                    // InternalMiniJava.g:2981:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getThisAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getThisKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:2993:3: ( () otherlv_13= 'super' )
                    {
                    // InternalMiniJava.g:2993:3: ( () otherlv_13= 'super' )
                    // InternalMiniJava.g:2994:4: () otherlv_13= 'super'
                    {
                    // InternalMiniJava.g:2994:4: ()
                    // InternalMiniJava.g:2995:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSuperAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:3007:3: ( () otherlv_15= 'null' )
                    {
                    // InternalMiniJava.g:3007:3: ( () otherlv_15= 'null' )
                    // InternalMiniJava.g:3008:4: () otherlv_15= 'null'
                    {
                    // InternalMiniJava.g:3008:4: ()
                    // InternalMiniJava.g:3009:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNullAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getNullKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:3021:3: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' )
                    {
                    // InternalMiniJava.g:3021:3: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' )
                    // InternalMiniJava.g:3022:4: () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')'
                    {
                    // InternalMiniJava.g:3022:4: ()
                    // InternalMiniJava.g:3023:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNewObjectAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1());
                      			
                    }
                    // InternalMiniJava.g:3033:4: ( (otherlv_18= RULE_ID ) )
                    // InternalMiniJava.g:3034:5: (otherlv_18= RULE_ID )
                    {
                    // InternalMiniJava.g:3034:5: (otherlv_18= RULE_ID )
                    // InternalMiniJava.g:3035:6: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getTypeClazzCrossReference_7_2_0());
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:3046:4: ( ( '(' )=>otherlv_19= '(' )
                    // InternalMiniJava.g:3047:5: ( '(' )=>otherlv_19= '('
                    {
                    otherlv_19=(Token)match(input,25,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_19, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                      				
                    }

                    }

                    // InternalMiniJava.g:3053:4: ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||LA54_0==25||LA54_0==52||(LA54_0>=56 && LA54_0<=63)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalMiniJava.g:3054:5: ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )*
                            {
                            // InternalMiniJava.g:3054:5: ( (lv_args_20_0= ruleExpression ) )
                            // InternalMiniJava.g:3055:6: (lv_args_20_0= ruleExpression )
                            {
                            // InternalMiniJava.g:3055:6: (lv_args_20_0= ruleExpression )
                            // InternalMiniJava.g:3056:7: lv_args_20_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
                            lv_args_20_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_20_0,
                              								"org.tetrabox.minijava.xtext.MiniJava.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMiniJava.g:3073:5: (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==20) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalMiniJava.g:3074:6: otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) )
                            	    {
                            	    otherlv_21=(Token)match(input,20,FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_21, grammarAccess.getTerminalExpressionAccess().getCommaKeyword_7_4_1_0());
                            	      					
                            	    }
                            	    // InternalMiniJava.g:3078:6: ( (lv_args_22_0= ruleExpression ) )
                            	    // InternalMiniJava.g:3079:7: (lv_args_22_0= ruleExpression )
                            	    {
                            	    // InternalMiniJava.g:3079:7: (lv_args_22_0= ruleExpression )
                            	    // InternalMiniJava.g:3080:8: lv_args_22_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
                            	    lv_args_22_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_22_0,
                            	      									"org.tetrabox.minijava.xtext.MiniJava.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_5());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:3105:3: ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' )
                    {
                    // InternalMiniJava.g:3105:3: ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' )
                    // InternalMiniJava.g:3106:4: () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']'
                    {
                    // InternalMiniJava.g:3106:4: ()
                    // InternalMiniJava.g:3107:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNewArrayAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_25=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getTerminalExpressionAccess().getNewKeyword_8_1());
                      			
                    }
                    // InternalMiniJava.g:3117:4: ( (lv_type_26_0= ruleTypeRef ) )
                    // InternalMiniJava.g:3118:5: (lv_type_26_0= ruleTypeRef )
                    {
                    // InternalMiniJava.g:3118:5: (lv_type_26_0= ruleTypeRef )
                    // InternalMiniJava.g:3119:6: lv_type_26_0= ruleTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_type_26_0=ruleTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_26_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava.g:3136:4: ( ( '[' )=>otherlv_27= '[' )
                    // InternalMiniJava.g:3137:5: ( '[' )=>otherlv_27= '['
                    {
                    otherlv_27=(Token)match(input,36,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_27, grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_8_3());
                      				
                    }

                    }

                    // InternalMiniJava.g:3143:4: ( (lv_size_28_0= ruleExpression ) )
                    // InternalMiniJava.g:3144:5: (lv_size_28_0= ruleExpression )
                    {
                    // InternalMiniJava.g:3144:5: (lv_size_28_0= ruleExpression )
                    // InternalMiniJava.g:3145:6: lv_size_28_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_8_4_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_size_28_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_28_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_8_5());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:3168:3: ( () ( (otherlv_31= RULE_ID ) ) )
                    {
                    // InternalMiniJava.g:3168:3: ( () ( (otherlv_31= RULE_ID ) ) )
                    // InternalMiniJava.g:3169:4: () ( (otherlv_31= RULE_ID ) )
                    {
                    // InternalMiniJava.g:3169:4: ()
                    // InternalMiniJava.g:3170:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava.g:3176:4: ( (otherlv_31= RULE_ID ) )
                    // InternalMiniJava.g:3177:5: (otherlv_31= RULE_ID )
                    {
                    // InternalMiniJava.g:3177:5: (otherlv_31= RULE_ID )
                    // InternalMiniJava.g:3178:6: otherlv_31= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_31, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_9_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava.g:3194:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:3200:2: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) )
            // InternalMiniJava.g:3201:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            {
            // InternalMiniJava.g:3201:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt56=1;
                }
                break;
            case 65:
                {
                alt56=2;
                }
                break;
            case 66:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMiniJava.g:3202:3: (enumLiteral_0= 'private' )
                    {
                    // InternalMiniJava.g:3202:3: (enumLiteral_0= 'private' )
                    // InternalMiniJava.g:3203:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:3210:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalMiniJava.g:3210:3: (enumLiteral_1= 'protected' )
                    // InternalMiniJava.g:3211:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:3218:3: (enumLiteral_2= 'public' )
                    {
                    // InternalMiniJava.g:3218:3: (enumLiteral_2= 'public' )
                    // InternalMiniJava.g:3219:4: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessLevel"

    // $ANTLR start synpred1_InternalMiniJava
    public final void synpred1_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1071:5: ( ruleAssignment )
        // InternalMiniJava.g:1071:6: ruleAssignment
        {
        pushFollow(FOLLOW_2);
        ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMiniJava

    // $ANTLR start synpred2_InternalMiniJava
    public final void synpred2_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1331:5: ( 'else' )
        // InternalMiniJava.g:1331:6: 'else'
        {
        match(input,33,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMiniJava

    // $ANTLR start synpred3_InternalMiniJava
    public final void synpred3_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1757:4: ( ruleParameter )
        // InternalMiniJava.g:1757:5: ruleParameter
        {
        pushFollow(FOLLOW_2);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMiniJava

    // $ANTLR start synpred4_InternalMiniJava
    public final void synpred4_InternalMiniJava_fragment() throws RecognitionException {   
        // InternalMiniJava.g:1913:4: ( ruleArrayAccess )
        // InternalMiniJava.g:1913:5: ruleArrayAccess
        {
        pushFollow(FOLLOW_2);
        ruleArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMiniJava

    // Delegated rules

    public final boolean synpred3_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\11\4\1\uffff\1\4\1\45\1\14\2\4\1\uffff";
    static final String dfa_3s = "\1\102\3\51\5\44\1\uffff\1\4\1\45\1\33\1\44\1\31\1\uffff";
    static final String dfa_4s = "\11\uffff\1\2\5\uffff\1\1";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\13\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10\26\uffff\1\1\1\2\1\3",
            "\1\4\13\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\4\13\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\4\13\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\14\11\uffff\1\12\12\uffff\1\11\12\uffff\1\13",
            "\1\14\24\uffff\1\11\12\uffff\1\13",
            "\1\14\24\uffff\1\11\12\uffff\1\13",
            "\1\14\24\uffff\1\11\12\uffff\1\13",
            "\1\14\24\uffff\1\11\12\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\14\uffff\1\11\1\uffff\1\17",
            "\1\14\11\uffff\1\12\12\uffff\1\11\12\uffff\1\13",
            "\1\14\24\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "621:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_7s = "\31\uffff";
    static final String dfa_8s = "\1\4\4\uffff\12\0\12\uffff";
    static final String dfa_9s = "\1\77\4\uffff\12\0\12\uffff";
    static final String dfa_10s = "\1\uffff\1\1\3\2\12\uffff\4\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_11s = "\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\16\1\6\1\7\16\uffff\1\27\3\uffff\1\2\2\uffff\1\26\2\uffff\1\1\1\23\1\uffff\1\24\1\25\2\uffff\1\17\1\20\1\21\1\22\12\uffff\1\4\3\uffff\1\3\1\5\1\10\1\11\1\12\1\13\1\14\1\15",
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

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1053:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==31) ) {s = 1;}

                        else if ( (LA28_0==25) && (synpred1_InternalMiniJava())) {s = 2;}

                        else if ( (LA28_0==56) && (synpred1_InternalMiniJava())) {s = 3;}

                        else if ( (LA28_0==52) && (synpred1_InternalMiniJava())) {s = 4;}

                        else if ( (LA28_0==57) ) {s = 5;}

                        else if ( (LA28_0==RULE_STRING) ) {s = 6;}

                        else if ( (LA28_0==RULE_INT) ) {s = 7;}

                        else if ( (LA28_0==58) ) {s = 8;}

                        else if ( (LA28_0==59) ) {s = 9;}

                        else if ( (LA28_0==60) ) {s = 10;}

                        else if ( (LA28_0==61) ) {s = 11;}

                        else if ( (LA28_0==62) ) {s = 12;}

                        else if ( (LA28_0==63) ) {s = 13;}

                        else if ( (LA28_0==RULE_ID) ) {s = 14;}

                        else if ( (LA28_0==38) && (synpred1_InternalMiniJava())) {s = 15;}

                        else if ( (LA28_0==39) && (synpred1_InternalMiniJava())) {s = 16;}

                        else if ( (LA28_0==40) && (synpred1_InternalMiniJava())) {s = 17;}

                        else if ( (LA28_0==41) && (synpred1_InternalMiniJava())) {s = 18;}

                        else if ( (LA28_0==32) ) {s = 19;}

                        else if ( (LA28_0==34) ) {s = 20;}

                        else if ( (LA28_0==35) ) {s = 21;}

                        else if ( (LA28_0==28) ) {s = 22;}

                        else if ( (LA28_0==21) ) {s = 23;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_9 = input.LA(1);

                         
                        int index28_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_10 = input.LA(1);

                         
                        int index28_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_11 = input.LA(1);

                         
                        int index28_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_12 = input.LA(1);

                         
                        int index28_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_13 = input.LA(1);

                         
                        int index28_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMiniJava()) ) {s = 18;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\15\uffff";
    static final String dfa_14s = "\11\uffff\1\14\3\uffff";
    static final String dfa_15s = "\6\4\1\uffff\1\4\1\45\1\14\2\4\1\uffff";
    static final String dfa_16s = "\1\102\5\44\1\uffff\1\4\1\45\1\33\1\44\1\31\1\uffff";
    static final String dfa_17s = "\6\uffff\1\2\5\uffff\1\1";
    static final String dfa_18s = "\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\13\uffff\1\6\7\uffff\1\6\15\uffff\1\2\1\3\1\4\1\5\26\uffff\3\6",
            "\1\11\11\uffff\1\7\12\uffff\1\6\12\uffff\1\10",
            "\1\11\24\uffff\1\6\12\uffff\1\10",
            "\1\11\24\uffff\1\6\12\uffff\1\10",
            "\1\11\24\uffff\1\6\12\uffff\1\10",
            "\1\11\24\uffff\1\6\12\uffff\1\10",
            "",
            "\1\12",
            "\1\13",
            "\1\6\14\uffff\1\6\1\uffff\1\6",
            "\1\11\11\uffff\1\7\12\uffff\1\6\12\uffff\1\10",
            "\1\11\24\uffff\1\6",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1719:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )";
        }
    }
    static final String dfa_20s = "\7\4\1\45\1\0\2\4\2\uffff";
    static final String dfa_21s = "\1\51\5\44\1\4\1\45\1\0\1\44\1\4\2\uffff";
    static final String dfa_22s = "\13\uffff\1\1\1\2";
    static final String dfa_23s = "\10\uffff\1\0\4\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\41\uffff\1\2\1\3\1\4\1\5",
            "\1\10\11\uffff\1\6\25\uffff\1\7",
            "\1\10\37\uffff\1\7",
            "\1\10\37\uffff\1\7",
            "\1\10\37\uffff\1\7",
            "\1\10\37\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\11\uffff\1\6\25\uffff\1\7",
            "\1\10",
            "",
            ""
    };
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1755:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMiniJava()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\43\uffff";
    static final String dfa_26s = "\15\uffff\1\22\6\uffff\1\22\16\uffff";
    static final String dfa_27s = "\1\4\14\uffff\1\4\1\uffff\2\4\3\uffff\1\4\16\uffff";
    static final String dfa_28s = "\1\77\14\uffff\1\44\1\uffff\1\67\1\77\3\uffff\1\44\16\uffff";
    static final String dfa_29s = "\1\uffff\14\1\1\uffff\1\2\2\uffff\3\1\1\uffff\16\1";
    static final String dfa_30s = "\1\3\14\uffff\1\1\1\uffff\1\4\1\0\3\uffff\1\2\16\uffff}>";
    static final String[] dfa_31s = {
            "\1\15\1\5\1\6\22\uffff\1\1\14\uffff\4\16\12\uffff\1\3\3\uffff\1\2\1\4\1\7\1\10\1\11\1\12\1\13\1\14",
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
            "\1\16\11\uffff\1\17\14\uffff\1\21\10\uffff\1\20",
            "",
            "\1\24\62\uffff\1\23",
            "\1\41\1\31\1\32\22\uffff\1\25\13\uffff\1\16\16\uffff\1\27\3\uffff\1\26\1\30\1\33\1\34\1\35\1\36\1\37\1\40",
            "",
            "",
            "",
            "\1\16\11\uffff\1\17\12\uffff\1\42\1\uffff\1\21\10\uffff\1\20",
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
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1911:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_16==25) && (synpred4_InternalMiniJava())) {s = 21;}

                        else if ( (LA34_16==56) && (synpred4_InternalMiniJava())) {s = 22;}

                        else if ( (LA34_16==52) && (synpred4_InternalMiniJava())) {s = 23;}

                        else if ( (LA34_16==57) && (synpred4_InternalMiniJava())) {s = 24;}

                        else if ( (LA34_16==RULE_STRING) && (synpred4_InternalMiniJava())) {s = 25;}

                        else if ( (LA34_16==RULE_INT) && (synpred4_InternalMiniJava())) {s = 26;}

                        else if ( (LA34_16==58) && (synpred4_InternalMiniJava())) {s = 27;}

                        else if ( (LA34_16==59) && (synpred4_InternalMiniJava())) {s = 28;}

                        else if ( (LA34_16==60) && (synpred4_InternalMiniJava())) {s = 29;}

                        else if ( (LA34_16==61) && (synpred4_InternalMiniJava())) {s = 30;}

                        else if ( (LA34_16==62) && (synpred4_InternalMiniJava())) {s = 31;}

                        else if ( (LA34_16==63) && (synpred4_InternalMiniJava())) {s = 32;}

                        else if ( (LA34_16==RULE_ID) && (synpred4_InternalMiniJava())) {s = 33;}

                        else if ( (LA34_16==37) ) {s = 14;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_13==14) ) {s = 15;}

                        else if ( (LA34_13==36) ) {s = 16;}

                        else if ( (LA34_13==RULE_ID) ) {s = 14;}

                        else if ( (LA34_13==27) && (synpred4_InternalMiniJava())) {s = 17;}

                        else if ( (LA34_13==EOF) && (synpred4_InternalMiniJava())) {s = 18;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_20 = input.LA(1);

                         
                        int index34_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_20==14) ) {s = 15;}

                        else if ( (LA34_20==36) ) {s = 16;}

                        else if ( (LA34_20==27) && (synpred4_InternalMiniJava())) {s = 17;}

                        else if ( (LA34_20==EOF) && (synpred4_InternalMiniJava())) {s = 18;}

                        else if ( (LA34_20==25) && (synpred4_InternalMiniJava())) {s = 34;}

                        else if ( (LA34_20==RULE_ID) ) {s = 14;}

                         
                        input.seek(index34_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==25) && (synpred4_InternalMiniJava())) {s = 1;}

                        else if ( (LA34_0==56) && (synpred4_InternalMiniJava())) {s = 2;}

                        else if ( (LA34_0==52) && (synpred4_InternalMiniJava())) {s = 3;}

                        else if ( (LA34_0==57) && (synpred4_InternalMiniJava())) {s = 4;}

                        else if ( (LA34_0==RULE_STRING) && (synpred4_InternalMiniJava())) {s = 5;}

                        else if ( (LA34_0==RULE_INT) && (synpred4_InternalMiniJava())) {s = 6;}

                        else if ( (LA34_0==58) && (synpred4_InternalMiniJava())) {s = 7;}

                        else if ( (LA34_0==59) && (synpred4_InternalMiniJava())) {s = 8;}

                        else if ( (LA34_0==60) && (synpred4_InternalMiniJava())) {s = 9;}

                        else if ( (LA34_0==61) && (synpred4_InternalMiniJava())) {s = 10;}

                        else if ( (LA34_0==62) && (synpred4_InternalMiniJava())) {s = 11;}

                        else if ( (LA34_0==63) && (synpred4_InternalMiniJava())) {s = 12;}

                        else if ( (LA34_0==RULE_ID) ) {s = 13;}

                        else if ( ((LA34_0>=38 && LA34_0<=41)) ) {s = 14;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_15==55) && (synpred4_InternalMiniJava())) {s = 19;}

                        else if ( (LA34_15==RULE_ID) ) {s = 20;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_32s = "\1\4\7\uffff\1\4\1\uffff\1\16\2\uffff";
    static final String dfa_33s = "\1\77\7\uffff\1\51\1\uffff\1\44\2\uffff";
    static final String dfa_34s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\11\1\10";
    static final String[] dfa_35s = {
            "\1\11\1\2\1\3\62\uffff\1\1\2\4\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\41\uffff\4\13",
            "",
            "\1\13\12\uffff\1\14\12\uffff\1\13",
            "",
            ""
    };
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_18;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "2849:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000832002L,0x0000000000000007L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000830002L,0x0000000000000007L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003C001410010L,0x0000000000000007L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003C001010010L,0x0000000000000007L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003C001000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003C000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003C004000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFF10000002000070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFF1003CD92600070L,0x0000000000000007L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFF1003C002000070L,0x0000000000000007L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xFF10000006000070L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L});

}