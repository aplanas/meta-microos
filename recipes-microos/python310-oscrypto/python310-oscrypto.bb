SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-oscrypto-1.3.0-1.3.noarch.rpm"
RPM_HASH = "f6ee0e5d4b153c325ed3c234256042f6b7e89398f0c814a1c51c51c61009d191907b45e9a30c33721132a8bd56b091ab20dccc1e41e9d22c73865f111d2bf420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oscrypto python3.10dist(oscrypto) python310-oscrypto python3dist(oscrypto)"
RDEPENDS:${PN} += "python(abi) python310-asn1crypto"

inherit rpm
