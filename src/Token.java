public class Token {
    final TokenType type; // The type of the token.
    final String lexeme; // The actual text of the token.
    final Object literal;  // The value of the token.
    final int line; // The line number where the token was found.

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
