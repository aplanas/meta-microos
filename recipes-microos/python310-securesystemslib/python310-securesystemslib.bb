SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python310-securesystemslib-0.21.0-2.1.noarch.rpm"
RPM_HASH = "519477275ae174f00a754b1f273fd37909117fd2a0d944c80909bf0e8e0c39e6f21b51b6ffdd63bd0d8b80b34a7f624bccb73b3fe0e77f81521b7c39cdf5f4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-securesystemslib python3.10dist(securesystemslib) python310-securesystemslib python3dist(securesystemslib)"
RDEPENDS:${PN} += "python(abi) python310-PyNaCl python310-asn1crypto python310-colorama python310-cryptography"

inherit rpm
