## Apache Spark Installation Guide

### Prerequisites

Before installing Apache Spark, ensure the following prerequisites are met:

#### Mac OS or Linux:

1. Java: Apache Spark requires Java. Make sure you have it installed:

```
java -version
```

If not installed, on Mac, use Homebrew:

```
brew install openjdk
```
On Ubuntu Linux:

```
sudo apt update
sudo apt install openjdk-8-jdk
```

#### Windows 10:

1.	Install WSL (Windows Subsystem for Linux) and then Install Ubuntu 20.04 LTS from the Microsoft Store.
    * Java Installation on WSL:

```
sudo apt update
sudo apt install openjdk-8-jdk
```

2.	Set JAVA_HOME: For more information on setting JAVA_HOME, refer to [this guide](https://www.wikihow.com/Set-Java-Home).


### Installing Apache Spark

To install Spark on Mac, Linux, or Windows (using WSL), follow these steps:

1.	Download and Extract Spark: Open a terminal and run the following commands to download and unpack Spark:

```
cd ~
wget https://archive.apache.org/dist/spark/spark-3.5.3/spark-3.5.3-bin-hadoop3.tgz
tar xfz spark-3.5.3-bin-hadoop3.tgz
```


2.	Add Spark to Your PATH: Add Spark binaries to your PATH. You can add this to your .bashrc or .zshrc file for convenience:

```
export SPARK_HOME=~/spark-3.5.3-bin-hadoop3
export PATH=$PATH:$SPARK_HOME/bin
```

After editing the file, load the changes:

```
source ~/.bashrc
```

3.	Verify the Installation: Check if Spark is installed by running:

```
spark-shell
```

This should open the Spark shell. Use ```:quit``` to exit.

### Setting Up PySpark

1.	Verify PySpark Installation:
Start PySpark by running:

```
pyspark
```

If you dont have pyspark installed, run the following command:

```
pip install pyspark
```

If you encounter errors, ensure Python is installed and accessible.

#### **In case you need any assistance, please contact the TA.**

----
