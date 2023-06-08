SUMMARY = "Java 1 to 15 Parser and Abstract Syntax Tree for Java"
DESCRIPTION = "A set of libraries implementing a Java 1.0 - Java 15 Parser with advanced \
analysis functionalities. This includes preview features to Java 13, with Java \
14 preview features work-in-progress."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.2"

RPM_NAME = "javaparser-3.25.2-1.1.noarch.rpm"
RPM_HASH = "35c4f848cdf43ced62941fcbbccc714bd6f03935bddf96854f8c9ac43d51a7ea33dc5a7d04860c992f54083d6dc29c4c823c3c294412798697dbe33453e2207a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser mvn(com.github.javaparser:javaparser-core) mvn(com.github.javaparser:javaparser-core:pom:) mvn(com.github.javaparser:javaparser-parent:pom:) mvn(com.github.javaparser:javaparser-symbol-solver-core) mvn(com.github.javaparser:javaparser-symbol-solver-core:pom:) mvn(com.github.javaparser:javaparser-symbol-solver-testing) mvn(com.github.javaparser:javaparser-symbol-solver-testing:pom:) mvn(com.google.code.javaparser:javaparser) mvn(com.google.code.javaparser:javaparser:pom:) osgi(com.github.javaparser.javaparser-core)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.google.guava:guava) mvn(org.checkerframework:checker-qual) mvn(org.javassist:javassist)"

inherit rpm
