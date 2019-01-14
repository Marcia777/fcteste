/* Generated By:JavaCC: Do not edit this line. CodeAnalyzer.java */
package com.fcteste.core;

public class CodeAnalyzer implements CodeAnalyzerConstants {

    public class Count{
        protected int opSum = 0;
        protected int opSubtrac = 0;
        protected int opMultiplication = 0;
        protected int opDivision = 0;
        protected int opModule = 0;
        protected int opXor = 0;
        protected int opAnd = 0;
        protected int opOr = 0;
        protected int opNot = 0;
        protected int opAssignment = 0;

        protected int operator = 0;
        protected int operatorOnly = 0;
        protected int operating = 0;

        protected int lineAll = 0;
        protected int lineBlank = 0;
        protected int command = 0;



        public int getOpSum() {
            return opSum;
        }

        public int getOpSubtrac() {
            return opSubtrac;
        }

        public int getOpMultiplication() {
            return opMultiplication;
        }

        public int getOpDivision() {
            return opDivision;
        }

        public int getOpModule() {
            return opModule;
        }

        public int getOpXor() {
            return opXor;
        }

        public int getOpAnd() {
            return opAnd;
        }

        public int getOpOr() {
            return opOr;
        }

        public int getOpNot() {
            return opNot;
        }

        public int getOperator() {
            return operator;
        }

        public int getOperatorOnly() {
            return operatorOnly;
        }

        public int getOperating() {
            return operating;
        }

        public int getLineAll() {
            return lineAll;
        }

        public int getLineBlank() {
            return lineBlank;
        }

        public int getCommand() {
            return command;
        }



    };

    public Count count = new Count();

