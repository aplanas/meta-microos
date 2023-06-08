SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python311-pyjwkest-1.4.2-2.9.noarch.rpm"
RPM_HASH = "e50d38f188e6b0005e164ce351c53b828d4b417961e5185fe166d611b877daaf90765a02c91577bab54273210983231edf3c5c9636de194d44812695c7b6d0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyjwkest) python311-pyjwkest python3dist(pyjwkest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-future python311-pycryptodomex python311-requests python311-six update-alternatives"

inherit rpm
