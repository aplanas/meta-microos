SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-python-jose-cryptography-3.3.0-1.5.noarch.rpm"
RPM_HASH = "59368c912450c2eb11ae9cd2766fe9b14dd15d81919626cb029a65add1f8b55d020285a63c0d3949da0138480b8a1204e6b29508e2ab33ca4dc954d7f7260133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-python-jose-cryptography"
RDEPENDS:${PN} += "python39-cryptography \
python39-python-jose"

inherit rpm
