SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.82.0"

RPM_NAME = "python39-google-api-python-client-2.82.0-1.2.noarch.rpm"
RPM_HASH = "8a9aba15aee2738000c10c3a4ae74e3e71f4b0ca66d726bf3621d1f868cf1817120e5841a6011137a0e5f2e8470e10cdeccae5c171e848c49164458fd39f825f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client python3.9dist(google-api-python-client) python39-google-api-python-client python3dist(google-api-python-client)"
RDEPENDS:${PN} += "python(abi) python39-google-api-core python39-google-auth python39-google-auth-httplib2 python39-httplib2 python39-uritemplate"

inherit rpm
