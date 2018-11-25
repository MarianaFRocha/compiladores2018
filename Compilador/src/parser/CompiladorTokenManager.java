/* Generated By:JavaCC: Do not edit this line. CompiladorTokenManager.java */
package parser;
import java.io.*;
import semantico.*;
import apoio.*;
import tratamentoErro.*;
import comandoAltoNivel.*;
import comandoPrimitivo.*;
import codigoDestino.*;
import java.util.LinkedList;

/** Token Manager. */
public class CompiladorTokenManager implements CompiladorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(2, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(2, 0);
      case 13:
         jjmatchedKind = 3;
         return jjMoveNfa_0(2, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(2, 0);
      case 38:
         jjmatchedKind = 42;
         return jjMoveNfa_0(2, 0);
      case 40:
         jjmatchedKind = 47;
         return jjMoveNfa_0(2, 0);
      case 41:
         jjmatchedKind = 48;
         return jjMoveNfa_0(2, 0);
      case 42:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 43:
         jjmatchedKind = 33;
         return jjMoveNfa_0(2, 0);
      case 44:
         jjmatchedKind = 53;
         return jjMoveNfa_0(2, 0);
      case 45:
         jjmatchedKind = 34;
         return jjMoveNfa_0(2, 0);
      case 47:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 58:
         jjmatchedKind = 52;
         return jjMoveNfa_0(2, 0);
      case 59:
         jjmatchedKind = 51;
         return jjMoveNfa_0(2, 0);
      case 60:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 61:
         jjmatchedKind = 41;
         return jjMoveNfa_0(2, 0);
      case 62:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 69:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x2100L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x15555000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x40008000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x820c00L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2100L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x15555000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x40008000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x820c00L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 123:
         jjmatchedKind = 49;
         return jjMoveNfa_0(2, 0);
      case 125:
         jjmatchedKind = 50;
         return jjMoveNfa_0(2, 0);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 0);
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         break;
      case 45:
         if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 44;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x48088000L);
      case 69:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xa20800L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x15555000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 85:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x22000000L);
      case 88:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x48088000L);
      case 101:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xa20800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x15555000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 111:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
         }
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x22000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 1);
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x40020000L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x35555000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x2200000L);
      case 81:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40020000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x35555000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2200000L);
      case 113:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 2);
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa4_0(active0, 0x15555000L);
      case 65:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x40000800L);
      case 66:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x20220000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 79:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x8800000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 97:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x40000800L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x20220000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 111:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x8800000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 3);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x202000L);
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 68:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 69:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x804000L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 77:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 79:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
         }
         break;
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x20400000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x1041000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 86:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x202000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 101:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x804000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 111:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
         }
         break;
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20400000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x1041000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 4);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x10110000L);
      case 69:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x1440000L);
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x6000L);
      case 79:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 80:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000L);
      case 84:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 5;
         }
         break;
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 88:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10110000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x1440000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x6000L);
      case 111:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 5;
         }
         break;
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 120:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 5);
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 51:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      case 65:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 80:
         return jjMoveStringLiteralDfa7_0(active0, 0x4400000L);
      case 81:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 82:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 83:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 84:
         return jjMoveStringLiteralDfa7_0(active0, 0x10002000L);
      case 97:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x4400000L);
      case 113:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x10002000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 6);
   }
   switch(curChar)
   {
      case 65:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 7;
         }
         break;
      case 68:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 7;
         }
         break;
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x440000L);
      case 76:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      case 79:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 7;
         }
         else if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 7;
         }
         break;
      case 82:
         return jjMoveStringLiteralDfa8_0(active0, 0x11000000L);
      case 84:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 85:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 97:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 7;
         }
         break;
      case 100:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 7;
         }
         break;
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x440000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      case 111:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 7;
         }
         else if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 7;
         }
         break;
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x11000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 7);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 7);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x404000L);
      case 69:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000L);
      case 79:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 8;
         }
         break;
      case 84:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x404000L);
      case 101:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000L);
      case 111:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 8;
         }
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 8);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 8);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 8);
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
      case 79:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 80:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 84:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 9;
         }
         break;
      case 88:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000L);
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 112:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 9;
         }
         break;
      case 120:
         return jjMoveStringLiteralDfa10_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 9);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 9);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 9);
   }
   switch(curChar)
   {
      case 51:
         return jjMoveStringLiteralDfa11_0(active0, 0x10000000L);
      case 69:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      case 82:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 10;
         }
         break;
      case 84:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000L);
      case 114:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 10;
         }
         break;
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 10);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 10);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 10);
   }
   switch(curChar)
   {
      case 68:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 11;
         }
         break;
      case 79:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 11;
         }
         break;
      case 84:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000L);
      case 100:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 11;
         }
         break;
      case 111:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 11;
         }
         break;
      case 116:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjMoveNfa_0(2, 11);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(2, 11);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(2, 11);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 12;
         }
         break;
      case 101:
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 12;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(2, 12);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 8;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(3, 4);
                  else if (curChar == 46)
                     jjCheckNAdd(1);
                  break;
               case 0:
                  if (curChar == 46)
                     jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 34 && kind > 54)
                     kind = 54;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 5:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAddTwoStates(5, 6);
                  break;
               case 3:
                  jjAddStates(3, 4);
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   0, 1, 7, 3, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, "\53", "\55", "\52", "\57", "\52\52", 
"\117\125", "\105", "\74\55", "\75", "\46", "\74", "\76\75", "\164\157", null, "\50", 
"\51", "\173", "\175", "\73", "\72", "\54", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "comentarioGeral",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffbfff7fffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[8];
static private final int[] jjstateSet = new int[16];
static protected char curChar;
/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 8; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 7)
       {
          jjmatchedKind = 7;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
