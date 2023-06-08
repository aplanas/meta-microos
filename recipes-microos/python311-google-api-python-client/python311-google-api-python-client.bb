SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.82.0"

RPM_NAME = "python311-google-api-python-client-2.82.0-1.2.noarch.rpm"
RPM_HASH = "ddaf5decce3712a4c0de3c5a7bec2c28552647e4cd511f4f1fd4817cf0f7a71f12654a0356bd4d5cffe985ab63955c0d8cf1873c9d4b615d6a387eda517b70e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client python3.11dist(google-api-python-client) python311-google-api-python-client python3dist(google-api-python-client)"
RDEPENDS:${PN} += "python(abi) python311-google-api-core python311-google-auth python311-google-auth-httplib2 python311-httplib2 python311-uritemplate"

inherit rpm
