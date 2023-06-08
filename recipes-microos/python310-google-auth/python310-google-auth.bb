SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python310-google-auth-2.16.1-3.1.noarch.rpm"
RPM_HASH = "694210b35f46e216c0de857fe87071575292ddeb6dc6636850f1540d3b0b5e449dcee20f343bdd7726a45716bdaf953827e74fdd5c45fd989bb05e4fa1a8ba23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth python3.10dist(google-auth) python310-google-auth python3dist(google-auth)"
RDEPENDS:${PN} += "python(abi) python310-cachetools python310-cryptography python310-pyasn1-modules python310-rsa python310-setuptools python310-six"

inherit rpm
