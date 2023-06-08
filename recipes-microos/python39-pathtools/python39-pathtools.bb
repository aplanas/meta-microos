SUMMARY = "File system general utilities"
DESCRIPTION = "Pattern matching and various utilities for file systems paths."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pathtools-0.1.2-14.17.noarch.rpm"
RPM_HASH = "9f228a4881bdb10f3783ea92cc856ca9bd10ef64c2a0c6ab0960b94bb84248b50ab17f72bfe5c6776ccc51b5c9d91c63e65ebad6f289ed6017c7bae6cab2a745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pathtools) python39-pathtools python3dist(pathtools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
