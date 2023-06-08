SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.96.0"

RPM_NAME = "python39-oci-sdk-2.96.0-1.2.noarch.rpm"
RPM_HASH = "a1c3cd757c60b24c2d216872ce8344106ccb8021f42f2273fb9cda832f0fca847f2bdd3765440a6ac98304e5c06ce52a1353e22bbdd11df8a05354501df3fbf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oci) python39-oci-sdk python3dist(oci)"
RDEPENDS:${PN} += "python(abi) python39-PyJWT python39-certifi python39-circuitbreaker python39-cryptography python39-httpsig_cffi python39-pyOpenSSL python39-python-dateutil python39-pytz python39-requests python39-six"

inherit rpm
