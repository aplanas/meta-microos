SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python39-pbkdf2-1.3-3.12.noarch.rpm"
RPM_HASH = "3d36a9cf73efda436ea00656acec004604071dc7ab2a906273c9457cc6a24ab5de4e348e8ee3a300ae1100269a011ac6c69ac348405759bc5317dd8f6a48acb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pbkdf2) \
python39-pbkdf2 \
python3dist(pbkdf2)"
RDEPENDS:${PN} += "python(abi) \
python39-pycrypto"

inherit rpm
