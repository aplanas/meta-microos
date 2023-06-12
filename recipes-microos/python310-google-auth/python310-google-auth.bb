SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.17.3"

RPM_NAME = "python310-google-auth-2.17.3-2.1.noarch.rpm"
RPM_HASH = "98c9f12e541cb529e3a1a8a33ee1533fb6da97ae6973a92f7202fd52526b35a92b32b8ac63bd554b6c5a778d2e9bf2def14dedb7abc34f178e1f37cb8f3f8752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-auth python3.10dist(google-auth) python310-google-auth python3dist(google-auth)"
RDEPENDS:${PN} += "python(abi) python310-cachetools python310-cryptography python310-pyasn1-modules python310-rsa python310-setuptools python310-six"

inherit rpm
