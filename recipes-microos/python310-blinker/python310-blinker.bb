SUMMARY = "Object-to-object and broadcast signaling in Python"
DESCRIPTION = "Blinker provides a dispatching system that allows any number of \
interested parties to subscribe to events, or 'signals'. \
 \
Signal receivers can subscribe to specific senders or receive signals \
sent by any sender."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "python310-blinker-1.5-3.1.noarch.rpm"
RPM_HASH = "49a2115c11e91f99828254a0662487eaad4812ff213676283b15b16f7d3d85ccf13869b3027054c2884c4dd26e3a9feab505ccd92d36001df6706baf138a3787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blinker python3.10dist(blinker) python310-blinker python3dist(blinker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
