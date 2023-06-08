SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-sat-stac-0.4.1-1.4.noarch.rpm"
RPM_HASH = "ef569842b32ba9691056e605313acbb756d136383947b2af62f4706d73011254f822419ca1e5102db12bc2763337551be37bfe22ba5b00c6a0917310ed151d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sat-stac) python39-sat-stac python3dist(sat-stac)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-python-dateutil python39-requests update-alternatives"

inherit rpm
