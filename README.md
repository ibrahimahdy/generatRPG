# RPGgenerator

RPGgenerator is a simple console application works as [RPG Attributes Generator.](https://rosettacode.org/wiki/RPG_Attributes_Generator) 


## Getting Started
Clone or download source code. The easiest way to run the application is to import it through a Java IDE such as [intellij IDE](https://www.jetbrains.com/idea/). 

### Prerequisites
Applications requires java 8 or newer installation on your machine.


## Running the Application
Once you run [Main class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Main.java), check the console window
for the output. It should print 2 lines:

#### First one is similar to:
```
Values using Generator: [15, 16, 9, 13, 10, 13]
```
This list is generated using [Generator class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java)


#### Second one is similar to:
```
Values using Naive Generator: [17, 9, 12, 14, 15, 15]
```
While this list is generated using [NaiveGenerator class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/NaiveGenerator.java)

Both classes do the same job. However, [NaiveGenerator class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/NaiveGenerator.java)
is to present a naive solution, rahter simpler one. Although it is harder to scale or change it in case of requirement updates.
On the otherhand, [Generator class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java) 
takes an agile approach, that is suitable for enterprise applications.

##### My concern was regarding the code performace in [Generator class](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java). Specially in 2 points:
1. [Soring list](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java#L41)
2. [Using Arrays.stream](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java#L68)

However, the [profiling log](https://github.com/ibrahimahdy/RPGgenerator/blob/master/Profiling-log.txt) showed no (major) difference.
Though the sample count is 102 only, it still gives an insight on what is happening. 
[Soring list](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java#L41) 
could be a problem when sorting large lists, in such case it could be replaced with an optimized sorting algorthim. 
[Using Arrays.stream](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/Generator.java#L68) 
makes the code easier to read. In addition, second Arrays.stream is only checked if the first one satisfies the condition.


## Unit tests
There are 2 Test classes:
- [GeneratorTest](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/GeneratorTest.java) to cover Generator class
- [NaiveGeneratorTest](https://github.com/ibrahimahdy/RPGgenerator/blob/master/src/RPG/example/NaiveGeneratorTest.java) to cover NaiveGenerator classe

Test coverage report could be checked under [TestCoverageReport](https://github.com/ibrahimahdy/RPGgenerator/tree/master/TestCoverageReport)

---------







