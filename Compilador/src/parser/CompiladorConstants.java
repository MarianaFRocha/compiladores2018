/* Generated By:JavaCC: Do not edit this line. CompiladorConstants.java */
package parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CompiladorConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int EXIBE = 8;
  /** RegularExpression Id. */
  int LEITURA = 9;
  /** RegularExpression Id. */
  int SE = 10;
  /** RegularExpression Id. */
  int FIMSE = 11;
  /** RegularExpression Id. */
  int ENQUANTO = 12;
  /** RegularExpression Id. */
  int FIMENQUANTO = 13;
  /** RegularExpression Id. */
  int NUMERO = 14;
  /** RegularExpression Id. */
  int PALAVRA = 15;
  /** RegularExpression Id. */
  int DIGIT = 16;
  /** RegularExpression Id. */
  int NUM = 17;
  /** RegularExpression Id. */
  int SOMA = 18;
  /** RegularExpression Id. */
  int SUB = 19;
  /** RegularExpression Id. */
  int MUL = 20;
  /** RegularExpression Id. */
  int DIV = 21;
  /** RegularExpression Id. */
  int OU = 22;
  /** RegularExpression Id. */
  int E = 23;
  /** RegularExpression Id. */
  int ATRIB = 24;
  /** RegularExpression Id. */
  int IGUAL = 25;
  /** RegularExpression Id. */
  int CONCAT = 26;
  /** RegularExpression Id. */
  int MENOR = 27;
  /** RegularExpression Id. */
  int MAIORIGUAL = 28;
  /** RegularExpression Id. */
  int CHAR = 29;
  /** RegularExpression Id. */
  int AP = 30;
  /** RegularExpression Id. */
  int FP = 31;
  /** RegularExpression Id. */
  int PV = 32;
  /** RegularExpression Id. */
  int VIRGULA = 33;
  /** RegularExpression Id. */
  int STRING = 34;
  /** RegularExpression Id. */
  int VAR = 35;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int comentarioGeral = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 7>",
    "\"exibe\"",
    "\"le\"",
    "\"se\"",
    "\"fim-se\"",
    "\"enquanto\"",
    "\"fim-enquanto\"",
    "\"numero\"",
    "\"palavra\"",
    "<DIGIT>",
    "<NUM>",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"OU\"",
    "\"E\"",
    "\"<-\"",
    "\"=\"",
    "\"&\"",
    "\"<\"",
    "\">=\"",
    "<CHAR>",
    "\"(\"",
    "\")\"",
    "\";\"",
    "\",\"",
    "<STRING>",
    "<VAR>",
  };

}
