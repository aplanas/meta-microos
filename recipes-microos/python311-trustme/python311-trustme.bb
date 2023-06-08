SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "0.9.0"

RPM_NAME = "python311-trustme-0.9.0-3.1.noarch.rpm"
RPM_HASH = "a3ab1002a1e0622c2b8e85a4a6b79c9d8443baad4026dcdfb1e7b487e0904f45dcba4b974dac6f86412552ea35ded740a32b67f4087f48aad0a64703843f7858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trustme) python311-trustme python3dist(trustme)"
RDEPENDS:${PN} += "python(abi) python311-cryptography python311-idna"

inherit rpm
