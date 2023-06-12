SUMMARY = "WebSocket client implementation"
DESCRIPTION = "The websocket-client module is a WebSocket client for Python. This provides the \
low-level APIs for WebSocket. All APIs are synchronous functions. \
 \
Websocket-client supports only hybi-13."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "python39-websocket-client-1.5.1-1.1.noarch.rpm"
RPM_HASH = "462e5ca0bebd171600a778787952d17904d1fb549e0f6ff4cf24ed1c6165c2af281eed358319954565ed989fe07f376d455ca77b249b201b713b7c22c0af5d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(websocket-client) python39-websocket-client python39-websocket-client-test python3dist(websocket-client)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 alts python(abi)"

inherit rpm
