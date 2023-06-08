SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python310-dateparser-1.1.8-2.1.noarch.rpm"
RPM_HASH = "2c796c051c4f3e5dab2b2d03411ec79104a549f14c0a81c9ae915a38a19a46320ecac5ca5cad5108ad3cfe2d13774b9e8dd89b91e3ec9d6a47bfba9ba454dea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateparser python3.10dist(dateparser) python310-dateparser python3dist(dateparser)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-python-dateutil python310-pytz python310-regex python310-tzlocal update-alternatives"

inherit rpm
