SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "python311-xmlschema-2.2.3-2.1.noarch.rpm"
RPM_HASH = "be54a7dd1d745ee21653069992ffaf528470012b9e1804ca41db21dd104726991ed2c3e36450f77d8c86b39ef66f2ce12c043a6066df894908ed5aa89e5e3b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xmlschema) python311-xmlschema python3dist(xmlschema)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-elementpath python311-lxml update-alternatives"

inherit rpm
