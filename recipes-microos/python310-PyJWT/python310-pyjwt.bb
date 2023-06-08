SUMMARY = "JSON Web Token implementation in Python"
DESCRIPTION = "A Python implementation of JSON Web Token draft 01."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-PyJWT-2.6.0-2.1.noarch.rpm"
RPM_HASH = "a9259560bd5c381132d55f6440d0d09061442121738718aa2eccefccda5c357e6c74b2797cb3f19d57acdbee742a5d7468ed4bdc84e4651c9e24d28d16db779d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyJWT python3.10dist(pyjwt) python310-PyJWT python3dist(pyjwt)"
RDEPENDS:${PN} += "python(abi) python310-cryptography python310-setuptools update-alternatives"

inherit rpm
