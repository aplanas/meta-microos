SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python39-txaio-23.1.1-1.2.noarch.rpm"
RPM_HASH = "afd21be234bdea8a6b2d0669567a6beb9756c2b3352d173540e3526985ab9958657b3aa86879a8aacb121769148f919632d943b1c606d6de290ccf8d1ca17a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(txaio) python39-txaio python3dist(txaio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
