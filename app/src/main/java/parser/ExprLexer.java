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
		T__0=1, T__1=2, T__2=3, T__3=4, IDENT=5, INT=6, WS=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, EQ=12, NE=13, LT=14, LE=15, MT=16, ME=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "IDENT", "INT", "WS", "MUL", "DIV", "ADD", 
			"SUB", "EQ", "NE", "LT", "LE", "MT", "ME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", null, null, null, "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IDENT", "INT", "WS", "MUL", "DIV", "ADD", 
			"SUB", "EQ", "NE", "LT", "LE", "MT", "ME"
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
		"\u0004\u0000\u0011V\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0005\u0004.\b\u0004\n\u0004\f\u00041\t\u0004\u0001"+
		"\u0005\u0004\u00054\b\u0005\u000b\u0005\f\u00055\u0001\u0006\u0004\u0006"+
		"9\b\u0006\u000b\u0006\f\u0006:\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000"+
		"\u0004\u0004\u0000\"\"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000"+
		"\t\t  X\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001"+
		"\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001\u0000"+
		"\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000"+
		"\r8\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011@\u0001"+
		"\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015D\u0001\u0000\u0000"+
		"\u0000\u0017F\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001b"+
		"L\u0001\u0000\u0000\u0000\u001dN\u0001\u0000\u0000\u0000\u001fQ\u0001"+
		"\u0000\u0000\u0000!S\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&\u0004\u0001\u0000\u0000"+
		"\u0000\'(\u0005(\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005)\u0000"+
		"\u0000*\b\u0001\u0000\u0000\u0000+/\u0007\u0000\u0000\u0000,.\u0007\u0001"+
		"\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\n\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000024\u0007\u0002\u0000\u000032\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\f\u0001\u0000\u0000\u000079\u0007\u0003\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0006\u0006\u0000"+
		"\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005*\u0000\u0000?\u0010\u0001"+
		"\u0000\u0000\u0000@A\u0005/\u0000\u0000A\u0012\u0001\u0000\u0000\u0000"+
		"BC\u0005+\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000"+
		"E\u0016\u0001\u0000\u0000\u0000FG\u0005=\u0000\u0000GH\u0005=\u0000\u0000"+
		"H\u0018\u0001\u0000\u0000\u0000IJ\u0005!\u0000\u0000JK\u0005=\u0000\u0000"+
		"K\u001a\u0001\u0000\u0000\u0000LM\u0005<\u0000\u0000M\u001c\u0001\u0000"+
		"\u0000\u0000NO\u0005<\u0000\u0000OP\u0005=\u0000\u0000P\u001e\u0001\u0000"+
		"\u0000\u0000QR\u0005>\u0000\u0000R \u0001\u0000\u0000\u0000ST\u0005>\u0000"+
		"\u0000TU\u0005=\u0000\u0000U\"\u0001\u0000\u0000\u0000\u0004\u0000/5:"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}