SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-ecdsa-0.18.0-2.1.noarch.rpm"
RPM_HASH = "b99a840a25f364a802bbba356543a2e9693279001383d3e5d9b28129ecb6c72a08d35edfe302a87ed23302b87a6fe29e183e062946f12085b99ffbcdec1f8a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ecdsa) python311-ecdsa python3dist(ecdsa)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
