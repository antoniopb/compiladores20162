/*
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.ufcg.compiladores.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PascalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_field_list_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PascalGrammarAccess) access;
		match_field_list_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
		match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getDowntoKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getFor_statementAccess().getToKeyword_4_0()));
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
			if (match_field_list_SemicolonKeyword_1_q.equals(syntax))
				emit_field_list_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0.equals(syntax))
				emit_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     fixed=fixed_part (ambiguity) (rule end)
	 *     variants+=variant_part (ambiguity) (rule end)
	 */
	protected void emit_field_list_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'to' | 'downto'
	 *
	 * This ambiguous syntax occurs at:
	 *     expressionInit=expression (ambiguity) expressionFin=expression
	 */
	protected void emit_for_statement_DowntoKeyword_4_1_or_ToKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
