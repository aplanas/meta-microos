SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.4.2"

RPM_NAME = "python310-websocket-client-1.4.2-3.1.noarch.rpm"
RPM_HASH = "eefe269e4fead4f1e008cd84f928a61af73c0e796f0957dc513637f5a85af50b60a5345c313d29c876b4a2ace8bef4ac88da2afe5381717669100ff0ca9db4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-websocket-client python3-websocket-client-test python3.10dist(websocket-client) python310-websocket-client python310-websocket-client-test python3dist(websocket-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi)"

inherit rpm
