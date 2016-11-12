# dependencycheck-archetype-analyzer

This is a simple archetype for generating some of the code that is necessary
for a Dependency Check analyzer. See [Making a new Analyzer][making] for more
information on how to make a new analyzer.

## Use It

    mvn archetype:generate \
        -DarchetypeGroupId=org.owasp \
        -DarchetypeArtifactId=dependencycheck-archetype-analyzer \
        -DarchetypeVersion=1.0

[making]: https://github.com/jeremylong/DependencyCheck/wiki/Making-a-new-Analyzer "Making a new Analyzer"

