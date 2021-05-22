// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.lex

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int IN_COMMENT = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\1\1\4"+
    "\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\11\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\7\5\32\1\33"+
    "\15\32\1\33\6\32\1\34\1\35\1\36\1\37\1\40"+
    "\1\7\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\32\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\1\62\1\63\1\64\1\32\1\65"+
    "\3\32\1\66\1\67\1\70\1\7\u0181\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\2\2\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\17\24\1\31\1\1\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\2\0\1\40\2\0\1\41"+
    "\1\42\11\24\1\43\3\24\1\44\12\24\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\0\2\53\2\0\11\24"+
    "\1\54\1\55\1\56\3\24\1\57\2\24\1\60\1\61"+
    "\2\24\1\62\3\24\1\63\1\24\1\64\1\65\1\66"+
    "\1\67\1\70\1\24\1\71\2\24\1\72\1\24\1\73"+
    "\1\24\1\74\1\24\1\75\1\76\1\77\1\100\1\101"+
    "\2\24\1\102\1\103\1\104";

  private static int [] zzUnpackAction() {
    int [] result = new int[150];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\253\0\344\0\u011d\0\253"+
    "\0\u0156\0\u018f\0\u01c8\0\253\0\253\0\253\0\253\0\253"+
    "\0\253\0\253\0\u0201\0\u023a\0\u0273\0\u02ac\0\253\0\u02e5"+
    "\0\253\0\253\0\253\0\u031e\0\u031e\0\253\0\253\0\253"+
    "\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u0675\0\253"+
    "\0\u06ae\0\253\0\u06e7\0\253\0\u0720\0\253\0\253\0\u0759"+
    "\0\u0792\0\u07cb\0\u0804\0\u083d\0\253\0\253\0\u0876\0\u08af"+
    "\0\u08e8\0\u0921\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u031e"+
    "\0\u0a77\0\u0ab0\0\u0ae9\0\u031e\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd"+
    "\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea\0\u0d23\0\253\0\253"+
    "\0\253\0\253\0\253\0\253\0\u0d5c\0\253\0\u0d95\0\u0dce"+
    "\0\u0e07\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96"+
    "\0\u0fcf\0\u1008\0\u031e\0\u031e\0\u031e\0\u1041\0\u107a\0\u10b3"+
    "\0\u031e\0\u10ec\0\u1125\0\u031e\0\u031e\0\u115e\0\u1197\0\u031e"+
    "\0\u11d0\0\u1209\0\u1242\0\u031e\0\u127b\0\u031e\0\u031e\0\u031e"+
    "\0\u031e\0\u031e\0\u12b4\0\u031e\0\u12ed\0\u1326\0\u031e\0\u135f"+
    "\0\u031e\0\u1398\0\u031e\0\u13d1\0\u031e\0\u031e\0\u031e\0\u031e"+
    "\0\u031e\0\u140a\0\u1443\0\u031e\0\u031e\0\u031e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[150];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\1\6\1\7\1\10\1\11\1\4\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\4\1\37\1\40\1\4"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\2\34\1\47"+
    "\1\34\1\50\1\51\1\34\1\52\1\53\1\34\1\54"+
    "\1\55\1\56\1\34\1\57\1\60\1\61\1\62\71\4"+
    "\2\63\2\4\1\63\1\64\27\63\1\65\33\63\73\0"+
    "\1\5\115\0\1\66\41\0\2\11\2\5\65\11\10\0"+
    "\1\67\64\0\63\70\1\0\1\70\6\0\1\71\102\0"+
    "\1\72\1\73\16\0\1\74\50\0\1\72\1\73\2\25"+
    "\14\0\1\74\57\0\1\75\70\0\1\76\63\0\2\34"+
    "\6\0\2\34\4\0\26\34\25\0\2\34\6\0\2\34"+
    "\4\0\13\34\1\77\12\34\25\0\2\34\6\0\2\34"+
    "\4\0\16\34\1\100\2\34\1\101\4\34\25\0\2\34"+
    "\6\0\2\34\4\0\10\34\1\102\15\34\25\0\2\34"+
    "\6\0\2\34\4\0\11\34\1\103\14\34\25\0\2\34"+
    "\6\0\2\34\4\0\13\34\1\104\12\34\25\0\2\34"+
    "\6\0\2\34\4\0\4\34\1\105\6\34\1\106\2\34"+
    "\1\107\7\34\25\0\2\34\6\0\2\34\4\0\6\34"+
    "\1\110\6\34\1\111\10\34\25\0\2\34\6\0\2\34"+
    "\4\0\5\34\1\112\20\34\25\0\2\34\6\0\2\34"+
    "\4\0\1\34\1\113\24\34\25\0\2\34\6\0\2\34"+
    "\4\0\6\34\1\114\17\34\25\0\2\34\6\0\2\34"+
    "\4\0\21\34\1\115\4\34\25\0\2\34\6\0\2\34"+
    "\4\0\1\34\1\116\3\34\1\117\20\34\25\0\2\34"+
    "\6\0\2\34\4\0\5\34\1\120\15\34\1\121\2\34"+
    "\25\0\2\34\6\0\2\34\4\0\4\34\1\122\3\34"+
    "\1\123\5\34\1\124\7\34\25\0\2\34\6\0\2\34"+
    "\4\0\1\34\1\125\6\34\1\126\15\34\72\0\1\127"+
    "\1\0\2\63\2\0\1\63\1\0\27\63\1\0\33\63"+
    "\5\0\1\130\47\0\1\131\3\0\1\132\1\0\1\133"+
    "\16\0\1\134\57\0\6\71\1\135\12\71\1\0\47\71"+
    "\22\0\2\72\67\0\1\136\1\137\67\0\1\140\1\141"+
    "\67\0\2\34\6\0\2\34\4\0\11\34\1\142\14\34"+
    "\25\0\2\34\6\0\2\34\4\0\16\34\1\143\7\34"+
    "\25\0\2\34\6\0\2\34\4\0\5\34\1\144\20\34"+
    "\25\0\2\34\6\0\2\34\4\0\1\34\1\145\24\34"+
    "\25\0\2\34\6\0\2\34\4\0\3\34\1\146\22\34"+
    "\25\0\2\34\6\0\2\34\4\0\11\34\1\147\10\34"+
    "\1\150\3\34\25\0\2\34\6\0\2\34\4\0\5\34"+
    "\1\151\20\34\25\0\2\34\6\0\2\34\4\0\16\34"+
    "\1\152\7\34\25\0\2\34\6\0\2\34\4\0\21\34"+
    "\1\153\4\34\25\0\2\34\6\0\2\34\4\0\23\34"+
    "\1\154\2\34\25\0\2\34\6\0\2\34\4\0\15\34"+
    "\1\155\10\34\25\0\2\34\6\0\2\34\4\0\11\34"+
    "\1\156\14\34\25\0\2\34\6\0\2\34\4\0\11\34"+
    "\1\157\14\34\25\0\2\34\6\0\2\34\4\0\15\34"+
    "\1\160\5\34\1\161\2\34\25\0\2\34\6\0\2\34"+
    "\4\0\1\34\1\162\21\34\1\163\2\34\25\0\2\34"+
    "\6\0\2\34\4\0\20\34\1\164\5\34\25\0\2\34"+
    "\6\0\2\34\4\0\21\34\1\165\4\34\25\0\2\34"+
    "\6\0\2\34\4\0\5\34\1\166\20\34\25\0\2\34"+
    "\6\0\2\34\4\0\21\34\1\167\4\34\25\0\2\34"+
    "\6\0\2\34\4\0\17\34\1\170\6\34\25\0\2\34"+
    "\6\0\2\34\4\0\11\34\1\171\14\34\25\0\2\34"+
    "\6\0\2\34\4\0\11\34\1\172\14\34\24\0\1\5"+
    "\71\0\2\137\66\0\1\73\70\0\1\73\2\141\67\0"+
    "\2\34\6\0\2\34\4\0\1\34\1\173\24\34\25\0"+
    "\2\34\6\0\2\34\4\0\13\34\1\174\12\34\25\0"+
    "\2\34\6\0\2\34\4\0\1\34\1\175\24\34\25\0"+
    "\2\34\6\0\2\34\4\0\21\34\1\176\4\34\25\0"+
    "\2\34\6\0\2\34\4\0\23\34\1\177\2\34\25\0"+
    "\2\34\6\0\2\34\4\0\6\34\1\200\17\34\25\0"+
    "\2\34\6\0\2\34\4\0\5\34\1\201\20\34\25\0"+
    "\2\34\6\0\2\34\4\0\6\34\1\202\17\34\25\0"+
    "\2\34\6\0\2\34\4\0\1\34\1\203\24\34\25\0"+
    "\2\34\6\0\2\34\4\0\15\34\1\204\10\34\25\0"+
    "\2\34\6\0\2\34\4\0\15\34\1\205\10\34\25\0"+
    "\2\34\6\0\2\34\4\0\7\34\1\206\16\34\25\0"+
    "\2\34\6\0\2\34\4\0\4\34\1\207\21\34\25\0"+
    "\2\34\6\0\2\34\4\0\24\34\1\210\1\34\25\0"+
    "\2\34\6\0\2\34\4\0\6\34\1\211\17\34\25\0"+
    "\2\34\6\0\2\34\4\0\5\34\1\212\20\34\25\0"+
    "\2\34\6\0\2\34\4\0\23\34\1\213\2\34\25\0"+
    "\2\34\6\0\2\34\4\0\13\34\1\214\12\34\25\0"+
    "\2\34\6\0\2\34\4\0\22\34\1\215\3\34\25\0"+
    "\2\34\6\0\2\34\4\0\12\34\1\216\13\34\25\0"+
    "\2\34\6\0\2\34\4\0\23\34\1\217\2\34\25\0"+
    "\2\34\6\0\2\34\4\0\23\34\1\220\2\34\25\0"+
    "\2\34\6\0\2\34\4\0\5\34\1\221\20\34\25\0"+
    "\2\34\6\0\2\34\4\0\21\34\1\222\4\34\25\0"+
    "\2\34\6\0\2\34\4\0\1\34\1\223\24\34\25\0"+
    "\2\34\6\0\2\34\4\0\5\34\1\224\20\34\25\0"+
    "\2\34\6\0\2\34\4\0\15\34\1\225\10\34\25\0"+
    "\2\34\6\0\2\34\4\0\4\34\1\226\21\34\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5244];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\11\2\1\1\11\3\1\7\11\4\1\1\11"+
    "\1\1\3\11\2\1\3\11\17\1\1\11\1\1\1\11"+
    "\1\1\1\11\1\1\2\11\2\0\1\1\2\0\2\11"+
    "\30\1\6\11\1\0\1\11\1\1\2\0\65\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[150];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error in line "
        + (yyline+1) +": Invalid input '" + yytext()+"'");
    return symbol(sym.ILLEGAL_CHARACTER);
            }
            // fall through
          case 69: break;
          case 2:
            { /* do nothing */
            }
            // fall through
          case 70: break;
          case 3:
            { return symbol(sym.NOT);
            }
            // fall through
          case 71: break;
          case 4:
            { string.setLength(0); yybegin(STRING);
            }
            // fall through
          case 72: break;
          case 5:
            { return symbol(sym.LPAREN);
            }
            // fall through
          case 73: break;
          case 6:
            { return symbol(sym.RPAREN);
            }
            // fall through
          case 74: break;
          case 7:
            { return symbol(sym.MULT);
            }
            // fall through
          case 75: break;
          case 8:
            { return symbol(sym.PLUS);
            }
            // fall through
          case 76: break;
          case 9:
            { return symbol(sym.COMMA);
            }
            // fall through
          case 77: break;
          case 10:
            { return symbol(sym.MINUS);
            }
            // fall through
          case 78: break;
          case 11:
            { return symbol(sym.DOT);
            }
            // fall through
          case 79: break;
          case 12:
            { return symbol(sym.DIV);
            }
            // fall through
          case 80: break;
          case 13:
            { return symbol(sym.INTEGER);
            }
            // fall through
          case 81: break;
          case 14:
            { return symbol(sym.COLON);
            }
            // fall through
          case 82: break;
          case 15:
            { return symbol(sym.SEMI);
            }
            // fall through
          case 83: break;
          case 16:
            { return symbol(sym.LT);
            }
            // fall through
          case 84: break;
          case 17:
            { return symbol(sym.EQUALTO);
            }
            // fall through
          case 85: break;
          case 18:
            { return symbol(sym.GT);
            }
            // fall through
          case 86: break;
          case 19:
            { return symbol(sym.QUESTION);
            }
            // fall through
          case 87: break;
          case 20:
            { return symbol(sym.IDENTIFIER);
            }
            // fall through
          case 88: break;
          case 21:
            { return symbol(sym.BOOLEAN);
            }
            // fall through
          case 89: break;
          case 22:
            { return symbol(sym.LSQB);
            }
            // fall through
          case 90: break;
          case 23:
            { return symbol(sym.RSQB);
            }
            // fall through
          case 91: break;
          case 24:
            { return symbol(sym.POW);
            }
            // fall through
          case 92: break;
          case 25:
            { return symbol(sym.LBRACE);
            }
            // fall through
          case 93: break;
          case 26:
            { return symbol(sym.RBRACE);
            }
            // fall through
          case 94: break;
          case 27:
            { string.append( yytext() );
            }
            // fall through
          case 95: break;
          case 28:
            { yybegin(YYINITIAL);                        
                                  return symbol(sym.STRING_LITERAL,
                                  string.toString());
            }
            // fall through
          case 96: break;
          case 29:
            { string.append('\\');
            }
            // fall through
          case 97: break;
          case 30:
            { return symbol(sym.NOTEQ);
            }
            // fall through
          case 98: break;
          case 31:
            { return symbol(sym.AND);
            }
            // fall through
          case 99: break;
          case 32:
            { return symbol(sym.FLOATING);
            }
            // fall through
          case 100: break;
          case 33:
            { return symbol(sym.EQUAL);
            }
            // fall through
          case 101: break;
          case 34:
            { return symbol(sym.LTEQ);
            }
            // fall through
          case 102: break;
          case 35:
            { return symbol(sym.IF);
            }
            // fall through
          case 103: break;
          case 36:
            { return symbol(sym.OF);
            }
            // fall through
          case 104: break;
          case 37:
            { return symbol(sym.OR);
            }
            // fall through
          case 105: break;
          case 38:
            { string.append('\"');
            }
            // fall through
          case 106: break;
          case 39:
            { string.append('\n');
            }
            // fall through
          case 107: break;
          case 40:
            { string.append('\r');
            }
            // fall through
          case 108: break;
          case 41:
            { string.append('\t');
            }
            // fall through
          case 109: break;
          case 42:
            { return symbol(sym.CHARACTER);
            }
            // fall through
          case 110: break;
          case 43:
            { return symbol(sym.RATIONAL);
            }
            // fall through
          case 111: break;
          case 44:
            { return symbol(sym.FOR);
            }
            // fall through
          case 112: break;
          case 45:
            { return symbol(sym.INT);
            }
            // fall through
          case 113: break;
          case 46:
            { return symbol(sym.LENGTH);
            }
            // fall through
          case 114: break;
          case 47:
            { return symbol(sym.RAT);
            }
            // fall through
          case 115: break;
          case 48:
            { return symbol(sym.SEQ);
            }
            // fall through
          case 116: break;
          case 49:
            { return symbol(sym.STR);
            }
            // fall through
          case 117: break;
          case 50:
            { return symbol(sym.TOP);
            }
            // fall through
          case 118: break;
          case 51:
            { return symbol(sym.BOOL);
            }
            // fall through
          case 119: break;
          case 52:
            { return symbol(sym.CHAR);
            }
            // fall through
          case 120: break;
          case 53:
            { return symbol(sym.DICT);
            }
            // fall through
          case 121: break;
          case 54:
            { return symbol(sym.ELIF);
            }
            // fall through
          case 122: break;
          case 55:
            { return symbol(sym.ELSE);
            }
            // fall through
          case 123: break;
          case 56:
            { return symbol(sym.FDEF);
            }
            // fall through
          case 124: break;
          case 57:
            { return symbol(sym.MAIN);
            }
            // fall through
          case 125: break;
          case 58:
            { return symbol(sym.READ);
            }
            // fall through
          case 126: break;
          case 59:
            { return symbol(sym.TDEF);
            }
            // fall through
          case 127: break;
          case 60:
            { return symbol(sym.WAIT);
            }
            // fall through
          case 128: break;
          case 61:
            { return symbol(sym.ALIAS);
            }
            // fall through
          case 129: break;
          case 62:
            { return symbol(sym.BREAK);
            }
            // fall through
          case 130: break;
          case 63:
            { return symbol(sym.FLOAT);
            }
            // fall through
          case 131: break;
          case 64:
            { return symbol(sym.PRINT);
            }
            // fall through
          case 132: break;
          case 65:
            { return symbol(sym.RANGE);
            }
            // fall through
          case 133: break;
          case 66:
            { return symbol(sym.WHILE);
            }
            // fall through
          case 134: break;
          case 67:
            { return symbol(sym.RETURN);
            }
            // fall through
          case 135: break;
          case 68:
            { return symbol(sym.THREAD);
            }
            // fall through
          case 136: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
