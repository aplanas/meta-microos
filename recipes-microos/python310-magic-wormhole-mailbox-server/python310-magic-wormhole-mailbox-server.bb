SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-magic-wormhole-mailbox-server-0.4.1-5.2.noarch.rpm"
RPM_HASH = "73e01600ed224aa783521f73443fc548f24da752ca0fe5765dfdace57669b97b3196a08d5ebddae699f791e843b317e4163219b79b697d075895ec8f8136f088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-mailbox-server \
python3.10dist(magic-wormhole-mailbox-server) \
python310-magic-wormhole-mailbox-server \
python3dist(magic-wormhole-mailbox-server)"
RDEPENDS:${PN} += "python(abi) \
python310-Twisted-tls \
python310-attrs \
python310-autobahn"

inherit rpm
