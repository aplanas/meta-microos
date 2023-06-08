SUMMARY = "WebSocket connector for Ypy"
DESCRIPTION = "An async WebSocket connector for Ypy."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python310-ypy-websocket-0.8.2-1.2.noarch.rpm"
RPM_HASH = "3882d36d12dee07b118b8bf26a29c25ce99a1a0211c1c25a429b0e15f4b5aae9ab9914de145320ef03a9724c0cfeaf69f6a9e40cced2d7602d4ff0d9f4f2b721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ypy-websocket python3.10dist(ypy-websocket) python310-ypy-websocket python3dist(ypy-websocket)"
RDEPENDS:${PN} += "(python310-aiosqlite >= 0.17.0 with python310-aiosqlite < 1) (python310-y-py >= 0.5.3 with python310-y-py < 0.6.0) python(abi) python310-aiofiles"

inherit rpm
