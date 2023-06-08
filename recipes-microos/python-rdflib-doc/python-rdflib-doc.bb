SUMMARY = "A Python library for working with RDF"
DESCRIPTION = "RDFLib is a Python library for working with RDF, a simple yet powerful \
language for representing information. The library contains an RDF/XML \
parser/serializer that conforms to the RDF/XML Syntax Specification (Revised). \
The library also contains both in-memory and persistent Graph backends."
LICENSE = "BSD-3-Clause"

PV = "6.1.1"

RPM_NAME = "python-rdflib-doc-6.1.1-1.12.noarch.rpm"
RPM_HASH = "76e9648df4749fc6259fdb70774d1f2a046905ba5a0b3b49e855ffe6899b2562de2fdb69128198dd952c91e4f58a8294c9e204d153d4c07b1559711de082f5c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rdflib-doc python310-rdflib-doc python311-rdflib-doc python39-rdflib-doc"
RDEPENDS:${PN} += ""

inherit rpm
