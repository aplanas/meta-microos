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

RPM_NAME = "python39-jwcrypto-1.4.2-1.3.noarch.rpm"
RPM_HASH = "e98ff56f2f950783d4d4a50c92c7e6be97b9e0dc24163932ed051a452703d420881723eb07b87f70cf89a4419c14159e8fa171337c06c52a5b6bc3aed883c227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jwcrypto) python39-jwcrypto python3dist(jwcrypto)"
RDEPENDS:${PN} += "python(abi) python39-Deprecated python39-cryptography"

inherit rpm
