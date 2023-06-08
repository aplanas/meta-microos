SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.4.2"

RPM_NAME = "python311-websocket-client-1.4.2-3.1.noarch.rpm"
RPM_HASH = "e67ebb59b3dd8f3744f59e4aa4b91816a2bde68486e07f404610f4fd90f47f15c65e47267ebd36741ce702992213dc2027beac3f55201f0c99797e21c68829f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(websocket-client) python311-websocket-client python311-websocket-client-test python3dist(websocket-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts python(abi)"

inherit rpm
