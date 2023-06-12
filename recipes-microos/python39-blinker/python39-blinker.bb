SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python39-blinker-1.6.2-1.1.noarch.rpm"
RPM_HASH = "1feec8b9d2afa700896f2e18b1e25f27944940e2724c909334dceb49bb67902c881635b23afa3be502c64c88604c9862a5e6a3b5c17dbf5e45bab2f47aebcf7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(blinker) \
python39-blinker \
python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
