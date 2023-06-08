SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.2"

RPM_NAME = "python310-tornado-6.2-16.1.noarch.rpm"
RPM_HASH = "45b7c3003017e4b535b19f000e378fbfb85cff50e84c66276efc613bf8dc9801336c2f44f2adc3072afe3733562f795fde29f0310782df8356d0d3d0005e9889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tornado python310-tornado"
RDEPENDS:${PN} += "python310-tornado6"

inherit rpm
