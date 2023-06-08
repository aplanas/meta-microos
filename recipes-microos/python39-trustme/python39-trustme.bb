SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "0.9.0"

RPM_NAME = "python39-trustme-0.9.0-3.1.noarch.rpm"
RPM_HASH = "b1be2a07d5c211780e256efe3b1d46573cf56785a7dcbecc8dcd18ad306871166d20f296ade37c5ad8364e745ac43d20ca4b5259f0fb778c7762735892230be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(trustme) python39-trustme python3dist(trustme)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-idna"

inherit rpm
