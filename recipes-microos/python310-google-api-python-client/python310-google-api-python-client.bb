SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.86.0"

RPM_NAME = "python310-google-api-python-client-2.86.0-1.1.noarch.rpm"
RPM_HASH = "ff162102f9525424d98ef3f2c4ff02413f2558fd8be28421091a8404bdcbaa35290d92fa52ed860f5e778aa63421a26565926f339271948f916f1dff3144886c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client python3-google-api-python-client python3.10dist(google-api-python-client) python310-google-api-python-client python3dist(google-api-python-client)"
RDEPENDS:${PN} += "python(abi) python310-google-api-core python310-google-auth python310-google-auth-httplib2 python310-httplib2 python310-uritemplate"

inherit rpm
