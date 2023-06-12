SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.86.0"

RPM_NAME = "python311-google-api-python-client-2.86.0-1.1.noarch.rpm"
RPM_HASH = "fd62dfb6abfeaa3ca9a9cddfd89ffad65c96cf12c8bfc488c4cf3e37534d57c004c7a642b63f5359e21dc6aec12f8ef75bd2097e2d59e286847cf5fd19a2aaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client python3.11dist(google-api-python-client) python311-google-api-python-client python3dist(google-api-python-client)"
RDEPENDS:${PN} += "python(abi) python311-google-api-core python311-google-auth python311-google-auth-httplib2 python311-httplib2 python311-uritemplate"

inherit rpm
