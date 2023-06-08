SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python311-aiosignal-1.3.1-1.1.noarch.rpm"
RPM_HASH = "a76cc886de987508eeb659e98d745d547cc464fbd587abea15756394e1c75d3e015e1fcd54eac30c4544c583593e36f3562d44a81439af426e9c563f1554abdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiosignal) python311-aiosignal python3dist(aiosignal)"
RDEPENDS:${PN} += "python(abi) python311-frozenlist"

inherit rpm
