SUMMARY = "Modello Maven Plugin"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation. \
 \
Modello Maven Plugin enables the use of Modello in Maven builds."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.0"

RPM_NAME = "modello-maven-plugin-2.0.0-3.1.noarch.rpm"
RPM_HASH = "080e8f74ca163778cdaabc9946b379a94c09f2580a3ff95ceff2e6c6d9afaa55a0ca71e63e2c3b8ad44104739b65292498bab74572a46b737852ddda3e35f18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin \
mvn(org.codehaus.modello:modello-maven-plugin) \
mvn(org.codehaus.modello:modello-maven-plugin:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.modello:modello-core) \
mvn(org.codehaus.modello:modello-plugin-converters) \
mvn(org.codehaus.modello:modello-plugin-dom4j) \
mvn(org.codehaus.modello:modello-plugin-java) \
mvn(org.codehaus.modello:modello-plugin-jdom) \
mvn(org.codehaus.modello:modello-plugin-sax) \
mvn(org.codehaus.modello:modello-plugin-stax) \
mvn(org.codehaus.modello:modello-plugin-xdoc) \
mvn(org.codehaus.modello:modello-plugin-xpp3) \
mvn(org.codehaus.modello:modello-plugin-xsd) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.sonatype.plexus:plexus-build-api)"

inherit rpm
