SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-sqlparse-0.4.4-1.1.noarch.rpm"
RPM_HASH = "666a1b7f8ad16a8bf6fb2e78e68a871cd7e1a5b1468ee0664e2ae4fbb087475333d8ef42081e51e531bcdd91cccbb5ae317c3df38c9429801345e9bede7b92c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlparse) python39-sqlparse python3dist(sqlparse)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
