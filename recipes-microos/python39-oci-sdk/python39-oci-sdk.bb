SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.103.0"

RPM_NAME = "python39-oci-sdk-2.103.0-1.1.noarch.rpm"
RPM_HASH = "2a44d17263ce4965d952b1d32355f1b69df88c449cb69a2791f2e590bc3e969c073de74725e372d43949e6770eb75f8faa4abaa213f30d55c28a80d96757a897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oci) python39-oci python39-oci-sdk python3dist(oci)"
RDEPENDS:${PN} += "python(abi) python39-PyJWT python39-certifi python39-circuitbreaker python39-cryptography python39-httpsig_cffi python39-pyOpenSSL python39-python-dateutil python39-pytz python39-requests python39-six python39-urllib3"

inherit rpm
