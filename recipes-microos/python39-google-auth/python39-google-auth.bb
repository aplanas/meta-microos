SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.16.1"

RPM_NAME = "python39-google-auth-2.16.1-3.1.noarch.rpm"
RPM_HASH = "cb9e56d86b0c70e32706d7fb75bcaa67e27c4ce6de05394d721e403fb557b3054eb342dd01171aa4c099f9d0b218189681bba48b461aea6fe073a2a691b34bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-auth) python39-google-auth python3dist(google-auth)"
RDEPENDS:${PN} += "python(abi) python39-cachetools python39-cryptography python39-pyasn1-modules python39-rsa python39-setuptools python39-six"

inherit rpm
