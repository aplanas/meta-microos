SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-elementpath-3.0.2-2.1.noarch.rpm"
RPM_HASH = "28c80dcbf92fcfb2923a0546c9058b9657f730b4e5fa110c6909cc08870a29da1e12a26d90a12d4dbfb47372fe350d35a8a7e89b7bb3d340beb81cfaaf2cf380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(elementpath) python311-elementpath python3dist(elementpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
