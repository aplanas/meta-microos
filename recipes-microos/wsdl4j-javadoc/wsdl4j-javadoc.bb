SUMMARY = "Javadoc for wsdl4j"
DESCRIPTION = "The Web Services Description Language for Java Toolkit (WSDL4J) allows \
the creation, representation, and manipulation of WSDL documents \
describing services.  This codebase will eventually serve as a \
reference implementation of the standard created by JSR110. \
 \
This package contains the javadoc documentation for the Web Services \
Description Language for Java."
LICENSE = "IPL-1.0"

PV = "1.6.3"

RPM_NAME = "wsdl4j-javadoc-1.6.3-11.6.noarch.rpm"
RPM_HASH = "219e2c675cea1f0cbbf3070070a48739890db32fa8b72cb137744b583dee13ca1192a84867a8bd3ef6c1db2f303a0ff5099e334e1dd500720b6647dcc2d039da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wsdl4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
