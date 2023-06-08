SUMMARY = "The SAXON XSLT Processor from Michael Kay"
DESCRIPTION = "The SAXON package is a collection of tools for processing XML \
documents. The main components are: \
 \
* An XSLT processor, which implements the Version 1.0 XSLT and XPath \
   Recommendations from the World Wide Web Consortium, found at \
   http://www.w3.org/TR/1999/REC-xslt-19991116 and \
   http://www.w3.org/TR/1999/REC-xpath-19991116 with a number of \
   powerful extensions. This version of Saxon also includes many of \
   the new features defined in the XSLT 1.1 working draft, but for \
   conformance and portability reasons these are not available if \
   the stylesheet header specifies version='1.0'. \
 \
* A Java library, which supports a similar processing model to XSL, \
   but allows full programming capability, which you need if you \
   want to perform complex processing of the data or to access \
   external services such as a relational database \
 \
* A slightly improved version of the Aelfred parser from Microstar. \
   (But you can use SAXON with any SAX-compliant XML parser if you \
   prefer). \
 \
So you can use SAXON by writing XSLT stylesheets, by writing Java \
applications, or by any combination of the two."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-6.5.5-16.6.noarch.rpm"
RPM_HASH = "11152ca98b4e9365e13699c52fe35f1aaf5ec5fd9b636f4114277232edef2e114047963563247265518a118816fce2d354fc344a4ea8b3c529f6de2be68c2533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxp_transform_impl mvn(saxon:saxon) saxon saxon6"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives java-headless javapackages-filesystem jaxp_parser_impl"

inherit rpm
