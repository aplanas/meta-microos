SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python39-blinker-1.5-3.1.noarch.rpm"
RPM_HASH = "792b52c974896ea19001fd1dce7eee6edbc215d8b1fa5799549a1e9b6815949627150db27b4fe0911d410694914b28d05902537092bce4f14c95dbd3a6f1c216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(blinker) python39-blinker python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
