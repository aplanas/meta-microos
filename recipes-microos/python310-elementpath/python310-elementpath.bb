SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-elementpath-3.0.2-2.1.noarch.rpm"
RPM_HASH = "0b8aa3632bc39fa5ae399d3bc7aea013ae57e4ea72123aaee64e66a0260dcad860653df7e6352ddec92984af323a0f2e5c496c0252e0b97e2a9472c2811a7711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elementpath python3.10dist(elementpath) python310-elementpath python3dist(elementpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
