SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python310-python-sql-1.4.0-1.5.noarch.rpm"
RPM_HASH = "4d212941e02be7267803a950a15b202f2738ab8f5694071d16b43085b8e0dbc5ea057b88cecc3967f38c3c7a5d36097480319283e6a6cf3f2e2154beb897e85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-sql python3.10dist(python-sql) python310-python-sql python3dist(python-sql)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
