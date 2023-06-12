SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python39-requests-mock-1.10.0-3.1.noarch.rpm"
RPM_HASH = "9d7ecba5cff120f58a0110296393bce27014984e369a2625bd3a14e9fc2b276f62f08fb84e1ebb89c13e8a00cd9d070f7aa939eff3e95d4a1fb384a3cc04826c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-mock) \
python39-requests-mock \
python3dist(requests-mock)"
RDEPENDS:${PN} += "python(abi) \
python39-dbm \
python39-requests \
python39-six"

inherit rpm
