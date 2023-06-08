SUMMARY = "XPath 1.0/20 parsers and selectors for ElementTree and lxml"
DESCRIPTION = "The proposal of this package is to provide XPath 1.0 and 2.0 selectors for Python's ElementTree XML \
data structures, both for the standard ElementTree library and for the \
`lxml.etree <http://lxml.de>`_ library."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python39-elementpath-3.0.2-2.1.noarch.rpm"
RPM_HASH = "ccc8dff6ef117a1e6ea532e084838b84ef17ff5094666b34bbc9e6d14a348bf3c6b51aceacf38c568b8e0b3a708b255305f8e90b682340300eb2a4ff7108b417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(elementpath) python39-elementpath python3dist(elementpath)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
