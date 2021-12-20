FROM openjdk:11
COPY ./target/java-fsd-capstone-assessment-foodbox-0.0.1-snapshot.jar java-fsd-capstone-assessment-foodbox-0.0.1-snapshot.jar
CMD ["java" ,"-jar","java-fsd-capstone-assessment-foodbox-0.0.1-snapshot.jar"]
RUN echo "jenkins ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
