SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python311-PyJWT-2.6.0-2.1.noarch.rpm"
RPM_HASH = "da6e3b228d1c7721f1f46b65ce0b5b8a73e39891b1396306e89163d5c0fe2a01816e88ae0987b906ae79479182e222c803dd016931065c608e61730004e2955e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyjwt) python311-PyJWT python3dist(pyjwt)"
RDEPENDS:${PN} += "python(abi) python311-cryptography python311-setuptools update-alternatives"

inherit rpm
