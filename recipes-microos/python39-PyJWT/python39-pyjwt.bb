SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-PyJWT-2.6.0-2.1.noarch.rpm"
RPM_HASH = "5f9b75b7113cffda24bf8090d31021b6d37ff57d592e74de2d83c60ac7816b0a77237a29c8448383607f2fcb9232d86fbb8eb555746fc626081d677a9dd85dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyjwt) python39-PyJWT python3dist(pyjwt)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-setuptools update-alternatives"

inherit rpm
