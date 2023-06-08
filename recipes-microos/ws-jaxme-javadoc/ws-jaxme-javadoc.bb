SUMMARY = "Open source implementation of JAXB"
DESCRIPTION = "A Java/XML binding compiler takes as input a schema description (in \
   most cases an XML schema, but it may be a DTD, a RelaxNG schema, \
   a Java class inspected via reflection, or a database schema). The \
   output is a set of Java classes: * A Java bean class matching the \
   schema description. (If the schema was obtained via Java \
   reflection, the original Java bean class.) \
 \
* Read a conforming XML document and convert it into the equivalent \
   Java bean. \
 \
* Vice versa, marshal the Java bean back into the original XML \
document."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "ws-jaxme-javadoc-0.5.2-11.1.noarch.rpm"
RPM_HASH = "6ef3831ee7d1da13fa07430132fed467f01298cd8d45ff4bd357a543c4915a64cfdd66a4d673532dd1efa0a26922d3bd94d9a90fc5e242588a5009836290e8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ws-jaxme-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
