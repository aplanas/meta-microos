SUMMARY = "A validating XML parser - Development Files"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. \
 \
This package includes files needed for development with Xerces-c"
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxerces-c-devel-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "b46315960c03358993c525b2b2229628c3cb7067a8ed50cbcfbb70bd01fdc2f4e0c173ffa634ced28ee7cee1f596ccb3e89d82ed5bc795ca59b952e5dea955bb"

RPROVIDES:${PN} += "Xerces-c-devel libXerces-c-devel libxerces-c-devel libxerces-c-devel(aarch-64) pkgconfig(xerces-c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxerces-c-3_2"

inherit rpm
