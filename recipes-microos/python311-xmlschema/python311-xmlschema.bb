SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-xmlschema-2.3.0-1.1.noarch.rpm"
RPM_HASH = "2cd1a1a66e1f8c97e6e3c05fc21fad1ba1a5963faac7ca5b810916fa7c9622ce5d486d92f1ff5d0357e384f480b7a2b1fdbf6007424873fb32479c6cffe31dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xmlschema) python311-xmlschema python3dist(xmlschema)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-elementpath python311-lxml update-alternatives"

inherit rpm
