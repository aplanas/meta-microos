SUMMARY = "Modello Data Model toolkit"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.0"

RPM_NAME = "modello-2.0.0-3.1.noarch.rpm"
RPM_HASH = "8ebfa6f29d4d4d398f9c10268c1b85c0b2911bd3759df08a90ba9eb4e25fe697fb4805d0567e5a9153d9129d55ed47780688e82c6f4ea12d97383f0ce0f076b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello mvn(org.codehaus.modello:modello-core) mvn(org.codehaus.modello:modello-core:pom:) mvn(org.codehaus.modello:modello-plugin-converters) mvn(org.codehaus.modello:modello-plugin-converters:pom:) mvn(org.codehaus.modello:modello-plugin-dom4j) mvn(org.codehaus.modello:modello-plugin-dom4j:pom:) mvn(org.codehaus.modello:modello-plugin-java) mvn(org.codehaus.modello:modello-plugin-java:pom:) mvn(org.codehaus.modello:modello-plugin-jdom) mvn(org.codehaus.modello:modello-plugin-jdom:pom:) mvn(org.codehaus.modello:modello-plugin-sax) mvn(org.codehaus.modello:modello-plugin-sax:pom:) mvn(org.codehaus.modello:modello-plugin-stax) mvn(org.codehaus.modello:modello-plugin-stax:pom:) mvn(org.codehaus.modello:modello-plugin-xdoc) mvn(org.codehaus.modello:modello-plugin-xdoc:pom:) mvn(org.codehaus.modello:modello-plugin-xml) mvn(org.codehaus.modello:modello-plugin-xml:pom:) mvn(org.codehaus.modello:modello-plugin-xpp3) mvn(org.codehaus.modello:modello-plugin-xpp3:pom:) mvn(org.codehaus.modello:modello-plugin-xsd) mvn(org.codehaus.modello:modello-plugin-xsd:pom:) mvn(org.codehaus.modello:modello-plugins:pom:) mvn(org.codehaus.modello:modello-test) mvn(org.codehaus.modello:modello-test:pom:) mvn(org.codehaus.modello:modello:pom:)"
RDEPENDS:${PN} += "/bin/bash guava java-headless javapackages-filesystem javapackages-tools mvn(org.codehaus.plexus:plexus-compiler-api) mvn(org.codehaus.plexus:plexus-compiler-javac) mvn(org.codehaus.plexus:plexus-utils) mvn(org.eclipse.sisu:org.eclipse.sisu.plexus) mvn(org.jsoup:jsoup) mvn(org.sonatype.plexus:plexus-build-api) mvn(org.sonatype.sisu:sisu-guice::no_aop:) xbean"

inherit rpm
