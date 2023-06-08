SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch_nacl-22.10.0-5.1.noarch.rpm"
RPM_HASH = "8e26538068656379b13cbbd61cc5e5eb473569aa162c8ddc8152bdabd3c2c9e6e39d3c6d4bbc51d53d77f7a83ec4f06bc1ca2648dd942e3149df20a5dee18026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch_nacl"
RDEPENDS:${PN} += "python39-PyNaCl python39-Twisted-conch"

inherit rpm
