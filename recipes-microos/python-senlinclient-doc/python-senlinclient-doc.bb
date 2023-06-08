SUMMARY = "Documentation for OpenStack Senlin API Client"
DESCRIPTION = "This is a client for the OpenStack Senlin API. \
It implements 100% of the OpenStack Senlin API. This package contains \
auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python-senlinclient-doc-2.4.0-1.5.noarch.rpm"
RPM_HASH = "d79b0ee871fa22cbf95bb296a66fce4d7e5c902630723e4717bf98c0f23559876dc42011276d8193c25f34e26d3b49d7e94abb68895c166490c63a0d3727d40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-senlinclient-doc"
RDEPENDS:${PN} += ""

inherit rpm
