// Generated from COE.g4 by ANTLR 4.5.3
package es.usc.rai.coego.martin.demiurgo.coe;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code classDef}
	 * labeled alternative in {@link COEParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(COEParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sCode}
	 * labeled alternative in {@link COEParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCode(COEParser.SCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link COEParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(COEParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(COEParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(COEParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(COEParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(COEParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(COEParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(COEParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(COEParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(COEParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(COEParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(COEParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(COEParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(COEParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLoc}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLoc(COEParser.GetLocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(COEParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roomOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomOp(COEParser.RoomOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(COEParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getUser}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetUser(COEParser.GetUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dice}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDice(COEParser.DiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullObj}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullObj(COEParser.NullObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getId}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetId(COEParser.GetIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObj}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObj(COEParser.NewObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(COEParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDice}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDice(COEParser.MultDiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(COEParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(COEParser.NotOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOp(COEParser.FunctionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roomContents}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomContents(COEParser.RoomContentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensOp(COEParser.ParensOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code move}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(COEParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(COEParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intermediateVariable}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntermediateVariable(COEParser.IntermediateVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code index}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(COEParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(COEParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someContents}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeContents(COEParser.SomeContentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(COEParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(COEParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sharp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharp(COEParser.SharpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(COEParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodOp(COEParser.MethodOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(COEParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceofOp}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofOp(COEParser.InstanceofOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code location}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(COEParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logic}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(COEParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link COEParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(COEParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(COEParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#new_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_obj(COEParser.New_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#sharp_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharp_identifier(COEParser.Sharp_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someRoom}
	 * labeled alternative in {@link COEParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeRoom(COEParser.SomeRoomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisRoom}
	 * labeled alternative in {@link COEParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisRoom(COEParser.ThisRoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegion(COEParser.RegionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rootRoom}
	 * labeled alternative in {@link COEParser#room_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootRoom(COEParser.RootRoomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafRoom}
	 * labeled alternative in {@link COEParser#room_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafRoom(COEParser.LeafRoomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relativeRoom}
	 * labeled alternative in {@link COEParser#room_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeRoom(COEParser.RelativeRoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#exp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_if(COEParser.Exp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#exp_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_else(COEParser.Exp_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#exp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_for(COEParser.Exp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#exp_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_user(COEParser.Exp_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#exp_throw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_throw(COEParser.Exp_throwContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#echo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho(COEParser.EchoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(COEParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inventoryType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInventoryType(COEParser.InventoryTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(COEParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(COEParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(COEParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolType(COEParser.SymbolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code roomType}
	 * labeled alternative in {@link COEParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomType(COEParser.RoomTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(COEParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link COEParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(COEParser.NlContext ctx);
}