SUMMARY = "Module to mock out responses from the requests package"
DESCRIPTION = "requests-mock provides a building block to stub out the HTTP requests portions of your testing code. \
You should checkout the docs for more information."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python310-requests-mock-1.10.0-3.1.noarch.rpm"
RPM_HASH = "19f3d1878471c571fe1233b2ad87dfe605872211d9eb2a067e56f8681acef908cc00cd5f3981201b80214db5180705814f2f01f95dad56cd6b39f8c4cc6b2e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-mock python3.10dist(requests-mock) python310-requests-mock python3dist(requests-mock)"
RDEPENDS:${PN} += "python(abi) python310-dbm python310-requests python310-six"

inherit rpm
