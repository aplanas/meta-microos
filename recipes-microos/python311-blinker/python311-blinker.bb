SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python311-blinker-1.5-3.1.noarch.rpm"
RPM_HASH = "5532c26be2592fef517394377a1cea4b76288716200544f6e2a4e142d1e45487d32e6e28b44061edd8b2fc8a55d3db0856fbff9d0b781c620059491ee36f8fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(blinker) python311-blinker python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
