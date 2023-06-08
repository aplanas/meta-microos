SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-oscrypto-1.3.0-1.3.noarch.rpm"
RPM_HASH = "5eaa3b774436dd592356c3d29ef1998643728c1c43e4ae4032fbb7f8557ab016c0d8ac98fa2508edf6eb8243bb721595cf33a5b67fbb65905f9db15735a26df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oscrypto) python311-oscrypto python3dist(oscrypto)"
RDEPENDS:${PN} += "python(abi) python311-asn1crypto"

inherit rpm
