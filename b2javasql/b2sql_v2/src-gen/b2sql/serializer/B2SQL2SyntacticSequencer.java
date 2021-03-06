/*
 * generated by Xtext 2.10.0
 */
package b2sql.serializer;

import b2sql.services.B2SQL2GrammarAccess;
import com.google.inject.Inject;
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
public class B2SQL2SyntacticSequencer extends AbstractSyntacticSequencer {

	protected B2SQL2GrammarAccess grammarAccess;
	protected AbstractElementAlias match_BAnyBlock_AmpersandKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (B2SQL2GrammarAccess) access;
		match_BAnyBlock_AmpersandKeyword_4_q = new TokenAlias(false, true, grammarAccess.getBAnyBlockAccess().getAmpersandKeyword_4());
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
			if (match_BAnyBlock_AmpersandKeyword_4_q.equals(syntax))
				emit_BAnyBlock_AmpersandKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '&'?
	 *
	 * This ambiguous syntax occurs at:
	 *     varTyping+=BParameterTyping (ambiguity) pres+=BPredicate
	 */
	protected void emit_BAnyBlock_AmpersandKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
