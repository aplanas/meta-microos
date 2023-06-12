SUMMARY = "RELAX NG validator in Java"
DESCRIPTION = "jing is an XML validator implemented in Java. It validates against the \
RELAX NG schema language and implements the following specifications: \
 \
* RELAX NG 1.0 Specification \
* RELAX NG Compact Syntax \
* Parts of RELAX NG DTD Compatibility (checking of ID/IDREF/IDREFS) \
 \
It also comes with experimental support for schema languages other than \
RELAX NG: \
 \
* W3C XML Schema (based on Xerces-J) \
* Schematron 1.5 \
* Namespace Routing Language"
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-20220510-3.1.noarch.rpm"
RPM_HASH = "52ecab51a118a745145efe425106f1281085e8bdca0b908aac2f5e59efd197152ea829315b3651f88162a3fa0ba5a948c50f7aa98b2c66547e1bb81ecb83cbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing \
mvn(com.thaiopensource:jing) \
mvn(org.relaxng:jing) \
mvn(org.relaxng:jing:pom:)"
RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn(com.github.relaxng:relaxngDatatype) \
mvn(isorelax:isorelax) \
mvn(net.sf.saxon:saxon) \
mvn(xerces:xercesImpl) \
mvn(xml-apis:xml-apis) \
mvn(xml-resolver:xml-resolver)"

inherit rpm
