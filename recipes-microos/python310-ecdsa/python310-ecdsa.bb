SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-ecdsa-0.18.0-2.1.noarch.rpm"
RPM_HASH = "8043d5c04ea1691302abb86ba819513cdcfd8216c70484d8667f479e99ef009c388a69c7200813a3d5c4baddf664d76585d02efa71fd472a1ec7bd75d44a198a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ecdsa python3.10dist(ecdsa) python310-ecdsa python3dist(ecdsa)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
