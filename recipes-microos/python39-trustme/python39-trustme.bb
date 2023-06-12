SUMMARY = "Fake CA provider for Python tests"
DESCRIPTION = "trustme is a Python package that provides a fake certificate \
authority (CA) that can be used to generate 'fake' TLS certs to use \
in tests. The CA and certificates are fake in the sense of \
https://martinfowler.com/bliki/TestDouble.html, that is, the trust \
circle of the CA is limited to the test environment."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python39-trustme-1.0.0-1.1.noarch.rpm"
RPM_HASH = "57ceaa12fc2c221e081e7a32707d1ad7cb2df89489293bba89652832918b5b304b1da6e59f62e1791a0b53bf4a2cf08945bb265043103a30d3155c20818f8a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(trustme) \
python39-trustme \
python3dist(trustme)"
RDEPENDS:${PN} += "python(abi) \
python39-cryptography \
python39-idna"

inherit rpm
