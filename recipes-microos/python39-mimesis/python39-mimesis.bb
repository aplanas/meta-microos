SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-mimesis-4.0.0-1.12.noarch.rpm"
RPM_HASH = "f77942330ebc23f6212984faadbae6482d73d6e49eabe7a0ef1f18aef2f6dce60c0283751b4d551d5e33fd0a862a11b5d13b09dc0cd5fe7e884784c7736e5a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mimesis) \
python39-mimesis \
python3dist(mimesis)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
