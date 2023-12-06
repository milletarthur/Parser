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
   | ...

EXPR ::= E1 . opt_BINOP_EXPR

E1 ::= ...

IDENT ::= (LOWERCASE | UPPERCASE | UNDERSCORE)+

VALUE ::= ...

TYPE ::=
     | "bool"
     | "int"
     | "char"
     | "string"
     
```
