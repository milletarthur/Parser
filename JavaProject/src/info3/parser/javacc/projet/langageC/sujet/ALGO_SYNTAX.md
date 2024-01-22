# The grammar of the ALGO syntax

```Java
PARSE ::= ALGO . EOF

ALGO ::= "ALGORITHM" . "(" . IDENT . ")" . BLOCK

BLOCK ::= "{" . SEQUENCE . "}"

SEQUENCE ::= ( STATEMENT )*

STATEMENT ::=
    | DECL ";"
    | EXPR ";"
    | ASSIGNMENT ";"
    | IFTE
    | RETURN ";"
    | WHILEDO

RETURN ::= "return" . EXPR

EXPR ::=
    | "(" . EXPR . ")"
    | E1 . opt_BINOP_EXPR

opt_BINOP_EXPR ::=
    | epsilon
    | BINOP . EXPR

ASSIGNEMENT ::= IDENT . BINASSIGN . EXPR

DECL ::= SIGN . PRE_TYPE . TYPE . IDENT . opt_DECL . ("," . IDENT . opt_DECL)*

opt_DECL ::=
    | epsilon
    | BINASSIGN . EXPR

IFTE ::= "if" . "(" . EXPR . ")" . (BLOCK | EXPR . ";") . opt_ELSE

opt_ELSE ::=
    | epsilon
    | "else" . (BLOCK | EXPR . ";")

WHILEDO ::= "while"  . "(" . EXPR . ")" . BLOCK

E1 ::=
    | VALUE
    | IDENT . opt_E1
    | PRE_POST_OP . IDENT
    | PTR . IDENT
    | FUNCTION

FUNCTION ::= IDENT . "(" . (epsilon | ARGS) . ")"

ARGS ::= EXPR . opt_ARGS

opt_ARGS ::=
    | epsilon
    | "," . ARGS

opt_E1 ::=
    | PRE_POST_OP
    | ("[" . EXPR . "]")*

PRE_POST_OP ::= "++" | "--" | "!"

PTR ::= "*" | "&"

IDENT ::= (LOWERCASE | UPPERCASE | "_")+ . (LOWERCASE | UPPERCASE | "_" | DIGIT)*

VALUE ::=
    | INTEGER
    | FLOAT
    | CHAR
    | STRING
    | BOOLEAN

INTEGER ::= (DIGIT)+

FLOAT ::=
    | (DIGIT)+ . "." . (DIGIT)*
    | (DIGIT)* . "." . (DIGIT)+

CHAR ::= "'" . (ASCII | epsilon) . "'"

STRING ::= """ . (ASCII)* . """

ASCII ::= All characters in the ASCII table !! WITH "\\" AND NOT "\" !!

BOOLEAN ::= "true" | "false"

BINOP ::= "/" | "!=" | "==" | "|" | "+" | "-" | "*" | "%" | "<"
    | ">" | "<=" | ">=" | "&&" | "||" | "<<" | ">>"

BINASSIGN ::= "=" | ":=" | "+=" | "-=" | "*=" | "&="  | "|=" | "<<=" | ">>="

TYPE ::=
    | "bool"
    | "int"
    | "char"
    | "string"
    | "long"
    | "double"
    | "float"

SIGN ::= "unsigned" | "signed" | epsilon

PRE_TYPE ::= "long" | "short" | epsilon

```
