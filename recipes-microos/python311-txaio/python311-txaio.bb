SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python311-txaio-23.1.1-1.2.noarch.rpm"
RPM_HASH = "3526711eec78052d8c346ee4d1ca40de979bde614a46ba845e4045c55808f39da3174cecc991b31f7d8173a91332ace18f58fa037d77303008eee7128fe6fb75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txaio) python311-txaio python3dist(txaio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
