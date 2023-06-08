SUMMARY = "Documentation for sqlite3"
DESCRIPTION = " \
Contains HTML documentation for SQLite: SQL Syntax, C/C++ API and \
other documentation found on sqlite.org. The files can be found in \
/usr/share/doc/packages/sqlite3-doc."
LICENSE = "SUSE-Public-Domain"

PV = "3.41.2"

RPM_NAME = "sqlite3-doc-3.41.2-1.1.noarch.rpm"
RPM_HASH = "359136dba6e930da00674d0483f89f2cfaf1cc068c47cededa0b71fec985d70193587771d4b8cba464876602cf6361d4df04cb282ba55e0cac15b373adcfa403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite3-doc"
RDEPENDS:${PN} += ""

inherit rpm
