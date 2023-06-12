SUMMARY = "XPath implementation using JDOM"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-0.9.4-28.6.noarch.rpm"
RPM_HASH = "514801bd83b97f23ce4a4065a036dd4fd39e8e0ec9b9e0125c9e333ba99969d21738cc01731074d2379a9be3ef543d0dd794471618d669974a207f844e7b3ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(werken-xpath:werken-xpath) \
mvn(werken-xpath:werken-xpath:pom:) \
werken-xpath \
werken.xpath"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jdom"

inherit rpm
