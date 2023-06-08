SUMMARY = "XML Graphics Commons"
DESCRIPTION = "Apache XML Graphics Commons is a library that consists of \
several reusable components used by Apache Batik and \
Apache FOP. Many of these components can easily be used \
separately outside the domains of SVG and XSL-FO. You will \
find components such as a PDF library, an RTF library, \
Graphics2D implementations that let you generate PDF & \
PostScript files, and much more."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-commons-2.8-1.2.noarch.rpm"
RPM_HASH = "a8da8082b42d0de0f8ee8cee08e7bf13295769f9e855645e2fb4ea2b5137bb5eff8399efb7e399c3ba5f6b0a72d316d0e52fb90be0645e322bde6e56ae1a8495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.xmlgraphics:xmlgraphics-commons) mvn(org.apache.xmlgraphics:xmlgraphics-commons:pom:) osgi(org.apache.xmlgraphics) xmlgraphics-commons"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-io:commons-io) mvn(commons-logging:commons-logging)"

inherit rpm
