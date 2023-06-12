SUMMARY = "Python module package implementing JOSE Web standards"
DESCRIPTION = "A Python implementation of the JOSE Working Group documents: \
RFC 7515 - JSON Web Signature (JWS) \
RFC 7516 - JSON Web Encryption (JWE) \
RFC 7517 - JSON Web Key (JWK) \
RFC 7518 - JSON Web Algorithms (JWA) \
RFC 7519 - JSON Web Token (JWT) \
RFC 7520 - Examples of Protecting Content Using JSON Object Signing and Encryption (JOSE)"
LICENSE = "LGPL-3.0-only"

PV = "1.4.2"

RPM_NAME = "python310-jwcrypto-1.4.2-1.3.noarch.rpm"
RPM_HASH = "3c7aa11ac53ec270e5abd4f379867d5e7fa42ea52b5517523727a86d023e68d80e1196b5c3d961929c9e18031e1cc51439cd04c612dd677227e0d089ab153b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jwcrypto \
python3.10dist(jwcrypto) \
python310-jwcrypto \
python3dist(jwcrypto)"
RDEPENDS:${PN} += "python(abi) \
python310-Deprecated \
python310-cryptography"

inherit rpm
