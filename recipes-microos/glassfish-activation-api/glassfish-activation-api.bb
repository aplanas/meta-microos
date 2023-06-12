SUMMARY = "JavaBeans Activation Framework API jar"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s). \
 \
This package contains a Java library with only the APIs"
LICENSE = "(BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-api-1.2.0-4.3.noarch.rpm"
RPM_HASH = "48eb97ed9e29fb4757c5c2923613d578575ce4b7c790083bb15a2750a07ef1c49c7c69eedc3c0c4358d99f4e4885579214640c602630f7b2d867378922570acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-api \
gnu-jaf \
mvn(javax.activation:activation) \
mvn(javax.activation:activation:pom:) \
mvn(javax.activation:javax.activation-api) \
mvn(javax.activation:javax.activation-api:pom:) \
osgi(javax.activation-api)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
