SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.6.0"

RPM_NAME = "python310-Faker-18.6.0-1.1.noarch.rpm"
RPM_HASH = "af105b397609d8466c5398e59de3dcd4a45d38fccee308fd2dd5cee5eb9ec0aa181ded8cf502d0fae8bd91bfeb65c7af16fcf684bebfa72b8be440dbdc815fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Faker python3-fake-factory python3.10dist(faker) python310-Faker python3dist(faker)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-python-dateutil python310-text-unidecode update-alternatives"

inherit rpm
