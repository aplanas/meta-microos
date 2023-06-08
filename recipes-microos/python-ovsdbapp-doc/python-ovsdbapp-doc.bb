SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the ovsdbap library."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python-ovsdbapp-doc-2.2.1-1.2.noarch.rpm"
RPM_HASH = "c6e9de884ebe4b2f69f16128c9e6452a169d911c8ce32d6ef051a1ea7311e9cb0e56df6f74033cf07397c2848d248923c73baba1f84eeca5751ea7aa64364e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ovsdbapp-doc"
RDEPENDS:${PN} += ""

inherit rpm
