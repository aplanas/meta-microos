SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python39-dateparser-1.1.8-2.1.noarch.rpm"
RPM_HASH = "82f9be807d038764ed5a88cce70ecf51ed3b9e04514d662faaca5ccf53f7879768a3ecf58f4abb588c9a85f2b246ba0758ec56a8f631164626518b20a18a2d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dateparser) python39-dateparser python3dist(dateparser)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-python-dateutil python39-pytz python39-regex python39-tzlocal update-alternatives"

inherit rpm
