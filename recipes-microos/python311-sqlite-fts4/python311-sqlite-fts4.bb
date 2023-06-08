SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python311-sqlite-fts4-1.0.3-1.3.noarch.rpm"
RPM_HASH = "33ab335f2103bb1eb787e7c9ac563aa2e7e3e7e929be055f1c99cebcb7a770e804ee5158b55378e013066561633f49d109ed8ff2ac77b0009300c4fe39c3b914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sqlite-fts4) python311-sqlite-fts4 python3dist(sqlite-fts4)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
