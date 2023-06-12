SUMMARY = "SQLite3-based store for Python objects"
DESCRIPTION = "Minidb 2 allows you to store Python objects in a SQLite 3 database."
LICENSE = "ISC"

PV = "2.0.7"

RPM_NAME = "python310-minidb-2.0.7-1.3.noarch.rpm"
RPM_HASH = "ecfefdd1fdde280fdc0be2846cfe966e93fada998d034d546c8481b0714f5e5509250bdc0627d17069d4d7a9e93536b901f035cef6f6349876d0c842b7f071c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-minidb \
python3.10dist(minidb) \
python310-minidb \
python3dist(minidb)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
