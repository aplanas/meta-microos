SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-mimesis-4.0.0-1.12.noarch.rpm"
RPM_HASH = "cf8d9cdc5a344d09c7021a8be0f603d218caa4138c0ea7ec9907d3bb8dd12ab6a9cb7640e97061897b24085a70330d0dfd1395d8243f8ee41e7f82fc33971329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mimesis) \
python311-mimesis \
python3dist(mimesis)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
