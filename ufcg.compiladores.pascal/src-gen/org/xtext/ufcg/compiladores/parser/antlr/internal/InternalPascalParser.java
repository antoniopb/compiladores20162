package org.xtext.ufcg.compiladores.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ufcg.compiladores.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "'label'", "','", "'const'", "'='", "'type'", "'var'", "':'", "'forward'", "'begin'", "'end'", "'procedure'", "'function'", "'packed'", "'array'", "'['", "']'", "'of'", "'..'", "':='", "'goto'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", "'downto'", "'if'", "'then'", "'else'", "'case'", "'with'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'not'", "'true'", "'false'", "'^'", "'record'", "'set'", "'file'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=14;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=9;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=16;
    public static final int RULE_SIGNED_REAL_NUMBER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_INTEGER_NUMBER=10;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_RELATIONAL_OPERATOR=5;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=15;
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
    public static final int RULE_WS=20;
    public static final int RULE_MULTIPLICATION_OPERATOR=7;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_SIGNED_INTEGER_NUMBER=12;
    public static final int T__48=48;
    public static final int RULE_ADDITION_OPERATOR=6;
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


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "program";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:64:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:64:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:65:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:71:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( ( (lv_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:78:2: ( ( (lv_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:78:2: ( ( (lv_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:79:3: ( (lv_heading_0_0= ruleprogram_heading ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:79:3: ( (lv_heading_0_0= ruleprogram_heading ) )
            // InternalPascal.g:80:4: (lv_heading_0_0= ruleprogram_heading )
            {
            // InternalPascal.g:80:4: (lv_heading_0_0= ruleprogram_heading )
            // InternalPascal.g:81:5: lv_heading_0_0= ruleprogram_heading
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.program_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:98:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:99:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:99:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:100:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading"
    // InternalPascal.g:125:1: entryRuleprogram_heading returns [EObject current=null] : iv_ruleprogram_heading= ruleprogram_heading EOF ;
    public final EObject entryRuleprogram_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading = null;


        try {
            // InternalPascal.g:125:56: (iv_ruleprogram_heading= ruleprogram_heading EOF )
            // InternalPascal.g:126:2: iv_ruleprogram_heading= ruleprogram_heading EOF
            {
             newCompositeNode(grammarAccess.getProgram_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading=ruleprogram_heading();

            state._fsp--;

             current =iv_ruleprogram_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogram_heading"


    // $ANTLR start "ruleprogram_heading"
    // InternalPascal.g:132:1: ruleprogram_heading returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:138:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:139:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:139:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:140:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_headingAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:145:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:146:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgram_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:162:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:163:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgram_headingAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:167:4: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // InternalPascal.g:168:5: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // InternalPascal.g:168:5: (lv_identifiers_3_0= ruleidentifier_list )
                    // InternalPascal.g:169:6: lv_identifiers_3_0= ruleidentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgram_headingAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgram_headingRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.ufcg.compiladores.Pascal.identifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_headingAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgram_headingAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:199:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:199:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:200:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:206:1: ruleblock returns [EObject current=null] : ( ( (lv_declaration_0_0= ruledeclaration_part ) ) ( (lv_statement_1_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_statement_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:212:2: ( ( ( (lv_declaration_0_0= ruledeclaration_part ) ) ( (lv_statement_1_0= rulestatement_part ) ) ) )
            // InternalPascal.g:213:2: ( ( (lv_declaration_0_0= ruledeclaration_part ) ) ( (lv_statement_1_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:213:2: ( ( (lv_declaration_0_0= ruledeclaration_part ) ) ( (lv_statement_1_0= rulestatement_part ) ) )
            // InternalPascal.g:214:3: ( (lv_declaration_0_0= ruledeclaration_part ) ) ( (lv_statement_1_0= rulestatement_part ) )
            {
            // InternalPascal.g:214:3: ( (lv_declaration_0_0= ruledeclaration_part ) )
            // InternalPascal.g:215:4: (lv_declaration_0_0= ruledeclaration_part )
            {
            // InternalPascal.g:215:4: (lv_declaration_0_0= ruledeclaration_part )
            // InternalPascal.g:216:5: lv_declaration_0_0= ruledeclaration_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getDeclarationDeclaration_partParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_declaration_0_0=ruledeclaration_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.declaration_part");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:233:3: ( (lv_statement_1_0= rulestatement_part ) )
            // InternalPascal.g:234:4: (lv_statement_1_0= rulestatement_part )
            {
            // InternalPascal.g:234:4: (lv_statement_1_0= rulestatement_part )
            // InternalPascal.g:235:5: lv_statement_1_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_1_0=rulestatement_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement_part");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRuledeclaration_part"
    // InternalPascal.g:256:1: entryRuledeclaration_part returns [EObject current=null] : iv_ruledeclaration_part= ruledeclaration_part EOF ;
    public final EObject entryRuledeclaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration_part = null;


        try {
            // InternalPascal.g:256:57: (iv_ruledeclaration_part= ruledeclaration_part EOF )
            // InternalPascal.g:257:2: iv_ruledeclaration_part= ruledeclaration_part EOF
            {
             newCompositeNode(grammarAccess.getDeclaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledeclaration_part=ruledeclaration_part();

            state._fsp--;

             current =iv_ruledeclaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuledeclaration_part"


    // $ANTLR start "ruledeclaration_part"
    // InternalPascal.g:263:1: ruledeclaration_part returns [EObject current=null] : ( ( (lv_label_decl_0_0= rulelabel_declaration_part ) )? ( (lv_constant_def_1_0= ruleconstant_definition_part ) )? ( (lv_type_def_2_0= ruletype_definition_part ) )? ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ) ;
    public final EObject ruledeclaration_part() throws RecognitionException {
        EObject current = null;

        EObject lv_label_decl_0_0 = null;

        EObject lv_constant_def_1_0 = null;

        EObject lv_type_def_2_0 = null;

        EObject lv_variable_decl_3_0 = null;

        EObject lv_abstraction_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:269:2: ( ( ( (lv_label_decl_0_0= rulelabel_declaration_part ) )? ( (lv_constant_def_1_0= ruleconstant_definition_part ) )? ( (lv_type_def_2_0= ruletype_definition_part ) )? ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ) )
            // InternalPascal.g:270:2: ( ( (lv_label_decl_0_0= rulelabel_declaration_part ) )? ( (lv_constant_def_1_0= ruleconstant_definition_part ) )? ( (lv_type_def_2_0= ruletype_definition_part ) )? ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? )
            {
            // InternalPascal.g:270:2: ( ( (lv_label_decl_0_0= rulelabel_declaration_part ) )? ( (lv_constant_def_1_0= ruleconstant_definition_part ) )? ( (lv_type_def_2_0= ruletype_definition_part ) )? ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? )
            // InternalPascal.g:271:3: ( (lv_label_decl_0_0= rulelabel_declaration_part ) )? ( (lv_constant_def_1_0= ruleconstant_definition_part ) )? ( (lv_type_def_2_0= ruletype_definition_part ) )? ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )?
            {
            // InternalPascal.g:271:3: ( (lv_label_decl_0_0= rulelabel_declaration_part ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:272:4: (lv_label_decl_0_0= rulelabel_declaration_part )
                    {
                    // InternalPascal.g:272:4: (lv_label_decl_0_0= rulelabel_declaration_part )
                    // InternalPascal.g:273:5: lv_label_decl_0_0= rulelabel_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getDeclaration_partAccess().getLabel_declLabel_declaration_partParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_label_decl_0_0=rulelabel_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                    					}
                    					set(
                    						current,
                    						"label_decl",
                    						lv_label_decl_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.label_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:290:3: ( (lv_constant_def_1_0= ruleconstant_definition_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:291:4: (lv_constant_def_1_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:291:4: (lv_constant_def_1_0= ruleconstant_definition_part )
                    // InternalPascal.g:292:5: lv_constant_def_1_0= ruleconstant_definition_part
                    {

                    					newCompositeNode(grammarAccess.getDeclaration_partAccess().getConstant_defConstant_definition_partParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_constant_def_1_0=ruleconstant_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                    					}
                    					set(
                    						current,
                    						"constant_def",
                    						lv_constant_def_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.constant_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:309:3: ( (lv_type_def_2_0= ruletype_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:310:4: (lv_type_def_2_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:310:4: (lv_type_def_2_0= ruletype_definition_part )
                    // InternalPascal.g:311:5: lv_type_def_2_0= ruletype_definition_part
                    {

                    					newCompositeNode(grammarAccess.getDeclaration_partAccess().getType_defType_definition_partParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_type_def_2_0=ruletype_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                    					}
                    					set(
                    						current,
                    						"type_def",
                    						lv_type_def_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.type_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:328:3: ( (lv_variable_decl_3_0= rulevariable_declaration_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:329:4: (lv_variable_decl_3_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:329:4: (lv_variable_decl_3_0= rulevariable_declaration_part )
                    // InternalPascal.g:330:5: lv_variable_decl_3_0= rulevariable_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getDeclaration_partAccess().getVariable_declVariable_declaration_partParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_variable_decl_3_0=rulevariable_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                    					}
                    					set(
                    						current,
                    						"variable_decl",
                    						lv_variable_decl_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.variable_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:347:3: ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:348:4: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    {
                    // InternalPascal.g:348:4: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    // InternalPascal.g:349:5: lv_abstraction_4_0= ruleprocedure_and_function_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getDeclaration_partAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_abstraction_4_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaration_partRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_4_0,
                    						"org.xtext.ufcg.compiladores.Pascal.procedure_and_function_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaration_part"


    // $ANTLR start "entryRulelabel_declaration_part"
    // InternalPascal.g:370:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:370:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:371:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // InternalPascal.g:377:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:383:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:384:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:384:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:385:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
            		
            // InternalPascal.g:389:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalPascal.g:390:4: (lv_labels_1_0= rulelabel )
            {
            // InternalPascal.g:390:4: (lv_labels_1_0= rulelabel )
            // InternalPascal.g:391:5: lv_labels_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_labels_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:408:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:409:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:413:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalPascal.g:414:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:414:5: (lv_labels_3_0= rulelabel )
            	    // InternalPascal.g:415:6: lv_labels_3_0= rulelabel
            	    {

            	    						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_3_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:441:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:441:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:442:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:448:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:454:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:455:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:455:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:456:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:460:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:461:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:461:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:462:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:462:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:463:6: lv_consts_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"consts",
            	    							lv_consts_1_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.constant_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:489:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:489:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:490:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:496:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:502:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:503:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:504:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:504:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:505:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:505:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:506:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:526:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:527:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:527:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:528:5: lv_const_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            					}
            					set(
            						current,
            						"const",
            						lv_const_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:549:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:549:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:550:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:556:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:562:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:563:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:563:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:564:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:568:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:569:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:569:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:570:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:570:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:571:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_1_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.type_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:597:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:597:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:598:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:604:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:610:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:611:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:612:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:612:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:613:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:613:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:614:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getType_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:634:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:635:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:635:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:636:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_definitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:657:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:657:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:658:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:664:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:670:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:671:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:671:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:672:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascal.g:676:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:677:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:677:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:678:5: lv_sections_1_0= rulevariable_section
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.variable_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
            		
            // InternalPascal.g:699:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:700:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:700:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:701:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:701:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:702:6: lv_sections_3_0= rulevariable_section
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.variable_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,26,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:728:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:728:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:729:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:735:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:741:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:742:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:742:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:743:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:743:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:744:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:744:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:745:5: lv_identifiers_0_0= rulevariable_identifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.variable_identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:766:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:767:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:767:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:768:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:789:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalPascal.g:789:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:790:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascal.g:796:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:802:2: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:803:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:803:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=37 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascal.g:804:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:804:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==37) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==38) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalPascal.g:805:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:805:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:806:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:806:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // InternalPascal.g:807:6: lv_procedures_0_0= ruleprocedure_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"procedures",
            	            							lv_procedures_0_0,
            	            							"org.xtext.ufcg.compiladores.Pascal.procedure_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:825:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:825:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // InternalPascal.g:826:5: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:826:5: (lv_functions_1_0= rulefunction_declaration )
            	            // InternalPascal.g:827:6: lv_functions_1_0= rulefunction_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"functions",
            	            							lv_functions_1_0,
            	            							"org.xtext.ufcg.compiladores.Pascal.function_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_12); 

            	    			newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:853:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:853:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:854:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:860:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:866:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:867:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:867:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:868:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:868:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:869:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:869:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:870:5: lv_heading_0_0= ruleprocedure_heading
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.procedure_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:891:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EOF||LA13_0==27||LA13_0==29||(LA13_0>=31 && LA13_0<=32)||LA13_0==35||(LA13_0>=37 && LA13_0<=38)) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:892:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:892:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:893:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:893:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:894:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.ufcg.compiladores.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:912:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:912:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:913:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:913:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:914:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:931:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:931:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:932:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:938:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:944:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:945:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:945:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:946:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:946:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:947:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:947:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:948:5: lv_heading_0_0= rulefunction_heading
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.function_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:969:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EOF||LA14_0==27||LA14_0==29||(LA14_0>=31 && LA14_0<=32)||LA14_0==35||(LA14_0>=37 && LA14_0<=38)) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascal.g:970:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:970:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:971:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:971:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:972:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.ufcg.compiladores.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:990:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:990:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:991:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:991:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:992:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunction_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:1009:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:1009:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:1010:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:1016:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1022:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:1023:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:1023:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:1024:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:1028:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:1029:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:1029:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:1030:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_partRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:1055:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:1055:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:1056:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:1062:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1068:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:1069:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:1069:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:1070:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:1074:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1075:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1075:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1076:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:1092:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1093:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1093:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1094:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:1115:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:1115:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:1116:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:1122:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_resultType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_resultType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1128:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_resultType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1129:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_resultType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1129:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_resultType_4_0= RULE_ID ) ) )
            // InternalPascal.g:1130:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_resultType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:1134:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:1135:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:1135:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:1136:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:1152:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1153:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:1153:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:1154:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
            		
            // InternalPascal.g:1175:3: ( (lv_resultType_4_0= RULE_ID ) )
            // InternalPascal.g:1176:4: (lv_resultType_4_0= RULE_ID )
            {
            // InternalPascal.g:1176:4: (lv_resultType_4_0= RULE_ID )
            // InternalPascal.g:1177:5: lv_resultType_4_0= RULE_ID
            {
            lv_resultType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_resultType_4_0, grammarAccess.getFunction_headingAccess().getResultTypeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"resultType",
            						lv_resultType_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:1197:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:1197:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:1198:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:1204:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1210:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:1211:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:1211:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:1212:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:1216:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:1217:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:1217:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:1218:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.formal_parameter_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1235:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:1236:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_25); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:1240:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:1241:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:1241:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:1242:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:1268:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:1268:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:1269:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:1275:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1281:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:1282:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:1282:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:1283:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:1283:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:1284:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:1284:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:1285:5: lv_value_0_0= rulevalue_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.value_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1303:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:1303:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:1304:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:1304:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:1305:5: lv_variable_1_0= rulevariable_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.variable_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1323:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:1323:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:1324:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:1324:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:1325:5: lv_procedure_2_0= ruleprocedure_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"procedure",
                    						lv_procedure_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.procedure_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1343:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:1343:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:1344:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:1344:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:1345:5: lv_function_3_0= rulefunction_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.function_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:1366:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:1366:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:1367:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:1373:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1379:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:1380:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:1380:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:1381:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:1381:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:1382:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:1382:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:1383:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:1404:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:1405:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:1405:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:1406:5: lv_type_2_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:1427:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:1427:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:1428:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:1434:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1440:2: ( (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:1441:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:1441:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:1442:3: otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalPascal.g:1446:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:1447:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:1447:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:1448:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
            		
            // InternalPascal.g:1469:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:1470:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:1470:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:1471:5: lv_type_3_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:1492:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:1492:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:1493:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:1499:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_array_1_0= ruleconformant_array_schema ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1505:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_array_1_0= ruleconformant_array_schema ) ) ) )
            // InternalPascal.g:1506:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_array_1_0= ruleconformant_array_schema ) ) )
            {
            // InternalPascal.g:1506:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_array_1_0= ruleconformant_array_schema ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=39 && LA19_0<=40)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascal.g:1507:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalPascal.g:1507:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalPascal.g:1508:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalPascal.g:1508:4: (lv_name_0_0= RULE_ID )
                    // InternalPascal.g:1509:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameter_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1526:3: ( (lv_array_1_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:1526:3: ( (lv_array_1_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:1527:4: (lv_array_1_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:1527:4: (lv_array_1_0= ruleconformant_array_schema )
                    // InternalPascal.g:1528:5: lv_array_1_0= ruleconformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleconformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalPascal.g:1549:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:1549:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:1550:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalPascal.g:1556:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1562:2: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:1563:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:1563:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:1564:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:1564:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:1565:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:1565:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:1566:5: lv_packed_0_0= rulepacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"packed",
                    						lv_packed_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.packed_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1584:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:1584:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:1585:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:1585:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:1586:5: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"unpacked",
                    						lv_unpacked_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.unpacked_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalPascal.g:1607:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:1607:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:1608:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalPascal.g:1614:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1620:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalPascal.g:1621:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1621:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalPascal.g:1622:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPascal.g:1634:3: ( (lv_bound_3_0= rulebound_specification ) )
            // InternalPascal.g:1635:4: (lv_bound_3_0= rulebound_specification )
            {
            // InternalPascal.g:1635:4: (lv_bound_3_0= rulebound_specification )
            // InternalPascal.g:1636:5: lv_bound_3_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"bound",
            						lv_bound_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:1661:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalPascal.g:1662:4: (lv_name_6_0= RULE_ID )
            {
            // InternalPascal.g:1662:4: (lv_name_6_0= RULE_ID )
            // InternalPascal.g:1663:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalPascal.g:1683:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:1683:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:1684:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalPascal.g:1690:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1696:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:1697:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:1697:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            // InternalPascal.g:1698:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:1706:3: ( (lv_bounds_2_0= rulebound_specification ) )
            // InternalPascal.g:1707:4: (lv_bounds_2_0= rulebound_specification )
            {
            // InternalPascal.g:1707:4: (lv_bounds_2_0= rulebound_specification )
            // InternalPascal.g:1708:5: lv_bounds_2_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					add(
            						current,
            						"bounds",
            						lv_bounds_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1725:3: (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPascal.g:1726:4: otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalPascal.g:1730:4: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // InternalPascal.g:1731:5: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:1731:5: (lv_bounds_4_0= rulebound_specification )
            	    // InternalPascal.g:1732:6: lv_bounds_4_0= rulebound_specification
            	    {

            	    						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bounds",
            	    							lv_bounds_4_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.bound_specification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:1758:3: ( (lv_type_7_0= ruleparameter_type ) )
            // InternalPascal.g:1759:4: (lv_type_7_0= ruleparameter_type )
            {
            // InternalPascal.g:1759:4: (lv_type_7_0= ruleparameter_type )
            // InternalPascal.g:1760:5: lv_type_7_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.ufcg.compiladores.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalPascal.g:1781:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:1781:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:1782:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalPascal.g:1788:1: rulebound_specification returns [EObject current=null] : ( ( (lv_init_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_fin_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_init_0_0=null;
        Token otherlv_1=null;
        Token lv_fin_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1794:2: ( ( ( (lv_init_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_fin_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:1795:2: ( ( (lv_init_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_fin_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:1795:2: ( ( (lv_init_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_fin_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalPascal.g:1796:3: ( (lv_init_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_fin_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalPascal.g:1796:3: ( (lv_init_0_0= RULE_ID ) )
            // InternalPascal.g:1797:4: (lv_init_0_0= RULE_ID )
            {
            // InternalPascal.g:1797:4: (lv_init_0_0= RULE_ID )
            // InternalPascal.g:1798:5: lv_init_0_0= RULE_ID
            {
            lv_init_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_init_0_0, grammarAccess.getBound_specificationAccess().getInitIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"init",
            						lv_init_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPascal.g:1818:3: ( (lv_fin_2_0= RULE_ID ) )
            // InternalPascal.g:1819:4: (lv_fin_2_0= RULE_ID )
            {
            // InternalPascal.g:1819:4: (lv_fin_2_0= RULE_ID )
            // InternalPascal.g:1820:5: lv_fin_2_0= RULE_ID
            {
            lv_fin_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_fin_2_0, grammarAccess.getBound_specificationAccess().getFinIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fin",
            						lv_fin_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:1840:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPascal.g:1841:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPascal.g:1841:4: (lv_name_4_0= RULE_ID )
            // InternalPascal.g:1842:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:1862:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:1862:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:1863:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:1869:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1875:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:1876:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:1876:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:1877:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:1877:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:1878:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:1878:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:1879:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1896:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPascal.g:1897:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:1901:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:1902:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:1902:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:1903:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:1925:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:1925:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:1926:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:1932:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1938:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:1939:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:1939:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:1940:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:1940:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER_NUMBER||LA23_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1941:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:1941:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:1942:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:1942:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:1943:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_0_0,
                    							"org.xtext.ufcg.compiladores.Pascal.label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:1965:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==26||LA24_0==36||LA24_0==46||LA24_0==50||LA24_0==56) ) {
                alt24=1;
            }
            else if ( (LA24_0==35||LA24_0==47||LA24_0==49||LA24_0==51||LA24_0==54||(LA24_0>=57 && LA24_0<=58)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:1966:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:1966:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalPascal.g:1967:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:1967:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalPascal.g:1968:6: lv_simple_2_0= rulesimple_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_2_0,
                    							"org.xtext.ufcg.compiladores.Pascal.simple_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1986:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:1986:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalPascal.g:1987:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:1987:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalPascal.g:1988:6: lv_structured_3_0= rulestructured_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"structured",
                    							lv_structured_3_0,
                    							"org.xtext.ufcg.compiladores.Pascal.structured_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:2010:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:2010:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:2011:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:2017:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2023:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )? )
            // InternalPascal.g:2024:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )?
            {
            // InternalPascal.g:2024:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) )?
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==22||LA25_1==41||LA25_1==45||LA25_1==68) ) {
                    alt25=1;
                }
                else if ( (LA25_1==24) ) {
                    alt25=2;
                }
            }
            else if ( (LA25_0==46) ) {
                alt25=3;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2025:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:2025:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:2026:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:2026:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:2027:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.assignment_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2045:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:2045:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:2046:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:2046:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:2047:5: lv_function_1_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2065:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:2065:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalPascal.g:2066:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalPascal.g:2066:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalPascal.g:2067:5: lv_goto_2_0= rulegoto_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"goto",
                    						lv_goto_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.goto_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:2088:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:2088:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:2089:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:2095:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2101:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:2102:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:2102:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:2103:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:2103:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:2104:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:2104:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:2105:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:2126:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:2127:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:2127:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:2128:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:2149:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:2149:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:2150:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalPascal.g:2156:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2162:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:2163:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:2163:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:2164:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
            		
            // InternalPascal.g:2168:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:2169:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:2169:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:2170:5: lv_label_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoto_statementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:2191:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2191:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2192:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:2198:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_with_stt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_with_stt_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2204:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_with_stt_3_0= rulewith_statement ) ) ) )
            // InternalPascal.g:2205:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_with_stt_3_0= rulewith_statement ) ) )
            {
            // InternalPascal.g:2205:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_with_stt_3_0= rulewith_statement ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt26=1;
                }
                break;
            case 47:
            case 49:
            case 51:
                {
                alt26=2;
                }
                break;
            case 54:
            case 57:
                {
                alt26=3;
                }
                break;
            case 58:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2206:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:2206:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalPascal.g:2207:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:2207:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalPascal.g:2208:5: lv_compound_0_0= rulecompound_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"compound",
                    						lv_compound_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.compound_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2226:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2226:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2227:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2227:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2228:5: lv_repetitive_1_0= rulerepetitive_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"repetitive",
                    						lv_repetitive_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.repetitive_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2246:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2246:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2247:4: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2247:4: (lv_conditional_2_0= ruleconditional_statement )
                    // InternalPascal.g:2248:5: lv_conditional_2_0= ruleconditional_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.conditional_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2266:3: ( (lv_with_stt_3_0= rulewith_statement ) )
                    {
                    // InternalPascal.g:2266:3: ( (lv_with_stt_3_0= rulewith_statement ) )
                    // InternalPascal.g:2267:4: (lv_with_stt_3_0= rulewith_statement )
                    {
                    // InternalPascal.g:2267:4: (lv_with_stt_3_0= rulewith_statement )
                    // InternalPascal.g:2268:5: lv_with_stt_3_0= rulewith_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getWith_sttWith_statementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_with_stt_3_0=rulewith_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"with_stt",
                    						lv_with_stt_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.with_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:2289:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:2289:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:2290:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:2296:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_stmt_seq_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2302:2: ( (otherlv_0= 'begin' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:2303:2: (otherlv_0= 'begin' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:2303:2: (otherlv_0= 'begin' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:2304:3: otherlv_0= 'begin' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:2308:3: ( (lv_stmt_seq_1_0= rulestatement_sequence ) )
            // InternalPascal.g:2309:4: (lv_stmt_seq_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:2309:4: (lv_stmt_seq_1_0= rulestatement_sequence )
            // InternalPascal.g:2310:5: lv_stmt_seq_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getStmt_seqStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_stmt_seq_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            					}
            					set(
            						current,
            						"stmt_seq",
            						lv_stmt_seq_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalPascal.g:2335:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:2335:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:2336:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalPascal.g:2342:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_while_0_0= rulewhile_statement ) ) | ( (lv_repeat_1_0= rulerepeat_statement ) ) | ( (lv_for_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_while_0_0 = null;

        EObject lv_repeat_1_0 = null;

        EObject lv_for_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2348:2: ( ( ( (lv_while_0_0= rulewhile_statement ) ) | ( (lv_repeat_1_0= rulerepeat_statement ) ) | ( (lv_for_2_0= rulefor_statement ) ) ) )
            // InternalPascal.g:2349:2: ( ( (lv_while_0_0= rulewhile_statement ) ) | ( (lv_repeat_1_0= rulerepeat_statement ) ) | ( (lv_for_2_0= rulefor_statement ) ) )
            {
            // InternalPascal.g:2349:2: ( ( (lv_while_0_0= rulewhile_statement ) ) | ( (lv_repeat_1_0= rulerepeat_statement ) ) | ( (lv_for_2_0= rulefor_statement ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 51:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2350:3: ( (lv_while_0_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:2350:3: ( (lv_while_0_0= rulewhile_statement ) )
                    // InternalPascal.g:2351:4: (lv_while_0_0= rulewhile_statement )
                    {
                    // InternalPascal.g:2351:4: (lv_while_0_0= rulewhile_statement )
                    // InternalPascal.g:2352:5: lv_while_0_0= rulewhile_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileWhile_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_while_0_0=rulewhile_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"while",
                    						lv_while_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.while_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2370:3: ( (lv_repeat_1_0= rulerepeat_statement ) )
                    {
                    // InternalPascal.g:2370:3: ( (lv_repeat_1_0= rulerepeat_statement ) )
                    // InternalPascal.g:2371:4: (lv_repeat_1_0= rulerepeat_statement )
                    {
                    // InternalPascal.g:2371:4: (lv_repeat_1_0= rulerepeat_statement )
                    // InternalPascal.g:2372:5: lv_repeat_1_0= rulerepeat_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatRepeat_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repeat_1_0=rulerepeat_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"repeat",
                    						lv_repeat_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.repeat_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2390:3: ( (lv_for_2_0= rulefor_statement ) )
                    {
                    // InternalPascal.g:2390:3: ( (lv_for_2_0= rulefor_statement ) )
                    // InternalPascal.g:2391:4: (lv_for_2_0= rulefor_statement )
                    {
                    // InternalPascal.g:2391:4: (lv_for_2_0= rulefor_statement )
                    // InternalPascal.g:2392:5: lv_for_2_0= rulefor_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForFor_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_for_2_0=rulefor_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"for",
                    						lv_for_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.for_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // InternalPascal.g:2413:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:2413:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:2414:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalPascal.g:2420:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2426:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:2427:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:2427:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:2428:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
            		
            // InternalPascal.g:2432:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2433:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2433:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2434:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
            		
            // InternalPascal.g:2455:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:2456:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:2456:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:2457:5: lv_statement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // InternalPascal.g:2478:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalPascal.g:2478:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalPascal.g:2479:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // InternalPascal.g:2485:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_stmt_seq_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2491:2: ( (otherlv_0= 'repeat' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:2492:2: (otherlv_0= 'repeat' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:2492:2: (otherlv_0= 'repeat' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:2493:3: otherlv_0= 'repeat' ( (lv_stmt_seq_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
            		
            // InternalPascal.g:2497:3: ( (lv_stmt_seq_1_0= rulestatement_sequence ) )
            // InternalPascal.g:2498:4: (lv_stmt_seq_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:2498:4: (lv_stmt_seq_1_0= rulestatement_sequence )
            // InternalPascal.g:2499:5: lv_stmt_seq_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getStmt_seqStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_stmt_seq_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"stmt_seq",
            						lv_stmt_seq_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
            		
            // InternalPascal.g:2520:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:2521:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:2521:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:2522:5: lv_expression_3_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalPascal.g:2543:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:2543:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:2544:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalPascal.g:2550:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_initID_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expressionInit_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expressionFin_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_stmt_8_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_initID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expressionInit_3_0 = null;

        EObject lv_expressionFin_6_0 = null;

        EObject lv_stmt_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2556:2: ( (otherlv_0= 'for' ( (lv_initID_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expressionInit_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expressionFin_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_stmt_8_0= rulestatement ) ) ) )
            // InternalPascal.g:2557:2: (otherlv_0= 'for' ( (lv_initID_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expressionInit_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expressionFin_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_stmt_8_0= rulestatement ) ) )
            {
            // InternalPascal.g:2557:2: (otherlv_0= 'for' ( (lv_initID_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expressionInit_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expressionFin_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_stmt_8_0= rulestatement ) ) )
            // InternalPascal.g:2558:3: otherlv_0= 'for' ( (lv_initID_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_expressionInit_3_0= ruleexpression ) ) (otherlv_4= 'to' | otherlv_5= 'downto' ) ( (lv_expressionFin_6_0= ruleexpression ) ) otherlv_7= 'do' ( (lv_stmt_8_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
            		
            // InternalPascal.g:2562:3: ( (lv_initID_1_0= RULE_ID ) )
            // InternalPascal.g:2563:4: (lv_initID_1_0= RULE_ID )
            {
            // InternalPascal.g:2563:4: (lv_initID_1_0= RULE_ID )
            // InternalPascal.g:2564:5: lv_initID_1_0= RULE_ID
            {
            lv_initID_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_initID_1_0, grammarAccess.getFor_statementAccess().getInitIDIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFor_statementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initID",
            						lv_initID_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getColonEqualsSignKeyword_2());
            		
            // InternalPascal.g:2584:3: ( (lv_expressionInit_3_0= ruleexpression ) )
            // InternalPascal.g:2585:4: (lv_expressionInit_3_0= ruleexpression )
            {
            // InternalPascal.g:2585:4: (lv_expressionInit_3_0= ruleexpression )
            // InternalPascal.g:2586:5: lv_expressionInit_3_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionInitExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_expressionInit_3_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"expressionInit",
            						lv_expressionInit_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2603:3: (otherlv_4= 'to' | otherlv_5= 'downto' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2604:4: otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getFor_statementAccess().getToKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2609:4: otherlv_5= 'downto'
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_36); 

                    				newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:2614:3: ( (lv_expressionFin_6_0= ruleexpression ) )
            // InternalPascal.g:2615:4: (lv_expressionFin_6_0= ruleexpression )
            {
            // InternalPascal.g:2615:4: (lv_expressionFin_6_0= ruleexpression )
            // InternalPascal.g:2616:5: lv_expressionFin_6_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionFinExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_expressionFin_6_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"expressionFin",
            						lv_expressionFin_6_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getFor_statementAccess().getDoKeyword_6());
            		
            // InternalPascal.g:2637:3: ( (lv_stmt_8_0= rulestatement ) )
            // InternalPascal.g:2638:4: (lv_stmt_8_0= rulestatement )
            {
            // InternalPascal.g:2638:4: (lv_stmt_8_0= rulestatement )
            // InternalPascal.g:2639:5: lv_stmt_8_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getStmtStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmt_8_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_8_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascal.g:2660:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2660:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2661:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascal.g:2667:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2673:2: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // InternalPascal.g:2674:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // InternalPascal.g:2674:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            else if ( (LA29_0==57) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2675:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // InternalPascal.g:2675:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // InternalPascal.g:2676:4: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // InternalPascal.g:2676:4: (lv_ifStmt_0_0= ruleif_statement )
                    // InternalPascal.g:2677:5: lv_ifStmt_0_0= ruleif_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ifStmt_0_0=ruleif_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"ifStmt",
                    						lv_ifStmt_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.if_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2695:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // InternalPascal.g:2695:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // InternalPascal.g:2696:4: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // InternalPascal.g:2696:4: (lv_caseStmt_1_0= rulecase_statement )
                    // InternalPascal.g:2697:5: lv_caseStmt_1_0= rulecase_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_caseStmt_1_0=rulecase_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"caseStmt",
                    						lv_caseStmt_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.case_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // InternalPascal.g:2718:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:2718:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:2719:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalPascal.g:2725:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2731:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:2732:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:2732:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:2733:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
            		
            // InternalPascal.g:2737:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2738:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2738:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2739:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
            		
            // InternalPascal.g:2760:3: ( (lv_ifStatement_3_0= rulestatement ) )
            // InternalPascal.g:2761:4: (lv_ifStatement_3_0= rulestatement )
            {
            // InternalPascal.g:2761:4: (lv_ifStatement_3_0= rulestatement )
            // InternalPascal.g:2762:5: lv_ifStatement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"ifStatement",
            						lv_ifStatement_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2779:3: (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2780:4: otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                    			
                    // InternalPascal.g:2784:4: ( (lv_elseStatement_5_0= rulestatement ) )
                    // InternalPascal.g:2785:5: (lv_elseStatement_5_0= rulestatement )
                    {
                    // InternalPascal.g:2785:5: (lv_elseStatement_5_0= rulestatement )
                    // InternalPascal.g:2786:6: lv_elseStatement_5_0= rulestatement
                    {

                    						newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_5_0,
                    							"org.xtext.ufcg.compiladores.Pascal.statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalPascal.g:2808:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascal.g:2808:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascal.g:2809:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalPascal.g:2815:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' this_expression_1= ruleexpression otherlv_2= 'of' ( (lv_case_limbs_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )* otherlv_6= ';' otherlv_7= 'end' ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_expression_1 = null;

        EObject lv_case_limbs_3_0 = null;

        EObject lv_case_limbs_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2821:2: ( (otherlv_0= 'case' this_expression_1= ruleexpression otherlv_2= 'of' ( (lv_case_limbs_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )* otherlv_6= ';' otherlv_7= 'end' ) )
            // InternalPascal.g:2822:2: (otherlv_0= 'case' this_expression_1= ruleexpression otherlv_2= 'of' ( (lv_case_limbs_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )* otherlv_6= ';' otherlv_7= 'end' )
            {
            // InternalPascal.g:2822:2: (otherlv_0= 'case' this_expression_1= ruleexpression otherlv_2= 'of' ( (lv_case_limbs_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )* otherlv_6= ';' otherlv_7= 'end' )
            // InternalPascal.g:2823:3: otherlv_0= 'case' this_expression_1= ruleexpression otherlv_2= 'of' ( (lv_case_limbs_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )* otherlv_6= ';' otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_expression_1=ruleexpression();

            state._fsp--;


            			current = this_expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
            		
            // InternalPascal.g:2839:3: ( (lv_case_limbs_3_0= rulecase_limb ) )
            // InternalPascal.g:2840:4: (lv_case_limbs_3_0= rulecase_limb )
            {
            // InternalPascal.g:2840:4: (lv_case_limbs_3_0= rulecase_limb )
            // InternalPascal.g:2841:5: lv_case_limbs_3_0= rulecase_limb
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbsCase_limbParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_case_limbs_3_0=rulecase_limb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					add(
            						current,
            						"case_limbs",
            						lv_case_limbs_3_0,
            						"org.xtext.ufcg.compiladores.Pascal.case_limb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2858:3: (otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_ID||LA31_1==RULE_ADDITION_OPERATOR||LA31_1==RULE_STRING||(LA31_1>=RULE_INTEGER_NUMBER && LA31_1<=RULE_SIGNED_REAL_NUMBER)||LA31_1==64||(LA31_1>=66 && LA31_1<=67)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalPascal.g:2859:4: otherlv_4= ';' ( (lv_case_limbs_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:2863:4: ( (lv_case_limbs_5_0= rulecase_limb ) )
            	    // InternalPascal.g:2864:5: (lv_case_limbs_5_0= rulecase_limb )
            	    {
            	    // InternalPascal.g:2864:5: (lv_case_limbs_5_0= rulecase_limb )
            	    // InternalPascal.g:2865:6: lv_case_limbs_5_0= rulecase_limb
            	    {

            	    						newCompositeNode(grammarAccess.getCase_statementAccess().getCase_limbsCase_limbParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_case_limbs_5_0=rulecase_limb();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"case_limbs",
            	    							lv_case_limbs_5_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.case_limb");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // InternalPascal.g:2895:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalPascal.g:2895:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalPascal.g:2896:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // InternalPascal.g:2902:1: rulecase_limb returns [EObject current=null] : ( ( (lv_case_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_stmt_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_case_list_0_0 = null;

        EObject lv_stmt_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2908:2: ( ( ( (lv_case_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_stmt_2_0= rulestatement ) ) ) )
            // InternalPascal.g:2909:2: ( ( (lv_case_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_stmt_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:2909:2: ( ( (lv_case_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_stmt_2_0= rulestatement ) ) )
            // InternalPascal.g:2910:3: ( (lv_case_list_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_stmt_2_0= rulestatement ) )
            {
            // InternalPascal.g:2910:3: ( (lv_case_list_0_0= rulecase_label_list ) )
            // InternalPascal.g:2911:4: (lv_case_list_0_0= rulecase_label_list )
            {
            // InternalPascal.g:2911:4: (lv_case_list_0_0= rulecase_label_list )
            // InternalPascal.g:2912:5: lv_case_list_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getCase_listCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_case_list_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"case_list",
            						lv_case_list_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2933:3: ( (lv_stmt_2_0= rulestatement ) )
            // InternalPascal.g:2934:4: (lv_stmt_2_0= rulestatement )
            {
            // InternalPascal.g:2934:4: (lv_stmt_2_0= rulestatement )
            // InternalPascal.g:2935:5: lv_stmt_2_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getStmtStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmt_2_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // InternalPascal.g:2956:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:2956:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:2957:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalPascal.g:2963:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2969:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:2970:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:2970:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:2971:3: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:2971:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascal.g:2972:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascal.g:2972:4: (lv_constants_0_0= ruleconstant )
            // InternalPascal.g:2973:5: lv_constants_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2990:3: (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPascal.g:2991:4: otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_17); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2995:4: ( (lv_constants_2_0= ruleconstant ) )
            	    // InternalPascal.g:2996:5: (lv_constants_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2996:5: (lv_constants_2_0= ruleconstant )
            	    // InternalPascal.g:2997:6: lv_constants_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_2_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRulewith_statement"
    // InternalPascal.g:3019:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalPascal.g:3019:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalPascal.g:3020:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // InternalPascal.g:3026:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_record_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )* otherlv_4= 'do' ( (lv_stmt_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_record_1_0=null;
        Token otherlv_2=null;
        Token lv_records_3_0=null;
        Token otherlv_4=null;
        EObject lv_stmt_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3032:2: ( (otherlv_0= 'with' ( (lv_record_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )* otherlv_4= 'do' ( (lv_stmt_5_0= rulestatement ) ) ) )
            // InternalPascal.g:3033:2: (otherlv_0= 'with' ( (lv_record_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )* otherlv_4= 'do' ( (lv_stmt_5_0= rulestatement ) ) )
            {
            // InternalPascal.g:3033:2: (otherlv_0= 'with' ( (lv_record_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )* otherlv_4= 'do' ( (lv_stmt_5_0= rulestatement ) ) )
            // InternalPascal.g:3034:3: otherlv_0= 'with' ( (lv_record_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )* otherlv_4= 'do' ( (lv_stmt_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
            		
            // InternalPascal.g:3038:3: ( (lv_record_1_0= RULE_ID ) )
            // InternalPascal.g:3039:4: (lv_record_1_0= RULE_ID )
            {
            // InternalPascal.g:3039:4: (lv_record_1_0= RULE_ID )
            // InternalPascal.g:3040:5: lv_record_1_0= RULE_ID
            {
            lv_record_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_record_1_0, grammarAccess.getWith_statementAccess().getRecordIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWith_statementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"record",
            						lv_record_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3056:3: (otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:3057:4: otherlv_2= ',' ( (lv_records_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:3061:4: ( (lv_records_3_0= RULE_ID ) )
            	    // InternalPascal.g:3062:5: (lv_records_3_0= RULE_ID )
            	    {
            	    // InternalPascal.g:3062:5: (lv_records_3_0= RULE_ID )
            	    // InternalPascal.g:3063:6: lv_records_3_0= RULE_ID
            	    {
            	    lv_records_3_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    						newLeafNode(lv_records_3_0, grammarAccess.getWith_statementAccess().getRecordsIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWith_statementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"records",
            	    							lv_records_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
            		
            // InternalPascal.g:3084:3: ( (lv_stmt_5_0= rulestatement ) )
            // InternalPascal.g:3085:4: (lv_stmt_5_0= rulestatement )
            {
            // InternalPascal.g:3085:4: (lv_stmt_5_0= rulestatement )
            // InternalPascal.g:3086:5: lv_stmt_5_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWith_statementAccess().getStmtStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmt_5_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWith_statementRule());
            					}
            					set(
            						current,
            						"stmt",
            						lv_stmt_5_0,
            						"org.xtext.ufcg.compiladores.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:3107:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:3107:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:3108:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:3114:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3120:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:3121:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:3121:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:3122:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:3122:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:3123:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:3123:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:3124:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.simple_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3141:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_RELATIONAL_OPERATOR||LA35_0==30||LA35_0==59) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3142:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:3142:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt34=1;
                        }
                        break;
                    case 59:
                        {
                        alt34=2;
                        }
                        break;
                    case 30:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // InternalPascal.g:3143:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // InternalPascal.g:3143:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // InternalPascal.g:3144:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // InternalPascal.g:3144:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            // InternalPascal.g:3145:7: lv_operators_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_36); 

                            							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"operators",
                            								lv_operators_1_0,
                            								"org.xtext.ufcg.compiladores.Pascal.RELATIONAL_OPERATOR");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:3162:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:3162:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:3163:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:3163:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:3164:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,59,FOLLOW_36); 

                            							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:3177:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:3177:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:3178:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:3178:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:3179:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,30,FOLLOW_36); 

                            							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:3192:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:3193:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:3193:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:3194:6: lv_expressions_4_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_4_0,
                    							"org.xtext.ufcg.compiladores.Pascal.simple_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:3216:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3218:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:3219:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:3228:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3235:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:3236:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:3236:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:3237:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:3237:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ADDITION_OPERATOR) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPascal.g:3238:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // InternalPascal.g:3238:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    // InternalPascal.g:3239:5: lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_36); 

                    					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_expressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"prefixOperator",
                    						lv_prefixOperator_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.ADDITION_OPERATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:3255:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:3256:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:3256:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:3257:5: lv_terms_1_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3274:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ADDITION_OPERATOR||LA38_0==60) ) {
                    alt38=1;
                }
                else if ( ((LA38_0>=RULE_INTEGER_NUMBER && LA38_0<=RULE_REAL_NUMBER)) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPascal.g:3275:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:3275:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:3276:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:3276:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==RULE_ADDITION_OPERATOR) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==60) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalPascal.g:3277:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:3277:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            // InternalPascal.g:3278:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            {
            	            // InternalPascal.g:3278:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            // InternalPascal.g:3279:8: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_36); 

            	            								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"operators",
            	            									lv_operators_2_0,
            	            									"org.xtext.ufcg.compiladores.Pascal.ADDITION_OPERATOR");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:3296:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:3296:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:3297:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:3297:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:3298:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,60,FOLLOW_36); 

            	            								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:3311:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:3312:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:3312:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:3313:7: lv_terms_4_0= ruleterm
            	    {

            	    							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_45);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"terms",
            	    								lv_terms_4_0,
            	    								"org.xtext.ufcg.compiladores.Pascal.term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:3332:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:3332:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:3333:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:3333:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:3334:6: lv_terms_5_0= ruleunsigned_number
            	    {

            	    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_5_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.unsigned_number");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:3359:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:3359:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:3360:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:3366:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3372:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:3373:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:3373:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:3374:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:3374:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:3375:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:3375:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:3376:5: lv_factors_0_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3393:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_MULTIPLICATION_OPERATOR||(LA40_0>=61 && LA40_0<=63)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3394:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:3394:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // InternalPascal.g:3395:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:3395:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // InternalPascal.g:3396:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // InternalPascal.g:3396:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // InternalPascal.g:3397:7: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_36); 

            	            							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"operators",
            	            								lv_operators_1_0,
            	            								"org.xtext.ufcg.compiladores.Pascal.MULTIPLICATION_OPERATOR");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:3414:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:3414:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:3415:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:3415:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:3416:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,61,FOLLOW_36); 

            	            							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:3429:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:3429:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:3430:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:3430:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:3431:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,62,FOLLOW_36); 

            	            							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:3444:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:3444:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:3445:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:3445:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:3446:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,63,FOLLOW_36); 

            	            							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:3459:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:3460:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:3460:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:3461:6: lv_factors_5_0= rulefactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_5_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.factor");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:3483:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:3483:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:3484:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:3490:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_boolean_11_0= 'true' ) ) | ( (lv_boolean_12_0= 'false' ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_boolean_11_0=null;
        Token lv_boolean_12_0=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_not_10_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3496:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_boolean_11_0= 'true' ) ) | ( (lv_boolean_12_0= 'false' ) ) ) )
            // InternalPascal.g:3497:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_boolean_11_0= 'true' ) ) | ( (lv_boolean_12_0= 'false' ) ) )
            {
            // InternalPascal.g:3497:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_boolean_11_0= 'true' ) ) | ( (lv_boolean_12_0= 'false' ) ) )
            int alt41=10;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:3498:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:3498:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:3499:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:3499:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:3500:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3518:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:3518:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:3519:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:3519:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:3520:5: lv_number_1_0= rulenumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3538:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:3538:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:3539:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:3539:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:3540:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:3557:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:3557:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:3558:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:3558:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:3559:5: lv_set_3_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:3577:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:3577:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:3578:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:3578:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:3579:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "nil", true, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:3592:3: ( (lv_function_5_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:3592:3: ( (lv_function_5_0= rulefunction_designator ) )
                    // InternalPascal.g:3593:4: (lv_function_5_0= rulefunction_designator )
                    {
                    // InternalPascal.g:3593:4: (lv_function_5_0= rulefunction_designator )
                    // InternalPascal.g:3594:5: lv_function_5_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_5_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_5_0,
                    						"org.xtext.ufcg.compiladores.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:3612:3: (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' )
                    {
                    // InternalPascal.g:3612:3: (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' )
                    // InternalPascal.g:3613:4: otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalPascal.g:3617:4: ( (lv_expression_7_0= ruleexpression ) )
                    // InternalPascal.g:3618:5: (lv_expression_7_0= ruleexpression )
                    {
                    // InternalPascal.g:3618:5: (lv_expression_7_0= ruleexpression )
                    // InternalPascal.g:3619:6: lv_expression_7_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_7_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_7_0,
                    							"org.xtext.ufcg.compiladores.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:3642:3: (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:3642:3: (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) )
                    // InternalPascal.g:3643:4: otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) )
                    {
                    otherlv_9=(Token)match(input,65,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getFactorAccess().getNotKeyword_7_0());
                    			
                    // InternalPascal.g:3647:4: ( (lv_not_10_0= rulefactor ) )
                    // InternalPascal.g:3648:5: (lv_not_10_0= rulefactor )
                    {
                    // InternalPascal.g:3648:5: (lv_not_10_0= rulefactor )
                    // InternalPascal.g:3649:6: lv_not_10_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_10_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"not",
                    							lv_not_10_0,
                    							"org.xtext.ufcg.compiladores.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:3668:3: ( (lv_boolean_11_0= 'true' ) )
                    {
                    // InternalPascal.g:3668:3: ( (lv_boolean_11_0= 'true' ) )
                    // InternalPascal.g:3669:4: (lv_boolean_11_0= 'true' )
                    {
                    // InternalPascal.g:3669:4: (lv_boolean_11_0= 'true' )
                    // InternalPascal.g:3670:5: lv_boolean_11_0= 'true'
                    {
                    lv_boolean_11_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_boolean_11_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_11_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:3683:3: ( (lv_boolean_12_0= 'false' ) )
                    {
                    // InternalPascal.g:3683:3: ( (lv_boolean_12_0= 'false' ) )
                    // InternalPascal.g:3684:4: (lv_boolean_12_0= 'false' )
                    {
                    // InternalPascal.g:3684:4: (lv_boolean_12_0= 'false' )
                    // InternalPascal.g:3685:5: lv_boolean_12_0= 'false'
                    {
                    lv_boolean_12_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_boolean_12_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_12_0, "false");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:3701:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:3701:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:3702:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:3708:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleresto ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3714:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleresto ) ) ) )
            // InternalPascal.g:3715:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleresto ) ) )
            {
            // InternalPascal.g:3715:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleresto ) ) )
            // InternalPascal.g:3716:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleresto ) )
            {
            // InternalPascal.g:3716:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:3717:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:3717:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:3718:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3734:3: ( (lv_variable_1_0= ruleresto ) )
            // InternalPascal.g:3735:4: (lv_variable_1_0= ruleresto )
            {
            // InternalPascal.g:3735:4: (lv_variable_1_0= ruleresto )
            // InternalPascal.g:3736:5: lv_variable_1_0= ruleresto
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableRestoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_1_0=ruleresto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.resto");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRuleresto"
    // InternalPascal.g:3757:1: entryRuleresto returns [EObject current=null] : iv_ruleresto= ruleresto EOF ;
    public final EObject entryRuleresto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleresto = null;


        try {
            // InternalPascal.g:3757:46: (iv_ruleresto= ruleresto EOF )
            // InternalPascal.g:3758:2: iv_ruleresto= ruleresto EOF
            {
             newCompositeNode(grammarAccess.getRestoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleresto=ruleresto();

            state._fsp--;

             current =iv_ruleresto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleresto"


    // $ANTLR start "ruleresto"
    // InternalPascal.g:3764:1: ruleresto returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) ) )? ;
    public final EObject ruleresto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3770:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) ) )? )
            // InternalPascal.g:3771:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) ) )?
            {
            // InternalPascal.g:3771:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) ) )?
            int alt42=4;
            switch ( input.LA(1) ) {
                case 41:
                    {
                    alt42=1;
                    }
                    break;
                case 22:
                    {
                    alt42=2;
                    }
                    break;
                case 68:
                    {
                    alt42=3;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // InternalPascal.g:3772:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) )
                    {
                    // InternalPascal.g:3772:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) ) )
                    // InternalPascal.g:3773:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= ruleresto ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_0, grammarAccess.getRestoAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:3777:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:3778:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:3778:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:3779:6: lv_expressions_1_0= ruleexpression_list
                    {

                    						newCompositeNode(grammarAccess.getRestoAccess().getExpressionsExpression_listParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestoRule());
                    						}
                    						set(
                    							current,
                    							"expressions",
                    							lv_expressions_1_0,
                    							"org.xtext.ufcg.compiladores.Pascal.expression_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getRestoAccess().getRightSquareBracketKeyword_0_2());
                    			
                    // InternalPascal.g:3800:4: ( (lv_array_3_0= ruleresto ) )
                    // InternalPascal.g:3801:5: (lv_array_3_0= ruleresto )
                    {
                    // InternalPascal.g:3801:5: (lv_array_3_0= ruleresto )
                    // InternalPascal.g:3802:6: lv_array_3_0= ruleresto
                    {

                    						newCompositeNode(grammarAccess.getRestoAccess().getArrayRestoParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=ruleresto();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestoRule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_3_0,
                    							"org.xtext.ufcg.compiladores.Pascal.resto");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3821:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) )
                    {
                    // InternalPascal.g:3821:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) ) )
                    // InternalPascal.g:3822:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= ruleresto ) )
                    {
                    // InternalPascal.g:3822:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:3823:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:3823:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:3824:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getRestoAccess().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestoRule());
                    						}
                    						setWithLastConsumed(current, "accessor", true, ".");
                    					

                    }


                    }

                    // InternalPascal.g:3836:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:3837:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:3837:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:3838:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getRestoAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalPascal.g:3854:4: ( (lv_variable_6_0= ruleresto ) )
                    // InternalPascal.g:3855:5: (lv_variable_6_0= ruleresto )
                    {
                    // InternalPascal.g:3855:5: (lv_variable_6_0= ruleresto )
                    // InternalPascal.g:3856:6: lv_variable_6_0= ruleresto
                    {

                    						newCompositeNode(grammarAccess.getRestoAccess().getVariableRestoParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=ruleresto();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestoRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.ufcg.compiladores.Pascal.resto");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3875:3: (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) )
                    {
                    // InternalPascal.g:3875:3: (otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) ) )
                    // InternalPascal.g:3876:4: otherlv_7= '^' ( (lv_pointer_8_0= ruleresto ) )
                    {
                    otherlv_7=(Token)match(input,68,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getRestoAccess().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalPascal.g:3880:4: ( (lv_pointer_8_0= ruleresto ) )
                    // InternalPascal.g:3881:5: (lv_pointer_8_0= ruleresto )
                    {
                    // InternalPascal.g:3881:5: (lv_pointer_8_0= ruleresto )
                    // InternalPascal.g:3882:6: lv_pointer_8_0= ruleresto
                    {

                    						newCompositeNode(grammarAccess.getRestoAccess().getPointerRestoParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=ruleresto();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestoRule());
                    						}
                    						set(
                    							current,
                    							"pointer",
                    							lv_pointer_8_0,
                    							"org.xtext.ufcg.compiladores.Pascal.resto");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleresto"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:3904:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:3904:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:3905:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:3911:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3917:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:3918:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:3918:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:3919:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:3919:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:3920:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:3920:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:3921:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,41,FOLLOW_48); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalPascal.g:3933:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==RULE_ADDITION_OPERATOR||LA43_0==RULE_STRING||(LA43_0>=RULE_INTEGER_NUMBER && LA43_0<=RULE_SIGNED_REAL_NUMBER)||LA43_0==24||LA43_0==41||(LA43_0>=64 && LA43_0<=67)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3934:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:3934:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:3935:5: lv_expressions_1_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:3952:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:3953:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:3953:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:3954:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,42,FOLLOW_2); 

            					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:3970:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:3970:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:3971:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:3977:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3983:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:3984:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:3984:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:3985:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:3985:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:3986:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:3986:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:3987:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_listRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4004:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==28) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPascal.g:4005:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_36); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:4009:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:4010:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:4010:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:4011:6: lv_expressions_2_0= ruleexpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:4033:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:4033:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:4034:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:4040:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4046:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:4047:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:4047:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:4048:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:4048:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:4049:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:4049:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:4050:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_designatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:4070:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==RULE_ADDITION_OPERATOR||LA45_0==RULE_STRING||(LA45_0>=RULE_INTEGER_NUMBER && LA45_0<=RULE_SIGNED_REAL_NUMBER)||LA45_0==24||LA45_0==41||(LA45_0>=64 && LA45_0<=67)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:4071:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:4071:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:4072:5: lv_expressions_2_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:4097:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:4097:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:4098:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:4104:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4110:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalPascal.g:4111:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalPascal.g:4111:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case 24:
            case 64:
            case 66:
            case 67:
                {
                alt46=1;
                }
                break;
            case 39:
            case 40:
            case 69:
            case 70:
            case 71:
                {
                alt46=2;
                }
                break;
            case 68:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalPascal.g:4112:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:4112:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:4113:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:4113:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:4114:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.simple_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4132:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:4132:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascal.g:4133:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:4133:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascal.g:4134:5: lv_structured_1_0= rulestructured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.structured_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4152:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:4152:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalPascal.g:4153:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:4153:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalPascal.g:4154:5: lv_pointer_2_0= rulepointer_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"pointer",
                    						lv_pointer_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.pointer_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:4175:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:4175:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:4176:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:4182:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4188:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPascal.g:4189:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPascal.g:4189:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case 64:
            case 66:
            case 67:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==EOF||(LA47_2>=25 && LA47_2<=26)||LA47_2==28||LA47_2==36||LA47_2==42) ) {
                    alt47=3;
                }
                else if ( (LA47_2==44) ) {
                    alt47=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt47=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalPascal.g:4190:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:4190:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalPascal.g:4191:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:4191:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalPascal.g:4192:5: lv_subrange_0_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"subrange",
                    						lv_subrange_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.subrange_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4210:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:4210:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:4211:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:4211:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalPascal.g:4212:5: lv_enumerated_1_0= ruleenumerated_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"enumerated",
                    						lv_enumerated_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.enumerated_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4230:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:4230:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalPascal.g:4231:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalPascal.g:4231:4: (lv_name_2_0= RULE_ID )
                    // InternalPascal.g:4232:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:4252:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:4252:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:4253:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:4259:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4265:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:4266:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:4266:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:4267:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:4271:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:4272:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:4272:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:4273:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:4298:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


        try {
            // InternalPascal.g:4298:54: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:4299:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:4305:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4311:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalPascal.g:4312:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalPascal.g:4312:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==RULE_ADDITION_OPERATOR||LA48_0==RULE_STRING||(LA48_0>=RULE_INTEGER_NUMBER && LA48_0<=RULE_SIGNED_REAL_NUMBER)||LA48_0==64||(LA48_0>=66 && LA48_0<=67)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_NUMERIC_SUBRANGE) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPascal.g:4313:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:4313:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalPascal.g:4314:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalPascal.g:4314:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalPascal.g:4315:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalPascal.g:4315:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalPascal.g:4316:6: lv_initialConst_0_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"initialConst",
                    							lv_initialConst_0_0,
                    							"org.xtext.ufcg.compiladores.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                    			
                    // InternalPascal.g:4337:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalPascal.g:4338:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalPascal.g:4338:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalPascal.g:4339:6: lv_finalConst_2_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"finalConst",
                    							lv_finalConst_2_0,
                    							"org.xtext.ufcg.compiladores.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4358:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:4358:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalPascal.g:4359:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalPascal.g:4359:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalPascal.g:4360:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalPascal.g:4360:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalPascal.g:4361:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_17); 

                    						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubrange_typeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"subrange",
                    							lv_subrange_3_0,
                    							"org.xtext.ufcg.compiladores.Pascal.NUMERIC_SUBRANGE");
                    					

                    }


                    }

                    // InternalPascal.g:4377:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalPascal.g:4378:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalPascal.g:4378:5: (lv_const_4_0= ruleconstant )
                    // InternalPascal.g:4379:6: lv_const_4_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"const",
                    							lv_const_4_0,
                    							"org.xtext.ufcg.compiladores.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:4401:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:4401:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:4402:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:4408:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4414:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:4415:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:4415:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:4416:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:4416:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:4417:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalPascal.g:4417:4: (lv_packed_0_0= 'packed' )
                    // InternalPascal.g:4418:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,39,FOLLOW_51); 

                    					newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStructured_typeRule());
                    					}
                    					setWithLastConsumed(current, "packed", true, "packed");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:4430:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:4431:4: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:4431:4: (lv_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:4432:5: lv_type_1_0= ruleunpacked_structured_type
            {

            					newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.unpacked_structured_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:4453:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:4453:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:4454:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:4460:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_record_1_0= rulerecord_type ) ) | ( (lv_set_2_0= ruleset_type ) ) | ( (lv_file_3_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_record_1_0 = null;

        EObject lv_set_2_0 = null;

        EObject lv_file_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4466:2: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_record_1_0= rulerecord_type ) ) | ( (lv_set_2_0= ruleset_type ) ) | ( (lv_file_3_0= rulefile_type ) ) ) )
            // InternalPascal.g:4467:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_record_1_0= rulerecord_type ) ) | ( (lv_set_2_0= ruleset_type ) ) | ( (lv_file_3_0= rulefile_type ) ) )
            {
            // InternalPascal.g:4467:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_record_1_0= rulerecord_type ) ) | ( (lv_set_2_0= ruleset_type ) ) | ( (lv_file_3_0= rulefile_type ) ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt50=1;
                }
                break;
            case 69:
                {
                alt50=2;
                }
                break;
            case 70:
                {
                alt50=3;
                }
                break;
            case 71:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalPascal.g:4468:3: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:4468:3: ( (lv_array_0_0= rulearray_type ) )
                    // InternalPascal.g:4469:4: (lv_array_0_0= rulearray_type )
                    {
                    // InternalPascal.g:4469:4: (lv_array_0_0= rulearray_type )
                    // InternalPascal.g:4470:5: lv_array_0_0= rulearray_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4488:3: ( (lv_record_1_0= rulerecord_type ) )
                    {
                    // InternalPascal.g:4488:3: ( (lv_record_1_0= rulerecord_type ) )
                    // InternalPascal.g:4489:4: (lv_record_1_0= rulerecord_type )
                    {
                    // InternalPascal.g:4489:4: (lv_record_1_0= rulerecord_type )
                    // InternalPascal.g:4490:5: lv_record_1_0= rulerecord_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_record_1_0=rulerecord_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"record",
                    						lv_record_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.record_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4508:3: ( (lv_set_2_0= ruleset_type ) )
                    {
                    // InternalPascal.g:4508:3: ( (lv_set_2_0= ruleset_type ) )
                    // InternalPascal.g:4509:4: (lv_set_2_0= ruleset_type )
                    {
                    // InternalPascal.g:4509:4: (lv_set_2_0= ruleset_type )
                    // InternalPascal.g:4510:5: lv_set_2_0= ruleset_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_2_0=ruleset_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_2_0,
                    						"org.xtext.ufcg.compiladores.Pascal.set_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:4528:3: ( (lv_file_3_0= rulefile_type ) )
                    {
                    // InternalPascal.g:4528:3: ( (lv_file_3_0= rulefile_type ) )
                    // InternalPascal.g:4529:4: (lv_file_3_0= rulefile_type )
                    {
                    // InternalPascal.g:4529:4: (lv_file_3_0= rulefile_type )
                    // InternalPascal.g:4530:5: lv_file_3_0= rulefile_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileFile_typeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_file_3_0=rulefile_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"file",
                    						lv_file_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.file_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascal.g:4551:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:4551:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:4552:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascal.g:4558:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= rulesimple_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4564:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= rulesimple_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) )
            // InternalPascal.g:4565:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= rulesimple_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            {
            // InternalPascal.g:4565:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= rulesimple_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            // InternalPascal.g:4566:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= rulesimple_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:4574:3: ( (lv_indexes_2_0= rulesimple_type ) )
            // InternalPascal.g:4575:4: (lv_indexes_2_0= rulesimple_type )
            {
            // InternalPascal.g:4575:4: (lv_indexes_2_0= rulesimple_type )
            // InternalPascal.g:4576:5: lv_indexes_2_0= rulesimple_type
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesSimple_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_indexes_2_0=rulesimple_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					add(
            						current,
            						"indexes",
            						lv_indexes_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.simple_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4593:3: (otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==28) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:4594:4: otherlv_3= ',' ( (lv_indexes_4_0= rulesimple_type ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_52); 

            	    				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPascal.g:4598:4: ( (lv_indexes_4_0= rulesimple_type ) )
            	    // InternalPascal.g:4599:5: (lv_indexes_4_0= rulesimple_type )
            	    {
            	    // InternalPascal.g:4599:5: (lv_indexes_4_0= rulesimple_type )
            	    // InternalPascal.g:4600:6: lv_indexes_4_0= rulesimple_type
            	    {

            	    						newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesSimple_typeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_indexes_4_0=rulesimple_type();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indexes",
            	    							lv_indexes_4_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.simple_type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
            		
            // InternalPascal.g:4626:3: ( (lv_type_7_0= ruletype ) )
            // InternalPascal.g:4627:4: (lv_type_7_0= ruletype )
            {
            // InternalPascal.g:4627:4: (lv_type_7_0= ruletype )
            // InternalPascal.g:4628:5: lv_type_7_0= ruletype
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalPascal.g:4649:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:4649:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:4650:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalPascal.g:4656:1: rulerecord_type returns [EObject current=null] : ( ( (lv_record_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_end_2_0= 'end' ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_record_0_0=null;
        Token lv_end_2_0=null;
        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4662:2: ( ( ( (lv_record_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_end_2_0= 'end' ) ) ) )
            // InternalPascal.g:4663:2: ( ( (lv_record_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_end_2_0= 'end' ) ) )
            {
            // InternalPascal.g:4663:2: ( ( (lv_record_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_end_2_0= 'end' ) ) )
            // InternalPascal.g:4664:3: ( (lv_record_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_end_2_0= 'end' ) )
            {
            // InternalPascal.g:4664:3: ( (lv_record_0_0= 'record' ) )
            // InternalPascal.g:4665:4: (lv_record_0_0= 'record' )
            {
            // InternalPascal.g:4665:4: (lv_record_0_0= 'record' )
            // InternalPascal.g:4666:5: lv_record_0_0= 'record'
            {
            lv_record_0_0=(Token)match(input,69,FOLLOW_54); 

            					newLeafNode(lv_record_0_0, grammarAccess.getRecord_typeAccess().getRecordRecordKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "record", lv_record_0_0, "record");
            				

            }


            }

            // InternalPascal.g:4678:3: ( (lv_fields_1_0= rulefield_list ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==57) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:4679:4: (lv_fields_1_0= rulefield_list )
                    {
                    // InternalPascal.g:4679:4: (lv_fields_1_0= rulefield_list )
                    // InternalPascal.g:4680:5: lv_fields_1_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:4697:3: ( (lv_end_2_0= 'end' ) )
            // InternalPascal.g:4698:4: (lv_end_2_0= 'end' )
            {
            // InternalPascal.g:4698:4: (lv_end_2_0= 'end' )
            // InternalPascal.g:4699:5: lv_end_2_0= 'end'
            {
            lv_end_2_0=(Token)match(input,36,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getRecord_typeAccess().getEndEndKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "end", lv_end_2_0, "end");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:4715:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:4715:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:4716:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:4722:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4728:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4729:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4729:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4730:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:4738:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4739:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4739:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4740:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSet_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // InternalPascal.g:4761:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalPascal.g:4761:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalPascal.g:4762:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // InternalPascal.g:4768:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4774:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4775:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4775:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4776:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:4784:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4785:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4785:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4786:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFile_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:4807:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:4807:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:4808:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:4814:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4820:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalPascal.g:4821:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalPascal.g:4821:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalPascal.g:4822:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:4826:3: ( (lv_type_1_0= ruletype ) )
            // InternalPascal.g:4827:4: (lv_type_1_0= ruletype )
            {
            // InternalPascal.g:4827:4: (lv_type_1_0= ruletype )
            // InternalPascal.g:4828:5: lv_type_1_0= ruletype
            {

            					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulefield_list"
    // InternalPascal.g:4849:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:4849:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:4850:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalPascal.g:4856:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4862:2: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) )
            // InternalPascal.g:4863:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            {
            // InternalPascal.g:4863:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            // InternalPascal.g:4864:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )?
            {
            // InternalPascal.g:4864:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==57) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalPascal.g:4865:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // InternalPascal.g:4865:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // InternalPascal.g:4866:5: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // InternalPascal.g:4866:5: ( (lv_fixed_0_0= rulefixed_part ) )
                    // InternalPascal.g:4867:6: (lv_fixed_0_0= rulefixed_part )
                    {
                    // InternalPascal.g:4867:6: (lv_fixed_0_0= rulefixed_part )
                    // InternalPascal.g:4868:7: lv_fixed_0_0= rulefixed_part
                    {

                    							newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_34);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getField_listRule());
                    							}
                    							set(
                    								current,
                    								"fixed",
                    								lv_fixed_0_0,
                    								"org.xtext.ufcg.compiladores.Pascal.fixed_part");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascal.g:4885:5: (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==26) ) {
                        int LA53_1 = input.LA(2);

                        if ( (LA53_1==57) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPascal.g:4886:6: otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,26,FOLLOW_55); 

                            						newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                            					
                            // InternalPascal.g:4890:6: ( (lv_variants_2_0= rulevariant_part ) )
                            // InternalPascal.g:4891:7: (lv_variants_2_0= rulevariant_part )
                            {
                            // InternalPascal.g:4891:7: (lv_variants_2_0= rulevariant_part )
                            // InternalPascal.g:4892:8: lv_variants_2_0= rulevariant_part
                            {

                            								newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0());
                            							
                            pushFollow(FOLLOW_34);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getField_listRule());
                            								}
                            								add(
                            									current,
                            									"variants",
                            									lv_variants_2_0,
                            									"org.xtext.ufcg.compiladores.Pascal.variant_part");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4912:4: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // InternalPascal.g:4912:4: ( (lv_variants_3_0= rulevariant_part ) )
                    // InternalPascal.g:4913:5: (lv_variants_3_0= rulevariant_part )
                    {
                    // InternalPascal.g:4913:5: (lv_variants_3_0= rulevariant_part )
                    // InternalPascal.g:4914:6: lv_variants_3_0= rulevariant_part
                    {

                    						newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getField_listRule());
                    						}
                    						add(
                    							current,
                    							"variants",
                    							lv_variants_3_0,
                    							"org.xtext.ufcg.compiladores.Pascal.variant_part");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:4932:3: (otherlv_4= ';' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPascal.g:4933:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalPascal.g:4942:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:4942:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:4943:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalPascal.g:4949:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4955:2: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:4956:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:4956:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:4957:3: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:4957:3: ( (lv_sections_0_0= rulerecord_section ) )
            // InternalPascal.g:4958:4: (lv_sections_0_0= rulerecord_section )
            {
            // InternalPascal.g:4958:4: (lv_sections_0_0= rulerecord_section )
            // InternalPascal.g:4959:5: lv_sections_0_0= rulerecord_section
            {

            					newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFixed_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.record_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4976:3: (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==RULE_ID) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalPascal.g:4977:4: otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:4981:4: ( (lv_sections_2_0= rulerecord_section ) )
            	    // InternalPascal.g:4982:5: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:4982:5: (lv_sections_2_0= rulerecord_section )
            	    // InternalPascal.g:4983:6: lv_sections_2_0= rulerecord_section
            	    {

            	    						newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_2_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.record_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:5005:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:5005:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:5006:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalPascal.g:5012:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5018:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:5019:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:5019:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:5020:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:5020:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:5021:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:5021:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:5022:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:5043:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:5044:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:5044:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:5045:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.ufcg.compiladores.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // InternalPascal.g:5066:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:5066:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:5067:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalPascal.g:5073:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5079:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:5080:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:5080:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            // InternalPascal.g:5081:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:5085:3: ( (lv_tag_1_0= ruletag_field ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==33) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalPascal.g:5086:4: (lv_tag_1_0= ruletag_field )
                    {
                    // InternalPascal.g:5086:4: (lv_tag_1_0= ruletag_field )
                    // InternalPascal.g:5087:5: lv_tag_1_0= ruletag_field
                    {

                    					newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariant_partRule());
                    					}
                    					set(
                    						current,
                    						"tag",
                    						lv_tag_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.tag_field");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:5104:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPascal.g:5105:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPascal.g:5105:4: (lv_name_2_0= RULE_ID )
            // InternalPascal.g:5106:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariant_partRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
            		
            // InternalPascal.g:5126:3: ( (lv_variants_4_0= rulevariant ) )
            // InternalPascal.g:5127:4: (lv_variants_4_0= rulevariant )
            {
            // InternalPascal.g:5127:4: (lv_variants_4_0= rulevariant )
            // InternalPascal.g:5128:5: lv_variants_4_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_variants_4_0=rulevariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariant_partRule());
            					}
            					add(
            						current,
            						"variants",
            						lv_variants_4_0,
            						"org.xtext.ufcg.compiladores.Pascal.variant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:5145:3: (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==26) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==RULE_ID||LA58_1==RULE_ADDITION_OPERATOR||LA58_1==RULE_STRING||(LA58_1>=RULE_INTEGER_NUMBER && LA58_1<=RULE_SIGNED_REAL_NUMBER)||LA58_1==64||(LA58_1>=66 && LA58_1<=67)) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalPascal.g:5146:4: otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_17); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalPascal.g:5150:4: ( (lv_variants_6_0= rulevariant ) )
            	    // InternalPascal.g:5151:5: (lv_variants_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:5151:5: (lv_variants_6_0= rulevariant )
            	    // InternalPascal.g:5152:6: lv_variants_6_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variants",
            	    							lv_variants_6_0,
            	    							"org.xtext.ufcg.compiladores.Pascal.variant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // InternalPascal.g:5174:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:5174:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:5175:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalPascal.g:5181:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPascal.g:5187:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalPascal.g:5188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalPascal.g:5188:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalPascal.g:5189:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalPascal.g:5189:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:5190:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:5190:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:5191:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTag_fieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:5215:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:5215:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:5216:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:5222:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5228:2: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) )
            // InternalPascal.g:5229:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            {
            // InternalPascal.g:5229:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            // InternalPascal.g:5230:3: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')'
            {
            // InternalPascal.g:5230:3: ( (lv_labels_0_0= rulecase_label_list ) )
            // InternalPascal.g:5231:4: (lv_labels_0_0= rulecase_label_list )
            {
            // InternalPascal.g:5231:4: (lv_labels_0_0= rulecase_label_list )
            // InternalPascal.g:5232:5: lv_labels_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"labels",
            						lv_labels_0_0,
            						"org.xtext.ufcg.compiladores.Pascal.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPascal.g:5257:3: ( (lv_fields_3_0= rulefield_list ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==57) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPascal.g:5258:4: (lv_fields_3_0= rulefield_list )
                    {
                    // InternalPascal.g:5258:4: (lv_fields_3_0= rulefield_list )
                    // InternalPascal.g:5259:5: lv_fields_3_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariantRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_3_0,
                    						"org.xtext.ufcg.compiladores.Pascal.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:5284:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:5284:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:5285:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:5291:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5297:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:5298:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:5298:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:5299:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:5299:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:5300:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:5300:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:5301:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:5317:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==28) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPascal.g:5318:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:5322:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:5323:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:5323:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:5324:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:5345:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:5345:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:5346:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:5352:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_ids_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_ids_0_0=null;
        Token otherlv_1=null;
        Token lv_ids_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5358:2: ( ( ( (lv_ids_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:5359:2: ( ( (lv_ids_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:5359:2: ( ( (lv_ids_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:5360:3: ( (lv_ids_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:5360:3: ( (lv_ids_0_0= RULE_ID ) )
            // InternalPascal.g:5361:4: (lv_ids_0_0= RULE_ID )
            {
            // InternalPascal.g:5361:4: (lv_ids_0_0= RULE_ID )
            // InternalPascal.g:5362:5: lv_ids_0_0= RULE_ID
            {
            lv_ids_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_ids_0_0, grammarAccess.getIdentifier_listAccess().getIdsIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"ids",
            						lv_ids_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:5378:3: (otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==28) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalPascal.g:5379:4: otherlv_1= ',' ( (lv_ids_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:5383:4: ( (lv_ids_2_0= RULE_ID ) )
            	    // InternalPascal.g:5384:5: (lv_ids_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:5384:5: (lv_ids_2_0= RULE_ID )
            	    // InternalPascal.g:5385:6: lv_ids_2_0= RULE_ID
            	    {
            	    lv_ids_2_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    						newLeafNode(lv_ids_2_0, grammarAccess.getIdentifier_listAccess().getIdsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"ids",
            	    							lv_ids_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:5406:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:5406:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:5407:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:5413:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5419:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:5420:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:5420:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:5421:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:5421:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:5422:4: lv_number_0_0= ruleany_number
            {

            				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberRule());
            				}
            				set(
            					current,
            					"number",
            					lv_number_0_0,
            					"org.xtext.ufcg.compiladores.Pascal.any_number");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:5442:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:5442:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:5443:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:5449:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:5455:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:5456:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:5456:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_INTEGER_NUMBER && LA62_0<=RULE_REAL_NUMBER)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=RULE_SIGNED_INTEGER_NUMBER && LA62_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalPascal.g:5457:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:5466:3: this_signed_number_1= rulesigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    			current = this_signed_number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:5478:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:5478:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:5479:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:5485:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5491:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:5492:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:5492:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INTEGER_NUMBER) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_REAL_NUMBER) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalPascal.g:5493:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:5493:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:5494:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:5494:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:5495:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5512:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:5512:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:5513:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:5513:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:5514:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:5534:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:5534:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:5535:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:5541:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5547:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:5548:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:5548:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalPascal.g:5549:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:5549:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:5550:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:5550:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:5551:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5568:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:5568:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:5569:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:5569:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:5570:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.SIGNED_REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:5590:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:5590:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:5591:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:5597:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5603:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:5604:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:5604:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_INTEGER_NUMBER) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalPascal.g:5605:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:5605:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:5606:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:5606:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:5607:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.ufcg.compiladores.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5624:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:5624:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:5625:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:5625:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:5626:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.ufcg.compiladores.Pascal.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:5646:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:5646:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:5647:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:5653:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5659:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) )
            // InternalPascal.g:5660:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            {
            // InternalPascal.g:5660:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            int alt68=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_ADDITION_OPERATOR:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
                {
                alt68=1;
                }
                break;
            case RULE_STRING:
                {
                alt68=2;
                }
                break;
            case 66:
                {
                alt68=3;
                }
                break;
            case 67:
                {
                alt68=4;
                }
                break;
            case 64:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalPascal.g:5661:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:5661:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:5662:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:5662:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ADDITION_OPERATOR) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalPascal.g:5663:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // InternalPascal.g:5663:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // InternalPascal.g:5664:6: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_57); 

                            						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"opterator",
                            							lv_opterator_0_0,
                            							"org.xtext.ufcg.compiladores.Pascal.ADDITION_OPERATOR");
                            					

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:5680:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_ID) ) {
                        alt67=1;
                    }
                    else if ( ((LA67_0>=RULE_INTEGER_NUMBER && LA67_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalPascal.g:5681:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:5681:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:5682:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:5682:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:5683:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:5700:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:5700:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:5701:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:5701:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:5702:7: lv_number_2_0= rulenumber
                            {

                            							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstantRule());
                            							}
                            							set(
                            								current,
                            								"number",
                            								lv_number_2_0,
                            								"org.xtext.ufcg.compiladores.Pascal.number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5722:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:5722:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:5723:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:5723:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:5724:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:5741:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:5741:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:5742:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:5742:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:5743:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:5756:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:5756:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:5757:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:5757:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:5758:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:5771:3: ( (lv_nil_6_0= 'nil' ) )
                    {
                    // InternalPascal.g:5771:3: ( (lv_nil_6_0= 'nil' ) )
                    // InternalPascal.g:5772:4: (lv_nil_6_0= 'nil' )
                    {
                    // InternalPascal.g:5772:4: (lv_nil_6_0= 'nil' )
                    // InternalPascal.g:5773:5: lv_nil_6_0= 'nil'
                    {
                    lv_nil_6_0=(Token)match(input,64,FOLLOW_2); 

                    					newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"

    // Delegated rules


    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\5\12\uffff";
    static final String dfa_4s = "\1\103\1\104\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\6\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\3\1\uffff\4\2\12\uffff\1\6\20\uffff\1\4\26\uffff\1\5\1\7\1\10\1\11",
            "\3\13\2\uffff\2\13\12\uffff\1\13\1\uffff\1\12\2\13\1\uffff\1\13\1\uffff\1\13\5\uffff\1\13\4\uffff\3\13\4\uffff\1\13\1\uffff\1\13\1\uffff\2\13\1\uffff\2\13\2\uffff\5\13\4\uffff\1\13",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3497:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_function_5_0= rulefunction_designator ) ) | (otherlv_6= '(' ( (lv_expression_7_0= ruleexpression ) ) otherlv_8= ')' ) | (otherlv_9= 'not' ( (lv_not_10_0= rulefactor ) ) ) | ( (lv_boolean_11_0= 'true' ) ) | ( (lv_boolean_12_0= 'false' ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000069A8000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000061A0000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006180000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003D50L,0x000000000000000DL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018001003F50L,0x00000000000000FDL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006DA8000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x064AC00800001410L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006100000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020001003D50L,0x000000000000000FL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000040000022L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000C42L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xE000000000000082L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020000400000L,0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000060001003D50L,0x000000000000000FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000020003003D50L,0x000000000000000FL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000018000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000001003F50L,0x000000000000000DL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200001000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000002000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000003C50L});

}