SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-magic-wormhole-mailbox-server-0.4.1-5.2.noarch.rpm"
RPM_HASH = "7715e3698b02a8a4deaf0831a399de2760122f3babdb15bd3dd8bc417fbd5b960a454dd7fda405248b0e1457e00da3cdf28ab258d8bf45ba237d250c799069c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(magic-wormhole-mailbox-server) \
python39-magic-wormhole-mailbox-server \
python3dist(magic-wormhole-mailbox-server)"
RDEPENDS:${PN} += "python(abi) \
python39-Twisted-tls \
python39-attrs \
python39-autobahn"

inherit rpm
