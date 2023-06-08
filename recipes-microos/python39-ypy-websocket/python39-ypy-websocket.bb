SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-ypy-websocket-0.8.2-1.2.noarch.rpm"
RPM_HASH = "8fee053e8c00692515c1bf28d754c395d12bf8c9b651b0644dd5a0b05739686de8567d09fa7a4ff6037813cb14f38322466b8de92b8db472889cae8c367c7e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ypy-websocket) python39-ypy-websocket python3dist(ypy-websocket)"
RDEPENDS:${PN} += "(python39-aiosqlite >= 0.17.0 with python39-aiosqlite < 1) (python39-y-py >= 0.5.3 with python39-y-py < 0.6.0) python(abi) python39-aiofiles"

inherit rpm
