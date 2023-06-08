SUMMARY = "The jaxen project is a Java XPath Engine"
DESCRIPTION = "Jaxen is a universal object model walker, capable of evaluating XPath \
expressions across multiple models. Currently supported are dom4j, \
JDOM, and DOM."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "jaxen-1.1.6-39.6.noarch.rpm"
RPM_HASH = "645e32c08738181dae99c967151014589899f1705645c766db2a485aa3da58e1cd39b7383411c642fd23edd38279d0be6771d18fccb7c55ea73fe80497d62864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen jaxen-bootstrap mvn(jaxen:jaxen) mvn(jaxen:jaxen:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(dom4j:dom4j) mvn(jdom:jdom) mvn(xerces:xercesImpl) mvn(xml-apis:xml-apis) mvn(xom:xom)"

inherit rpm
