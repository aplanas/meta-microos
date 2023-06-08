SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python39-pyjwkest-1.4.2-2.9.noarch.rpm"
RPM_HASH = "baa490cacbef0cc346cc09d81d675029311dc405dd12d7f24ab744fcc99fb32d1cd405a5b516d0004787e633945ce2c41889a14aa8ac220007b796a6de43f121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyjwkest) python39-pyjwkest python3dist(pyjwkest)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-future python39-pycryptodomex python39-requests python39-six update-alternatives"

inherit rpm