  final public void run() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARENT_OPEN:
    case PARENT_CLOSE:
    case SUM:
    case SUBTRAC:
    case DIVISION:
    case MULTIPLICATION:
    case MODULE:
    case XOR:
    case AND:
    case OR:
    case NOT:
    case ASSIGNMENT:
    case EQUAL:
    case DIFFERENT:
    case GREATER:
    case LESS:
    case GREQUAL:
    case LSEQUAL:
    case CAND:
    case COR:
    case CXOR:
    case CNOT:
    case VARIABLE:
    case NUMBER:
    case TEXTVALID:
      label_1:
      while (true) {
        analyzer();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PARENT_OPEN:
        case PARENT_CLOSE:
        case SUM:
        case SUBTRAC:
        case DIVISION:
        case MULTIPLICATION:
        case MODULE:
        case XOR:
        case AND:
        case OR:
        case NOT:
        case ASSIGNMENT:
        case EQUAL:
        case DIFFERENT:
        case GREATER:
        case LESS:
        case GREQUAL:
        case LSEQUAL:
        case CAND:
        case COR:
        case CXOR:
        case CNOT:
        case VARIABLE:
        case NUMBER:
        case TEXTVALID:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
      break;
    case 0:
      jj_consume_token(0);
            {if (true) return;}
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final private void analyzer() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARENT_OPEN:
    case SUM:
    case SUBTRAC:
    case DIVISION:
    case MULTIPLICATION:
    case MODULE:
    case XOR:
    case AND:
    case OR:
    case NOT:
    case ASSIGNMENT:
    case VARIABLE:
    case NUMBER:
    case TEXTVALID:
      label_2:
      while (true) {
        checkExpression();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PARENT_OPEN:
        case SUM:
        case SUBTRAC:
        case DIVISION:
        case MULTIPLICATION:
        case MODULE:
        case XOR:
        case AND:
        case OR:
        case NOT:
        case ASSIGNMENT:
        case VARIABLE:
        case NUMBER:
        case TEXTVALID:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PCOMMA:
        jj_consume_token(PCOMMA);
                                        count.command++;
        break;
      case COMMA:
        jj_consume_token(COMMA);
        break;
      case EQUAL:
      case DIFFERENT:
      case GREATER:
      case LESS:
      case GREQUAL:
      case LSEQUAL:
      case CAND:
      case COR:
      case CXOR:
      case CNOT:
        conditional();
        break;
      case PARENT_CLOSE:
        jj_consume_token(PARENT_CLOSE);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case EQUAL:
    case DIFFERENT:
    case GREATER:
    case LESS:
    case GREQUAL:
    case LSEQUAL:
    case CAND:
    case COR:
    case CXOR:
    case CNOT:
      conditional();
      break;
    case PARENT_CLOSE:
      jj_consume_token(PARENT_CLOSE);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final private void checkExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PARENT_OPEN:
    case VARIABLE:
    case NUMBER:
    case TEXTVALID:
      operating();
      break;
    case SUM:
    case SUBTRAC:
    case DIVISION:
    case MULTIPLICATION:
    case MODULE:
    case XOR:
    case AND:
    case OR:
    case NOT:
    case ASSIGNMENT:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUM:
      case SUBTRAC:
      case DIVISION:
      case MULTIPLICATION:
      case MODULE:
      case XOR:
      case AND:
      case OR:
      case ASSIGNMENT:
        operator();
        break;
      case NOT:
        operatorSimple();
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      operating();
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final private void operator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SUM:
    case SUBTRAC:
    case DIVISION:
    case MULTIPLICATION:
    case MODULE:
    case XOR:
    case AND:
    case OR:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUM:
        jj_consume_token(SUM);
               count.opSum++;
        break;
      case SUBTRAC:
        jj_consume_token(SUBTRAC);
                    count.opSubtrac++;
        break;
      case MULTIPLICATION:
        jj_consume_token(MULTIPLICATION);
                           count.opMultiplication++;
        break;
      case DIVISION:
        jj_consume_token(DIVISION);
                     count.opDivision++;
        break;
      case MODULE:
        jj_consume_token(MODULE);
                   count.opModule++;
        break;
      case AND:
        jj_consume_token(AND);
               count.opAnd++;
        break;
      case OR:
        jj_consume_token(OR);
              count.opOr++;
        break;
      case XOR:
        jj_consume_token(XOR);
               count.opXor++;
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ASSIGNMENT:
        jj_consume_token(ASSIGNMENT);
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
                    count.opAssignment++;
      break;
    case ASSIGNMENT:
      jj_consume_token(ASSIGNMENT);
                   count.opAssignment++;
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final private void operatorSimple() throws ParseException {
    jj_consume_token(NOT);
           count.opNot++;
  }

  final private void operating() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VARIABLE:
    case NUMBER:
    case TEXTVALID:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUMBER:
        jj_consume_token(NUMBER);
        break;
      case TEXTVALID:
        jj_consume_token(TEXTVALID);
        jj_consume_token(PARENT_OPEN);
        analyzer();
        break;
      case VARIABLE:
        jj_consume_token(VARIABLE);
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case POINT:
            ;
            break;
          default:
            jj_la1[10] = jj_gen;
            break label_3;
          }
          jj_consume_token(POINT);
          jj_consume_token(VARIABLE);
        }
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      count.operating++;
      break;
    case PARENT_OPEN:
      jj_consume_token(PARENT_OPEN);
      analyzer();
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final private void conditional() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQUAL:
      jj_consume_token(EQUAL);
      break;
    case DIFFERENT:
      jj_consume_token(DIFFERENT);
      break;
    case GREATER:
      jj_consume_token(GREATER);
      break;
    case LESS:
      jj_consume_token(LESS);
      break;
    case GREQUAL:
      jj_consume_token(GREQUAL);
      break;
    case LSEQUAL:
      jj_consume_token(LSEQUAL);
      break;
    case CAND:
      jj_consume_token(CAND);
      break;
    case COR:
      jj_consume_token(COR);
      break;
    case CXOR:
      jj_consume_token(CXOR);
      break;
    case CNOT:
      jj_consume_token(CNOT);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public CodeAnalyzerTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[14];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x8fffffc0,0x8fffffc1,0x8003ff40,0x6ffc0080,0x8fffffc0,0x3ff00,0x8003ff40,0xff00,0x20000,0x2ff00,0x10000000,0x80000000,0x80000040,0xffc0000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x3,0x3,0x3,0x0,0x3,0x0,0x3,0x0,0x0,0x0,0x0,0x3,0x3,0x0,};
   }

  /** Constructor with InputStream. */
  public CodeAnalyzer(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public CodeAnalyzer(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CodeAnalyzerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public CodeAnalyzer(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CodeAnalyzerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public CodeAnalyzer(CodeAnalyzerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CodeAnalyzerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[35];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 14; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 35; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

    /** Main to debug. *
    public static void main(String args[]) throws ParseException {
        CodeAnalyzer parser = new CodeAnalyzer(System.in);
        parser.run();
    }/**/
}
