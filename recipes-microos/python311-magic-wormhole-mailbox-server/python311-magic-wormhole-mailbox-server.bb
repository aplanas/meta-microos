SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-magic-wormhole-mailbox-server-0.4.1-5.2.noarch.rpm"
RPM_HASH = "70d82d45799aeaa462b9676692d89750a9b9653487d227ea35a9243689697057e0e2cb890044ffca1ff5704610149bd2398abd2fd91bea9062f2bad00371ddf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(magic-wormhole-mailbox-server) python311-magic-wormhole-mailbox-server python3dist(magic-wormhole-mailbox-server)"
RDEPENDS:${PN} += "python(abi) python311-Twisted-tls python311-attrs python311-autobahn"

inherit rpm
