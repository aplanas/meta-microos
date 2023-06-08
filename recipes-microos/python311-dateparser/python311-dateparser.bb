SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python311-dateparser-1.1.8-2.1.noarch.rpm"
RPM_HASH = "fd287654c118f73a615711fdb67f3e1c48ae3c7f4483a615dfed0e14b42bebde6533e746dc86db285886df6316ca62ef77ac5875741f8d2b0ecb7e8470f59952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dateparser) python311-dateparser python3dist(dateparser)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-python-dateutil python311-pytz python311-regex python311-tzlocal update-alternatives"

inherit rpm
