SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-xmlschema-2.3.0-1.1.noarch.rpm"
RPM_HASH = "9d4ee35520e7ee3f2f3fbdc75246d52f88162dd7e931ffcfcaf2b59e1e890e95f992b8dce14800a5336094a27ebb0d6b00f7667b90596ae688e6acdeeaac3c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmlschema python3.10dist(xmlschema) python310-xmlschema python3dist(xmlschema)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-elementpath python310-lxml update-alternatives"

inherit rpm
