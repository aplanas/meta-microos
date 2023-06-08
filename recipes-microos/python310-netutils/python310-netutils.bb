SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-netutils-1.2.0-1.3.noarch.rpm"
RPM_HASH = "312488ff551f0aaf65f972bd92f960086192f36c39849e578d33468bc764c7a20b516b97ff0d50097bf4de324919081252a5f8af651225c10f10f6bf561b06ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netutils python3.10dist(netutils) python310-netutils python3dist(netutils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
