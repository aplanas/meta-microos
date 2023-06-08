SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "python310-xmlschema-2.2.3-2.1.noarch.rpm"
RPM_HASH = "4bc6b6c3df4cff0189ecaea8da163fc72966bad47ab631d8d07c9cfd8d702ebd36480ddefc944b5050d0a95d90827a2dee8e6f82e5616dbf5962595b176f9e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmlschema python3.10dist(xmlschema) python310-xmlschema python3dist(xmlschema)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-elementpath python310-lxml update-alternatives"

inherit rpm
