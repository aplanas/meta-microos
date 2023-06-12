SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-blinker-1.6.2-1.1.noarch.rpm"
RPM_HASH = "ec8dcc07c929688da23fdb168336e9236e829ff4a0505d0250404229af28296abe215e301b9be309d93e359724abeb5af055108c1921ad97f60d8fac58841115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(blinker) python311-blinker python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
