SUMMARY = "Python CLI tool and library for manipulating SQLite databases"
DESCRIPTION = "CLI tool and Python utility functions for manipulating SQLite databases."
LICENSE = "Apache-2.0"

PV = "3.24"

RPM_NAME = "python311-sqlite-utils-3.24-1.8.noarch.rpm"
RPM_HASH = "39b6ff8a555f94f659cd7010a9bc60f09e957a9be99b143ec44a3de9a8774f4b68cd7014d9e66b4c0001d1488ffafd36206607f2b56580c4cd3a3d1d60272236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sqlite-utils) python311-sqlite-utils python3dist(sqlite-utils)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-click-default-group python311-sqlite-fts4 python311-tabulate update-alternatives"

inherit rpm
