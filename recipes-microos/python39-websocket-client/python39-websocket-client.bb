SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.4.2"

RPM_NAME = "python39-websocket-client-1.4.2-3.1.noarch.rpm"
RPM_HASH = "daf0f9736b9542a6eca029279ebef750e7058ee2b9080a7061cea998612294cfb1098ac9927766b689fa0132302eef92db0149ffda6c16544ad531f4d471f197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(websocket-client) python39-websocket-client python39-websocket-client-test python3dist(websocket-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi)"

inherit rpm
