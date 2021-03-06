// Generated from nl\han\ica\icss\parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9, 
		DEFAULT=10, SUMOP=11, SUMMIN=12, SUMKEER=13, COLOR=14, PIXELS=15, PERCENTAGE=16, 
		VARNAME=17, NAME=18, PROPERTYNAME=19, NUMBERS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WS", 
		"DEFAULT", "SUMOP", "SUMMIN", "SUMKEER", "COLOR", "PIXELS", "PERCENTAGE", 
		"VARNAME", "NAME", "PROPERTYNAME", "ALPHANUM", "LETTERS", "NUMBERS", "HASH", 
		"DOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'is'", "';'", "'switch'", "'case'", "'{'", "'}'", "':'", 
		null, "'default'", "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WS", "DEFAULT", 
		"SUMOP", "SUMMIN", "SUMKEER", "COLOR", "PIXELS", "PERCENTAGE", "VARNAME", 
		"NAME", "PROPERTYNAME", "NUMBERS"
	};
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nP\n\n\r\n\16\nQ\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20m\n\20\r\20\16\20"+
		"n\3\20\3\20\3\20\3\21\6\21u\n\21\r\21\16\21v\3\21\3\21\3\22\3\22\3\22"+
		"\6\22~\n\22\r\22\16\22\177\3\23\3\23\3\23\3\23\6\23\u0086\n\23\r\23\16"+
		"\23\u0087\3\24\3\24\6\24\u008c\n\24\r\24\16\24\u008d\3\25\5\25\u0091\n"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\2+\2-\26/\2\61\2\3\2\7\5\2\13\f\17\17\"\"\4\2//aa\5\2\62;CHch\4\2"+
		"C\\c|\3\2\62;\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\3\63\3\2"+
		"\2\2\5\67\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13C\3\2\2\2\rH\3\2\2\2\17J\3\2"+
		"\2\2\21L\3\2\2\2\23O\3\2\2\2\25U\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3"+
		"\2\2\2\35c\3\2\2\2\37l\3\2\2\2!t\3\2\2\2#z\3\2\2\2%\u0085\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096\3\2\2\2\61"+
		"\u0098\3\2\2\2\63\64\7n\2\2\64\65\7g\2\2\65\66\7v\2\2\66\4\3\2\2\2\67"+
		"8\7k\2\289\7u\2\29\6\3\2\2\2:;\7=\2\2;\b\3\2\2\2<=\7u\2\2=>\7y\2\2>?\7"+
		"k\2\2?@\7v\2\2@A\7e\2\2AB\7j\2\2B\n\3\2\2\2CD\7e\2\2DE\7c\2\2EF\7u\2\2"+
		"FG\7g\2\2G\f\3\2\2\2HI\7}\2\2I\16\3\2\2\2JK\7\177\2\2K\20\3\2\2\2LM\7"+
		"<\2\2M\22\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS"+
		"\3\2\2\2ST\b\n\2\2T\24\3\2\2\2UV\7f\2\2VW\7g\2\2WX\7h\2\2XY\7c\2\2YZ\7"+
		"w\2\2Z[\7n\2\2[\\\7v\2\2\\\26\3\2\2\2]^\7-\2\2^\30\3\2\2\2_`\7/\2\2`\32"+
		"\3\2\2\2ab\7,\2\2b\34\3\2\2\2cd\5/\30\2de\5)\25\2ef\5)\25\2fg\5)\25\2"+
		"gh\5)\25\2hi\5)\25\2ij\5)\25\2j\36\3\2\2\2km\5-\27\2lk\3\2\2\2mn\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7r\2\2qr\7z\2\2r \3\2\2\2su\5-\27\2"+
		"ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\'\2\2y\"\3\2\2"+
		"\2z}\7&\2\2{~\5+\26\2|~\7a\2\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080$\3\2\2\2\u0081\u0086\5\61\31\2\u0082\u0086"+
		"\5/\30\2\u0083\u0086\5+\26\2\u0084\u0086\t\3\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088&\3\2\2\2\u0089\u008c"+
		"\5+\26\2\u008a\u008c\7/\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e(\3\2\2\2"+
		"\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091*\3\2\2\2\u0092\u0093\t"+
		"\5\2\2\u0093,\3\2\2\2\u0094\u0095\t\6\2\2\u0095.\3\2\2\2\u0096\u0097\7"+
		"%\2\2\u0097\60\3\2\2\2\u0098\u0099\7\60\2\2\u0099\62\3\2\2\2\r\2Qnv}\177"+
		"\u0085\u0087\u008b\u008d\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}