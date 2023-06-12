SUMMARY = "Python package that generates fake data"
DESCRIPTION = "Faker is a Python package that generates fake data. It helps with \
database bootstrapping, creating XML documents, persistence stress \
testing, and data anonymization from production services."
LICENSE = "MIT"

PV = "18.9.0"

RPM_NAME = "python39-Faker-18.9.0-1.1.noarch.rpm"
RPM_HASH = "35a06323b658b4546ecbbd9f5c70d4067978952605201adee7351bc161222c6805eb1ab85a90f4fb0abeca88681fd7f55be63062d6ec5428dc896a4904363b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fake-factory \
python3.9dist(faker) \
python39-Faker \
python3dist(faker)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-python-dateutil \
python39-text-unidecode \
update-alternatives"

inherit rpm
