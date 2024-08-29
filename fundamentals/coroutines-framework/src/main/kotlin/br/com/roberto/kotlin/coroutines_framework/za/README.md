# Kotlin Developer - Coroutines Framework
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Spring](https://img.shields.io/badge/springboot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)

Repository containing generic source code for Kotlin

## 🚀 Started

These instructions will allow you to get a copy of the project running on your local machine for development and testing purposes.

See **[Implantação](#-implanta%C3%A7%C3%A3o)** to learn how to implement the project.

### 📋 Requirements

- Installation of OpenJDK (Free) according to the project version 
- Gradle dependency manager

### 🔧 Links
  - AdoptiumOpenJdk version 'jdk-17.0.9+9.1'
  - Link: https://adoptium.net/download/
  - Dependency Manager: 'gradle 8.5'
  - Link: https://gradle.org/install/ 
  - Dependency Coroutines Framework: kotlinx-coroutines-core:1.8.0
  - Link: https://github.com/Kotlin/kotlinx.coroutines/blob/master/README.md#using-in-your-projects



### 🔧 Scenario:

Suppose we have a list of 1 million numbers and we need to calculate the square of each number. We divide the work into 4 parts (250 thousand numbers in each part) and use 4 threads to process this list.

1. Concurrency with a single-core processor (Threaded Simulation):
In this case, the processor has a single core, but is capable of executing multiple threads concurrently. This means that it switches quickly between threads, giving the impression that all 4 threads are running at the same time.

Division of work: 1 million numbers are divided into 4 parts of 250 thousand numbers each.
Execution with concurrency: The processor does not process two tasks at the same time, but switches between the 4 threads, switching from one to the other every short interval of time.
Timeline (Single-core concurrency):
Time Impact:
Context Switching Overhead: Switching between threads (pausing one and resuming another) has a cost, known as "context switching". This can introduce delay, especially if there are many threads.
Total Time: The total time will be almost equivalent to the sequential processing time (about 1x the execution time of a task), since the threads are not actually running at the same time.
Numerical example:
If the time to calculate the squares of 1 million numbers sequentially is 1000ms, the concurrent time would be somewhere around 1000ms to 1200ms due to the context switching overhead.

2. Parallelism with multicore processor (multithreaded):
In this case, we have a processor with 4 cores and each core can execute a thread separately. This means that the 4 threads can actually run simultaneously.

Division of work: Again, we divide 1 million numbers into 4 parts (250 thousand numbers per thread).
Parallel execution: Now, each thread is assigned to a separate CPU core, allowing the work to be done at the same time.
Timeline (Parallelism with 4 cores):
Time impact:
No context switching: There is no switching between threads, so the overhead of context switching is avoided.
Total time: The total time will be approximately 1/4 of the sequential time, since the work is divided evenly among 4 cores, each processing a part at the same time.
Numerical example:
If the time to process 1 million numbers sequentially is 1000ms, the time with parallelism will be close to 250ms, since the work is distributed equally among the cores.

### 🔧 The diference between concurrent and parallel

| Concept           | Single Core (Concurrent)                      | MultiCore(Parallelism)             | 
|-------------------|-----------------------------------------------|------------------------------------|
| Threads Execution | Alternância entre threads (troca de contexto) | Threads executadas simultaneamente |
| Overhead          | Troca de contexto entre threads               | Sem troca de contexto              |
| CPU use           | 100% de um núcleo                             | 100% de múltiplos núcleos          |
| Total Time        | 1000ms a 1200ms                               | 250ms                              |
|                   |                                               |                                    |

The Concurrent MultithreadSample implementation

<p align="center">
  <img src= "https://github.com/CarlosRobertoMedeiros/repo-kotlin-developer/blob/main/fundamentals/coroutines-framework/src/main/kotlin/br/com/roberto/kotlin/coroutines_framework/za/ConcurrentMultithread.jpg" />
</p>

The Parallel MultithreadSample implementation

<p align="center">
  <img src= "https://github.com/CarlosRobertoMedeiros/repo-kotlin-developer/blob/main/fundamentals/coroutines-framework/src/main/kotlin/br/com/roberto/kotlin/coroutines_framework/za/ParallelMultithread.jpg" />
</p>

## 🖇️ Colaboration

Please, read the [COLABORACAO.md](https://gist.github.com/usuario/linkParaInfoSobreContribuicoes) to get details about source code

## 📌 Semantic Version Control

We are using [SemVer](http://semver.org/) for version control. See the product version in tags [tags neste repositório](https://github.com/suas/tags/do/projeto). 

## ✒️ Author

* **Carlos Roberto - dev ** - *Dev and Documentation*

## 🎁 Gratitude Expression

* Thank you GOD for the execution about these projects;

---
⌨️ with ❤️ for [Carlos Roberto] 😊
