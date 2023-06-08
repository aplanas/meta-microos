SUMMARY = "Async JSON-RPC 20 protocol + server powered by asyncio"
DESCRIPTION = "Async JSON-RPC 2.0 protocol + server powered by asyncio."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-ajsonrpc-1.2.0-2.4.noarch.rpm"
RPM_HASH = "e0c3b01c338bd6b93982345a226598c3238157375100ef478556a14d3bad5e4dd0dfc6b1bafb9ca5228b58412cc1b4ff4a13fd88e0fa72b27e57ffa99525cb51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ajsonrpc) python311-ajsonrpc python3dist(ajsonrpc)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi)"

inherit rpm
