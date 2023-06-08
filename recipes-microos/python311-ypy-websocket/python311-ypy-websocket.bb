SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python311-ypy-websocket-0.8.2-1.2.noarch.rpm"
RPM_HASH = "b2c675e3c40ea51339ea5b1090661d812395dc320c7401951b9baf4cfc6718b7e625f9d1eb17f33689bf3b886d901056f279bb269252fb3f79be30dc0277d63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ypy-websocket) python311-ypy-websocket python3dist(ypy-websocket)"
RDEPENDS:${PN} += "(python311-aiosqlite >= 0.17.0 with python311-aiosqlite < 1) (python311-y-py >= 0.5.3 with python311-y-py < 0.6.0) python(abi) python311-aiofiles"

inherit rpm
