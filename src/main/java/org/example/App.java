package org.example;

/*

1. Pushing to Git repository on Github
2. It triggers a build on Travis CI
3. The project is completed
4. Tests run with code coverage
5. The result of the code coverage is sent to Tute
6. Code quality analysis is performed on SonarCloud
7. The results of all remove services are sent back to Github
8. It will be used to annotate the file commit and possibly the PR with those results (including failures)

 */
public class App {

    public String sayHello() {
        return "Hello";
    }
}
