SUMMARY = "Demonstration and samples for xalan-j2"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program. \
 \
This package contains demonstration and sample files for Xalan."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-demo-2.7.2-12.6.noarch.rpm"
RPM_HASH = "a04ee2e58ca19a08c3297a104ee3d4f90f8bb10ca3aba856cac43741fb6ab0a5c3e094ca624c1070d8a320aa62b6d2017238c2c35e2390df07dbbcd00802fc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xalan-j2-demo"
RDEPENDS:${PN} += "servlet xalan-j2"

inherit rpm
