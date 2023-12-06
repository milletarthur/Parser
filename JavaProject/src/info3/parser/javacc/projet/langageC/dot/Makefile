DOT_FILES = $(wildcard *.dot)

default: 
	@less Makefile

jpg: $(DOT_FILES:%.dot=%.jpg)

%.jpg: %.dot
	@dot -Tjpg $< > $@
	@open $@

clean:
	@rm -f *.dot* *.jpg
