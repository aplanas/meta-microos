SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch_nacl-22.10.0-5.1.noarch.rpm"
RPM_HASH = "38d490889cccf86f1f205a215047ff0f6690b9f339fff589d29f16a0e72045a02c007a748c99c37d679726fcdb2372b51ee497e1e93c5f0950bc886a3b8d66cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-conch_nacl"
RDEPENDS:${PN} += "python311-PyNaCl python311-Twisted-conch"

inherit rpm
