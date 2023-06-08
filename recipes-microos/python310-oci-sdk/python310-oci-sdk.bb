SUMMARY = "Oracle Cloud Infrastructure Python SDK"
DESCRIPTION = "Python SDK for Oracle Cloud Infrastructure. Python 2.7+ and 3.5+ are supported."
LICENSE = "Apache-2.0 | UPL-1.0"

PV = "2.96.0"

RPM_NAME = "python310-oci-sdk-2.96.0-1.2.noarch.rpm"
RPM_HASH = "7152bf26e85871cf65781dac04f5804beef546296442e995cd858082ff41f196dc93bf0a421a8e795bd4ab9145508c41e83f8935247efad2c34c7cf219c85846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oci-sdk python3.10dist(oci) python310-oci-sdk python3dist(oci)"
RDEPENDS:${PN} += "python(abi) python310-PyJWT python310-certifi python310-circuitbreaker python310-cryptography python310-httpsig_cffi python310-pyOpenSSL python310-python-dateutil python310-pytz python310-requests python310-six"

inherit rpm
