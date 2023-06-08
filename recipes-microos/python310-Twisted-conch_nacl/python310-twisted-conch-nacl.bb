SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch_nacl-22.10.0-5.1.noarch.rpm"
RPM_HASH = "42d7fc63cc75bd5e3a62105e36b5013b544eb99fa0b1268a18fbda0634719e56c559e7e3a0d56994cd12064b22ff4af7330e9981b740d962e2bc1f4916bda106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch_nacl python310-Twisted-conch_nacl"
RDEPENDS:${PN} += "python310-PyNaCl python310-Twisted-conch"

inherit rpm
