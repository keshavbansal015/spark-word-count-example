from pyspark import SparkContext

# Initialize SparkContext
sc = SparkContext("local", "Word Count")

# Read the input file
text_file1 = sc.textFile("../input/sample1.txt")
text_file2 = sc.textFile("../input/sample2.txt")

# Perform word count
counts1 = (text_file1
          .flatMap(lambda line: line.split())
          .map(lambda word: (word, 1))
          .reduceByKey(lambda a, b: a + b))

# Perform word count
counts2 = (text_file2
          .flatMap(lambda line: line.split())
          .map(lambda word: (word, 1))
          .reduceByKey(lambda a, b: a + b))

# Save the output
counts1.saveAsTextFile("output1")
counts2.saveAsTextFile("output2")

sc.stop()