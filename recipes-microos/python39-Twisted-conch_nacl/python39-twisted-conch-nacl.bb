SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch_nacl-22.10.0-6.1.noarch.rpm"
RPM_HASH = "0c5a42fac339eb07790192207a43aaa3914da9499c4afce987ece3e3d6458ceab67264365cccf0435ff7b760f9862c70bd5984e127dc50ec1794c62d816ddb4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch_nacl"
RDEPENDS:${PN} += "python39-PyNaCl python39-Twisted-conch"

inherit rpm
