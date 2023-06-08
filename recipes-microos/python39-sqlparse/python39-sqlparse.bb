SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "python39-sqlparse-0.4.3-1.4.noarch.rpm"
RPM_HASH = "8e3a98951400882fb50e559a7ec49b07ad28a5f05da19d5e7093b223a839730919a44dd236c2db046d6b930ca8716040f3ed187edd57b7a8762f72b438e5c669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlparse) python39-sqlparse python3dist(sqlparse)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
