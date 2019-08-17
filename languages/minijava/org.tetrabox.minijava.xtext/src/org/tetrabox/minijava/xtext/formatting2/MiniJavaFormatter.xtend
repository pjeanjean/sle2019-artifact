/*
 * generated by Xtext 2.12.0
 */
package org.tetrabox.minijava.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.Member
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.NewObject
import org.tetrabox.minijava.xtext.miniJava.Program
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration
import org.tetrabox.minijava.xtext.miniJava.TypedDeclaration
import org.tetrabox.minijava.xtext.services.MiniJavaGrammarAccess
import org.tetrabox.minijava.xtext.miniJava.Field
import org.tetrabox.minijava.xtext.miniJava.IfStatement
import org.tetrabox.minijava.xtext.miniJava.ForStatement
import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.Parameter
import org.tetrabox.minijava.xtext.miniJava.ArrayTypeRef
import org.tetrabox.minijava.xtext.miniJava.ArrayLength
import org.tetrabox.minijava.xtext.miniJava.ArrayAccess

class MiniJavaFormatter extends AbstractFormatter2 {

	@Inject extension MiniJavaGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {

		// println(textRegionAccess)
		program.regionFor.keyword(";").append[newLines = 2]

		// Visit
		for (TypeDeclaration type : program.classes) {
			type.format;
		}

	}

	def dispatch void format(TypeDeclaration type, extension IFormattableDocument document) {
		// We put some space before and after each class declaration
		type.append[newLines = 2]

		// Single spaces around the class name
		type.regionFor.feature(MiniJavaPackage::eINSTANCE.namedElement_Name).surround[oneSpace]

		// New lines after opening bracket + indentation inside brackets  
		interior(
			type.regionFor.keyword("{").append[newLines = 2],
			type.regionFor.keyword("}").prepend[newLines = 2],
			[indent]
		)

		// Visit
		for (Member member : type.members) {
			member.format;
		}

	}

	private def void formatMember(Member member, extension IFormattableDocument document) {

		member.regionFor.feature(MiniJavaPackage::eINSTANCE.member_Access).append[oneSpace]

		// Single space between field type and field name 
		member.typeRef.append[oneSpace]

		// No space between method name and params
		member.regionFor.feature(MiniJavaPackage::eINSTANCE.namedElement_Name).append[noSpace]

		// No spaces surrounding method parameters list
		member.regionFor.keyword("(").append[noSpace]
		member.regionFor.keyword(")").prepend[noSpace]

		// One space in between each pair of parameters
		member.regionFor.keyword(",").prepend[noSpace]
		member.regionFor.keyword(",").append[oneSpace]

		member.append[newLines = 2]

//		// New lines after opening bracket + indentation inside brackets  
//		interior(
//			member.regionFor.keyword("{").append[newLine],
//			member.regionFor.keyword("}"),
//			[indent]
//		)
	}

	def dispatch void format(Method method, extension IFormattableDocument document) {
		formatMember(method, document)

		// Visit
		method.body.format

	}

	def dispatch void format(Field field, extension IFormattableDocument document) {
		formatMember(field, document)

		// Visit
		field.defaultValue.format
	}

	def dispatch void format(ArrayLength arrayLength, extension IFormattableDocument document) {
		arrayLength.regionFor.keyword(".").surround[noSpace]

		// Visit
		arrayLength.array.format
	}

	def dispatch void format(ArrayAccess arrayAccess, extension IFormattableDocument document) {

		arrayAccess.regionFor.keyword("[").surround[noSpace]
		arrayAccess.regionFor.keyword("]").surround[noSpace]

		// Visit
		arrayAccess.index.format
		arrayAccess.object.format
	}

	def dispatch void format(Parameter parameter, extension IFormattableDocument document) {
		// Visit
		parameter.typeRef.format
	}

	def dispatch void format(ArrayTypeRef arrayTypeRef, extension IFormattableDocument document) {
		arrayTypeRef.regionFor.keyword("[").surround[noSpace]

		// Visit
		arrayTypeRef.typeRef.format
	}

	def dispatch void format(IfStatement ifStatement, extension IFormattableDocument document) {

		// No spaces surrounding args list
		ifStatement.regionFor.keyword("(").prepend[oneSpace]
		ifStatement.regionFor.keyword("(").append[noSpace]
		ifStatement.regionFor.keyword(")").prepend[noSpace]

		// Visit
		ifStatement.thenBlock.format
		ifStatement.elseBlock.format
		ifStatement.expression.format
	}

	def dispatch void format(ForStatement forStatement, extension IFormattableDocument document) {

		forStatement.regionFor.keyword("for").append[oneSpace]
		forStatement.regionFor.keyword("(").append[noSpace]

		forStatement.declaration.surround[noSpace]
		forStatement.condition.prepend[oneSpace]
		forStatement.condition.append[noSpace]
		forStatement.progression.prepend[oneSpace]
		forStatement.progression.append[noSpace]

		// Visit
		forStatement.declaration.format
		forStatement.condition.format
		forStatement.progression.format
		forStatement.block.format
	}

	def dispatch void format(Assignment assignment, extension IFormattableDocument document) {

		assignment.regionFor.keyword("=").surround[oneSpace]

		// Visit
		assignment.assignee.format
		assignment.value.format

	}

	def dispatch void format(Block block, extension IFormattableDocument document) {

		// Single space before bracket
		block.regionFor.keyword("{").prepend[oneSpace]

		// New lines after opening bracket + indentation inside brackets  
		interior(
			block.regionFor.keyword("{").append[newLines = 1],
			block.regionFor.keyword("}").prepend[newLine],
			[indent]
		)

		// Single space after return
		block.regionFor.keyword("return").append[oneSpace]

		// No space before semicolumn, one new line after
		block.allRegionsFor.keyword(";").prepend[noSpace]
		block.allRegionsFor.keyword(";").append[newLine]

		// Visit
		for (s : block.statements) {
			s.format
		}

	}

	def dispatch void format(NewObject _new, extension IFormattableDocument document) {
		_new.regionFor.keyword("new").append[oneSpace]

		// No spaces surrounding args list
		_new.regionFor.keyword("(").surround[noSpace]
		_new.regionFor.keyword(")").prepend[noSpace]

		// One space in between each pair of args
		_new.regionFor.keyword(",").prepend[noSpace]
		_new.regionFor.keyword(",").append[oneSpace]

		// Visit
		for (arg : _new.args) {
			arg.format
		}
	}

	def dispatch void format(MethodCall methodCall, extension IFormattableDocument document) {
		methodCall.regionFor.keyword("(").surround[noSpace]
		methodCall.regionFor.keyword(")").prepend[noSpace]
		methodCall.regionFor.keyword(".").surround[noSpace]

		// Visit
		methodCall.receiver.format

	}

	def dispatch void format(FieldAccess selection, extension IFormattableDocument document) {
		selection.regionFor.keyword(".").surround[noSpace]

		// Visit
		selection.receiver.format

	}
}
