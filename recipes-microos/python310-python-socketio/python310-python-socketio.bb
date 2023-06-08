SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python310-python-socketio-5.7.2-1.3.noarch.rpm"
RPM_HASH = "c49488624c6f53bdf33dc545947321b23ac91e99702dff3f5e9b4642f367706f4229ba4e95cc69c37ba4e9a42c9c26e9332b32e95ce855a1c935cfe1af7380c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socketio python3.10dist(python-socketio) python310-python-socketio python3dist(python-socketio)"
RDEPENDS:${PN} += "python(abi) python310-bidict python310-python-engineio"

inherit rpm
