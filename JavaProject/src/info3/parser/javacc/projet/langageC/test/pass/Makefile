
PARSER = info3.parser.javacc.projet.langageC._code.Parser
EXT = c

THE_WORKSPACE = ../../../../../../../..
THE_CP = $(THE_WORKSPACE)/bin 
RUN = java -cp $(THE_CP) 
TEST_DIR = .
SOURCES = $(wildcard $(TEST_DIR)/*.$(EXT))

default:
	@less Makefile

test: $(SOURCES:.$(EXT)=.parsing)

%.parsing: %.$(EXT)
	@echo 
	@echo "\033[1mparsing\033[0m"
	@echo "\033[94m" ; cat $< ; echo "\033[0m"
	@echo 
	$(RUN) $(PARSER) $< 

cfg:
	$(MAKE) -C ../dot/ jpg

clean:
	$(MAKE) -C ../dot/ clean


