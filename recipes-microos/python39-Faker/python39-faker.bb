SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.6.0"

RPM_NAME = "python39-Faker-18.6.0-1.1.noarch.rpm"
RPM_HASH = "c01174e58faa4015b2eecc9e0cea3bb2c83459ab73a6759d5fd0ec067c1b083eb9312ee37f9ea36c565a0e50184d5a84b821c80e9b6d3302d99518abd26cd3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory python3.9dist(faker) python39-Faker python3dist(faker)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-python-dateutil python39-text-unidecode update-alternatives"

inherit rpm
