JC = javac
JVM= java

.SUFFIXES: .java .class

.java.class: 
	$(JC) $*.java

 CLASSES = \
    Main.java \
    Elevator.java \
    
 MAIN = Main

 default: classes

 classes: $(CLASSES:.java=.class)

 run : classes 
	$(JVM) $(MAIN) $(INPUT)

clean:
	$(RM) *.class