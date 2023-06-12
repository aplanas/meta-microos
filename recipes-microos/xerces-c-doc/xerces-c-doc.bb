SUMMARY = "Documentation for xerces-c"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces). \
 \
This package contains just documentation."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "xerces-c-doc-3.2.4-1.5.aarch64.rpm"
RPM_HASH = "4917520689fa8ffb2944012a0067342083f2aa1f25590ae8c76e433a5cd782e00fb1e082696827321960c3a389790f541976eaa19c2bc439e47fa2f829e1f754"

RPROVIDES:${PN} += "xerces-c-doc \
xerces-c-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
