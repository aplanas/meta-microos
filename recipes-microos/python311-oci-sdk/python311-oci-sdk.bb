SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.96.0"

RPM_NAME = "python311-oci-sdk-2.96.0-1.2.noarch.rpm"
RPM_HASH = "69e202ea79fd4b18e1467737b03463e092668aa78a03d6367f9f3f02da4abb589e89cbe5c6df77297f224b34adb5f7173c55662bda5101009eb57de576c0f18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oci) python311-oci-sdk python3dist(oci)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-certifi python311-circuitbreaker python311-cryptography python311-httpsig_cffi python311-pyOpenSSL python311-python-dateutil python311-pytz python311-requests python311-six"

inherit rpm
