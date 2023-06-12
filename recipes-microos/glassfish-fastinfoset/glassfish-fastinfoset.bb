SUMMARY = "Fast Infoset"
DESCRIPTION = "Fast Infoset specifies a standardized binary encoding for the XML Information \
Set. An XML infoset (such as a DOM tree, StAX events or SAX events in \
programmatic representations) may be serialized to an XML 1.x document or, as \
specified by the Fast Infoset standard, may be serialized to a fast infoset \
document.  Fast infoset documents are generally smaller in size and faster to \
parse and serialize than equivalent XML documents."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-1.2.15-4.4.noarch.rpm"
RPM_HASH = "24a604efcdf8d5eacfd14e8e6a6480215ac8fd00227ba36da9574dc904faf5ee18d9a287bee1c1511be9e22c747b5d29e108d0e51527fc7f93f481776d130f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset \
mvn(com.sun.xml.fastinfoset:FastInfoset) \
mvn(com.sun.xml.fastinfoset:FastInfoset:pom:) \
mvn(com.sun.xml.fastinfoset:FastInfosetUtilities) \
mvn(com.sun.xml.fastinfoset:FastInfosetUtilities:pom:) \
mvn(com.sun.xml.fastinfoset:fastinfoset-project:pom:) \
osgi(com.sun.xml.fastinfoset.FastInfoset)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.sun.xml.stream.buffer:streambuffer) \
mvn(com.sun.xsom:xsom)"

inherit rpm
