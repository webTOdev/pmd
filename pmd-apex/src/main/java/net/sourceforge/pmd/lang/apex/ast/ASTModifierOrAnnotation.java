/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.modifier.ModifierOrAnnotation;

public class ASTModifierOrAnnotation extends AbstractApexNode<ModifierOrAnnotation> {

	public ASTModifierOrAnnotation(ModifierOrAnnotation modifierOrAnnotation) {
		super(modifierOrAnnotation);
	}

	public Object jjtAccept(ApexParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
