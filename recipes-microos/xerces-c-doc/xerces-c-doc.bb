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

RPM_NAME = "xerces-c-doc-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "f9386f8bdb32945791be705f53aa8913de8fd0bba07edf3f3c8810ef290e7fdb8e261ee8d83adf059ad2feef740da9cbb7d2f4a3576982acaac4da0963b75408"

RPROVIDES:${PN} += "xerces-c-doc xerces-c-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
