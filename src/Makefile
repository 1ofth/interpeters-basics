JFLEX  = jflex
JACC = java -jar /home/edem/jacc.jar
JAVAC  = javac

# targets:

all: Parser.class

run: Parser.class
	java Parser

build: clean Parser.class

clean:
	rm -f *~ *.class com/ifmo/interpreter/*.class

Parser.class: Lexer.java Parser.java
	$(JAVAC)  Parser.java

Lexer.java: lexer.flex
	$(JFLEX) lexer.flex

Parser.java: parser.jacc
	$(JACC) parser.jacc