SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.9.0"

RPM_NAME = "python310-Faker-18.9.0-1.1.noarch.rpm"
RPM_HASH = "06e659c2ae03f047b68e8184c11fd03ac20e5bd444d048de8e6f60740f0566450fa329e9b3346a09a7bd0c785aa477645bd716bfe7f0a0cb04467cdaa099dcf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Faker \
python3-fake-factory \
python3.10dist(faker) \
python310-Faker \
python3dist(faker)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-python-dateutil \
python310-text-unidecode \
update-alternatives"

inherit rpm
