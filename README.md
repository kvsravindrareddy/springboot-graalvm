# springboot-graalvm
################################################################################################################
This is created by Trending Technologies Pvt Ltd.
Live training please contact info@trendingtechnologies.net
+91-7353122882 (Whatsapp only)
Send enquires from 
www.trendingtechnologies.in
www.trendingtechnologies.net
www.trendingtechnologies.asia
################################################################################################################



GraalVM

GraalVM is a universal virtual machine for running applications written in JavaScript, Python, Ruby, R, JVM-based languages like Java, Scala, Groovy, Kotlin, Clojure, and LLVM-based languages such as C and C++.

GraalVM removes the isolation between programming languages and enables interoperability in a shared runtime. It can run either standalone or in the context of OpenJDK, Node.js or Oracle Database.

Turning JVM into a Polyglot world with GraalVM.
Stable version is 19.3.0 which was released in May 2019.

What does GraalVM do?
Zero overhead interoperability between programming languages allows you to write polyglot applications and select the best language for your task.

Run any programming language faster with GraalVM.
Community version is free to use it in Development and Production.
Enterprise version is faster and more secure and free to use it for Development but paid for Production use.

Enterprise Version benefits.
    • Faster performance
    • Lower memory footprint for microservices
    •  Enhanced security features, including managed capabilities for native code
    •  Free for evaluation and for developing new applications
    •  Premier 24x7 support via Oracle Support non-experimental features
    •  GraalVM Native Image is supported
    
Installation : 
GraalVM is a standalone Java Development Kit to execute Java or JVM-based languages (e.g. Scala, Kotlin), dynamic languages (e.g. JavaScript, R, Ruby, R, Python), LLVM-based languages (e.g. C and C++) in one shared runtime, and supports Linux, macOS and Windows platforms on x86 64-bit systems.
It may not work in Windows properly. Suggest to use the Mac or Any Linux OS either use the Docker to run the applications using GraalVM.

This documents installation uses the GraalVM using Docker.
Docker Installation using Ubuntu (for other operating systems refer Google)
Note : If you already docker setup skip the docker installation process.
>sudo apt-get update
>sudo apt-get install docker.io
Start the docker container and enter the bash to execute the different programming languages which is supported by GraalVM
>sudo docker run -it oracle/graalvm-ce:19.3.1 bash
      it takes some time to pull and run the graalVM in docker container.
      Once it opens in bash mode execute the below commands to check the supported programming language versions.
      >java -version
      >node -v
      >npm -v
      >lli --version

Examples :-
Run existing Java program, C, Ruby in GraalVM using Docker container or standalone.

C Language :
Write a C program in Bash mode.
>vi helloworld.c
#include <stdio.h>
int main()
{
        printf("Hello TrendingTechnologies\n");
        return 0;
}
save and run the program using GraalVM bash
To set up the LLVM toolchain support for GraalVM, execute the following commands:
$ gu install llvm-toolchain
$ export LLVM_TOOLCHAIN=$(lli --print-toolchain-path)
$ $LLVM_TOOLCHAIN/clang helloworld.c -o helloworld
$ lli helloworld
$Hello TrendingTechnologies

Java (SpringBoot Application):
Run the existing basic spring boot application with GraalVM by making it as docker image.
Create a Dockerfile for the existing SpringBoot application.
Dockerfile:-
Clone the ‘springboot-graalvm’ project and do the ./mvnw clean install
Do the Docker build and run the application using docker run
Here is the Docker file for Just understanding.
FROM oracle/graalvm-ce:19.3.1
copy target/springboot-graalvm.jar springboot-graalvm.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "springboot-graalvm.jar"]

>docker build -t springboot-graalvm .
Here is dot (.) is mandatory to build the application using Docker
>docker run -p 8095:8095 springboot-graalvm
