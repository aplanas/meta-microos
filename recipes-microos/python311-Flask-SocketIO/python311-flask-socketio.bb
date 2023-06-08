SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python311-Flask-SocketIO-5.1.1-1.8.noarch.rpm"
RPM_HASH = "b79bb05346cf0d98463955e00ebb0dd9326d26bd0d4e63987542310df659f95f73f29d12d9d16680f63e1926138d2703bc8a75e31499c1d455ee3c69e58bf7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-socketio) python311-Flask-SocketIO python3dist(flask-socketio)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-python-socketio"

inherit rpm
