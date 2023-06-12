SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "python310-txaio-23.1.1-1.2.noarch.rpm"
RPM_HASH = "8ee3294d84d05f29cebf654d254724126c3ffa16067bc360c0ba888d2883c91bf6133047b16577cd03ad0bcd79ad57e661cc5998d1ed64e9dc755d503576f711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txaio \
python3.10dist(txaio) \
python310-txaio \
python3dist(txaio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
