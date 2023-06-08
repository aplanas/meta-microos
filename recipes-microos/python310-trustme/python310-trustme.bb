SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "0.9.0"

RPM_NAME = "python310-trustme-0.9.0-3.1.noarch.rpm"
RPM_HASH = "225561c1f2bc0e25f280c1eb1c5d2a3bd1ee81d7671e9a7f6ffe1376a6523beffb8919cbaa819a54704830ce98424693160fe00837e3c4c2785534c018ffded9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trustme python3.10dist(trustme) python310-trustme python3dist(trustme)"
RDEPENDS:${PN} += "python(abi) python310-cryptography python310-idna"

inherit rpm
