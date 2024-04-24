// Generated from /home/guo/javaplay/w1/app/src/main/java/parser/Expr.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IDENT=8, INT=9, 
		WS=10, MUL=11, DIV=12, ADD=13, SUB=14, EQ=15, NE=16, LT=17, LE=18, MT=19, 
		ME=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "IDENT", "INT", 
			"WS", "MUL", "DIV", "ADD", "SUB", "EQ", "NE", "LT", "LE", "MT", "ME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'return'", "'if'", "'('", "')'", "'else'", "'='", null, 
			null, null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IDENT", "INT", "WS", 
			"MUL", "DIV", "ADD", "SUB", "EQ", "NE", "LT", "LE", "MT", "ME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014k\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007C\b"+
		"\u0007\n\u0007\f\u0007F\t\u0007\u0001\b\u0004\bI\b\b\u000b\b\f\bJ\u0001"+
		"\t\u0004\tN\b\t\u000b\t\f\tO\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\u0004\u0004\u0000\"\"AZ__az\u0004\u000009"+
		"AZ__az\u0001\u000009\u0002\u0000\t\t  m\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000"+
		"\u00052\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001"+
		"\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000"+
		"\u0000\u000f@\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013"+
		"M\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017U\u0001"+
		"\u0000\u0000\u0000\u0019W\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000"+
		"\u0000\u001d[\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!"+
		"a\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000"+
		"\u0000\'h\u0001\u0000\u0000\u0000)*\u0005;\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005t\u0000"+
		"\u0000./\u0005u\u0000\u0000/0\u0005r\u0000\u000001\u0005n\u0000\u0000"+
		"1\u0004\u0001\u0000\u0000\u000023\u0005i\u0000\u000034\u0005f\u0000\u0000"+
		"4\u0006\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0005)\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005e\u0000"+
		"\u0000:;\u0005l\u0000\u0000;<\u0005s\u0000\u0000<=\u0005e\u0000\u0000"+
		"=\f\u0001\u0000\u0000\u0000>?\u0005=\u0000\u0000?\u000e\u0001\u0000\u0000"+
		"\u0000@D\u0007\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GI\u0007\u0002\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0012"+
		"\u0001\u0000\u0000\u0000LN\u0007\u0003\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\t\u0000\u0000R\u0014\u0001"+
		"\u0000\u0000\u0000ST\u0005*\u0000\u0000T\u0016\u0001\u0000\u0000\u0000"+
		"UV\u0005/\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005+\u0000\u0000"+
		"X\u001a\u0001\u0000\u0000\u0000YZ\u0005-\u0000\u0000Z\u001c\u0001\u0000"+
		"\u0000\u0000[\\\u0005=\u0000\u0000\\]\u0005=\u0000\u0000]\u001e\u0001"+
		"\u0000\u0000\u0000^_\u0005!\u0000\u0000_`\u0005=\u0000\u0000` \u0001\u0000"+
		"\u0000\u0000ab\u0005<\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005<"+
		"\u0000\u0000de\u0005=\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0005>\u0000"+
		"\u0000g&\u0001\u0000\u0000\u0000hi\u0005>\u0000\u0000ij\u0005=\u0000\u0000"+
		"j(\u0001\u0000\u0000\u0000\u0004\u0000DJO\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}