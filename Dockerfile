FROM oracle/graalvm-ce:19.3.1
copy target/springboot-graalvm.jar springboot-graalvm.jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "springboot-graalvm.jar"]