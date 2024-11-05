## Spark Word Count Example

1. Compile the code:
```
javac -cp "$SPARK_HOME/jars/*" WordCount.java
```

2. Run the code:

```
java -cp ".:$SPARK_HOME/jars/*" WordCount
```

In my case, because of Java version compatibility issues:
```
java --add-opens java.base/sun.nio.ch=ALL-UNNAMED -cp ".:$SPARK_HOME/jars/*" WordCount
```