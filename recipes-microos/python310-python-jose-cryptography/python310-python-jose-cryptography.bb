SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-python-jose-cryptography-3.3.0-1.5.noarch.rpm"
RPM_HASH = "cffd3d14d13240ea7e70dcd6d611f9a1fa1385a49ea019620f7d4c57d4d5cff93ae998f6a06b7fb62735fd2b57306788bdccceea11fb61a414334d26ce6ed0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jose-cryptography python310-python-jose-cryptography"
RDEPENDS:${PN} += "python310-cryptography python310-python-jose"

inherit rpm
