```
Michaël PÉRIN,
VERIMAG / Univ. Grenoble-Alpes
INP / Polytech Grenoble,
November 2023
```

# __6 hours project__
Part of the course __"Parsers which Compute"__

## Project 2023 - A parser of simple C programs

The project consists in
1. parsing simple C programs and building an Abstract Syntax Tree (AST)
2. reprinting the reformated source code with coloring

## Table of tasks

The goal of the project 2022 is to develop several components:

1. a parser

2. an internal representation of the program as an Abstract Syntax Tree (AST)

3. a pretty printer with color mode

4. a exporter of the corresponding Control Flow Graph in the DOT format

5. an optimized version of the CFG with less/no epsilon/NOP-transitions


## How far can you go?

>You can choose the level of your project. Each level adds new requirements on top of the lower levels. The evaluation takes into account the realized features and the quality of your code.

### 10/20 : A correct duo parser-printer

* a parser of simple C program
  - block
  - sequence of statements
  - control structure : `if then else`, `while`
  - assignment : x = expression ;
  - return expression ;
  - simple expression : `e, e op e, (e), ...`
  - boolean binary operator : `==,&&,...`
  - numeric binary operator: `+,*,...`


* ... which constructs the Abstract Syntax Tree

* a printer of your internal representation (AST) which reprints the program
  - with correct indentation

These two steps ensure the correctness of your parser : it is meant to check that your parser/printer reproduces exactly what it parsed.


### 13/20 : more complex expressions

_Previous requirements with in addition:_

* more complex expressions

   - pre and post operator : `!e, &e, *e, e++, e--`	 
   - function call : `f(), f(e,...,e)`
   - one dimension array as expression : `T[N], T[e]`
   - one dimension array as left-hand-side of an assignment : `T[i] = e;`


### 14/20 : reformating with automatic line numbering

_Previous requirements with in addition:_

* The program is __reprinted with colors__ for _types, keywords, operators_
* Each statement is associated to a __line number__
which is shown in the reprinted-program. It will be useful to construct the CFG.
* Example

    <CODE>x=0; y=x+1;</CODE>
    without line breaks is reprinted
    ```C
      1: x=0;
      2: y=y+1;
    ```

### 15/20 : Building the Control Flow Graph (CFG)

_Previous requirements with in addition_

* __Building the CFG__ as an automaton __in DOT format__:

  * Each statement generates an edge of the graph where _source and target states correspond to line numbers_
  * Example
    - The program
  ```C
  1: x=1;
  2: y=x+1;
  3:
  ```
    - has for CFG  `1 --x=1--> 2 --y=x+1--> 3`

    - which is exported in DOT format as
    ```Java
    digraph CFG{
     	1-->2 [label="x=1"];
     	2-->3 [label="y=x+1"];
    }
    ```

### 17/20 : more complex grammar

_Previous requirements with in addition:_

* more statements:
  - `if` without `else`
  - `for` loop

### 18/20 : avoiding epsilon/NOP-transitions

_Previous requirements with in addition:_

* Avoiding epsilon/NOP-transions. For instance,
  - Example
```C
1: x=1;
2: {
3:  {
4:    y=x+1;
5:  }
6: }
7:
```
  - should produce the CFG
`1 --x=1--> 2 --y=x+1--> 7`
  - instead of
`1 --x=1--> 2 ---> 3 ---> 4 --y=x+1--> 5 ---> 6 ---> 7`


### 19/20 : dealing with the break instruction

_Previous requirements and in addition:_

* The `break` instruction exits the current loop.
  - For instance,
  `while(true){ ... ; break; ... }` exits the while loop

  - It is tricky to construct the corresponding CFG.

  - The treatment of `break` is similar to but more complex that of `return`.

  - Try to do your best without spending all your time on this task.


### 20/20 : avoiding all epsilon/NOP-transitions

_Previous requirements and in addition:_

* Avoiding __all__ epsilon/NOP-transitions.

* Associate a different color to each level of nested control structure (if, while, for, ...)

* Try to do your best without spending all your time on this task.




# Where to start?

> Read this file twice. Have a look at the provided code for the first level. Have a meeting with your team to brainstorm and browse the code. And then, take the tasks in the following order.

* **The grammar of the simple C programs**

The grammar is not provided.
It is part of the project to create a grammar.

* **The parser**

  - In the first step the parser can reprint what has been parsed using Tracing methods.
  - In a second phase, it must build an internal Java representation as an Abstract Syntax Tree.


* **Exporting**

The `export` package contains classes which provides the needed functions
for exporting to`DOT`.


## Contents of the `langageC/` directory

* The `syntax/C_SYNTAX.md` file __must be completed with your grammar__

* The `langageC/` directory contains a draft of the parser

  - `Parser.jj` __must be completed__.
    It contains a draft of the parser and runs wihout error on `a00.c` files.

  - The `.java` files __must be completed__ and __must be compliant with the interface__.
    They define the basic structures for the internal representation and export to DOT.

* The `test/` directory contains some simple C program to test your parser/printer.
  - It contains a `Makefile` for generating the output of your tools.


* The `dot/` directory will receive all files produced by your parser/printer.

  - Use the command line `dot -Tjpg file.dot > file.jpg` to generated an image from a dot file.
  - All this is done in the provided `test/Makefile`.


* The `demo/` directory contains examples of **the expected results**.


## Import the project in Eclipse

1. Close Eclipse and relauch it with **workspace =** *the directory of your git clone*

2. Eclipse: File -> Import from source **Project name=**  *JavaProject*


## Test your import

The projet is provided as a prototype able to deal with the grammar `a00.c` below

```C
PROGRAM(a00){
  x=1;
}
```

1. build the project
2. run `make parse` in the `test/` directory
