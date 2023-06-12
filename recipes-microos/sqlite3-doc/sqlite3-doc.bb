SUMMARY = "Documentation for sqlite3"
DESCRIPTION = " \
Contains HTML documentation for SQLite: SQL Syntax, C/C++ API and \
other documentation found on sqlite.org. The files can be found in \
/usr/share/doc/packages/sqlite3-doc."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-doc-3.42.0-1.1.noarch.rpm"
RPM_HASH = "17c5eca14e506347ea87a1ec090737faf9454e8bf94767ecbb4b145d2657981886b5a506468ee90e0f99686f66490f5ffa6a18545069fb00499cbc4b030f82e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite3-doc"
RDEPENDS:${PN} += ""

inherit rpm
