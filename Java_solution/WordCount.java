import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;

public class WordCount {

    public static void main(String[] args) {
        // Set up Spark configuration and context
        SparkConf conf = new SparkConf().setAppName("Word Count").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        // Load the input files
        JavaRDD<String> textFile1 = sc.textFile("../input/sample1.txt");
        JavaRDD<String> textFile2 = sc.textFile("../input/sample2.txt");

        // Perform word count on the first file
        JavaPairRDD<String, Integer> counts1 = textFile1
                .flatMap(line -> Arrays.asList(line.split(" ")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey(Integer::sum);

        // Perform word count on the second file
        JavaPairRDD<String, Integer> counts2 = textFile2
                .flatMap(line -> Arrays.asList(line.split(" ")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey(Integer::sum);

        // Save the output for both word counts
        counts1.saveAsTextFile("output1");
        counts2.saveAsTextFile("output2");

        // Stop the Spark context
        sc.stop();
    }
}