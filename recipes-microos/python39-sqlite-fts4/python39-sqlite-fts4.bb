SUMMARY = "Python functions for working with SQLite FTS4 search"
DESCRIPTION = "Python functions for working with SQLite FTS4 search"
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python39-sqlite-fts4-1.0.3-1.3.noarch.rpm"
RPM_HASH = "780974530ca0fb233aa7f3cae2de1ea962976dcb8b5a155d05c1a64a84b6eb861bba66f20f025c63bc117ae83ea003fc3eacaf43370acd9e7fc06588b76221cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlite-fts4) python39-sqlite-fts4 python3dist(sqlite-fts4)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
