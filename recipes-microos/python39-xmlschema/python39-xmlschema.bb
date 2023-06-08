SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "python39-xmlschema-2.2.3-2.1.noarch.rpm"
RPM_HASH = "f573236b1609e6ddb3360fd91576d1f717ea7b9d7db652e9ba9f146df2040680342a02bb5c9f34df315d9d47b442c522b859410f66b511dd3fbaa3e87946a8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xmlschema) python39-xmlschema python3dist(xmlschema)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-elementpath python39-lxml update-alternatives"

inherit rpm
