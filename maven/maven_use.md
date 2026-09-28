The maven in java is a build automation tool used primarily for Java projects. It helps manage project dependencies, build processes, and project configurations. Maven uses a Project Object Model (POM) file to define the project's structure, dependencies, and build instructions. It simplifies the process of managing libraries and frameworks, allowing developers to easily include external dependencies in their projects. Additionally, Maven provides a standardized way to build and deploy applications, making it easier to maintain and collaborate on Java projects.

So basically to make our java project live we need to write the source code, compile it, and then package it into a deployable format (like a JAR or WAR file). Maven automates these steps through its lifecycle phases, which include:
1. **Validate**: Checks if the project is correct and all necessary information is available.
2. **Compile**: Compiles the source code of the project.
3. **Test**: Runs tests using a suitable testing framework.
4. **Package**: Packages the compiled code into a distributable format, such as a JAR or WAR file.
5. **Verify**: Runs any checks to verify the package is valid and meets quality criteria.
6. **Install**: Installs the package into the local repository, making it available for other projects on the same machine.
7. **Deploy**: Copies the final package to the remote repository for sharing with other developers or for deployment to production environments.

jar is basically a Java ARchive file format that is used to aggregate many Java class files and associated metadata and resources (text, images, etc.) into one file for distribution. JAR files are built on the ZIP file format and have a .jar file extension. They are used for packaging Java applications or libraries, making it easier to distribute and deploy them.while the war is a Web Application Archive file format used to package web applications that can be deployed on a servlet container or application server. WAR files contain JavaServer Pages (JSP), servlets, Java classes, XML files, tag libraries, static web pages (HTML and related files), and other resources that make up a web application. They have a .war file extension and are also built on the ZIP file format. WAR files are essential for deploying Java web applications in environments like Apache Tomcat, JBoss, or GlassFish.

maven is an open source tool and developed by the Apache Software Foundation. It is widely used in the Java community for managing project builds, dependencies, and documentation. Maven provides a consistent and standardized way to build projects, making it easier for developers to collaborate and maintain codebases. It also integrates with various IDEs (Integrated Development Environments) like Eclipse, IntelliJ IDEA, and NetBeans, enhancing the development experience.

what maven can do?

-create the standard project folder structure for a new project.
-download and manage dependencies automatically from a central repository.
-execute unit test cases using testing frameworks like JUnit or TestNG.
-compile source code and package it into JAR or WAR files.
-generate project documentation and reports.
-automate the build process through a series of predefined lifecycle phases.

Command for creating a new maven project:

mvn archetype:generate "-DgroupId=com.example" "-DartifactId=myapp" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false"


Maven Goals

maven goals are used to perform various stages of the project lifecycle. Some common goals include:
- **clean**: Cleans the project by deleting the target directory, which contains compiled classes and other build artifacts.
- **compile**: Compiles the source code of the project.
- **test**: Executes unit tests using testing frameworks like JUnit or TestNG.
- **package**: Packages the compiled code into a distributable format, such as a JAR or WAR file.
- **install**: Installs the package into the local repository for use as a dependency in other projects.

$mvn <goal> :This command is used to execute a specific goal in Maven. For example, to compile the project, you would run:

```bash
mvn compile
```
```bash
mvn clean:This command is used to clean the project by deleting the target directory, which contains compiled classes and other build artifacts. It is often used before building the project to ensure a clean build environment.

```

```bash
mvn test: This command is used to execute unit tests in the project. It runs the tests defined in the test source directory and generates test reports.It runs compile + test phases of the build lifecycle.
```

```bash
mvn package: This command is used to package the compiled code into a distributable format, such as a JAR or WAR file. It runs compile + test + package phases of the build lifecycle.
```


Maven Web APP
```bash
mvn archetype:generate "-DgroupId=com.example" "-DartifactId=myapp" "-DarchetypeArtifactId=maven-archetype-webapp" "-DinteractiveMode=false"
```
Maven Repositories:

1)Central Repository: The central repository is the default repository used by Maven to download dependencies. It is a public repository maintained by the Apache Software Foundation and contains a vast collection of open-source libraries and frameworks. When you specify a dependency in your POM file, Maven automatically searches the central repository to download the required artifacts.

2)Local Repository: The local repository is a directory on your local machine where Maven stores downloaded dependencies and project artifacts. By default, it is located in the user's home directory under `.m2/repository`. When you build a Maven project, it first checks the local repository for the required dependencies before attempting to download them from the central repository. This helps reduce network usage and speeds up the build process for subsequent builds of the same project or other projects that use the same dependencies.

3)Remote Repository: A remote repository is a repository hosted on a remote server, which can be accessed over the internet. It can be a public repository, like the central repository, or a private repository set up by an organization to host its own artifacts. Maven can be configured to use remote repositories in addition to the central repository, allowing developers to access additional libraries and frameworks that may not be available in the central repository.


Gradle: It is another build automation tool that is used for building, testing, and deploying software. It is designed to be flexible and extensible, allowing developers to define custom build logic and tasks. Gradle uses a Groovy-based DSL (Domain Specific Language) or Kotlin-based DSL for defining build scripts, making it more expressive and easier to read compared to XML-based configurations like Maven's POM files. Gradle supports incremental builds, parallel execution, and dependency management, making it suitable for large-scale projects. It is widely used in the Java ecosystem and has gained popularity for its performance and flexibility.But Maven is still preferred in many enterprise environments due to its simplicity, convention over configuration approach, and extensive plugin ecosystem.