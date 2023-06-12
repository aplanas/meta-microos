SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-blinker-1.6.2-1.1.noarch.rpm"
RPM_HASH = "7dcecfa335fc46319d068e6bb0cf2e510bbe4c2f961a5bfacac5e5e2671ad466670873528f931b9d0714e8ff34a367eef2f6fcab73d5ffce8352dfd6318eb3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker \
python3.10dist(blinker) \
python310-blinker \
python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
