SUMMARY = "Open Source Implementation of JMX Java API"
DESCRIPTION = "OpenJMX is an open source implementation of the Java(TM) Management \
Extensions (JMX)."
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "mx4j-3.0.2-38.4.noarch.rpm"
RPM_HASH = "2fc3369fad6bc8c1e94702c229599e63b4bf3c8fe045cccd54c23978457507a5279231bd25c522100d9230ab590c81610bd7de87dd27d170e8470b2bd825194f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmx jmxri mvn(mx4j:mx4j) mvn(mx4j:mx4j-impl) mvn(mx4j:mx4j-impl:pom:) mvn(mx4j:mx4j-jmx) mvn(mx4j:mx4j-jmx:pom:) mvn(mx4j:mx4j-remote) mvn(mx4j:mx4j-remote:pom:) mvn(mx4j:mx4j-rimpl) mvn(mx4j:mx4j-rimpl:pom:) mvn(mx4j:mx4j-rjmx) mvn(mx4j:mx4j-rjmx:pom:) mvn(mx4j:mx4j-tools) mvn(mx4j:mx4j-tools:pom:) mvn(mx4j:mx4j:pom:) mx4j openjmx"
RDEPENDS:${PN} += "/bin/sh apache-commons-logging axis bcel glassfish-activation-api java-headless javamail javapackages-filesystem jce reload4j update-alternatives xml-apis xml-resolver"

inherit rpm
