SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.82.0"

RPM_NAME = "python310-google-api-python-client-2.82.0-1.2.noarch.rpm"
RPM_HASH = "eafb573f17a539115afc3b3f988c471d5610c261415bb3cd242609c3b2e2e8389aff9d330b06db65d270db3b9990cbab77d6455d6cbc221060128b4c82302bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client python3-google-api-python-client python3.10dist(google-api-python-client) python310-google-api-python-client python3dist(google-api-python-client)"
RDEPENDS:${PN} += "python(abi) python310-google-api-core python310-google-auth python310-google-auth-httplib2 python310-httplib2 python310-uritemplate"

inherit rpm
