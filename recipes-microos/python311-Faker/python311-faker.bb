SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.6.0"

RPM_NAME = "python311-Faker-18.6.0-1.1.noarch.rpm"
RPM_HASH = "b1b1ff35d20d0bc11a78b17de307b5cfdf131516d306cb54da12a4819c70576349ff632d6e3956d976092e34bd9f2c59d8b989bb2a4747d89d7bd38f7f3b49d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory python3.11dist(faker) python311-Faker python3dist(faker)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-python-dateutil python311-text-unidecode update-alternatives"

inherit rpm
